package com.ncpbails.culturaldelights;

import com.ncpbails.culturaldelights.block.ModBlocks;
import com.ncpbails.culturaldelights.item.ModItems;
import com.ncpbails.culturaldelights.tab.ModCreativeModeTabs;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;


public class CulturalDelights
{
    public static final String MOD_ID = "culturaldelights";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static void init()
    {
        ModCreativeModeTabs.register();
        ModItems.register();
        ModBlocks.register();
    }
}
