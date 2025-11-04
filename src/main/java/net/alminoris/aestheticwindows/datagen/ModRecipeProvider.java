package net.alminoris.aestheticwindows.datagen;

import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.alminoris.aestheticwindows.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name+"_planks"));

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name), block, 1);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WINDOWS.get(name))
                    .input(ModBlocks.EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_WINDOWS.get(name))
                    .input(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOURPANE_WINDOWS.get(name))
                    .input(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name))
                    .input(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name), block, 1);
            offerStonecuttingRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name), block, 1);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WINDOWS.get(name))
                    .input(ModBlocks.EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_WINDOWS.get(name))
                    .input(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOURPANE_WINDOWS.get(name))
                    .input(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name))
                    .input(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name))
                    .input(Blocks.GLASS_PANE)
                    .criterion(hasItem(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)), conditionsFromItem(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)))
                    .criterion(hasItem(Blocks.GLASS_PANE), conditionsFromItem(Blocks.GLASS_PANE))
                    .offerTo(recipeExporter);
        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("arborealnature:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.WT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("whisperleaftrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.ST_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("silverwoodtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.MT_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("missingtrees:"+name+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for(String name : BlockSetsHelper.NSS_WOOD_NAMES)
        {
            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");

            ModJsonHelper.createStonecuttingRecipe("natures_spirit:"+name.replace("_nss", "")+"_planks",
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath(), "1");
        }

        for (String name: BlockSetsHelper.getWoodsNStones())
        {
            ModJsonHelper.createShapelessRecipe("minecraft:glass_pane",
                    "minecraft:"+Registries.BLOCK.getId(ModBlocks.WINDOWS.get(name)).getPath(),
                    Registries.BLOCK.getId(ModBlocks.EMPTY_WINDOWS.get(name)).getPath());

            ModJsonHelper.createShapelessRecipe("minecraft:glass_pane",
                    "minecraft:"+Registries.BLOCK.getId(ModBlocks.VERTICAL_WINDOWS.get(name)).getPath(),
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_EMPTY_WINDOWS.get(name)).getPath());

            ModJsonHelper.createShapelessRecipe("minecraft:glass_pane",
                    "minecraft:"+Registries.BLOCK.getId(ModBlocks.FOURPANE_WINDOWS.get(name)).getPath(),
                    Registries.BLOCK.getId(ModBlocks.FOURPANE_EMPTY_WINDOWS.get(name)).getPath());

            ModJsonHelper.createShapelessRecipe("minecraft:glass_pane",
                    "minecraft:"+Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name)).getPath(),
                    Registries.BLOCK.getId(ModBlocks.VERTICAL_FOURPANE_EMPTY_WINDOWS.get(name)).getPath());
        }
    }
}