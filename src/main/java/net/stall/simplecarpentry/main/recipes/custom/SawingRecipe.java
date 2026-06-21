package net.stall.simplecarpentry.main.recipes.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import net.stall.simplecarpentry.main.block.SCBlocks;
import net.stall.simplecarpentry.main.recipes.SCRecipeSerializers;
import net.stall.simplecarpentry.main.recipes.SCRecipes;


public class SawingRecipe extends SingleItemRecipe {

    public SawingRecipe(String group, Ingredient ingredient, ItemStack result) {
        super(SCRecipes.SAWING.get(), SCRecipeSerializers.SAWMILL.get(), group, ingredient, result);
    }

    @Override
    public boolean matches(SingleRecipeInput input, Level level) {
        return this.ingredient.test(input.item());
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(SCBlocks.SAWMILL.get());
    }
}