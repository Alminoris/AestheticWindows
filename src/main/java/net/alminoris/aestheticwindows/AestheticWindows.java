package net.alminoris.aestheticwindows;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.item.ModItemGroups;
import net.alminoris.aestheticwindows.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AestheticWindows implements ModInitializer
{
	public static final String MOD_ID = "aestheticwindows";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModItemGroups.registerItemGroups();
	}
}