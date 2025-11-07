package net.alminoris.aestheticwindows.datagen;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.item.ModItemGroups;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.alminoris.aestheticwindows.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Arrays;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataGenerator output)
    {
        super(output);
    }

    @Override
    public void generateRecipes(Consumer<RecipeJsonProvider> recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registry.BLOCK.get(new Identifier("minecraft",name+"_planks"));

            offerStonecuttingRecipe(recipeExporter, ModBlocks.EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name), block, 1);

            ShapelessRecipeJsonBuilder.create(ModBlocks.WINDOWS.get(name))
                    .input(ModBlocks.EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(ModBlocks.VERTICAL_WINDOWS.get(name))
                    .input(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(ModBlocks.FOURPANE_WINDOWS.get(name))
                    .input(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name))
                    .input(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registry.BLOCK.get(new Identifier("minecraft", name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            offerStonecuttingRecipe(recipeExporter, ModBlocks.EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name), block, 1);

            ShapelessRecipeJsonBuilder.create(ModBlocks.WINDOWS.get(name))
                    .input(ModBlocks.EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(ModBlocks.VERTICAL_WINDOWS.get(name))
                    .input(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(ModBlocks.FOURPANE_WINDOWS.get(name))
                    .input(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name))
                    .input(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.WT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.ST_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.MT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : ModItemGroups.NSS_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for (String name: BlockSetsHelper.getWoodsNStones())
        {
            if (Arrays.asList(BlockSetsHelper.STONES).contains(name) || Arrays.asList(BlockSetsHelper.WOODS).contains(name))
                continue;

            ModJsonHelper.createShapelessRecipe("minecraft:glass_pane",
                    "aestheticwindows:"+Registry.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(),
                    Registry.BLOCK.getId(ModBlocks.WINDOWS.get(name)).getPath());

            ModJsonHelper.createShapelessRecipe("minecraft:glass_pane",
                    "aestheticwindows:"+Registry.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(),
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_WINDOWS.get(name)).getPath());

            ModJsonHelper.createShapelessRecipe("minecraft:glass_pane",
                    "aestheticwindows:"+Registry.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(),
                    Registry.BLOCK.getId(ModBlocks.FOURPANE_WINDOWS.get(name)).getPath());

            ModJsonHelper.createShapelessRecipe("minecraft:glass_pane",
                    "aestheticwindows:"+Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(),
                    Registry.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name)).getPath());
        }
    }
}