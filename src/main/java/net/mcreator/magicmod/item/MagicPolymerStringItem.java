
package net.mcreator.magicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicPolymerStringItem extends Item {
	public MagicPolymerStringItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
