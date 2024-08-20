
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.magicmod.block.SpawnEggTableBlock;
import net.mcreator.magicmod.block.MagicrealmPortalBlock;
import net.mcreator.magicmod.block.MagicWoodBlock;
import net.mcreator.magicmod.block.MagicWaterBlock;
import net.mcreator.magicmod.block.MagicStoneBlock;
import net.mcreator.magicmod.block.MagicStairsBlock;
import net.mcreator.magicmod.block.MagicSmartStorageBlock;
import net.mcreator.magicmod.block.MagicSlabBlock;
import net.mcreator.magicmod.block.MagicSandBlock;
import net.mcreator.magicmod.block.MagicPressurePlateBlock;
import net.mcreator.magicmod.block.MagicPlanksBlock;
import net.mcreator.magicmod.block.MagicOreBlock;
import net.mcreator.magicmod.block.MagicLogBlock;
import net.mcreator.magicmod.block.MagicLeavesBlock;
import net.mcreator.magicmod.block.MagicGrassBlockBlock;
import net.mcreator.magicmod.block.MagicGlassBlock;
import net.mcreator.magicmod.block.MagicFlowerBlock;
import net.mcreator.magicmod.block.MagicFenceGateBlock;
import net.mcreator.magicmod.block.MagicFenceBlock;
import net.mcreator.magicmod.block.MagicDirtBlock;
import net.mcreator.magicmod.block.MagicCraftingTableBlock;
import net.mcreator.magicmod.block.MagicButtonBlock;
import net.mcreator.magicmod.block.MagicBlockBlock;
import net.mcreator.magicmod.block.MagicAlloyBlockBlock;
import net.mcreator.magicmod.MagicmodMod;

public class MagicmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MagicmodMod.MODID);
	public static final RegistryObject<Block> MAGIC_STONE = REGISTRY.register("magic_stone", () -> new MagicStoneBlock());
	public static final RegistryObject<Block> MAGIC_ORE = REGISTRY.register("magic_ore", () -> new MagicOreBlock());
	public static final RegistryObject<Block> MAGIC_BLOCK = REGISTRY.register("magic_block", () -> new MagicBlockBlock());
	public static final RegistryObject<Block> MAGIC_WOOD = REGISTRY.register("magic_wood", () -> new MagicWoodBlock());
	public static final RegistryObject<Block> MAGIC_LOG = REGISTRY.register("magic_log", () -> new MagicLogBlock());
	public static final RegistryObject<Block> MAGIC_PLANKS = REGISTRY.register("magic_planks", () -> new MagicPlanksBlock());
	public static final RegistryObject<Block> MAGIC_LEAVES = REGISTRY.register("magic_leaves", () -> new MagicLeavesBlock());
	public static final RegistryObject<Block> MAGIC_STAIRS = REGISTRY.register("magic_stairs", () -> new MagicStairsBlock());
	public static final RegistryObject<Block> MAGIC_SLAB = REGISTRY.register("magic_slab", () -> new MagicSlabBlock());
	public static final RegistryObject<Block> MAGIC_FENCE = REGISTRY.register("magic_fence", () -> new MagicFenceBlock());
	public static final RegistryObject<Block> MAGIC_FENCE_GATE = REGISTRY.register("magic_fence_gate", () -> new MagicFenceGateBlock());
	public static final RegistryObject<Block> MAGIC_PRESSURE_PLATE = REGISTRY.register("magic_pressure_plate", () -> new MagicPressurePlateBlock());
	public static final RegistryObject<Block> MAGIC_BUTTON = REGISTRY.register("magic_button", () -> new MagicButtonBlock());
	public static final RegistryObject<Block> MAGIC_WATER = REGISTRY.register("magic_water", () -> new MagicWaterBlock());
	public static final RegistryObject<Block> MAGIC_GLASS = REGISTRY.register("magic_glass", () -> new MagicGlassBlock());
	public static final RegistryObject<Block> MAGIC_FLOWER = REGISTRY.register("magic_flower", () -> new MagicFlowerBlock());
	public static final RegistryObject<Block> MAGICREALM_PORTAL = REGISTRY.register("magicrealm_portal", () -> new MagicrealmPortalBlock());
	public static final RegistryObject<Block> MAGIC_DIRT = REGISTRY.register("magic_dirt", () -> new MagicDirtBlock());
	public static final RegistryObject<Block> MAGIC_GRASS_BLOCK = REGISTRY.register("magic_grass_block", () -> new MagicGrassBlockBlock());
	public static final RegistryObject<Block> MAGIC_CRAFTING_TABLE = REGISTRY.register("magic_crafting_table", () -> new MagicCraftingTableBlock());
	public static final RegistryObject<Block> SPAWN_EGG_TABLE = REGISTRY.register("spawn_egg_table", () -> new SpawnEggTableBlock());
	public static final RegistryObject<Block> MAGIC_SAND = REGISTRY.register("magic_sand", () -> new MagicSandBlock());
	public static final RegistryObject<Block> MAGIC_ALLOY_BLOCK = REGISTRY.register("magic_alloy_block", () -> new MagicAlloyBlockBlock());
	public static final RegistryObject<Block> MAGIC_SMART_STORAGE = REGISTRY.register("magic_smart_storage", () -> new MagicSmartStorageBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
