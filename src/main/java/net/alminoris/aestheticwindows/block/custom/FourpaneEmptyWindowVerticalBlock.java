package net.alminoris.aestheticwindows.block.custom;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Hashtable;
import java.util.Map;

public class FourpaneEmptyWindowVerticalBlock extends BaseWindowVerticalBlock
{
    public FourpaneEmptyWindowVerticalBlock(Settings settings)
    {
        super(settings.nonOpaque());
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit)
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

            world.setBlockState(pos, ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(getMaterialName()).getDefaultState()
                    .with(FACING, state.get(FACING))
                    .with(VARIANT, state.get(VARIANT))
                    .with(GLASS_COLOR, GlassColor.fromString(colorName))
                    .with(OPEN, state.get(OPEN))
                    .with(WATERLOGGED, state.get(WATERLOGGED)));

            return ActionResult.SUCCESS;
        }

        return super.onUse(state, world, pos, player, hit);
    }

    private String getMaterialName()
    {
        if (getKeyByValue((Hashtable<String, Block>)ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS, this) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS, this);

        return "";
    }
}