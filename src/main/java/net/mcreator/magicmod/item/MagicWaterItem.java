
package net.mcreator.magicmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.magicmod.init.MagicmodModFluids;

public class MagicWaterItem extends BucketItem {
	public MagicWaterItem() {
		super(MagicmodModFluids.MAGIC_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
