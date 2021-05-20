package myxej.data.client;

import java.util.function.Consumer;

import myxej.garduite;
import myxej.modblocks;
import myxej.moditems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.CookingRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

public class modRecipeProvider extends RecipeProvider {

    public modRecipeProvider(DataGenerator generator) {
        super(generator);
    }
    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        // SILVER
        ShapelessRecipeBuilder.shapeless(moditems.SILVER_INGOT.get(), 9)
        .requires(modblocks.SILVER_BLOCK.get())
        .unlockedBy("has_item", has(moditems.SILVER_INGOT.get()))
        .save(consumer)
        ;

        ShapedRecipeBuilder.shaped(modblocks.SILVER_BLOCK.get())
        .define('#', moditems.SILVER_INGOT.get())
        .pattern("###")
        .pattern("###")
        .pattern("###")
        .unlockedBy("has_item", has(moditems.SILVER_INGOT.get()))
        .save(consumer)
        ;

        // COPPER
        ShapelessRecipeBuilder.shapeless(moditems.COPPER_INGOT.get(), 9)
        .requires(modblocks.COPPER_BLOCK.get())
        .unlockedBy("has_item", has(moditems.COPPER_INGOT.get()))
        .save(consumer)
        ;

        ShapedRecipeBuilder.shaped(modblocks.COPPER_BLOCK.get())
        .define('#', moditems.COPPER_INGOT.get())
        .pattern("###")
        .pattern("###")
        .pattern("###")
        .unlockedBy("has_item", has(moditems.COPPER_INGOT.get()))
        .save(consumer)
        ;

        // Cooking silver
        CookingRecipeBuilder.cooking(Ingredient.of(modblocks.SILVER_ORE.get()), moditems.SILVER_INGOT.get(), 0.7f, 200, CookingRecipeSerializer.SMELTING_RECIPE)
        .unlockedBy("has_item", has(modblocks.SILVER_ORE.get()))
        .save(consumer, modid("silver_ore_smelting"));   

        CookingRecipeBuilder.blasting(Ingredient.of(modblocks.SILVER_ORE.get()), moditems.SILVER_INGOT.get(), 0.7f, 100)
        .unlockedBy("has_item", has(modblocks.SILVER_ORE.get()))
        .save(consumer, modid("silver_ore_blasting"));
        
        CookingRecipeBuilder.cooking(Ingredient.of(moditems.SILVER_ORE_CHUNK.get()), moditems.SILVER_INGOT.get(), 0.7f, 200, CookingRecipeSerializer.SMELTING_RECIPE)
        .unlockedBy("has_item", has(moditems.SILVER_ORE_CHUNK.get()))
        .save(consumer, modid("silver_ore_chunk_smelting"));

        CookingRecipeBuilder.blasting(Ingredient.of(moditems.SILVER_ORE_CHUNK.get()), moditems.SILVER_INGOT.get(), 0.7f, 100)
        .unlockedBy("has_item", has(moditems.SILVER_ORE_CHUNK.get()))
        .save(consumer, modid("silver_ore_chunk_blasting"));
        
        // Cooking iron
        CookingRecipeBuilder.cooking(Ingredient.of(moditems.IRON_ORE_CHUNK.get()), Items.IRON_INGOT, 0.7f, 200, CookingRecipeSerializer.SMELTING_RECIPE)
        .unlockedBy("has_item", has(moditems.IRON_ORE_CHUNK.get()))
        .save(consumer, modid("iron_ore_chunk_smelting"));

        CookingRecipeBuilder.blasting(Ingredient.of(moditems.IRON_ORE_CHUNK.get()), Items.IRON_INGOT, 0.7f, 100)
        .unlockedBy("has_item", has(moditems.IRON_ORE_CHUNK.get()))
        .save(consumer, modid("iron_ore_chunk_blasting"));

        // Cooking copper
        CookingRecipeBuilder.cooking(Ingredient.of(modblocks.COPPER_ORE.get()), moditems.COPPER_INGOT.get(), 0.7f, 200, CookingRecipeSerializer.SMELTING_RECIPE)
        .unlockedBy("has_item", has(modblocks.COPPER_ORE.get()))
        .save(consumer, modid("copper_ore_smelting"));   

        CookingRecipeBuilder.blasting(Ingredient.of(modblocks.COPPER_ORE.get()), moditems.COPPER_INGOT.get(), 0.7f, 100)
        .unlockedBy("has_item", has(modblocks.COPPER_ORE.get()))
        .save(consumer, modid("copper_ore_blasting"));
        
        CookingRecipeBuilder.cooking(Ingredient.of(moditems.COPPER_ORE_CHUNK.get()), moditems.COPPER_INGOT.get(), 0.7f, 200, CookingRecipeSerializer.SMELTING_RECIPE)
        .unlockedBy("has_item", has(moditems.COPPER_ORE_CHUNK.get()))
        .save(consumer, modid("copper_ore_chunk_smelting"));

        CookingRecipeBuilder.blasting(Ingredient.of(moditems.COPPER_ORE_CHUNK.get()), moditems.COPPER_INGOT.get(), 0.7f, 100)
        .unlockedBy("has_item", has(moditems.COPPER_ORE_CHUNK.get()))
        .save(consumer, modid("copper_ore_chunk_blasting"));

    }

    private static ResourceLocation modid(String path) {
        return new ResourceLocation(garduite.MODID, path);
    }
    
}
