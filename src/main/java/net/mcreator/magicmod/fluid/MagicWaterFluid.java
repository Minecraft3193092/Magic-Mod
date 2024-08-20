
package net.mcreator.magicmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.magicmod.init.MagicmodModItems;
import net.mcreator.magicmod.init.MagicmodModFluids;
import net.mcreator.magicmod.init.MagicmodModFluidTypes;
import net.mcreator.magicmod.init.MagicmodModBlocks;

public abstract class MagicWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> MagicmodModFluidTypes.MAGIC_WATER_TYPE.get(), () -> MagicmodModFluids.MAGIC_WATER.get(), () -> MagicmodModFluids.FLOWING_MAGIC_WATER.get())
			.explosionResistance(100f).bucket(() -> MagicmodModItems.MAGIC_WATER_BUCKET.get()).block(() -> (LiquidBlock) MagicmodModBlocks.MAGIC_WATER.get());

	private MagicWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MagicWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MagicWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
