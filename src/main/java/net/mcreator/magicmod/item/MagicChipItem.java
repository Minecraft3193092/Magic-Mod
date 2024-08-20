
package net.mcreator.magicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicChipItem extends Item {
	public MagicChipItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
