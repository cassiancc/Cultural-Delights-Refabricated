package com.baisylia.culturaldelights.refabricated;

import com.baisylia.culturaldelights.CulturalDelights;
import net.fabricmc.api.ModInitializer;

public class CulturalDelightsFabric implements ModInitializer {


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		CulturalDelights.init();
	}
}