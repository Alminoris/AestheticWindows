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

public class WindowBlock extends BaseWindowBlock
{
    public WindowBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    protected void spawnBreakParticles(World world, PlayerEntity player, BlockPos pos, BlockState state)
    {
        super.spawnBreakParticles(world, player, pos, state);

        if (!world.isClient() && !getMaterialName().isEmpty())
        {
            world.setBlockState(pos, ModBlocks.EMPTY_WINDOWS.get(getMaterialName()).getDefaultState()
                    .with(FACING, state.get(FACING))
                    .with(VARIANT, state.get(VARIANT))
                    .with(OPEN, state.get(OPEN))
                    .with(WATERLOGGED, state.get(WATERLOGGED)));
        }
    }

    private String getMaterialName()
    {
        if (getKeyByValue((Hashtable<String, Block>)ModBlocks.WINDOWS, this) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.WINDOWS, this);

        return "";
    }

    private static String getKeyByValue(Hashtable<String, Block> table, Block value)
    {
        for (Map.Entry<String, Block> entry : table.entrySet())
        {
            if (entry.getValue().equals(value))
            {
                return entry.getKey();
            }
        }
        return null;
    }
}