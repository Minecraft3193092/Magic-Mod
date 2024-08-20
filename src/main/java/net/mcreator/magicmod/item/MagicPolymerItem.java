
package net.mcreator.magicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicPolymerItem extends Item {
	public MagicPolymerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
