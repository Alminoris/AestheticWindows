package net.alminoris.aestheticwindows.datagen;

import net.alminoris.aestheticwindows.AestheticWindows;
import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.alminoris.aestheticwindows.util.helper.ModJsonHelper;
import net.alminoris.aestheticwindows.util.helper.ModJsonTemplates;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            String modId = Arrays.asList(BlockSetsHelper.WOODS).contains(name) ? "minecraft" : "aestheticwindows";

            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.WINDOW, ModJsonTemplates.WINDOW_CENTER,
                    ModJsonTemplates.WINDOW_LEFT, ModJsonTemplates.WINDOW_RIGHT,
                    ModJsonTemplates.WINDOW_OPEN, ModJsonTemplates.WINDOW_OPEN_CENTER,
                    ModJsonTemplates.WINDOW_OPEN_LEFT, ModJsonTemplates.WINDOW_OPEN_RIGHT,
                    ModBlocks.WINDOWS.get(name), name, modId);

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_WINDOW, ModJsonTemplates.VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_UP, ModJsonTemplates.VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN, ModJsonTemplates.VERTICAL_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_WINDOWS.get(name), name, modId);

            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_WINDOW, ModJsonTemplates.FOURPANE_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT, ModJsonTemplates.FOURPANE_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_WINDOW_OPEN, ModJsonTemplates.FOURPANE_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_WINDOWS.get(name), name, modId);

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), name, modId);


            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.EMPTY_WINDOW, ModJsonTemplates.EMPTY_WINDOW_CENTER,
                    ModJsonTemplates.EMPTY_WINDOW_LEFT, ModJsonTemplates.EMPTY_WINDOW_RIGHT,
                    ModJsonTemplates.EMPTY_WINDOW_OPEN, ModJsonTemplates.EMPTY_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.EMPTY_WINDOW_OPEN_LEFT, ModJsonTemplates.EMPTY_WINDOW_OPEN_RIGHT,
                    ModBlocks.EMPTY_WINDOWS.get(name), name, modId);

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_UP, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name), name, modId);

            registerWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_EMPTY_WINDOW, ModJsonTemplates.FOURPANE_EMPTY_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_EMPTY_WINDOW_LEFT, ModJsonTemplates.FOURPANE_EMPTY_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_EMPTY_WINDOW_OPEN, ModJsonTemplates.FOURPANE_EMPTY_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_EMPTY_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_EMPTY_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name), name, modId);

            registerVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name), name, modId);
        }

        for(String name : BlockSetsHelper.getStones())
        {
            String modId = Arrays.asList(BlockSetsHelper.STONES).contains(name) ? "minecraft" : "aestheticwindows";

            registerStoneWindow(blockStateModelGenerator,
                    ModJsonTemplates.WINDOW, ModJsonTemplates.WINDOW_CENTER,
                    ModJsonTemplates.WINDOW_LEFT, ModJsonTemplates.WINDOW_RIGHT,
                    ModJsonTemplates.WINDOW_OPEN, ModJsonTemplates.WINDOW_OPEN_CENTER,
                    ModJsonTemplates.WINDOW_OPEN_LEFT, ModJsonTemplates.WINDOW_OPEN_RIGHT,
                    ModBlocks.WINDOWS.get(name), name, modId);

            registerStoneVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_WINDOW, ModJsonTemplates.VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_UP, ModJsonTemplates.VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN, ModJsonTemplates.VERTICAL_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_WINDOWS.get(name), name, modId);

            registerStoneWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_WINDOW, ModJsonTemplates.FOURPANE_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT, ModJsonTemplates.FOURPANE_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_WINDOW_OPEN, ModJsonTemplates.FOURPANE_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_WINDOWS.get(name), name, modId);

            registerStoneVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name), name, modId);

            registerStoneWindow(blockStateModelGenerator,
                    ModJsonTemplates.EMPTY_WINDOW, ModJsonTemplates.EMPTY_WINDOW_CENTER,
                    ModJsonTemplates.EMPTY_WINDOW_LEFT, ModJsonTemplates.EMPTY_WINDOW_RIGHT,
                    ModJsonTemplates.EMPTY_WINDOW_OPEN, ModJsonTemplates.EMPTY_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.EMPTY_WINDOW_OPEN_LEFT, ModJsonTemplates.EMPTY_WINDOW_OPEN_RIGHT,
                    ModBlocks.EMPTY_WINDOWS.get(name), name, modId);

            registerStoneVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_CENTER,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_UP, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_DOWN,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN_CENTER,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN_UP, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN_DOWN,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_FLIPPED, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_UP_FLIPPED, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.VERTICAL_EMPTY_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.VERTICAL_EMPTY_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name), name, modId);

            registerStoneWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_EMPTY_WINDOW, ModJsonTemplates.FOURPANE_EMPTY_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_EMPTY_WINDOW_LEFT, ModJsonTemplates.FOURPANE_EMPTY_WINDOW_RIGHT,
                    ModJsonTemplates.FOURPANE_EMPTY_WINDOW_OPEN, ModJsonTemplates.FOURPANE_EMPTY_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_EMPTY_WINDOW_LEFT_OPEN, ModJsonTemplates.FOURPANE_EMPTY_WINDOW_RIGHT_OPEN,
                    ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name), name, modId);

            registerStoneVerticalWindow(blockStateModelGenerator,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_UP, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_UP_OPEN, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_OPEN,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_UP_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_CENTER_OPEN_FLIPPED,
                    ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_UP_OPEN_FLIPPED, ModJsonTemplates.FOURPANE_VERTICAL_EMPTY_WINDOW_DOWN_OPEN_FLIPPED,
                    ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name), name, modId);
        }
    }

    public final void registerWindow(BlockStateModelGenerator blockStateModelGenerator, String normal,
                                     String center, String left, String right,
                                     String normalOpen, String centerOpen, String leftOpen, String rightOpen,Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.registerWindowBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", false);
        ModJsonHelper.registerWindowBlockModel(center, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "center", false);
        ModJsonHelper.registerWindowBlockModel(left, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "left", false);
        ModJsonHelper.registerWindowBlockModel(right, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "right", false);

        ModJsonHelper.registerWindowBlockModel(normalOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", true);
        ModJsonHelper.registerWindowBlockModel(centerOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "center", true);
        ModJsonHelper.registerWindowBlockModel(leftOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "left", true);
        ModJsonHelper.registerWindowBlockModel(rightOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "right", true);

        String filePath = System.getProperty("user.dir").replace("build\\datagen",
                "src\\main\\resources") + "/assets/"+ AestheticWindows.MOD_ID+"/custom_blockstates/simple_window.json";
        String s = "";
        try { s = Files.readString(Paths.get(filePath)); } catch (IOException ignored) {}

        ModJsonHelper.createBlockstate(s, Registries.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticWindows.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()));
    }

    public final void registerStoneWindow(BlockStateModelGenerator blockStateModelGenerator, String normal,
                                     String center, String left, String right,
                                     String normalOpen, String centerOpen, String leftOpen, String rightOpen,Block table, String name, String modId)
    {
        ModJsonHelper.registerWindowBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "normal", false);
        ModJsonHelper.registerWindowBlockModel(center, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "center", false);
        ModJsonHelper.registerWindowBlockModel(left, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "left", false);
        ModJsonHelper.registerWindowBlockModel(right, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "right", false);

        ModJsonHelper.registerWindowBlockModel(normalOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "normal", true);
        ModJsonHelper.registerWindowBlockModel(centerOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "center", true);
        ModJsonHelper.registerWindowBlockModel(leftOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "left", true);
        ModJsonHelper.registerWindowBlockModel(rightOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "right", true);


        String filePath = System.getProperty("user.dir").replace("build\\datagen",
                "src\\main\\resources") + "/assets/"+ AestheticWindows.MOD_ID+"/custom_blockstates/simple_window.json";
        String s = "";
        try { s = Files.readString(Paths.get(filePath)); } catch (IOException ignored) {}

        ModJsonHelper.createBlockstate(s, Registries.BLOCK.getId(table).getPath());

        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticWindows.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()));
    }

    public final void registerVerticalWindow(BlockStateModelGenerator blockStateModelGenerator,
                                             String normal, String center, String up, String down,
                                             String normalOpen, String centerOpen, String upOpen, String downOpen,
                                             String normalFlipped, String centerFlipped, String upFlipped, String downFlipped,
                                             String normalOpenFlipped, String centerOpenFlipped, String upOpenFlipped, String downOpenFlipped,
                                             Block table, String name, String modId)
    {
        String logName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");

        ModJsonHelper.registerWindowBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", false, false);
        ModJsonHelper.registerWindowBlockModel(center, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "center", false, false);
        ModJsonHelper.registerWindowBlockModel(up, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "up", false, false);
        ModJsonHelper.registerWindowBlockModel(down, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "down", false, false);

        ModJsonHelper.registerWindowBlockModel(normalOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", true, false);
        ModJsonHelper.registerWindowBlockModel(centerOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "center", true, false);
        ModJsonHelper.registerWindowBlockModel(upOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "up", true, false);
        ModJsonHelper.registerWindowBlockModel(downOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "down", true, false);

        ModJsonHelper.registerWindowBlockModel(normalFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", false, true);
        ModJsonHelper.registerWindowBlockModel(centerFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "center", false, true);
        ModJsonHelper.registerWindowBlockModel(upFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "up", false, true);
        ModJsonHelper.registerWindowBlockModel(downFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "down", false, true);

        ModJsonHelper.registerWindowBlockModel(normalOpenFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "normal", true, true);
        ModJsonHelper.registerWindowBlockModel(centerOpenFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "center", true, true);
        ModJsonHelper.registerWindowBlockModel(upOpenFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "up", true, true);
        ModJsonHelper.registerWindowBlockModel(downOpenFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/stripped_"+name+"_"+logName,
                "aestheticwindows:block/glass",
                modId+":block/"+name+"_"+logName,
                "down", true, true);

        String filePath = System.getProperty("user.dir").replace("build\\datagen",
                "src\\main\\resources") + "/assets/"+ AestheticWindows.MOD_ID+"/custom_blockstates/vertical_window.json";
        String s = "";
        try { s = Files.readString(Paths.get(filePath)); } catch (IOException ignored) {}

        ModJsonHelper.createBlockstate(s, Registries.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticWindows.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()));
    }

    public final void registerStoneVerticalWindow(BlockStateModelGenerator blockStateModelGenerator,
                                             String normal, String center, String up, String down,
                                             String normalOpen, String centerOpen, String upOpen, String downOpen,
                                             String normalFlipped, String centerFlipped, String upFlipped, String downFlipped,
                                             String normalOpenFlipped, String centerOpenFlipped, String upOpenFlipped, String downOpenFlipped,
                                             Block table, String name, String modId)
    {
        ModJsonHelper.registerWindowBlockModel(normal, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "normal", false, false);
        ModJsonHelper.registerWindowBlockModel(center, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "center", false, false);
        ModJsonHelper.registerWindowBlockModel(up, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "up", false, false);
        ModJsonHelper.registerWindowBlockModel(down, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "down", false, false);

        ModJsonHelper.registerWindowBlockModel(normalOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "normal", true, false);
        ModJsonHelper.registerWindowBlockModel(centerOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "center", true, false);
        ModJsonHelper.registerWindowBlockModel(upOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "up", true, false);
        ModJsonHelper.registerWindowBlockModel(downOpen, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "down", true, false);

        ModJsonHelper.registerWindowBlockModel(normalFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "normal", false, true);
        ModJsonHelper.registerWindowBlockModel(centerFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "center", false, true);
        ModJsonHelper.registerWindowBlockModel(upFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "up", false, true);
        ModJsonHelper.registerWindowBlockModel(downFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "down", false, true);

        ModJsonHelper.registerWindowBlockModel(normalOpenFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "normal", true, true);
        ModJsonHelper.registerWindowBlockModel(centerOpenFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "center", true, true);
        ModJsonHelper.registerWindowBlockModel(upOpenFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "up", true, true);
        ModJsonHelper.registerWindowBlockModel(downOpenFlipped, Registries.BLOCK.getId(table).getPath(),
                modId+":block/"+name,
                "aestheticwindows:block/glass",
                modId+":block/"+name,
                "down", true, true);

        String filePath = System.getProperty("user.dir").replace("build\\datagen",
                "src\\main\\resources") + "/assets/"+ AestheticWindows.MOD_ID+"/custom_blockstates/vertical_window.json";
        String s = "";
        try { s = Files.readString(Paths.get(filePath)); } catch (IOException ignored) {}

        ModJsonHelper.createBlockstate(s, Registries.BLOCK.getId(table).getPath());
        blockStateModelGenerator.registerParentedItemModel(table, Identifier.of(AestheticWindows.MOD_ID, "block/"+Registries.BLOCK.getId(table).getPath()));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
    }
}