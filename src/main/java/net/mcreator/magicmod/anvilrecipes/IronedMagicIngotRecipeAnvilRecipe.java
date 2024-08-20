
package net.mcreator.magicmod.anvilrecipes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.AnvilUpdateEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import net.mcreator.magicmod.init.MagicmodModItems;

@Mod.EventBusSubscriber
public class IronedMagicIngotRecipeAnvilRecipe {
	@SubscribeEvent
	public static void execute(AnvilUpdateEvent event) {
		if ((event.getLeft().getItem() == MagicmodModItems.MAGIC_INGOT.get()) && (event.getRight().getItem() == Items.IRON_INGOT)) {
			if ((event.getLeft().getCount() == 1) && (event.getRight().getCount() >= 1)) {
				event.setMaterialCost(1);
				event.setCost(1);
				event.setOutput(new ItemStack(MagicmodModItems.MAGIC_IRON_INGOT.get()));
			}
		}
	}
}
