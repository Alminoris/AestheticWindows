package net.alminoris.aestheticwindows.util.helper;

import net.alminoris.aestheticwindows.AestheticWindows;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModJsonHelper
{
    public static void registerWindowBlockModel(String jsonContent, String name, String textureBase, String textureGlass,
                                                String textureHandle, String variant, boolean isOpen, boolean isFlipped)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticWindows.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + (isOpen ? "_open" : "") + (variant.equals("normal") ? "" : ("_" + variant)) + (isFlipped ? "_flipped" : "")  + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("BASE_NAME", textureBase).replace("GLASS_NAME", textureGlass).replace("HANDLE_NAME", textureHandle);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void registerWindowBlockModel(String jsonContent, String name, String textureBase, String textureGlass,
                                                String textureHandle, String variant, boolean isOpen)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticWindows.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + (isOpen ? "_open" : "") + (variant.equals("normal") ? "" : ("_" + variant)) + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("BASE_NAME", textureBase).replace("GLASS_NAME", textureGlass).replace("HANDLE_NAME", textureHandle);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createStonecuttingRecipe(String ingredientName, String outputName, String count)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/data/"+ AestheticWindows.MOD_ID+"/recipe/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = outputName + "_from_" + ingredientName.split(":")[1] + "_stonecutting.json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.STONECUTTING_RECIPE.replace("COUNT", count)
                .replace("INGREDIENT_NAME", ingredientName).replace("OUTPUT_NAME", outputName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createBlockstate(String jsonContent, String name)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticWindows.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("NAME", name);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}