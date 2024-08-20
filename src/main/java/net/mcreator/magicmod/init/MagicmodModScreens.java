
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.magicmod.client.gui.SpawnEggTableUIScreen;
import net.mcreator.magicmod.client.gui.MagicsmartstorageUIScreen;
import net.mcreator.magicmod.client.gui.MagicSmartStoragePasswordUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MagicmodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MagicmodModMenus.SPAWN_EGG_TABLE_UI.get(), SpawnEggTableUIScreen::new);
			MenuScreens.register(MagicmodModMenus.MAGICSMARTSTORAGE_UI.get(), MagicsmartstorageUIScreen::new);
			MenuScreens.register(MagicmodModMenus.MAGIC_SMART_STORAGE_PASSWORD_UI.get(), MagicSmartStoragePasswordUIScreen::new);
		});
	}
}
