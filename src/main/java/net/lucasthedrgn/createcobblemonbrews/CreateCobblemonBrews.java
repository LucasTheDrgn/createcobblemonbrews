package net.lucasthedrgn.createcobblemonbrews;

import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CreateCobblemonBrews implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("createcobblemonbrews");

	public static final String MOD_ID = "createcobblemonbrews";

	public static VirtualFluid MEDICINAL_BREW;
	public static VirtualFluid ETHER;
	public static VirtualFluid ELIXIR;
	public static VirtualFluid POTION;
	public static VirtualFluid HYPER_POTION;
	public static VirtualFluid FULL_HEAL;
	public static VirtualFluid ANTIDOTE;
	public static VirtualFluid AWAKENING;
	public static VirtualFluid BURN_HEAL;
	public static VirtualFluid ICE_HEAL;
	public static VirtualFluid PARALYZE_HEAL;
	public static VirtualFluid MAX_ETHER;
	public static VirtualFluid MAX_ELIXIR;
	public static VirtualFluid SUPER_POTION;
	public static VirtualFluid MAX_POTION;
	public static VirtualFluid FULL_RESTORE;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initializing Create Cobblemon Brews");

		MEDICINAL_BREW = Registry.register(Registries.FLUID, asResource("medicinal_brew"), new VirtualFluid());
		ETHER = Registry.register(Registries.FLUID, asResource("ether"), new VirtualFluid());
		ELIXIR = Registry.register(Registries.FLUID, asResource("elixir"), new VirtualFluid());
		POTION = Registry.register(Registries.FLUID, asResource("potion"), new VirtualFluid());
		HYPER_POTION = Registry.register(Registries.FLUID, asResource("hyper_potion"), new VirtualFluid());
		FULL_HEAL = Registry.register(Registries.FLUID, asResource("full_heal"), new VirtualFluid());
		ANTIDOTE = Registry.register(Registries.FLUID, asResource("antidote"), new VirtualFluid());
		AWAKENING = Registry.register(Registries.FLUID, asResource("awakening"), new VirtualFluid());
		BURN_HEAL = Registry.register(Registries.FLUID, asResource("burn_heal"), new VirtualFluid());
		ICE_HEAL = Registry.register(Registries.FLUID, asResource("ice_heal"), new VirtualFluid());
		PARALYZE_HEAL = Registry.register(Registries.FLUID, asResource("paralyze_heal"), new VirtualFluid());
		MAX_ETHER = Registry.register(Registries.FLUID, asResource("max_ether"), new VirtualFluid());
		MAX_ELIXIR = Registry.register(Registries.FLUID, asResource("max_elixir"), new VirtualFluid());
		SUPER_POTION = Registry.register(Registries.FLUID, asResource("super_potion"), new VirtualFluid());
		MAX_POTION = Registry.register(Registries.FLUID, asResource("max_potion"), new VirtualFluid());
		FULL_RESTORE = Registry.register(Registries.FLUID, asResource("full_restore"), new VirtualFluid());


	}

	public static Identifier asResource(String id){
		return new Identifier(MOD_ID, id);
	}
}