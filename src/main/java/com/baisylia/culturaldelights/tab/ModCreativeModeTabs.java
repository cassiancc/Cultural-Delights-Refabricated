package com.baisylia.culturaldelights.tab;

import com.baisylia.culturaldelights.block.ModBlocks;
import com.baisylia.culturaldelights.item.ModItems;
import com.baisylia.culturaldelights.refabricated.RegUtils;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.baisylia.culturaldelights.CulturalDelights.MOD_ID;

public class ModCreativeModeTabs {

    public static final ResourceKey<CreativeModeTab> CULTURALDELIGHTS_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(MOD_ID, "culturaldelights_tab"));
    public static final CreativeModeTab CULTURALDELIGHTS_TAB = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CHICKEN_TACO.get()))
            .title(Component.translatable("creativetab.culturaldelights.culturaldelights_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.CUCUMBER_SEEDS.get());
                output.accept(ModItems.CORN_KERNELS.get());
                output.accept(ModItems.EGGPLANT_SEEDS.get());
                output.accept(ModItems.AVOCADO.get());
                output.accept(ModItems.CUT_AVOCADO.get());
                output.accept(ModItems.CUCUMBER.get());
                output.accept(ModItems.PICKLE.get());
                output.accept(ModItems.CUT_CUCUMBER.get());
                output.accept(ModItems.CUT_PICKLE.get());
                output.accept(ModItems.EGGPLANT.get());
                output.accept(ModItems.CUT_EGGPLANT.get());
                output.accept(ModItems.SMOKED_EGGPLANT.get());
                output.accept(ModItems.SMOKED_TOMATO.get());
                output.accept(ModItems.SMOKED_CUT_EGGPLANT.get());
                output.accept(ModItems.SMOKED_WHITE_EGGPLANT.get());
                output.accept(ModItems.WHITE_EGGPLANT.get());
                output.accept(ModItems.CORN_COB.get());
                output.accept(ModItems.SQUID.get());
                output.accept(ModItems.COOKED_SQUID.get());
                output.accept(ModItems.GLOW_SQUID.get());
                output.accept(ModItems.RAW_CALAMARI.get());
                output.accept(ModItems.COOKED_CALAMARI.get());
                output.accept(ModItems.POPCORN.get());
                output.accept(ModItems.CORN_DOUGH.get());
                output.accept(ModItems.TORTILLA.get());
                output.accept(ModItems.TORTILLA_CHIPS.get());
                output.accept(ModItems.ELOTE.get());
                output.accept(ModItems.EMPANADA.get());
                output.accept(ModItems.HEARTY_SALAD.get());
                output.accept(ModItems.BEEF_BURRITO.get());
                output.accept(ModItems.MUTTON_SANDWICH.get());
                output.accept(ModItems.EGGPLANT_PARMESAN.get());
                output.accept(ModItems.POACHED_EGGPLANTS.get());
                output.accept(ModItems.EGGPLANT_BURGER.get());
                output.accept(ModItems.AVOCADO_TOAST.get());
                output.accept(ModItems.CREAMED_CORN.get());
                output.accept(ModItems.CHICKEN_TACO.get());
                output.accept(ModItems.SPICY_CURRY.get());
                output.accept(ModItems.PORK_WRAP.get());
                output.accept(ModItems.FISH_TACO.get());
                output.accept(ModItems.MIDORI_ROLL.get());
                output.accept(ModItems.MIDORI_ROLL_SLICE.get());
                output.accept(ModItems.EGG_ROLL.get());
                output.accept(ModItems.CHICKEN_ROLL.get());
                output.accept(ModItems.CHICKEN_ROLL_SLICE.get());
                output.accept(ModItems.PUFFERFISH_ROLL.get());
                output.accept(ModItems.TROPICAL_ROLL.get());
                output.accept(ModItems.RICE_BALL.get());
                output.accept(ModItems.CALAMARI_ROLL.get());
                output.accept(ModBlocks.WILD_CUCUMBERS.get());
                output.accept(ModBlocks.WILD_CORN.get());
                output.accept(ModBlocks.WILD_EGGPLANTS.get());
                output.accept(ModBlocks.AVOCADO_PIT.get());
                output.accept(ModBlocks.AVOCADO_SAPLING.get());
                output.accept(ModBlocks.AVOCADO_LOG.get());
                output.accept(ModBlocks.AVOCADO_WOOD.get());
                output.accept(ModBlocks.AVOCADO_LEAVES.get());
                output.accept(ModBlocks.FRUITING_AVOCADO_LEAVES.get());
                output.accept(ModBlocks.AVOCADO_CRATE.get());
                output.accept(ModBlocks.CUCUMBER_CRATE.get());
                output.accept(ModBlocks.PICKLE_CRATE.get());
                output.accept(ModBlocks.CORN_COB_CRATE.get());
                output.accept(ModBlocks.EGGPLANT_CRATE.get());
                output.accept(ModBlocks.WHITE_EGGPLANT_CRATE.get());
                output.accept(ModBlocks.EXOTIC_ROLL_MEDLEY.get());
                output.accept(ModBlocks.EGGPLANT_PARMESAN_BLOCK.get());
            }).build();

    public static void register() {
        RegUtils.regTab("culturaldelights_tab", () -> CULTURALDELIGHTS_TAB);
    }
}
