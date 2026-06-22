package net.stall.simplecarpentry.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.stall.simplecarpentry.SimpleCarpentry;
import net.stall.simplecarpentry.main.block.SCBlocks;
import net.stall.simplecarpentry.main.recipes.builders.SawingRecipeBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    private static ResourceLocation sawing(String path) {
        return ResourceLocation.fromNamespaceAndPath(SimpleCarpentry.MODID, path);
    }

    private static void sawingResultFromBase(RecipeOutput output, RecipeCategory category, ItemLike result, int count, ItemLike base) {
        SawingRecipeBuilder.sawing(Ingredient.of(base),result,count).unlockedBy(getHasName(base), has(base)).save(output, sawing(getItemName(result) + "_from_" + getItemName(base) + "_sawing"));
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_PLANKS, 4, Blocks.OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_FENCE, 4, Blocks.OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_FENCE_GATE, 1, Blocks.OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_DOOR, 1, Blocks.OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_TRAPDOOR, 1, Blocks.OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_SIGN, 1, Blocks.OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.OAK_CORDWOOD.get(), 1, Blocks.OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_PLANKS, 4, Blocks.STRIPPED_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_FENCE, 4, Blocks.STRIPPED_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_FENCE_GATE, 1, Blocks.STRIPPED_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_DOOR, 1, Blocks.STRIPPED_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_TRAPDOOR, 1, Blocks.STRIPPED_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_SIGN, 1, Blocks.STRIPPED_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_OAK_CORDWOOD.get(), 1, Blocks.STRIPPED_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_SLAB, 2, Blocks.OAK_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_STAIRS, 1, Blocks.OAK_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_FENCE, 1, Blocks.OAK_PLANKS);

        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_PLANKS, 4, Blocks.SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_FENCE, 4, Blocks.SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_FENCE_GATE, 1, Blocks.SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_DOOR, 1, Blocks.SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_TRAPDOOR, 1, Blocks.SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_SIGN, 1, Blocks.SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.SPRUCE_CORDWOOD.get(), 1, Blocks.SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_PLANKS, 4, Blocks.STRIPPED_SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_FENCE, 4, Blocks.STRIPPED_SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_FENCE_GATE, 1, Blocks.STRIPPED_SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_DOOR, 1, Blocks.STRIPPED_SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_TRAPDOOR, 1, Blocks.STRIPPED_SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_SIGN, 1, Blocks.STRIPPED_SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_SPRUCE_CORDWOOD.get(), 1, Blocks.STRIPPED_SPRUCE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_SLAB, 2, Blocks.SPRUCE_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_STAIRS, 1, Blocks.SPRUCE_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_FENCE, 1, Blocks.SPRUCE_PLANKS);

        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_PLANKS, 4, Blocks.BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_FENCE, 4, Blocks.BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_FENCE_GATE, 1, Blocks.BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_DOOR, 1, Blocks.BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_TRAPDOOR, 1, Blocks.BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_SIGN, 1, Blocks.BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.BIRCH_CORDWOOD.get(), 1, Blocks.BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_PLANKS, 4, Blocks.STRIPPED_BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_FENCE, 4, Blocks.STRIPPED_BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_FENCE_GATE, 1, Blocks.STRIPPED_BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_DOOR, 1, Blocks.STRIPPED_BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_TRAPDOOR, 1, Blocks.STRIPPED_BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_SIGN, 1, Blocks.STRIPPED_BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_BIRCH_CORDWOOD.get(), 1, Blocks.STRIPPED_BIRCH_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_SLAB, 2, Blocks.BIRCH_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_STAIRS, 1, Blocks.BIRCH_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_FENCE, 1, Blocks.BIRCH_PLANKS);

        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_PLANKS, 4, Blocks.DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_FENCE, 4, Blocks.DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_FENCE_GATE, 1, Blocks.DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_DOOR, 1, Blocks.DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_TRAPDOOR, 1, Blocks.DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_SIGN, 1, Blocks.DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.DARK_OAK_CORDWOOD.get(), 1, Blocks.DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_PLANKS, 4, Blocks.STRIPPED_DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_FENCE, 4, Blocks.STRIPPED_DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_FENCE_GATE, 1, Blocks.STRIPPED_DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_DOOR, 1, Blocks.STRIPPED_DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_TRAPDOOR, 1, Blocks.STRIPPED_DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_SIGN, 1, Blocks.STRIPPED_DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_DARK_OAK_CORDWOOD.get(), 1, Blocks.STRIPPED_DARK_OAK_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_SLAB, 2, Blocks.DARK_OAK_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_STAIRS, 1, Blocks.DARK_OAK_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_FENCE, 1, Blocks.DARK_OAK_PLANKS);

        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_PLANKS, 4, Blocks.JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_FENCE, 4, Blocks.JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_FENCE_GATE, 1, Blocks.JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_DOOR, 1, Blocks.JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_TRAPDOOR, 1, Blocks.JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_SIGN, 1, Blocks.JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.JUNGLE_CORDWOOD.get(), 1, Blocks.JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_PLANKS, 4, Blocks.STRIPPED_JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_FENCE, 4, Blocks.STRIPPED_JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_FENCE_GATE, 1, Blocks.STRIPPED_JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_DOOR, 1, Blocks.STRIPPED_JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_TRAPDOOR, 1, Blocks.STRIPPED_JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_SIGN, 1, Blocks.STRIPPED_JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_JUNGLE_CORDWOOD.get(), 1, Blocks.STRIPPED_JUNGLE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_SLAB, 2, Blocks.JUNGLE_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_STAIRS, 1, Blocks.JUNGLE_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_FENCE, 1, Blocks.JUNGLE_PLANKS);

        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_PLANKS, 4, Blocks.ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_FENCE, 4, Blocks.ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_FENCE_GATE, 1, Blocks.ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_DOOR, 1, Blocks.ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_TRAPDOOR, 1, Blocks.ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_SIGN, 1, Blocks.ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.ACACIA_CORDWOOD.get(), 1, Blocks.ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_PLANKS, 4, Blocks.STRIPPED_ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_FENCE, 4, Blocks.STRIPPED_ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_FENCE_GATE, 1, Blocks.STRIPPED_ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_DOOR, 1, Blocks.STRIPPED_ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_TRAPDOOR, 1, Blocks.STRIPPED_ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_SIGN, 1, Blocks.STRIPPED_ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_ACACIA_CORDWOOD.get(), 1, Blocks.STRIPPED_ACACIA_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_SLAB, 2, Blocks.ACACIA_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_STAIRS, 1, Blocks.ACACIA_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_FENCE, 1, Blocks.ACACIA_PLANKS);

        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_PLANKS, 4, Blocks.CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_FENCE, 4, Blocks.CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_FENCE_GATE, 1, Blocks.CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_DOOR, 1, Blocks.CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_TRAPDOOR, 1, Blocks.CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_SIGN, 1, Blocks.CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.CHERRY_CORDWOOD.get(), 1, Blocks.CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_PLANKS, 4, Blocks.STRIPPED_CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_FENCE, 4, Blocks.STRIPPED_CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_FENCE_GATE, 1, Blocks.STRIPPED_CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_DOOR, 1, Blocks.STRIPPED_CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_TRAPDOOR, 1, Blocks.STRIPPED_CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_SIGN, 1, Blocks.STRIPPED_CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_CHERRY_CORDWOOD.get(), 1, Blocks.STRIPPED_CHERRY_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_SLAB, 2, Blocks.CHERRY_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_STAIRS, 1, Blocks.CHERRY_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_FENCE, 1, Blocks.CHERRY_PLANKS);

        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_PLANKS, 4, Blocks.MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_FENCE, 4, Blocks.MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_FENCE_GATE, 1, Blocks.MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_DOOR, 1, Blocks.MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_TRAPDOOR, 1, Blocks.MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_SIGN, 1, Blocks.MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.MANGROVE_CORDWOOD.get(), 1, Blocks.MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_PLANKS, 4, Blocks.STRIPPED_MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_FENCE, 4, Blocks.STRIPPED_MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_FENCE_GATE, 1, Blocks.STRIPPED_MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_DOOR, 1, Blocks.STRIPPED_MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_TRAPDOOR, 1, Blocks.STRIPPED_MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_SIGN, 1, Blocks.STRIPPED_MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_MANGROVE_CORDWOOD.get(), 1, Blocks.STRIPPED_MANGROVE_LOG);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_SLAB, 2, Blocks.MANGROVE_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_STAIRS, 1, Blocks.MANGROVE_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_FENCE, 1, Blocks.MANGROVE_PLANKS);


        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_PLANKS, 4, Blocks.CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_FENCE, 4, Blocks.CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_FENCE_GATE, 1, Blocks.CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_DOOR, 1, Blocks.CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_TRAPDOOR, 1, Blocks.CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_SIGN, 1, Blocks.CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.CRIMSON_CORDWOOD.get(), 1, Blocks.CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_PLANKS, 4, Blocks.STRIPPED_CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_FENCE, 4, Blocks.STRIPPED_CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_FENCE_GATE, 1, Blocks.STRIPPED_CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_DOOR, 1, Blocks.STRIPPED_CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_TRAPDOOR, 1, Blocks.STRIPPED_CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_SIGN, 1, Blocks.STRIPPED_CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_CRIMSON_CORDWOOD.get(), 1, Blocks.STRIPPED_CRIMSON_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_SLAB, 2, Blocks.CRIMSON_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_STAIRS, 1, Blocks.CRIMSON_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_FENCE, 1, Blocks.CRIMSON_PLANKS);

        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_PLANKS, 4, Blocks.WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_FENCE, 4, Blocks.WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_FENCE_GATE, 1, Blocks.WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_DOOR, 1, Blocks.WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_TRAPDOOR, 1, Blocks.WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_SIGN, 1, Blocks.WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.WARPED_CORDWOOD.get(), 1, Blocks.WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_PLANKS, 4, Blocks.STRIPPED_WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_FENCE, 4, Blocks.STRIPPED_WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_FENCE_GATE, 1, Blocks.STRIPPED_WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_DOOR, 1, Blocks.STRIPPED_WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_TRAPDOOR, 1, Blocks.STRIPPED_WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_SIGN, 1, Blocks.STRIPPED_WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, SCBlocks.STRIPPED_WARPED_CORDWOOD.get(), 1, Blocks.STRIPPED_WARPED_STEM);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_SLAB, 2, Blocks.WARPED_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_STAIRS, 1, Blocks.WARPED_PLANKS);
        sawingResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_FENCE, 1, Blocks.WARPED_PLANKS);
    }
}
