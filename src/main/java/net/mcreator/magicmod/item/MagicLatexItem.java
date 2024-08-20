
package net.mcreator.magicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MagicLatexItem extends Item {
	public MagicLatexItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
