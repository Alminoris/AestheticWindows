package net.alminoris.aestheticwindows;

import net.alminoris.aestheticwindows.datagen.ModBlockTagProvider;
import net.alminoris.aestheticwindows.datagen.ModLootTableProvider;
import net.alminoris.aestheticwindows.datagen.ModModelProvider;
import net.alminoris.aestheticwindows.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticWindowsDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
	}
}
