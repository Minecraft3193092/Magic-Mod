
package net.mcreator.magicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicStickItem extends Item {
	public MagicStickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
