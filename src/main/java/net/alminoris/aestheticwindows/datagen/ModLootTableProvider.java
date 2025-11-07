package net.alminoris.aestheticwindows.datagen;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
        for(String name : BlockSetsHelper.getWoodsNStones())
        {
            addDrop(ModBlocks.EMPTY_WINDOWS.get(name));
            addDrop(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name));
            addDrop(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name));
            addDrop(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name));

            addDropWithSilkTouch(ModBlocks.WINDOWS.get(name), Blocks.GLASS_PANE);
            addDropWithSilkTouch(ModBlocks.VERTICAL_WINDOWS.get(name), Blocks.GLASS_PANE);
            addDropWithSilkTouch(ModBlocks.FOURPANE_WINDOWS.get(name), Blocks.GLASS_PANE);
            addDropWithSilkTouch(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), Blocks.GLASS_PANE);
        }
    }
}