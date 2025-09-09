package com.baisylia.culturaldelights.refabricated.client;

import com.baisylia.culturaldelights.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class CulturalDelightsFabricClient implements ClientModInitializer {


	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.putBlocks(ChunkSectionLayer.CUTOUT_MIPPED,
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