package net.alminoris.aestheticwindows.datagen;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;


public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataOutput)
    {
        super(dataOutput);
    }

    @Override
    public void generateBlockLootTables()
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