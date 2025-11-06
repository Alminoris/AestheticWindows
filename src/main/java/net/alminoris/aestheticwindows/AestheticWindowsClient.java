package net.alminoris.aestheticwindows;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.block.custom.BaseWindowBlock;
import net.alminoris.aestheticwindows.block.custom.BaseWindowVerticalBlock;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.BlockItem;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Identifier;

import java.util.*;
import java.util.stream.Stream;

public class AestheticWindowsClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        for (String name : BlockSetsHelper.getWoodsNStones())
        {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WINDOWS.get(name), RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VERTICAL_WINDOWS.get(name), RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FOURPANE_WINDOWS.get(name), RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), RenderLayer.getTranslucent());
        }

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                {
                    if (tintIndex != 0) return -1;
                    if (state.contains(BaseWindowBlock.GLASS_COLOR))
                    {
                        return getGlassColor(state.get(BaseWindowBlock.GLASS_COLOR));
                    }
                    return 0xFFFFFF;
                }, allWindowBlocks());

        ColorProviderRegistry.ITEM.register((stack, tintIndex) ->
                {
                    if (tintIndex != 0) return -1;
                    if (stack.getItem() instanceof BlockItem blockItem &&
                            blockItem.getBlock() instanceof BaseWindowBlock)
                    {

                        BaseWindowBlock.GlassColor color = BaseWindowBlock.GlassColor.NONE;

                        var customData = stack.get(DataComponentTypes.CUSTOM_DATA);
                        if (customData != null) {
                            NbtCompound nbt = customData.copyNbt();
                            if (nbt.contains("glass_color"))
                            {
                                try
                                {
                                    color = BaseWindowBlock.GlassColor.valueOf(nbt.getString("glass_color").toUpperCase());
                                } catch (Exception ignored) {}
                            }
                        }

                        return getGlassColor(color);
                    }
                    return 0xFFFFFF;
                }, allWindowBlocks());

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
        {
            if (tintIndex != 0) return -1;
            if (state.contains(BaseWindowVerticalBlock.GLASS_COLOR))
            {
                return getGlassColor(state.get(BaseWindowVerticalBlock.GLASS_COLOR));
            }
            return 0xFFFFFF;
        }, allVerticalWindowBlocks());

        ColorProviderRegistry.ITEM.register((stack, tintIndex) ->
        {
            if (tintIndex != 0) return -1;
            if (stack.getItem() instanceof BlockItem blockItem &&
                    blockItem.getBlock() instanceof BaseWindowVerticalBlock)
            {

                BaseWindowVerticalBlock.GlassColor color = BaseWindowVerticalBlock.GlassColor.NONE;

                var customData = stack.get(DataComponentTypes.CUSTOM_DATA);
                if (customData != null) {
                    NbtCompound nbt = customData.copyNbt();
                    if (nbt.contains("glass_color"))
                    {
                        try
                        {
                            color = BaseWindowVerticalBlock.GlassColor.valueOf(nbt.getString("glass_color").toUpperCase());
                        } catch (Exception ignored) {}
                    }
                }

                return getGlassColor(color);
            }
            return 0xFFFFFF;
        }, allVerticalWindowBlocks());
    }

    private static Block[] allWindowBlocks()
    {
        return Stream.of(ModBlocks.WINDOWS.elements(), ModBlocks.FOURPANE_WINDOWS.elements()).flatMap(e ->
        {
            List<Block> list = new ArrayList<>();
            while (e.hasMoreElements()) list.add(e.nextElement());
            return list.stream();
        }).toArray(Block[]::new);
    }

    private static Block[] allVerticalWindowBlocks()
    {
        return Stream.of(ModBlocks.VERTICAL_WINDOWS.elements(), ModBlocks.VERTICAL_FOURPANE_WINDOWS.elements()).flatMap(e ->
        {
            List<Block> list = new ArrayList<>();
            while (e.hasMoreElements()) list.add(e.nextElement());
            return list.stream();
        }).toArray(Block[]::new);
    }

    private static int getGlassColor(BaseWindowBlock.GlassColor color)
    {
        return switch (color)
        {
            case NONE       -> -1;
            case WHITE      -> 0xF9FFFE;
            case ORANGE     -> 0xF9801D;
            case MAGENTA    -> 0xC74EBD;
            case LIGHT_BLUE -> 0x3AB3DA;
            case YELLOW     -> 0xFED83D;
            case LIME       -> 0x80C71F;
            case PINK       -> 0xF38BAA;
            case GRAY       -> 0x474F52;
            case LIGHT_GRAY -> 0x9D9D97;
            case CYAN       -> 0x169C9C;
            case PURPLE     -> 0x8932B8;
            case BLUE       -> 0x3C44AA;
            case BROWN      -> 0x835432;
            case GREEN      -> 0x5E7C16;
            case RED        -> 0xB02E26;
            case BLACK      -> 0x1D1D21;
        };
    }

    private static int getGlassColor(BaseWindowVerticalBlock.GlassColor color)
    {
        return switch (color)
        {
            case NONE       -> -1;
            case WHITE      -> 0xF9FFFE;
            case ORANGE     -> 0xF9801D;
            case MAGENTA    -> 0xC74EBD;
            case LIGHT_BLUE -> 0x3AB3DA;
            case YELLOW     -> 0xFED83D;
            case LIME       -> 0x80C71F;
            case PINK       -> 0xF38BAA;
            case GRAY       -> 0x474F52;
            case LIGHT_GRAY -> 0x9D9D97;
            case CYAN       -> 0x169C9C;
            case PURPLE     -> 0x8932B8;
            case BLUE       -> 0x3C44AA;
            case BROWN      -> 0x835432;
            case GREEN      -> 0x5E7C16;
            case RED        -> 0xB02E26;
            case BLACK      -> 0x1D1D21;
        };
    }
}