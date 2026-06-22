package net.stall.simplecarpentry.main.recipes.builders;

import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.stall.simplecarpentry.main.recipes.custom.SawingRecipe;

import java.util.LinkedHashMap;
import java.util.Map;

public class SawingRecipeBuilder implements RecipeBuilder {

    private final Ingredient ingredient;
    private final Item result;
    private final int count;

    private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();

    public SawingRecipeBuilder(Ingredient ingredient, ItemLike result, int count) {
        this.ingredient = ingredient;
        this.result = result.asItem();
        this.count = count;
    }

    public static SawingRecipeBuilder sawing(Ingredient ingredient, ItemLike result, int count) {
        return new SawingRecipeBuilder(ingredient, result, count);
    }

    @Override
    public RecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        criteria.put(name, criterion);
        return this;
    }

    @Override
    public RecipeBuilder group(String group) {
        return this;
    }

    @Override
    public Item getResult() {
        return result;
    }

    @Override
    public void save(RecipeOutput output, ResourceLocation id) {
        AdvancementHolder advancement = output.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR)
                .build(id.withPrefix("recipes/"));

        output.accept(
                id,
                new SawingRecipe("", ingredient, new ItemStack(result, count)),
                advancement
        );
    }
}