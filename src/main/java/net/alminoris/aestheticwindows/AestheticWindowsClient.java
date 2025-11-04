package net.alminoris.aestheticwindows;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class AestheticWindowsClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        for(String name : BlockSetsHelper.getWoodsNStones())
        {
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WINDOWS.get(name), RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VERTICAL_WINDOWS.get(name), RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FOURPANE_WINDOWS.get(name), RenderLayer.getTranslucent());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), RenderLayer.getTranslucent());
        }
    }
}