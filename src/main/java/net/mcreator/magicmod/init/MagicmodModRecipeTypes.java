package net.mcreator.magicmod.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.mcreator.magicmod.jei_recipes.SpawnEggTablerecipetypeRecipe;
import net.mcreator.magicmod.MagicmodMod;

@Mod.EventBusSubscriber(modid = MagicmodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagicmodModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "magicmod");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("spawn_egg_tablerecipetype", () -> SpawnEggTablerecipetypeRecipe.Serializer.INSTANCE);
		});
	}
}
