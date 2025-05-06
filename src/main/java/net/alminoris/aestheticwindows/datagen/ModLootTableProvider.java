package net.alminoris.aestheticwindows.datagen;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables()
    {
        for(String name : BlockSetsHelper.getStones())
        {

        }

        for(String name : BlockSetsHelper.getWoods())
        {
            addDrop(ModBlocks.WINDOWS.get(name));
            addDrop(ModBlocks.VERTICAL_WINDOWS.get(name));
            addDrop(ModBlocks.FOURPANE_WINDOWS.get(name));
            addDrop(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            addDrop(ModBlocks.WINDOWS.get(name));
            addDrop(ModBlocks.VERTICAL_WINDOWS.get(name));
            addDrop(ModBlocks.FOURPANE_WINDOWS.get(name));
            addDrop(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name));
        }
    }
}