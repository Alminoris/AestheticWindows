package net.alminoris.aestheticwindows.block.custom;

import net.alminoris.aestheticwindows.util.helper.VoxelShapeHelper;
import net.minecraft.block.AbstractBlock;
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
import java.util.List;

public class WindowBlock extends YAxisRotatedBlock
{
    protected static final VoxelShape SHAPE = Block.createCuboidShape(
            0.0D, 0.0D, 6.5D,
            16.0D, 16.0D, 9.5D
    );

    protected static final VoxelShape UP = Block.createCuboidShape(
            1.0D, 15.0D, 6.5D,
            15.0D, 16.0D, 9.5D
    );

    protected static final VoxelShape DOWN = Block.createCuboidShape(
            1.0D, 0.0D, 6.5D,
            15.0D, 1.0D, 9.5D
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

    public enum Variant implements StringIdentifiable
    {
        NORMAL("normal"),
        CENTER("center"),
        LEFT("left"),
        RIGHT("right");

        private final String name;

        Variant(String name) { this.name = name; }

        @Override
        public String asString() { return this.name; }
    }

    public static final BooleanProperty OPEN = BooleanProperty.of("open");

    public static final EnumProperty<Variant> VARIANT = EnumProperty.of("variant", Variant.class);

    public WindowBlock(AbstractBlock.Settings settings)
    {
        super(settings.nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(VARIANT, Variant.NORMAL).with(OPEN, false).with(WATERLOGGED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING, VARIANT, OPEN, WATERLOGGED);
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
        if (state.get(OPEN))
        {
            boxes.add(UP.getBoundingBox());
            boxes.add(DOWN.getBoundingBox());
            boxes.add(LEFT.getBoundingBox());
            boxes.add(RIGHT.getBoundingBox());
        }
        else
        {
            boxes.add(SHAPE.getBoundingBox());
        }

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit)
    {
        if (!player.getMainHandStack().isEmpty())
        {
            return ActionResult.PASS;
        }

        Variant currentVariant = state.get(VARIANT);
        boolean currentOpen = state.get(OPEN);

        if (!world.isClient)
        {
            currentOpen = !currentOpen;
            Direction currentFacing = state.get(FACING);
            world.setBlockState(pos, state
                    .with(FACING, currentFacing)
                    .with(VARIANT, currentVariant)
                    .with(OPEN, currentOpen));

            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hit);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        boolean waterlogged = ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER;
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing()).with(WATERLOGGED, waterlogged);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos)
    {
        if (state.get(WATERLOGGED))
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));

        return updateGardenWindowVariant(state, world, pos);
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
        updateSurroundingGardenWindows(world, pos);
    }

    private void updateSurroundingGardenWindows(World world, BlockPos pos)
    {
        for (Direction direction : Direction.Type.HORIZONTAL)
        {
            BlockPos neighborPos = pos.offset(direction);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.getBlock() instanceof WindowBlock)
                world.setBlockState(neighborPos, updateGardenWindowVariant(neighborState, world, neighborPos));
        }
    }

    private BlockState updateGardenWindowVariant(BlockState state, WorldAccess world, BlockPos pos)
    {
        Direction facing = state.get(FACING);

        BlockPos leftPos = pos.offset(facing.rotateYCounterclockwise());
        BlockPos rightPos = pos.offset(facing.rotateYClockwise());

        boolean leftConnected = isWindow(world, leftPos, facing);
        boolean rightConnected = isWindow(world, rightPos, facing);

        if (leftConnected && rightConnected)
            return state.with(VARIANT, Variant.CENTER);
        else if (leftConnected)
            return state.with(VARIANT, Variant.RIGHT);
        else if (rightConnected)
            return state.with(VARIANT, Variant.LEFT);
        else
            return state.with(VARIANT, Variant.NORMAL);
    }

    private boolean isWindow(WorldAccess world, BlockPos pos, Direction facing)
    {
        BlockState state = world.getBlockState(pos);
        return state.getBlock() instanceof WindowBlock && state.get(FACING) == facing;
    }
}