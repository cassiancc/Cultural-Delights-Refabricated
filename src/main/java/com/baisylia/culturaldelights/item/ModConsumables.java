package com.baisylia.culturaldelights.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.List;

public class ModConsumables {
    //INGREDIENTS
    public static final Consumable FAST_FOOD = Consumable.builder().consumeSeconds(1.2f).build();
    public static final Consumable GLOW_SQUID = Consumable.builder().onConsume(new ApplyStatusEffectsConsumeEffect(
            new MobEffectInstance(MobEffects.GLOWING, 40, 1), 1.0F)).build();

    public static final Consumable PUFFERFISH_ROLL = Consumable.builder().onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
            new MobEffectInstance(MobEffects.NAUSEA, 200, 0), new MobEffectInstance(MobEffects.HUNGER, 200, 1)), 1.0F)).consumeSeconds(1.2f).build();

    public static final Consumable HEARTY_SALAD = Consumable.builder().onConsume(new ApplyStatusEffectsConsumeEffect(
            new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)).build();
    public static final Consumable EGGPLANT_PARMESAN = Consumable.builder().onConsume(new ApplyStatusEffectsConsumeEffect(
            new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)).build();
    public static final Consumable SPICY_CURRY = Consumable.builder().onConsume(new ApplyStatusEffectsConsumeEffect(
            new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)).build();
    public static final Consumable POACHED_EGGPLANTS = Consumable.builder().onConsume(new ApplyStatusEffectsConsumeEffect(
            new MobEffectInstance(ModEffects.NOURISHMENT, FoodValues.LONG_DURATION, 0), 1.0F)).build();

}
