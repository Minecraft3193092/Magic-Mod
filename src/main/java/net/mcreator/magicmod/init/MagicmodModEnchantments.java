
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.magicmod.enchantment.MagicenfEnchantment;
import net.mcreator.magicmod.enchantment.MagicAttackEnchantment;
import net.mcreator.magicmod.MagicmodMod;

public class MagicmodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MagicmodMod.MODID);
	public static final RegistryObject<Enchantment> MAGICENF = REGISTRY.register("magicenf", () -> new MagicenfEnchantment());
	public static final RegistryObject<Enchantment> MAGIC_ATTACK = REGISTRY.register("magic_attack", () -> new MagicAttackEnchantment());
}
