package com.ncpbails.culturaldelights.refabricated.client;

import com.ncpbails.culturaldelights.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class CulturalDelightsFabricClient implements ClientModInitializer {


	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutoutMipped(),
				ModBlocks.CUCUMBERS.get(),
				ModBlocks.EGGPLANTS.get(),
				ModBlocks.CORN.get(),
				ModBlocks.CORN_UPPER.get(),
				ModBlocks.AVOCADO_SAPLING.get(),
				ModBlocks.WILD_CUCUMBERS.get(),
				ModBlocks.WILD_CORN.get(),
				ModBlocks.WILD_EGGPLANTS.get());
	}
}