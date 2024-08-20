
package net.mcreator.magicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicWaferItem extends Item {
	public MagicWaferItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
