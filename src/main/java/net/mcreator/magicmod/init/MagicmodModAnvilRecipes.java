
package net.mcreator.magicmod.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import mezz.jei.api.recipe.vanilla.IJeiAnvilRecipe;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;
import java.util.ArrayList;

@JeiPlugin
public class MagicmodModAnvilRecipes implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("magicmod:anvil_recipes");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		IVanillaRecipeFactory factory = registration.getVanillaRecipeFactory();
		List<IJeiAnvilRecipe> anvilRecipes = new ArrayList<>();
		ItemStack rightItem = ItemStack.EMPTY;
		rightItem = new ItemStack(Items.IRON_INGOT);
		rightItem.setCount(1);
		anvilRecipes.add(factory.createAnvilRecipe(new ItemStack(MagicmodModItems.MAGIC_INGOT.get()), List.of(rightItem.copy()), List.of(new ItemStack(MagicmodModItems.MAGIC_IRON_INGOT.get()))));
		rightItem = new ItemStack(Items.COAL);
		rightItem.setCount(1);
		anvilRecipes.add(factory.createAnvilRecipe(new ItemStack(MagicmodModItems.MAGIC_INGOT.get()), List.of(rightItem.copy()), List.of(new ItemStack(MagicmodModItems.MAGIC_FUEL.get()))));
		registration.addRecipes(RecipeTypes.ANVIL, anvilRecipes);
	}
}
