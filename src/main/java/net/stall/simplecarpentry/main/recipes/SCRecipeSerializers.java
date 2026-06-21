package net.stall.simplecarpentry.main.recipes;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SingleItemRecipe;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stall.simplecarpentry.SimpleCarpentry;
import net.stall.simplecarpentry.main.recipes.custom.SawingRecipe;

public class SCRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, SimpleCarpentry.MODID);
    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<SawingRecipe>> SAWMILL = RECIPE_SERIALIZERS.register("sawmill", () -> new SingleItemRecipe.Serializer<>(SawingRecipe::new) {
    });
}
