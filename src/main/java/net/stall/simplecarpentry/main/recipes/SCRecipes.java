package net.stall.simplecarpentry.main.recipes;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stall.simplecarpentry.SimpleCarpentry;
import net.stall.simplecarpentry.main.recipes.custom.SawingRecipe;

public class SCRecipes {

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, SimpleCarpentry.MODID);
    public static final DeferredHolder<RecipeType<?>, RecipeType<SawingRecipe>> SAWING = RECIPE_TYPES.register("sawing", () -> new RecipeType<>() {
        @Override
        public String toString() {
            return SimpleCarpentry.MODID + ":sawing";
        }
    });
}