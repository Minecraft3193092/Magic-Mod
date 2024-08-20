
package net.mcreator.magicmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class MagicmodModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("magicmod:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(
				List.of(new ItemStack(MagicmodModItems.MAGIC_INGOT.get()), new ItemStack(MagicmodModItems.MAGIC_IRON_INGOT.get()), new ItemStack(MagicmodModItems.SE_MAGIC_INGOT.get()), new ItemStack(MagicmodModItems.DIAMONDEDSEMAGICINGOT.get())),
				VanillaTypes.ITEM_STACK, Component.translatable("jei.magicmod.magic_ingot_info"));
		registration.addIngredientInfo(List.of(new ItemStack(MagicmodModItems.COMMAND_BLOCK_CORE.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.magicmod.command_block_core_info"));
	}
}
