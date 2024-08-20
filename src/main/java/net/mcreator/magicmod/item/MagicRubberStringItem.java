
package net.mcreator.magicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicRubberStringItem extends Item {
	public MagicRubberStringItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
