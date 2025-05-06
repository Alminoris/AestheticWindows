package net.alminoris.aestheticwindows.datagen;

import net.alminoris.aestheticwindows.AestheticWindows;
import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.alminoris.aestheticwindows.util.helper.ModJsonHelper;
import net.alminoris.aestheticwindows.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.STONES)
        {

        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {

        }

        for(String name : BlockSetsHelper.WOODS)
        {
            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.WINDOW, ModJsonTemplates.WINDOW_CENTER,
                    ModJsonTemplates.WINDOW_LEFT, ModJsonTemplates.WINDOW_RIGHT,
                    ModJsonTemplates.WINDOW_OPEN, ModJsonTemplates.WINDOW_OPEN_CENTER,
                    ModJsonTemplates.WINDOW_OPEN_LEFT, ModJsonTemplates.WINDOW_OPEN_RIGHT,
                    ModBlocks.WINDOWS.get(name), name, "minecraft");

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_WINDOW, ModJsonTemplates.VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_UP, ModJsonTemplates.VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN, ModJsonTemplates.VERTICAL_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_WINDOWS.get(name), name, "minecraft");

            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_WINDOW, ModJsonTemplates.FOURPANE_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT, ModJsonTemplates.FOURPANE_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_WINDOW_OPEN, ModJsonTemplates.FOURPANE_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_WINDOWS.get(name), name, "minecraft");

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), name, "minecraft");
        }

        for(String name : BlockSetsHelper.STONES)
        {
            registerStoneWindow(blockStateModelGenerator,
                    ModJsonTemplates.WINDOW, ModJsonTemplates.WINDOW_CENTER,
                    ModJsonTemplates.WINDOW_LEFT, ModJsonTemplates.WINDOW_RIGHT,
                    ModJsonTemplates.WINDOW_OPEN, ModJsonTemplates.WINDOW_OPEN_CENTER,
                    ModJsonTemplates.WINDOW_OPEN_LEFT, ModJsonTemplates.WINDOW_OPEN_RIGHT,
                    ModBlocks.WINDOWS.get(name), name, "minecraft");

            registerStoneVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_WINDOW, ModJsonTemplates.VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_UP, ModJsonTemplates.VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN, ModJsonTemplates.VERTICAL_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_WINDOWS.get(name), name, "minecraft");

            registerStoneWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_WINDOW, ModJsonTemplates.FOURPANE_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT, ModJsonTemplates.FOURPANE_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_WINDOW_OPEN, ModJsonTemplates.FOURPANE_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_WINDOWS.get(name), name, "minecraft");

            registerStoneVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), name, "minecraft");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.WINDOW, ModJsonTemplates.WINDOW_CENTER,
                    ModJsonTemplates.WINDOW_LEFT, ModJsonTemplates.WINDOW_RIGHT,
                    ModJsonTemplates.WINDOW_OPEN, ModJsonTemplates.WINDOW_OPEN_CENTER,
                    ModJsonTemplates.WINDOW_OPEN_LEFT, ModJsonTemplates.WINDOW_OPEN_RIGHT,
                    ModBlocks.WINDOWS.get(name), name, "aestheticwindows");

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_WINDOW, ModJsonTemplates.VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_UP, ModJsonTemplates.VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN, ModJsonTemplates.VERTICAL_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_WINDOWS.get(name), name, "aestheticwindows");

            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_WINDOW, ModJsonTemplates.FOURPANE_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT, ModJsonTemplates.FOURPANE_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_WINDOW_OPEN, ModJsonTemplates.FOURPANE_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_WINDOWS.get(name), name, "aestheticwindows");

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), name, "aestheticwindows");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.WINDOW, ModJsonTemplates.WINDOW_CENTER,
                    ModJsonTemplates.WINDOW_LEFT, ModJsonTemplates.WINDOW_RIGHT,
                    ModJsonTemplates.WINDOW_OPEN, ModJsonTemplates.WINDOW_OPEN_CENTER,
                    ModJsonTemplates.WINDOW_OPEN_LEFT, ModJsonTemplates.WINDOW_OPEN_RIGHT,
                    ModBlocks.WINDOWS.get(name), name, "aestheticwindows");

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_WINDOW, ModJsonTemplates.VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_UP, ModJsonTemplates.VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN, ModJsonTemplates.VERTICAL_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_WINDOWS.get(name), name, "aestheticwindows");

            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_WINDOW, ModJsonTemplates.FOURPANE_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT, ModJsonTemplates.FOURPANE_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_WINDOW_OPEN, ModJsonTemplates.FOURPANE_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_WINDOWS.get(name), name, "aestheticwindows");

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), name, "aestheticwindows");
        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {
            registerStoneWindow(blockStateModelGenerator,
                    ModJsonTemplates.WINDOW, ModJsonTemplates.WINDOW_CENTER,
                    ModJsonTemplates.WINDOW_LEFT, ModJsonTemplates.WINDOW_RIGHT,
                    ModJsonTemplates.WINDOW_OPEN, ModJsonTemplates.WINDOW_OPEN_CENTER,
                    ModJsonTemplates.WINDOW_OPEN_LEFT, ModJsonTemplates.WINDOW_OPEN_RIGHT,
                    ModBlocks.WINDOWS.get(name), name, "aestheticwindows");

            registerStoneVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_WINDOW, ModJsonTemplates.VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_UP, ModJsonTemplates.VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN, ModJsonTemplates.VERTICAL_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_WINDOWS.get(name), name, "aestheticwindows");

            registerStoneWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_WINDOW, ModJsonTemplates.FOURPANE_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT, ModJsonTemplates.FOURPANE_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_WINDOW_OPEN, ModJsonTemplates.FOURPANE_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_WINDOWS.get(name), name, "aestheticwindows");

            registerStoneVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), name, "aestheticwindows");
        }
    }

    public final void registerWindow(BlockStateModelGenerator blockStateModelGenerator, String normal,
                                     String center, String left, String right,
                                     String normalOpen, String centerOpen, String leftOpen, String rightOpen,Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.registerWindowBlockModel(normal, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", false);
        ModJsonHelper.registerWindowBlockModel(center, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "center", false);
        ModJsonHelper.registerWindowBlockModel(left, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "left", false);
        ModJsonHelper.registerWindowBlockModel(right, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "right", false);

        ModJsonHelper.registerWindowBlockModel(normalOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", true);
        ModJsonHelper.registerWindowBlockModel(centerOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "center", true);
        ModJsonHelper.registerWindowBlockModel(leftOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "left", true);
        ModJsonHelper.registerWindowBlockModel(rightOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "right", true);

        ModJsonHelper.createBlockstate(ModJsonTemplates.SIMPLE_WINDOW_BLOCKSTATE_TEMPLATE, Registry.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, new Identifier(AestheticWindows.MOD_ID, "block/"+Registry.BLOCK.getId(table).getPath()));
    }

    public final void registerStoneWindow(BlockStateModelGenerator blockStateModelGenerator, String normal,
                                     String center, String left, String right,
                                     String normalOpen, String centerOpen, String leftOpen, String rightOpen,Block table, String name, String modId)
    {
        ModJsonHelper.registerWindowBlockModel(normal, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "normal", false);
        ModJsonHelper.registerWindowBlockModel(center, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "center", false);
        ModJsonHelper.registerWindowBlockModel(left, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "left", false);
        ModJsonHelper.registerWindowBlockModel(right, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "right", false);

        ModJsonHelper.registerWindowBlockModel(normalOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "normal", true);
        ModJsonHelper.registerWindowBlockModel(centerOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "center", true);
        ModJsonHelper.registerWindowBlockModel(leftOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "left", true);
        ModJsonHelper.registerWindowBlockModel(rightOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "right", true);

        ModJsonHelper.createBlockstate(ModJsonTemplates.SIMPLE_WINDOW_BLOCKSTATE_TEMPLATE, Registry.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, new Identifier(AestheticWindows.MOD_ID, "block/"+Registry.BLOCK.getId(table).getPath()));
    }

    public final void registerVerticalWindow(BlockStateModelGenerator blockStateModelGenerator,
                                             String normal, String center, String up, String down,
                                             String normalOpen, String centerOpen, String upOpen, String downOpen,
                                             String normalFlipped, String centerFlipped, String upFlipped, String downFlipped,
                                             String normalOpenFlipped, String centerOpenFlipped, String upOpenFlipped, String downOpenFlipped,
                                             Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.registerWindowBlockModel(normal, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", false, false);
        ModJsonHelper.registerWindowBlockModel(center, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "center", false, false);
        ModJsonHelper.registerWindowBlockModel(up, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "up", false, false);
        ModJsonHelper.registerWindowBlockModel(down, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "down", false, false);

        ModJsonHelper.registerWindowBlockModel(normalOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", true, false);
        ModJsonHelper.registerWindowBlockModel(centerOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "center", true, false);
        ModJsonHelper.registerWindowBlockModel(upOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "up", true, false);
        ModJsonHelper.registerWindowBlockModel(downOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "down", true, false);

        ModJsonHelper.registerWindowBlockModel(normalFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", false, true);
        ModJsonHelper.registerWindowBlockModel(centerFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "center", false, true);
        ModJsonHelper.registerWindowBlockModel(upFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "up", false, true);
        ModJsonHelper.registerWindowBlockModel(downFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "down", false, true);

        ModJsonHelper.registerWindowBlockModel(normalOpenFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", true, true);
        ModJsonHelper.registerWindowBlockModel(centerOpenFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "center", true, true);
        ModJsonHelper.registerWindowBlockModel(upOpenFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "up", true, true);
        ModJsonHelper.registerWindowBlockModel(downOpenFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                modId+":block/glass",
                modId+":block/"+name+"_"+logName,
                "down", true, true);

        ModJsonHelper.createBlockstate(ModJsonTemplates.VERTICAL_WINDOW_BLOCKSTATE_TEMPLATE, Registry.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, new Identifier(AestheticWindows.MOD_ID, "block/"+Registry.BLOCK.getId(table).getPath()));
    }

    public final void registerStoneVerticalWindow(BlockStateModelGenerator blockStateModelGenerator,
                                             String normal, String center, String up, String down,
                                             String normalOpen, String centerOpen, String upOpen, String downOpen,
                                             String normalFlipped, String centerFlipped, String upFlipped, String downFlipped,
                                             String normalOpenFlipped, String centerOpenFlipped, String upOpenFlipped, String downOpenFlipped,
                                             Block table, String name, String modId)
    {
        ModJsonHelper.registerWindowBlockModel(normal, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "normal", false, false);
        ModJsonHelper.registerWindowBlockModel(center, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "center", false, false);
        ModJsonHelper.registerWindowBlockModel(up, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "up", false, false);
        ModJsonHelper.registerWindowBlockModel(down, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "down", false, false);

        ModJsonHelper.registerWindowBlockModel(normalOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "normal", true, false);
        ModJsonHelper.registerWindowBlockModel(centerOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "center", true, false);
        ModJsonHelper.registerWindowBlockModel(upOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "up", true, false);
        ModJsonHelper.registerWindowBlockModel(downOpen, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "down", true, false);

        ModJsonHelper.registerWindowBlockModel(normalFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "normal", false, true);
        ModJsonHelper.registerWindowBlockModel(centerFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "center", false, true);
        ModJsonHelper.registerWindowBlockModel(upFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "up", false, true);
        ModJsonHelper.registerWindowBlockModel(downFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "down", false, true);

        ModJsonHelper.registerWindowBlockModel(normalOpenFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "normal", true, true);
        ModJsonHelper.registerWindowBlockModel(centerOpenFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "center", true, true);
        ModJsonHelper.registerWindowBlockModel(upOpenFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "up", true, true);
        ModJsonHelper.registerWindowBlockModel(downOpenFlipped, Registry.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                modId+":block/glass",
                modId+":block/"+name,
                "down", true, true);

        ModJsonHelper.createBlockstate(ModJsonTemplates.VERTICAL_WINDOW_BLOCKSTATE_TEMPLATE, Registry.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, new Identifier(AestheticWindows.MOD_ID, "block/"+Registry.BLOCK.getId(table).getPath()));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
    }
}