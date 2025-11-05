package net.alminoris.aestheticwindows.block.custom;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.VoxelShapeHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
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
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class FourpaneWindowVerticalBlock extends BaseWindowVerticalBlock
{
    public FourpaneWindowVerticalBlock(Settings settings)
    {
        super(settings);
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool)
    {
        super.afterBreak(world, player, pos, state, blockEntity, tool);

        if (!world.isClient() && !getMaterialName().isEmpty())
        {
            world.setBlockState(pos, ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(getMaterialName()).getDefaultState()
                    .with(FACING, state.get(FACING))
                    .with(VARIANT, Variant.valueOf(String.valueOf(state.get(VARIANT))))
                    .with(OPEN, state.get(OPEN))
                    .with(WATERLOGGED, state.get(WATERLOGGED)));
        }
    }

    private String getMaterialName()
    {
        if (getKeyByValue((Hashtable<String, Block>)ModBlocks.VERTICAL_FOURPANE_WINDOWS, this) != null)
            return getKeyByValue((Hashtable<String, Block>)ModBlocks.VERTICAL_FOURPANE_WINDOWS, this);

        return "";
    }

    public static String getKeyByValue(Hashtable<String, Block> table, Block value)
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