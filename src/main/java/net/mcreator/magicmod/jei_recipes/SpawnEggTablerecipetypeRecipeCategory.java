
package net.mcreator.magicmod.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.magicmod.init.MagicmodModJeiPlugin;
import net.mcreator.magicmod.init.MagicmodModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class SpawnEggTablerecipetypeRecipeCategory implements IRecipeCategory<SpawnEggTablerecipetypeRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("magicmod", "spawn_egg_tablerecipetype");
	public final static ResourceLocation TEXTURE = new ResourceLocation("magicmod", "textures/screens/spawn_egg_table_ui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public SpawnEggTablerecipetypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 82);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(MagicmodModBlocks.SPAWN_EGG_TABLE.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<SpawnEggTablerecipetypeRecipe> getRecipeType() {
		return MagicmodModJeiPlugin.SpawnEggTablerecipetype_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Spawn Egg Table recipe type");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, SpawnEggTablerecipetypeRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 20, 38).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 44, 38).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 133, 38).addItemStack(recipe.getResultItem(null));
	}
}
