package net.mcreator.magicmod.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class SpawnEggTableItemRetrivedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
			if (_ent != null) {
				final int _slotid = 0;
				final ItemStack _setstack = (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).copy();
				_setstack.setCount((int) ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getCount() - (-1)));
				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable)
						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
				});
			}
		}
		{
			BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
			if (_ent != null) {
				final int _slotid = 1;
				final ItemStack _setstack = (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).copy();
				_setstack.setCount((int) ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getCount() - (-1)));
				_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable)
						((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
				});
			}
		}
	}
}
