package net.alminoris.aestheticwindows.datagen;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
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