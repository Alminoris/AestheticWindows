package net.alminoris.aestheticwindows.block.custom;

import net.alminoris.aestheticwindows.util.helper.BlockShape;
import net.alminoris.aestheticwindows.util.helper.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.ArrayList;
import java.util.List;

public class YAxisRotatedBlock extends Block
{
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    List<BlockShape> shapes;

    public YAxisRotatedBlock(Settings settings, BlockShape... shapes)
    {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
        this.shapes = List.of(shapes);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx)
    {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(FACING);
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
        for(var shape : shapes)
        {
            VoxelShape voxelShape = YAxisRotatedBlock.createCuboidShape(shape.getShapeCoords());
            boxes.add(voxelShape.getBoundingBox());
        }

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    private static VoxelShape createCuboidShape(List<Double> shapeCoords)
    {
        return YAxisRotatedBlock.createCuboidShape(shapeCoords.get(0), shapeCoords.get(1), shapeCoords.get(2),
                shapeCoords.get(3), shapeCoords.get(4), shapeCoords.get(5));
    }
}