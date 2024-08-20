
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.magicmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.magicmod.fluid.types.MagicWaterFluidType;
import net.mcreator.magicmod.MagicmodMod;

public class MagicmodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, MagicmodMod.MODID);
	public static final RegistryObject<FluidType> MAGIC_WATER_TYPE = REGISTRY.register("magic_water", () -> new MagicWaterFluidType());
}
