
package net.mcreator.magicmod.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.magicmod.jei_recipes.SpawnEggTablerecipetypeRecipeCategory;
import net.mcreator.magicmod.jei_recipes.SpawnEggTablerecipetypeRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class MagicmodModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<SpawnEggTablerecipetypeRecipe> SpawnEggTablerecipetype_Type = new mezz.jei.api.recipe.RecipeType<>(SpawnEggTablerecipetypeRecipeCategory.UID, SpawnEggTablerecipetypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("magicmod:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new SpawnEggTablerecipetypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<SpawnEggTablerecipetypeRecipe> SpawnEggTablerecipetypeRecipes = recipeManager.getAllRecipesFor(SpawnEggTablerecipetypeRecipe.Type.INSTANCE);
		registration.addRecipes(SpawnEggTablerecipetype_Type, SpawnEggTablerecipetypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
	}
}
