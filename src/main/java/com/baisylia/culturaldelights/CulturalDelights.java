package com.baisylia.culturaldelights;

import com.baisylia.culturaldelights.block.ModBlocks;
import com.baisylia.culturaldelights.item.ModItems;
import com.baisylia.culturaldelights.tab.ModCreativeModeTabs;
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
        ModBlocks.register();
        ModItems.register();
    }
}
