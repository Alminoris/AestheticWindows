package net.alminoris.aestheticwindows.block;

import net.alminoris.aestheticwindows.AestheticWindows;
import net.alminoris.aestheticwindows.block.custom.FourpaneWindowBlock;
import net.alminoris.aestheticwindows.block.custom.FourpaneWindowVerticalBlock;
import net.alminoris.aestheticwindows.block.custom.WindowBlock;
import net.alminoris.aestheticwindows.block.custom.WindowVerticalBlock;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoodsNStones())
        {
            put(name, registerBlock("window_"+name, new WindowBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))));
        }
    }};

    public static final Dictionary<String, Block> VERTICAL_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoodsNStones())
        {
            put(name, registerBlock("vertical_window_"+name, new WindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))));
        }
    }};

    public static final Dictionary<String, Block> FOURPANE_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoodsNStones())
        {
            put(name, registerBlock("fourpane_window_"+name, new FourpaneWindowBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))));
        }
    }};

    public static final Dictionary<String, Block> VERTICAL_FOURPANE_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoodsNStones())
        {
            put(name, registerBlock("vertical_fourpane_window_"+name, new FourpaneWindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.GLASS_PANE))));
        }
    }};

    public static final Dictionary<String, Block> EMPTY_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("empty_window_"+name, new WindowBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("empty_window_"+name, new WindowBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static final Dictionary<String, Block> VERTICAL_EMPTY_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("vertical_empty_window_"+name, new WindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("vertical_empty_window_"+name, new WindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static final Dictionary<String, Block> FOURPANE_EMPTY_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("fourpane_empty_window_"+name, new FourpaneWindowBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("fourpane_empty_window_"+name, new FourpaneWindowBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static final Dictionary<String, Block> VERTICAL_FOURPANE_EMPTY_WINDOWS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock("vertical_fourpane_empty_window_"+name, new FourpaneWindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD))));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock("vertical_fourpane_empty_window_"+name, new FourpaneWindowVerticalBlock(AbstractBlock.Settings.copy(Blocks.STONE))));
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AestheticWindows.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AestheticWindows.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {

    }
}