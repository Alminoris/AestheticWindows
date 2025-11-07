package net.alminoris.aestheticwindows.block.custom;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.Hashtable;
import java.util.Map;

public class FourpaneWindowBlock extends BaseWindowBlock
{
    public FourpaneWindowBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state)
    {
        super.onBroken(world, pos, state);

        if (!world.isClient() && !getMaterialName().isEmpty())
        {
            world.setBlockState(pos, ModBlocks.FOURPANE_EMPTY_WINDOWS.get(getMaterialName()).getDefaultState()
                    .with(FACING, state.get(FACING))
                    .with(VARIANT, state.get(VARIANT))
                    .with(OPEN, state.get(OPEN))
                    .with(WATERLOGGED, state.get(WATERLOGGED)), 3);
        }
    }

    private String getMaterialName()
    {
        if (getKeyByValue((Hashtable<String, Block>)ModBlocks.FOURPANE_WINDOWS, this) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.FOURPANE_WINDOWS, this);

        return "";
    }
}