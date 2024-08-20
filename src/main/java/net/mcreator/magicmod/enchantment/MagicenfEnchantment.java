
package net.mcreator.magicmod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class MagicenfEnchantment extends Enchantment {
	public MagicenfEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 60000;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 100;
	}
}
