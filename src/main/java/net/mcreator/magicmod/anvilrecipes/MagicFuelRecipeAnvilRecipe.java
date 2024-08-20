
package net.mcreator.magicmod.anvilrecipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.AnvilUpdateEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import net.mcreator.magicmod.init.MagicmodModItems;

@Mod.EventBusSubscriber
public class MagicFuelRecipeAnvilRecipe {
	@SubscribeEvent
	public static void execute(AnvilUpdateEvent event) {
		if ((event.getLeft().getItem() == MagicmodModItems.MAGIC_INGOT.get()) && (event.getRight().getItem() == Items.COAL)) {
			if ((event.getLeft().getCount() == 1) && (event.getRight().getCount() >= 1)) {
				event.setMaterialCost(1);
				event.setCost(1);
				event.setOutput(new ItemStack(MagicmodModItems.MAGIC_FUEL.get()));
			}
		}
	}
}
