package com.ncpbails.culturaldelights.block;

import com.ncpbails.culturaldelights.CulturalDelights;
import com.ncpbails.culturaldelights.block.custom.*;
import com.ncpbails.culturaldelights.item.ModItems;
import com.ncpbails.culturaldelights.refabricated.RegUtils;
import com.ncpbails.culturaldelights.world.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

import static net.minecraft.world.item.Items.registerBlock;

public class ModBlocks {

    public static final Supplier<Block> WILD_CUCUMBERS = registerBlock("wild_cucumbers",
            () -> new WildCropBlock(MobEffects.FIRE_RESISTANCE, 6,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final Supplier<Block> WILD_CORN = registerBlock("wild_corn",
            () -> new WildCropBlock(MobEffects.HUNGER, 6,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));

    public static final Supplier<Block> WILD_EGGPLANTS = registerBlock("wild_eggplants",
            () -> new WildCropBlock(MobEffects.DAMAGE_BOOST, 6,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS)));


    public static final Supplier<Block> AVOCADO_PIT = registerBlock("avocado_pit",
            () -> new AvocadoPitBlock(ModTreeGrowers.AVOCADO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final Supplier<Block> AVOCADO_SAPLING = registerBlock("avocado_sapling",
            () -> new SaplingBlock(ModTreeGrowers.AVOCADO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));

    public static final Supplier<Block> AVOCADO_LOG = registerBlock("avocado_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LOG)));

    public static final Supplier<Block> AVOCADO_WOOD = registerBlock("avocado_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD)));

    public static final Supplier<Block> AVOCADO_LEAVES = registerBlock("avocado_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES)));

    public static final Supplier<Block> FRUITING_AVOCADO_LEAVES = registerBlock("fruiting_avocado_leaves",
            () -> new FruitingLeaves(BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES)));


    public static final Supplier<Block> CUCUMBERS = RegUtils.regBlock("cucumbers",
            () -> new CucumbersBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final Supplier<Block> EGGPLANTS = RegUtils.regBlock("eggplants",
            () -> new EggplantsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final Supplier<Block> CORN = RegUtils.regBlock("corn",
            () -> new CornBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final Supplier<Block> CORN_UPPER = RegUtils.regBlock("corn_upper",
            () -> new CornUpperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));


    public static final Supplier<Block> AVOCADO_CRATE = registerBlock("avocado_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            );

    public static final Supplier<Block> CUCUMBER_CRATE = registerBlock("cucumber_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            );

    public static final Supplier<Block> PICKLE_CRATE = registerBlock("pickle_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            );

    public static final Supplier<Block> CORN_COB_CRATE = registerBlock("corn_cob_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            );

    public static final Supplier<Block> EGGPLANT_CRATE = registerBlock("eggplant_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            );

    public static final Supplier<Block> WHITE_EGGPLANT_CRATE = registerBlock("white_eggplant_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.CARROT_CRATE.get()))
            );


    public static final Supplier<Block> EXOTIC_ROLL_MEDLEY = registerBlock("exotic_roll_medley",
            () -> new ExoticRollMedleyBlock(BlockBehaviour.Properties.ofFullCopy(vectorwing.farmersdelight.common.registry.ModBlocks.RICE_ROLL_MEDLEY_BLOCK.get()).noOcclusion()));




    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = RegUtils.regBlock(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        RegUtils.regItem(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register() {
        
    }
}
