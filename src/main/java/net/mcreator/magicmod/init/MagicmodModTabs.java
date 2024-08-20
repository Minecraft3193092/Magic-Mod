
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.magicmod.MagicmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MagicmodMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MagicmodModBlocks.MAGIC_STONE.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_ORE.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_BLOCK.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_WOOD.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_LOG.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_PLANKS.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_STAIRS.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_SLAB.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_BUTTON.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_GLASS.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_SAND.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(MagicmodModBlocks.MAGIC_FENCE_GATE.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_PRESSURE_PLATE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(MagicmodModBlocks.MAGIC_CRAFTING_TABLE.get().asItem());
			tabData.accept(MagicmodModBlocks.SPAWN_EGG_TABLE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MagicmodModItems.MAGIC_SWORD.get());
			tabData.accept(MagicmodModItems.MAGIC_ARMOR_HELMET.get());
			tabData.accept(MagicmodModItems.MAGIC_ARMOR_CHESTPLATE.get());
			tabData.accept(MagicmodModItems.MAGIC_ARMOR_LEGGINGS.get());
			tabData.accept(MagicmodModItems.MAGIC_ARMOR_BOOTS.get());
			tabData.accept(MagicmodModItems.MAGIC_ARROW.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MagicmodModItems.SE_MAGIC_INGOT.get());
			tabData.accept(MagicmodModItems.MAGIC_INGOT.get());
			tabData.accept(MagicmodModItems.MAGIC_WATER_BUCKET.get());
			tabData.accept(MagicmodModItems.MAGIC_IRON_INGOT.get());
			tabData.accept(MagicmodModItems.MAGIC_FUEL.get());
			tabData.accept(MagicmodModItems.MAGICITE_INGOT.get());
			tabData.accept(MagicmodModItems.MAGIC_EGG.get());
			tabData.accept(MagicmodModItems.MAGIC_DUST.get());
			tabData.accept(MagicmodModItems.MAGIC_ENCHANTED_DUST.get());
			tabData.accept(MagicmodModItems.MAGIC_DUST_GLASS_BOTTLE.get());
			tabData.accept(MagicmodModItems.MAGIC_ENCHANTED_DUST_GLASS_BOTTLE.get());
			tabData.accept(MagicmodModItems.MAGIC_BRAIN.get());
			tabData.accept(MagicmodModItems.COMMAND_BLOCK_CORE.get());
			tabData.accept(MagicmodModItems.NETHER_STAR_CORE.get());
			tabData.accept(MagicmodModItems.DIAMONDEDSEMAGICINGOT.get());
			tabData.accept(MagicmodModItems.MAGIC_ALLOY_INGOT.get());
			tabData.accept(MagicmodModItems.MAGIC_CHIP.get());
			tabData.accept(MagicmodModItems.MAGIC_CRYSTAL.get());
			tabData.accept(MagicmodModItems.RAW_MAGIC_CRYSTAL.get());
			tabData.accept(MagicmodModItems.MAGIC_LATEX.get());
			tabData.accept(MagicmodModItems.MAGIC_RUBBER.get());
			tabData.accept(MagicmodModItems.MAGIC_WOODEN_STICK.get());
			tabData.accept(MagicmodModItems.MAGIC_LATEX_STICK.get());
			tabData.accept(MagicmodModItems.MAGIC_LATEX_STRING.get());
			tabData.accept(MagicmodModItems.MAGIC_RUBBER_STICK.get());
			tabData.accept(MagicmodModItems.MAGIC_RUBBER_STRING.get());
			tabData.accept(MagicmodModItems.MAGIC_POLYMER.get());
			tabData.accept(MagicmodModItems.MAGIC_POLYMER_STICK.get());
			tabData.accept(MagicmodModItems.MAGIC_POLYMER_STRING.get());
			tabData.accept(MagicmodModItems.RAW_MAGIC_MATERIAL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MagicmodModItems.MAGICTOOL.get());
			tabData.accept(MagicmodModItems.MAGIC_PICKAXE.get());
			tabData.accept(MagicmodModItems.MAGIC_AXE.get());
			tabData.accept(MagicmodModItems.MAGIC_SHOVEL.get());
			tabData.accept(MagicmodModItems.MAGIC_HOE.get());
			tabData.accept(MagicmodModItems.MAGICREALM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MagicmodModBlocks.MAGIC_LEAVES.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_FENCE.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_FLOWER.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_DIRT.get().asItem());
			tabData.accept(MagicmodModBlocks.MAGIC_GRASS_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(MagicmodModItems.MAGIC_CUCUMBER.get());
		}
	}
}
