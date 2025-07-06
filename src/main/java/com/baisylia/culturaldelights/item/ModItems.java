package com.baisylia.culturaldelights.item;


import com.baisylia.culturaldelights.refabricated.RegUtils;
import com.baisylia.culturaldelights.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.function.Supplier;

public class ModItems {

    //Items                                                                  item id

    public static final Supplier<Item> CUCUMBER_SEEDS = RegUtils.regItem("cucumber_seeds", ModBlocks.CUCUMBERS.get(), false);

    public static final Supplier<Item> CORN_KERNELS = RegUtils.regItem("corn_kernels", ModBlocks.CORN.get(), false);

    public static final Supplier<Item> EGGPLANT_SEEDS = RegUtils.regItem("eggplant_seeds", ModBlocks.EGGPLANTS.get(), false);


    //Ingredients
    public static final Supplier<Item> AVOCADO = RegUtils.regItem("avocado",
            ModFoods.AVOCADO);

    public static final Supplier<Item> CUT_AVOCADO = RegUtils.regItem("cut_avocado",
            ModFoods.CUT_AVOCADO, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> CUCUMBER = RegUtils.regItem("cucumber",
            ModFoods.CUCUMBER);

    public static final Supplier<Item> PICKLE = RegUtils.regItem("pickle",
            ModFoods.PICKLE);

    public static final Supplier<Item> CUT_CUCUMBER = RegUtils.regItem("cut_cucumber",
            ModFoods.CUT_CUCUMBER, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> CUT_PICKLE = RegUtils.regItem("cut_pickle",
            ModFoods.CUT_PICKLE, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> EGGPLANT = RegUtils.regItem("eggplant",
            ModFoods.EGGPLANT);

    public static final Supplier<Item> CUT_EGGPLANT = RegUtils.regItem("cut_eggplant",
            ModFoods.CUT_EGGPLANT, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> SMOKED_EGGPLANT = RegUtils.regItem("smoked_eggplant",
            ModFoods.SMOKED_EGGPLANT);

    public static final Supplier<Item> SMOKED_TOMATO = RegUtils.regItem("smoked_tomato",
            ModFoods.SMOKED_TOMATO);

    public static final Supplier<Item> SMOKED_CUT_EGGPLANT = RegUtils.regItem("smoked_cut_eggplant",
            ModFoods.SMOKED_CUT_EGGPLANT);

    public static final Supplier<Item> SMOKED_WHITE_EGGPLANT = RegUtils.regItem("smoked_white_eggplant",
            ModFoods.SMOKED_WHITE_EGGPLANT);
    public static final Supplier<Item> WHITE_EGGPLANT = RegUtils.regItem("white_eggplant",
            ModFoods.WHITE_EGGPLANT);
    public static final Supplier<Item> CORN_COB = RegUtils.regItem("corn_cob",
            ModFoods.CORN_COB);
    //public static final Supplier<Item> GINGER = RegUtils.regItem("ginger",
    //        ModFoods.GINGER);

    public static final Supplier<Item> SQUID = RegUtils.regItem("squid",
            ModFoods.SQUID);

    public static final Supplier<Item> COOKED_SQUID = RegUtils.regItem("cooked_squid",
            ModFoods.COOKED_SQUID);

    public static final Supplier<Item> GLOW_SQUID = RegUtils.regItem("glow_squid",
            ModFoods.GLOW_SQUID, ModConsumables.GLOW_SQUID);

    public static final Supplier<Item> RAW_CALAMARI = RegUtils.regItem("raw_calamari",
            ModFoods.RAW_CALAMARI);

    public static final Supplier<Item> COOKED_CALAMARI = RegUtils.regItem("cooked_calamari",
            ModFoods.COOKED_CALAMARI);


    //Meals
    public static final Supplier<Item> POPCORN = RegUtils.regItem("popcorn",
            ModFoods.POPCORN, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> CORN_DOUGH = RegUtils.regItem("corn_dough",
            ModFoods.CORN_DOUGH);

    public static final Supplier<Item> TORTILLA = RegUtils.regItem("tortilla",
            ModFoods.TORTILLA);

    public static final Supplier<Item> TORTILLA_CHIPS = RegUtils.regItem("tortilla_chips",
            ModFoods.TORTILLA_CHIPS, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> ELOTE = RegUtils.regItem("elote",
            ModFoods.ELOTE);

    public static final Supplier<Item> EMPANADA = RegUtils.regItem("empanada",
            ModFoods.EMPANADA);

    public static final Supplier<Item> HEARTY_SALAD = RegUtils.regItem("hearty_salad", ModFoods.HEARTY_SALAD, ModConsumables.HEARTY_SALAD, Items.BOWL);

    public static final Supplier<Item> BEEF_BURRITO = RegUtils.regItem("beef_burrito",
            ModFoods.BEEF_BURRITO);

    public static final Supplier<Item> MUTTON_SANDWICH = RegUtils.regItem("mutton_sandwich",
            ModFoods.MUTTON_SANDWICH);

    public static final Supplier<Item> EGGPLANT_PARMESAN = RegUtils.regItem("eggplant_parmesan", ModFoods.EGGPLANT_PARMESAN, ModConsumables.EGGPLANT_PARMESAN, Items.BOWL);

    public static final Supplier<Item> POACHED_EGGPLANTS = RegUtils.regItem("poached_eggplants", ModFoods.POACHED_EGGPLANTS, ModConsumables.POACHED_EGGPLANTS, Items.BOWL);

    public static final Supplier<Item> EGGPLANT_BURGER = RegUtils.regItem("eggplant_burger",
            ModFoods.EGGPLANT_BURGER);

    public static final Supplier<Item> AVOCADO_TOAST = RegUtils.regItem("avocado_toast",
            ModFoods.AVOCADO_TOAST);

    public static final Supplier<Item> CREAMED_CORN = RegUtils.regItem("creamed_corn", ModFoods.CREAMED_CORN, Items.BOWL);

    public static final Supplier<Item> CHICKEN_TACO = RegUtils.regItem("chicken_taco",
            ModFoods.CHICKEN_TACO);

    public static final Supplier<Item> SPICY_CURRY = RegUtils.regItem("spicy_curry", ModFoods.SPICY_CURRY, ModConsumables.SPICY_CURRY, Items.BOWL);

    public static final Supplier<Item> PORK_WRAP = RegUtils.regItem("pork_wrap",
            ModFoods.PORK_WRAP);

    public static final Supplier<Item> FISH_TACO = RegUtils.regItem("fish_taco",
            ModFoods.FISH_TACO);

    public static final Supplier<Item> MIDORI_ROLL = RegUtils.regItem("midori_roll",
            ModFoods.MIDORI_ROLL, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> MIDORI_ROLL_SLICE = RegUtils.regItem("midori_roll_slice",
            ModFoods.MIDORI_ROLL_SLICE, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> EGG_ROLL = RegUtils.regItem("egg_roll",
            ModFoods.EGG_ROLL);

    public static final Supplier<Item> CHICKEN_ROLL = RegUtils.regItem("chicken_roll",
            ModFoods.CHICKEN_ROLL);

    public static final Supplier<Item> CHICKEN_ROLL_SLICE = RegUtils.regItem("chicken_roll_slice",
            ModFoods.CHICKEN_ROLL_SLICE, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> PUFFERFISH_ROLL = RegUtils.regItem("pufferfish_roll",
            ModFoods.PUFFERFISH_ROLL, ModConsumables.PUFFERFISH_ROLL);

    public static final Supplier<Item> TROPICAL_ROLL = RegUtils.regItem("tropical_roll",
            ModFoods.TROPICAL_ROLL, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> RICE_BALL = RegUtils.regItem("rice_ball",
            ModFoods.RICE_BALL, ModConsumables.FAST_FOOD);

    public static final Supplier<Item> CALAMARI_ROLL = RegUtils.regItem("calamari_roll",
            ModFoods.CALAMARI_ROLL, ModConsumables.FAST_FOOD);
    
    public static void register() {

    }
}
