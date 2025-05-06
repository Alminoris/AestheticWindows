package net.alminoris.aestheticwindows.block;

import net.alminoris.aestheticwindows.AestheticWindows;
import net.alminoris.aestheticwindows.block.custom.FourpaneWindowBlock;
import net.alminoris.aestheticwindows.block.custom.FourpaneWindowVerticalBlock;
import net.alminoris.aestheticwindows.block.custom.WindowBlock;
import net.alminoris.aestheticwindows.block.custom.WindowVerticalBlock;
import net.alminoris.aestheticwindows.item.ModItemGroups;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("window_"+name, new WindowBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("window_"+name, new WindowBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static final Dictionary<String, Block> VERTICAL_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("vertical_window_"+name, new WindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("vertical_window_"+name, new WindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static final Dictionary<String, Block> FOURPANE_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("fourpane_window_"+name, new FourpaneWindowBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("fourpane_window_"+name, new FourpaneWindowBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static final Dictionary<String, Block> VERTICAL_FOURPANE_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("vertical_fourpane_window_"+name, new FourpaneWindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("vertical_fourpane_window_"+name, new FourpaneWindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, Identifier.of(AestheticWindows.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registry.ITEM, Identifier.of(AestheticWindows.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroups.AWS_TAB)));
    }

    public static void registerBlocks()
    {

    }
}