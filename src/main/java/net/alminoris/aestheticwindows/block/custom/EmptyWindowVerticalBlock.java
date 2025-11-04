package net.alminoris.aestheticwindows.block.custom;

import net.alminoris.aestheticwindows.util.helper.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmptyWindowVerticalBlock extends YAxisRotatedBlock
{
    protected static final VoxelShape UP = Block.createCuboidShape(
            0.0D, 15.0D, 6.5D,
            16.0D, 16.0D, 9.5D
    );

    protected static final VoxelShape DOWN = Block.createCuboidShape(
            0.0D, 0.0D, 6.5D,
            16.0D, 1.0D, 9.5D
    );

    protected static final VoxelShape LEFT = Block.createCuboidShape(
            0.0D, 0.0D, 6.5D,
            1.0D, 16.0D, 9.5D
    );

    protected static final VoxelShape RIGHT = Block.createCuboidShape(
            15.0D, 0.0D, 6.5D,
            16.0D, 16.0D, 9.5D
    );

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final BooleanProperty OPEN = BooleanProperty.of("open");
    public static final BooleanProperty FLIPPED = BooleanProperty.of("flipped");

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        CENTER("center"),
        UP("up"),
        DOWN("down");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final EnumProperty<Variant> VARIANT = EnumProperty.of("variant", Variant.class);

    public EmptyWindowVerticalBlock(Settings settings)
    {
        super(settings.nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(VARIANT, Variant.NORMAL)
                .with(OPEN, false)
                .with(WATERLOGGED, false)
                .with(FLIPPED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT, OPEN, WATERLOGGED, FLIPPED);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return getRotatedShape(state);
    }

    private VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);

        List<Box> boxes = new ArrayList<>();
        switch(state.get(VARIANT))
        {
            case NORMAL:
                boxes.add(UP.getBoundingBox());
                boxes.add(DOWN.getBoundingBox());
                break;
            case UP:
                boxes.add(UP.getBoundingBox());
                break;
            case DOWN:
                boxes.add(DOWN.getBoundingBox());
                break;
        }
        boxes.add(LEFT.getBoundingBox());
        boxes.add(RIGHT.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit)
    {
        if (!player.getMainHandStack().isEmpty())
        {
            return ActionResult.PASS;
        }

        if (world.isClient) return ActionResult.SUCCESS;

        boolean newOpen = !state.get(OPEN);
        Direction facing = state.get(FACING);

        List<BlockPos> stack = new ArrayList<>();
        Set<BlockPos> visited = new HashSet<>();
        stack.add(pos);

        while (!stack.isEmpty())
        {
            BlockPos currentPos = stack.remove(stack.size() - 1);
            if (!visited.add(currentPos)) continue;

            BlockState currentState = world.getBlockState(currentPos);

            if ((currentState.getBlock() instanceof EmptyWindowVerticalBlock || currentState.getBlock() instanceof WindowVerticalBlock) &&
                    currentState.get(FACING) == facing)
            {

                Variant currentVariant = currentState.get(EmptyWindowVerticalBlock.VARIANT);

                if (currentVariant == Variant.UP || currentVariant == Variant.DOWN || currentVariant == Variant.CENTER)
                {
                    world.setBlockState(currentPos, currentState.with(OPEN, newOpen), Block.NOTIFY_ALL);

                    stack.add(currentPos.up());
                    stack.add(currentPos.down());
                }
                else if (currentVariant == EmptyWindowVerticalBlock.Variant.NORMAL)
                {
                    world.setBlockState(currentPos, currentState.with(OPEN, newOpen), Block.NOTIFY_ALL);
                }
            }
        }

        return ActionResult.SUCCESS;
    }


    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        boolean waterlogged = ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER;
        return this.getDefaultState()
                .with(FACING, ctx.getHorizontalPlayerFacing())
                .with(WATERLOGGED, waterlogged);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        if (state.get(WATERLOGGED))
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));

        return updateVerticalWindowVariant(state, world, pos);
    }

    @Override
    public FluidState getFluidState(BlockState state)
    {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify)
    {
        super.onBlockAdded(state, world, pos, oldState, notify);
        updateSurroundingVerticalWindows(world, pos);
    }

    private void updateSurroundingVerticalWindows(World world, BlockPos pos)
    {
        for (Direction direction : new Direction[]{Direction.UP, Direction.DOWN})
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() instanceof EmptyWindowVerticalBlock)
                world.setBlockState(neighborPos, updateVerticalWindowVariant(neighborState, world, neighborPos));
        }
    }

    private BlockState updateVerticalWindowVariant(BlockState state, WorldAccess world, BlockPos pos)
    {
        Direction facing = state.get(FACING);
        BlockPos upPos = pos.up();
        BlockPos downPos = pos.down();

        boolean upConnected = isWindow(world, upPos, facing);
        boolean downConnected = isWindow(world, downPos, facing);

        Variant variant = Variant.NORMAL;
        if (upConnected && downConnected)
            variant = Variant.CENTER;
        else if (upConnected)
            variant = Variant.DOWN;
        else if (downConnected)
            variant = Variant.UP;

        BlockPos leftPos = pos.offset(facing.rotateYClockwise());
        boolean flipped = isWindow(world, leftPos, facing);

        return state.with(VARIANT, variant).with(FLIPPED, flipped);
    }

    private boolean isWindow(WorldAccess world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() instanceof EmptyWindowVerticalBlock && state.get(FACING) == facing;
    }
}