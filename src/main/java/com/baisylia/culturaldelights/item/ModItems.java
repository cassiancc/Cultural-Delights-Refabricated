package com.baisylia.culturaldelights.item;


import com.baisylia.culturaldelights.refabricated.RegUtils;
import com.baisylia.culturaldelights.CulturalDelights;
import com.baisylia.culturaldelights.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

public class ModItems {

    //Items                                                                  item id

    public static final Supplier<Item> CUCUMBER_SEEDS = RegUtils.regItem("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBERS.get(),
                    new Item.Properties()));

    public static final Supplier<Item> CORN_KERNELS = RegUtils.regItem("corn_kernels",
            () -> new ItemNameBlockItem(ModBlocks.CORN.get(),
                    new Item.Properties()));

    public static final Supplier<Item> EGGPLANT_SEEDS = RegUtils.regItem("eggplant_seeds",
            () -> new ItemNameBlockItem(ModBlocks.EGGPLANTS.get(),
                    new Item.Properties()));


    //Ingredients
    public static final Supplier<Item> AVOCADO = RegUtils.regItem("avocado",
            () -> new Item(new Item.Properties().food(ModFoods.AVOCADO)));

    public static final Supplier<Item> CUT_AVOCADO = RegUtils.regItem("cut_avocado",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_AVOCADO)));

    public static final Supplier<Item> CUCUMBER = RegUtils.regItem("cucumber",
            () -> new Item(new Item.Properties().food(ModFoods.CUCUMBER)));

    public static final Supplier<Item> PICKLE = RegUtils.regItem("pickle",
            () -> new Item(new Item.Properties().food(ModFoods.PICKLE)));

    public static final Supplier<Item> CUT_CUCUMBER = RegUtils.regItem("cut_cucumber",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_CUCUMBER)));

    public static final Supplier<Item> CUT_PICKLE = RegUtils.regItem("cut_pickle",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_PICKLE)));

    public static final Supplier<Item> EGGPLANT = RegUtils.regItem("eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.EGGPLANT)));

    public static final Supplier<Item> CUT_EGGPLANT = RegUtils.regItem("cut_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_EGGPLANT)));

    public static final Supplier<Item> SMOKED_EGGPLANT = RegUtils.regItem("smoked_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_EGGPLANT)));

    public static final Supplier<Item> SMOKED_TOMATO = RegUtils.regItem("smoked_tomato",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_TOMATO)));

    public static final Supplier<Item> SMOKED_CUT_EGGPLANT = RegUtils.regItem("smoked_cut_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_CUT_EGGPLANT)));

    public static final Supplier<Item> SMOKED_WHITE_EGGPLANT = RegUtils.regItem("smoked_white_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.SMOKED_WHITE_EGGPLANT)));
    public static final Supplier<Item> WHITE_EGGPLANT = RegUtils.regItem("white_eggplant",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_EGGPLANT)));
    public static final Supplier<Item> CORN_COB = RegUtils.regItem("corn_cob",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_COB)));
    //public static final Supplier<Item> GINGER = RegUtils.regItem("ginger",
    //        () -> new Item(new Item.Properties().food(ModFoods.GINGER)));

    public static final Supplier<Item> SQUID = RegUtils.regItem("squid",
            () -> new Item(new Item.Properties().food(ModFoods.SQUID)));

    public static final Supplier<Item> COOKED_SQUID = RegUtils.regItem("cooked_squid",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_SQUID)));

    public static final Supplier<Item> GLOW_SQUID = RegUtils.regItem("glow_squid",
            () -> new Item(new Item.Properties().food(ModFoods.GLOW_SQUID)));

    public static final Supplier<Item> RAW_CALAMARI = RegUtils.regItem("raw_calamari",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_CALAMARI)));

    public static final Supplier<Item> COOKED_CALAMARI = RegUtils.regItem("cooked_calamari",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_CALAMARI)));


    //Meals
    public static final Supplier<Item> POPCORN = RegUtils.regItem("popcorn",
            () -> new Item(new Item.Properties().food(ModFoods.POPCORN)));

    public static final Supplier<Item> CORN_DOUGH = RegUtils.regItem("corn_dough",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_DOUGH)));

    public static final Supplier<Item> TORTILLA = RegUtils.regItem("tortilla",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA)));

    public static final Supplier<Item> TORTILLA_CHIPS = RegUtils.regItem("tortilla_chips",
            () -> new Item(new Item.Properties().food(ModFoods.TORTILLA_CHIPS)));

    public static final Supplier<Item> ELOTE = RegUtils.regItem("elote",
            () -> new Item(new Item.Properties().food(ModFoods.ELOTE)));

    public static final Supplier<Item> EMPANADA = RegUtils.regItem("empanada",
            () -> new Item(new Item.Properties().food(ModFoods.EMPANADA)));

    public static final Supplier<Item> HEARTY_SALAD = RegUtils.regItem("hearty_salad",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.HEARTY_SALAD)));

    public static final Supplier<Item> BEEF_BURRITO = RegUtils.regItem("beef_burrito",
            () -> new Item(new Item.Properties().food(ModFoods.BEEF_BURRITO)));

    public static final Supplier<Item> MUTTON_SANDWICH = RegUtils.regItem("mutton_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.MUTTON_SANDWICH)));

    public static final DeferredItem<Item> EGGPLANT_PARMESAN = ITEMS.register("eggplant_parmesan",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.EGGPLANT_PARMESAN)));

    public static final Supplier<Item> POACHED_EGGPLANTS = RegUtils.regItem("poached_eggplants",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.POACHED_EGGPLANTS)));

    public static final Supplier<Item> EGGPLANT_BURGER = RegUtils.regItem("eggplant_burger",
            () -> new Item(new Item.Properties().food(ModFoods.EGGPLANT_BURGER)));

    public static final Supplier<Item> AVOCADO_TOAST = RegUtils.regItem("avocado_toast",
            () -> new Item(new Item.Properties().food(ModFoods.AVOCADO_TOAST)));

    public static final Supplier<Item> CREAMED_CORN = RegUtils.regItem("creamed_corn",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.CREAMED_CORN)));

    public static final Supplier<Item> CHICKEN_TACO = RegUtils.regItem("chicken_taco",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_TACO)));

    public static final Supplier<Item> SPICY_CURRY = RegUtils.regItem("spicy_curry",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.SPICY_CURRY)));

    public static final Supplier<Item> PORK_WRAP = RegUtils.regItem("pork_wrap",
            () -> new Item(new Item.Properties().food(ModFoods.PORK_WRAP)));

    public static final Supplier<Item> FISH_TACO = RegUtils.regItem("fish_taco",
            () -> new Item(new Item.Properties().food(ModFoods.FISH_TACO)));

    public static final Supplier<Item> MIDORI_ROLL = RegUtils.regItem("midori_roll",
            () -> new Item(new Item.Properties().food(ModFoods.MIDORI_ROLL)));

    public static final Supplier<Item> MIDORI_ROLL_SLICE = RegUtils.regItem("midori_roll_slice",
            () -> new Item(new Item.Properties().food(ModFoods.MIDORI_ROLL_SLICE)));

    public static final Supplier<Item> EGG_ROLL = RegUtils.regItem("egg_roll",
            () -> new Item(new Item.Properties().food(ModFoods.EGG_ROLL)));

    public static final Supplier<Item> CHICKEN_ROLL = RegUtils.regItem("chicken_roll",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_ROLL)));

    public static final Supplier<Item> CHICKEN_ROLL_SLICE = RegUtils.regItem("chicken_roll_slice",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_ROLL_SLICE)));

    public static final Supplier<Item> PUFFERFISH_ROLL = RegUtils.regItem("pufferfish_roll",
            () -> new Item(new Item.Properties().food(ModFoods.PUFFERFISH_ROLL)));

    public static final Supplier<Item> TROPICAL_ROLL = RegUtils.regItem("tropical_roll",
            () -> new Item(new Item.Properties().food(ModFoods.TROPICAL_ROLL)));

    public static final Supplier<Item> RICE_BALL = RegUtils.regItem("rice_ball",
            () -> new Item(new Item.Properties().food(ModFoods.RICE_BALL)));

    public static final Supplier<Item> CALAMARI_ROLL = RegUtils.regItem("calamari_roll",
            () -> new Item(new Item.Properties().food(ModFoods.CALAMARI_ROLL)));
    
    public static void register() {

    }
}
