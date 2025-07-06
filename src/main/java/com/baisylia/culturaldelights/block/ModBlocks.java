package com.baisylia.culturaldelights.block;

import com.baisylia.culturaldelights.CulturalDelights;
import com.baisylia.culturaldelights.block.custom.*;
import com.baisylia.culturaldelights.item.ModItems;
import com.baisylia.culturaldelights.refabricated.RegUtils;
import com.baisylia.culturaldelights.world.tree.ModTreeGrowers;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

public class ModBlocks {

    public static final Supplier<Block> WILD_CUCUMBERS = registerBlock("wild_cucumbers",
            () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).setId(resourceKey("wild_cucumbers"))));

    public static final Supplier<Block> WILD_CORN = registerBlock("wild_corn",
            () -> new WildCropBlock(MobEffects.HUNGER, 6,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).setId(resourceKey("wild_corn"))));

    public static final Supplier<Block> WILD_EGGPLANTS = registerBlock("wild_eggplants",
            () -> new WildCropBlock(MobEffects.STRENGTH, 6,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).setId(resourceKey("wild_eggplants"))));


    public static final Supplier<Block> AVOCADO_PIT = registerBlock("avocado_pit",
            () -> new AvocadoPitBlock(ModTreeGrowers.AVOCADO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).setId(resourceKey("avocado_pit"))));

    public static final Supplier<Block> AVOCADO_SAPLING = registerBlock("avocado_sapling",
            () -> new SaplingBlock(ModTreeGrowers.AVOCADO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).setId(resourceKey("avocado_sapling"))));

    public static final Supplier<Block> AVOCADO_LOG = registerBlock("avocado_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LOG).setId(resourceKey("avocado_log"))));

    public static final Supplier<Block> AVOCADO_WOOD = registerBlock("avocado_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD).setId(resourceKey("avocado_wood"))));

    public static final Supplier<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            () -> new TintedParticleLeavesBlock(0.01f, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES).setId(resourceKey("avocado_leaves"))));

    public static final Supplier<Block> FRUITING_AVOCADO_LEAVES = registerBlock("fruiting_avocado_leaves",
            () -> new FruitingLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES).setId(resourceKey("fruiting_avocado_leaves"))));


    public static final Supplier<Block> CUCUMBERS = RegUtils.regBlock("cucumbers",
            () -> new CucumbersBlock(wheatProperties().setId(resourceKey("cucumbers")).noOcclusion()));

    private static ResourceKey<Block> resourceKey(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(CulturalDelights.MOD_ID, name));
    }

    public static final Supplier<Block> EGGPLANTS = RegUtils.regBlock("eggplants",
            () -> new EggplantsBlock(wheatProperties().setId(resourceKey("eggplants")).noOcclusion()));

    public static final Supplier<Block> CORN = RegUtils.regBlock("corn",
            () -> new CornBlock(wheatProperties().setId(resourceKey("corn")).noOcclusion()));

    public static final Supplier<Block> CORN_UPPER = RegUtils.regBlock("corn_upper",
            () -> new CornUpperBlock(wheatProperties().setId(resourceKey("corn_upper")).noOcclusion()));

    private static BlockBehaviour.Properties wheatProperties() {
        return BlockBehaviour.Properties.of().noCollission().randomTicks().instabreak().sound(SoundType.CROP).mapColor(MapColor.PLANT);
    }


    public static final Supplier<Block> AVOCADO_CRATE = registerBlock("avocado_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()).setId(resourceKey("avocado_crate")))
            );

    public static final Supplier<Block> CUCUMBER_CRATE = registerBlock("cucumber_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()).setId(resourceKey("cucumber_crate")))
            );

    public static final Supplier<Block> PICKLE_CRATE = registerBlock("pickle_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()).setId(resourceKey("pickle_crate")))
            );

    public static final Supplier<Block> CORN_COB_CRATE = registerBlock("corn_cob_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()).setId(resourceKey("corn_cob_crate")))
            );

    public static final Supplier<Block> EGGPLANT_CRATE = registerBlock("eggplant_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()).setId(resourceKey("eggplant_crate")))
            );

    public static final Supplier<Block> WHITE_EGGPLANT_CRATE = registerBlock("white_eggplant_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()).setId(resourceKey("white_eggplant_crate")))
            );


    public static final Supplier<Block> EXOTIC_ROLL_MEDLEY = registerBlock("exotic_roll_medley",
            () -> new ExoticRollMedleyBlock(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.RICE_ROLL_MEDLEY_BLOCK.get()).noOcclusion().setId(resourceKey("exotic_roll_medley"))));

    public static final Supplier<Block> EGGPLANT_PARMESAN_BLOCK = registerBlock("eggplant_parmesan_block",
            () -> new EggplantFeastBlock(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.ROAST_CHICKEN_BLOCK.get()).setId(resourceKey("eggplant_parmesean_block")), ModItems.EGGPLANT_PARMESAN, true));



    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = RegUtils.regBlock(name, block);
        RegUtils.regItem(name, toReturn.get());
        return toReturn;
    }

    public static void register() {

    }
}
