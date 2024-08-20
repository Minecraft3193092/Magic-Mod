
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.magicmod.world.inventory.SpawnEggTableUIMenu;
import net.mcreator.magicmod.world.inventory.MagicsmartstorageUIMenu;
import net.mcreator.magicmod.world.inventory.MagicSmartStoragePasswordUIMenu;
import net.mcreator.magicmod.MagicmodMod;

public class MagicmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MagicmodMod.MODID);
	public static final RegistryObject<MenuType<SpawnEggTableUIMenu>> SPAWN_EGG_TABLE_UI = REGISTRY.register("spawn_egg_table_ui", () -> IForgeMenuType.create(SpawnEggTableUIMenu::new));
	public static final RegistryObject<MenuType<MagicsmartstorageUIMenu>> MAGICSMARTSTORAGE_UI = REGISTRY.register("magicsmartstorage_ui", () -> IForgeMenuType.create(MagicsmartstorageUIMenu::new));
	public static final RegistryObject<MenuType<MagicSmartStoragePasswordUIMenu>> MAGIC_SMART_STORAGE_PASSWORD_UI = REGISTRY.register("magic_smart_storage_password_ui", () -> IForgeMenuType.create(MagicSmartStoragePasswordUIMenu::new));
}
