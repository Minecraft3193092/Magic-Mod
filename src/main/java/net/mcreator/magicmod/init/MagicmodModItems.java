
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.magicmod.item.SeMagicIngotItem;
import net.mcreator.magicmod.item.RawMagicMaterialItem;
import net.mcreator.magicmod.item.RawMagicCrystalItem;
import net.mcreator.magicmod.item.NetherStarCoreItem;
import net.mcreator.magicmod.item.MagictoolItem;
import net.mcreator.magicmod.item.MagicrealmItem;
import net.mcreator.magicmod.item.MagiciteIngotItem;
import net.mcreator.magicmod.item.MagicWoodenStickItem;
import net.mcreator.magicmod.item.MagicWaterItem;
import net.mcreator.magicmod.item.MagicWaferItem;
import net.mcreator.magicmod.item.MagicSwordItem;
import net.mcreator.magicmod.item.MagicStringItem;
import net.mcreator.magicmod.item.MagicStickItem;
import net.mcreator.magicmod.item.MagicShovelItem;
import net.mcreator.magicmod.item.MagicRubberStringItem;
import net.mcreator.magicmod.item.MagicRubberStickItem;
import net.mcreator.magicmod.item.MagicRubberItem;
import net.mcreator.magicmod.item.MagicPolymerStringItem;
import net.mcreator.magicmod.item.MagicPolymerStickItem;
import net.mcreator.magicmod.item.MagicPolymerItem;
import net.mcreator.magicmod.item.MagicPickaxeItem;
import net.mcreator.magicmod.item.MagicLatexItem;
import net.mcreator.magicmod.item.MagicIngotItem;
import net.mcreator.magicmod.item.MagicHoeItem;
import net.mcreator.magicmod.item.MagicFuelItem;
import net.mcreator.magicmod.item.MagicEnchantedDustItem;
import net.mcreator.magicmod.item.MagicEnchantedDustGlassBottleItem;
import net.mcreator.magicmod.item.MagicEggItem;
import net.mcreator.magicmod.item.MagicDustItem;
import net.mcreator.magicmod.item.MagicDustGlassBottleItem;
import net.mcreator.magicmod.item.MagicCucumberItem;
import net.mcreator.magicmod.item.MagicCrystalItem;
import net.mcreator.magicmod.item.MagicChipItem;
import net.mcreator.magicmod.item.MagicBrainItem;
import net.mcreator.magicmod.item.MagicAxeItem;
import net.mcreator.magicmod.item.MagicArrowItem;
import net.mcreator.magicmod.item.MagicArmorItem;
import net.mcreator.magicmod.item.MagicAlloyIngotItem;
import net.mcreator.magicmod.item.IronedMagicIngotItem;
import net.mcreator.magicmod.item.DiamondedsemagicingotItem;
import net.mcreator.magicmod.item.CommandBlockCoreItem;
import net.mcreator.magicmod.MagicmodMod;

public class MagicmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MagicmodMod.MODID);
	public static final RegistryObject<Item> MAGICTOOL = REGISTRY.register("magictool", () -> new MagictoolItem());
	public static final RegistryObject<Item> MAGIC_STONE = block(MagicmodModBlocks.MAGIC_STONE);
	public static final RegistryObject<Item> SE_MAGIC_INGOT = REGISTRY.register("se_magic_ingot", () -> new SeMagicIngotItem());
	public static final RegistryObject<Item> MAGIC_SWORD = REGISTRY.register("magic_sword", () -> new MagicSwordItem());
	public static final RegistryObject<Item> MAGIC_INGOT = REGISTRY.register("magic_ingot", () -> new MagicIngotItem());
	public static final RegistryObject<Item> MAGIC_ORE = block(MagicmodModBlocks.MAGIC_ORE);
	public static final RegistryObject<Item> MAGIC_BLOCK = block(MagicmodModBlocks.MAGIC_BLOCK);
	public static final RegistryObject<Item> MAGIC_PICKAXE = REGISTRY.register("magic_pickaxe", () -> new MagicPickaxeItem());
	public static final RegistryObject<Item> MAGIC_AXE = REGISTRY.register("magic_axe", () -> new MagicAxeItem());
	public static final RegistryObject<Item> MAGIC_SHOVEL = REGISTRY.register("magic_shovel", () -> new MagicShovelItem());
	public static final RegistryObject<Item> MAGIC_HOE = REGISTRY.register("magic_hoe", () -> new MagicHoeItem());
	public static final RegistryObject<Item> MAGIC_ARMOR_HELMET = REGISTRY.register("magic_armor_helmet", () -> new MagicArmorItem.Helmet());
	public static final RegistryObject<Item> MAGIC_ARMOR_CHESTPLATE = REGISTRY.register("magic_armor_chestplate", () -> new MagicArmorItem.Chestplate());
	public static final RegistryObject<Item> MAGIC_ARMOR_LEGGINGS = REGISTRY.register("magic_armor_leggings", () -> new MagicArmorItem.Leggings());
	public static final RegistryObject<Item> MAGIC_ARMOR_BOOTS = REGISTRY.register("magic_armor_boots", () -> new MagicArmorItem.Boots());
	public static final RegistryObject<Item> MAGIC_WOOD = block(MagicmodModBlocks.MAGIC_WOOD);
	public static final RegistryObject<Item> MAGIC_LOG = block(MagicmodModBlocks.MAGIC_LOG);
	public static final RegistryObject<Item> MAGIC_PLANKS = block(MagicmodModBlocks.MAGIC_PLANKS);
	public static final RegistryObject<Item> MAGIC_LEAVES = block(MagicmodModBlocks.MAGIC_LEAVES);
	public static final RegistryObject<Item> MAGIC_STAIRS = block(MagicmodModBlocks.MAGIC_STAIRS);
	public static final RegistryObject<Item> MAGIC_SLAB = block(MagicmodModBlocks.MAGIC_SLAB);
	public static final RegistryObject<Item> MAGIC_FENCE = block(MagicmodModBlocks.MAGIC_FENCE);
	public static final RegistryObject<Item> MAGIC_FENCE_GATE = block(MagicmodModBlocks.MAGIC_FENCE_GATE);
	public static final RegistryObject<Item> MAGIC_PRESSURE_PLATE = block(MagicmodModBlocks.MAGIC_PRESSURE_PLATE);
	public static final RegistryObject<Item> MAGIC_BUTTON = block(MagicmodModBlocks.MAGIC_BUTTON);
	public static final RegistryObject<Item> MAGIC_WATER_BUCKET = REGISTRY.register("magic_water_bucket", () -> new MagicWaterItem());
	public static final RegistryObject<Item> MAGIC_GLASS = block(MagicmodModBlocks.MAGIC_GLASS);
	public static final RegistryObject<Item> MAGIC_IRON_INGOT = REGISTRY.register("magic_iron_ingot", () -> new IronedMagicIngotItem());
	public static final RegistryObject<Item> MAGIC_FLOWER = block(MagicmodModBlocks.MAGIC_FLOWER);
	public static final RegistryObject<Item> MAGIC_FUEL = REGISTRY.register("magic_fuel", () -> new MagicFuelItem());
	public static final RegistryObject<Item> MAGICITE_INGOT = REGISTRY.register("magicite_ingot", () -> new MagiciteIngotItem());
	public static final RegistryObject<Item> MAGICREALM = REGISTRY.register("magicrealm", () -> new MagicrealmItem());
	public static final RegistryObject<Item> MAGIC_DIRT = block(MagicmodModBlocks.MAGIC_DIRT);
	public static final RegistryObject<Item> MAGIC_GRASS_BLOCK = block(MagicmodModBlocks.MAGIC_GRASS_BLOCK);
	public static final RegistryObject<Item> MAGIC_EGG = REGISTRY.register("magic_egg", () -> new MagicEggItem());
	public static final RegistryObject<Item> MAGIC_CRAFTING_TABLE = block(MagicmodModBlocks.MAGIC_CRAFTING_TABLE);
	public static final RegistryObject<Item> SPAWN_EGG_TABLE = block(MagicmodModBlocks.SPAWN_EGG_TABLE);
	public static final RegistryObject<Item> MAGIC_DUST = REGISTRY.register("magic_dust", () -> new MagicDustItem());
	public static final RegistryObject<Item> MAGIC_ENCHANTED_DUST = REGISTRY.register("magic_enchanted_dust", () -> new MagicEnchantedDustItem());
	public static final RegistryObject<Item> MAGIC_DUST_GLASS_BOTTLE = REGISTRY.register("magic_dust_glass_bottle", () -> new MagicDustGlassBottleItem());
	public static final RegistryObject<Item> MAGIC_ENCHANTED_DUST_GLASS_BOTTLE = REGISTRY.register("magic_enchanted_dust_glass_bottle", () -> new MagicEnchantedDustGlassBottleItem());
	public static final RegistryObject<Item> MAGIC_SAND = block(MagicmodModBlocks.MAGIC_SAND);
	public static final RegistryObject<Item> MAGIC_BRAIN = REGISTRY.register("magic_brain", () -> new MagicBrainItem());
	public static final RegistryObject<Item> COMMAND_BLOCK_CORE = REGISTRY.register("command_block_core", () -> new CommandBlockCoreItem());
	public static final RegistryObject<Item> MAGIC_CUCUMBER = REGISTRY.register("magic_cucumber", () -> new MagicCucumberItem());
	public static final RegistryObject<Item> NETHER_STAR_CORE = REGISTRY.register("nether_star_core", () -> new NetherStarCoreItem());
	public static final RegistryObject<Item> DIAMONDEDSEMAGICINGOT = REGISTRY.register("diamondedsemagicingot", () -> new DiamondedsemagicingotItem());
	public static final RegistryObject<Item> MAGIC_ALLOY_INGOT = REGISTRY.register("magic_alloy_ingot", () -> new MagicAlloyIngotItem());
	public static final RegistryObject<Item> MAGIC_ALLOY_BLOCK = block(MagicmodModBlocks.MAGIC_ALLOY_BLOCK);
	public static final RegistryObject<Item> MAGIC_CHIP = REGISTRY.register("magic_chip", () -> new MagicChipItem());
	public static final RegistryObject<Item> MAGIC_CRYSTAL = REGISTRY.register("magic_crystal", () -> new MagicCrystalItem());
	public static final RegistryObject<Item> RAW_MAGIC_CRYSTAL = REGISTRY.register("raw_magic_crystal", () -> new RawMagicCrystalItem());
	public static final RegistryObject<Item> MAGIC_LATEX = REGISTRY.register("magic_latex", () -> new MagicLatexItem());
	public static final RegistryObject<Item> MAGIC_RUBBER = REGISTRY.register("magic_rubber", () -> new MagicRubberItem());
	public static final RegistryObject<Item> MAGIC_WOODEN_STICK = REGISTRY.register("magic_wooden_stick", () -> new MagicWoodenStickItem());
	public static final RegistryObject<Item> MAGIC_LATEX_STICK = REGISTRY.register("magic_latex_stick", () -> new MagicStickItem());
	public static final RegistryObject<Item> MAGIC_LATEX_STRING = REGISTRY.register("magic_latex_string", () -> new MagicStringItem());
	public static final RegistryObject<Item> MAGIC_RUBBER_STICK = REGISTRY.register("magic_rubber_stick", () -> new MagicRubberStickItem());
	public static final RegistryObject<Item> MAGIC_RUBBER_STRING = REGISTRY.register("magic_rubber_string", () -> new MagicRubberStringItem());
	public static final RegistryObject<Item> MAGIC_POLYMER = REGISTRY.register("magic_polymer", () -> new MagicPolymerItem());
	public static final RegistryObject<Item> MAGIC_POLYMER_STICK = REGISTRY.register("magic_polymer_stick", () -> new MagicPolymerStickItem());
	public static final RegistryObject<Item> MAGIC_POLYMER_STRING = REGISTRY.register("magic_polymer_string", () -> new MagicPolymerStringItem());
	public static final RegistryObject<Item> RAW_MAGIC_MATERIAL = REGISTRY.register("raw_magic_material", () -> new RawMagicMaterialItem());
	public static final RegistryObject<Item> MAGIC_ARROW = REGISTRY.register("magic_arrow", () -> new MagicArrowItem());
	public static final RegistryObject<Item> MAGIC_WAFER = REGISTRY.register("magic_wafer", () -> new MagicWaferItem());
	public static final RegistryObject<Item> MAGIC_SMART_STORAGE = block(MagicmodModBlocks.MAGIC_SMART_STORAGE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
