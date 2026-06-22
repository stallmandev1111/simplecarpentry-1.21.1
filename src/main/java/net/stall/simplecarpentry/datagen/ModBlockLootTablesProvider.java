package net.stall.simplecarpentry.datagen;


import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.stall.simplecarpentry.main.block.SCBlocks;

import java.util.Set;

public class ModBlockLootTablesProvider extends BlockLootSubProvider {
    protected ModBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(SCBlocks.OAK_CORDWOOD.get());
        dropSelf(SCBlocks.BIRCH_CORDWOOD.get());
        dropSelf(SCBlocks.SPRUCE_CORDWOOD.get());
        dropSelf(SCBlocks.DARK_OAK_CORDWOOD.get());
        dropSelf(SCBlocks.ACACIA_CORDWOOD.get());
        dropSelf(SCBlocks.JUNGLE_CORDWOOD.get());
        dropSelf(SCBlocks.CHERRY_CORDWOOD.get());
        dropSelf(SCBlocks.MANGROVE_CORDWOOD.get());
        dropSelf(SCBlocks.CRIMSON_CORDWOOD.get());
        dropSelf(SCBlocks.WARPED_CORDWOOD.get());

        dropSelf(SCBlocks.STRIPPED_OAK_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_BIRCH_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_SPRUCE_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_DARK_OAK_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_ACACIA_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_JUNGLE_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_CHERRY_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_MANGROVE_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_CRIMSON_CORDWOOD.get());
        dropSelf(SCBlocks.STRIPPED_WARPED_CORDWOOD.get());
    }




    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SCBlocks.BLOCKS.getEntries().stream().map(Holder::value).filter(block ->
                block != SCBlocks.SAWMILL.get()
                //&& block !=  SCBlocks.CANVAS_TABLE.get()
        )::iterator;

        //return null;
    }
}





/*dropSelf(ModBlocks.POTTERY_WHEEL.get());

        dropSelf(ModBlocks.TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.WHITE_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.ORANGE_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.MAGENTA_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.YELLOW_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.LIME_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.LIME_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.PINK_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.PINK_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.GRAY_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.GRAY_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.CYAN_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.CYAN_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.PURPLE_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.BLUE_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.BLUE_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.BROWN_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.BROWN_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.GREEN_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.GREEN_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.RED_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.RED_TERRACOTTA_SLAB.get());

        dropSelf(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
        dropSelf(ModBlocks.BLACK_TERRACOTTA_SLAB.get());*/


/*                .filter(block -> block != ModBlocks.POTTERY_WHEEL.get())

                .filter(block -> block != ModBlocks.TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.WHITE_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.WHITE_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.ORANGE_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.ORANGE_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.MAGENTA_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.MAGENTA_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.YELLOW_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.YELLOW_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.LIME_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.LIME_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.PINK_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.PINK_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.GRAY_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.GRAY_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.CYAN_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.CYAN_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.PURPLE_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.PURPLE_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.BLUE_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.BLUE_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.BROWN_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.BROWN_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.GREEN_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.GREEN_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.RED_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.RED_TERRACOTTA_SLAB.get())

                .filter(block -> block != ModBlocks.BLACK_TERRACOTTA_STAIRS.get())
                .filter(block -> block != ModBlocks.BLACK_TERRACOTTA_SLAB.get())*/
