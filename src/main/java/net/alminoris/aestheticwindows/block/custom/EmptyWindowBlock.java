package net.alminoris.aestheticwindows.block.custom;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class EmptyWindowBlock extends BaseWindowBlock
{
    public EmptyWindowBlock(Settings settings)
    {
        super(settings.nonOpaque());
    }

    @Override
    protected VoxelShape getRotatedShape(BlockState state)
    {
        Direction direction = state.get(FACING);

        List<Box> boxes = new ArrayList<>();
        boxes.add(UP.getBoundingBox());
        boxes.add(DOWN.getBoundingBox());
        boxes.add(LEFT.getBoundingBox());
        boxes.add(RIGHT.getBoundingBox());

        return VoxelShapeHelper.rotateShape(boxes, direction);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit)
    {
        ItemStack stack = player.getMainHandStack();
        if (!world.isClient() && !getMaterialName().isEmpty() && isGlassBlockInStack(stack))
        {
            stack.decrement(1);

            String colorName;
            if (!stack.isOf(Blocks.GLASS_PANE.asItem()))
                colorName = Registries.ITEM.getId(stack.getItem()).getPath().replace("_stained_glass_pane", "");
            else
                colorName = "none";

            world.setBlockState(pos, ModBlocks.WINDOWS.get(getMaterialName()).getDefaultState()
                    .with(FACING, state.get(FACING))
                    .with(VARIANT, state.get(VARIANT))
                    .with(GLASS_COLOR, GlassColor.fromString(colorName))
                    .with(OPEN, state.get(OPEN))
                    .with(WATERLOGGED, state.get(WATERLOGGED)));

            return ActionResult.SUCCESS;
        }

        return super.onUse(state, world, pos, player, hand, hit);
    }

    private String getMaterialName()
    {
        if (getKeyByValue((Hashtable<String, Block>)ModBlocks.EMPTY_WINDOWS, this) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.EMPTY_WINDOWS, this);

        return "";
    }
}