package net.alminoris.aestheticwindows.item;

import net.alminoris.aestheticwindows.AestheticWindows;
import net.alminoris.aestheticwindows.block.ModBlocks;
import net.alminoris.aestheticwindows.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup AWS_TAB = FabricItemGroup.builder(new Identifier(AestheticWindows.MOD_ID, "awstab")).displayName(Text.translatable("itemgroup.awstab"))
                    .icon(() -> new ItemStack(ModBlocks.WINDOWS.get("oak"))).entries((displayContext, entries) ->
                    {
                        for(String name : BlockSetsHelper.STONES)
                        {

                        }
                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {

                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.WINDOWS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.WINDOWS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.WINDOWS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.VERTICAL_WINDOWS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.VERTICAL_WINDOWS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.VERTICAL_WINDOWS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.FOURPANE_WINDOWS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.FOURPANE_WINDOWS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.FOURPANE_WINDOWS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                        {
                            entries.add(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                entries.add(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                entries.add(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.STONES)
                        {
                            entries.add(ModBlocks.WINDOWS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.WINDOWS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.STONES)
                        {
                            entries.add(ModBlocks.VERTICAL_WINDOWS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.VERTICAL_WINDOWS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.STONES)
                        {
                            entries.add(ModBlocks.FOURPANE_WINDOWS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.FOURPANE_WINDOWS.get(name));
                            }
                        }

                        for(String name : BlockSetsHelper.STONES)
                        {
                            entries.add(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                entries.add(ModBlocks.VERTICAL_FOURPANE_WINDOWS.get(name));
                            }
                        }
                    }).build();

    public static void registerItemGroups()
    {

    }
}