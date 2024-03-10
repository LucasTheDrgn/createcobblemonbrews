package net.lucasthedrgn.createcobblemonbrews;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;

public class CreateCobblemonBrewsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.MEDICINAL_BREW,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0x2ebca2
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.ETHER,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xd8a8e0
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.ELIXIR,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xf1b097
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.POTION,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xab90ce
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.HYPER_POTION,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xf59bdd
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.FULL_HEAL,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xf7ef3f
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.ANTIDOTE,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xfffa8d
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.AWAKENING,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0x92faff
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.BURN_HEAL,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0x97ffb8
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.ICE_HEAL,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xffd0cc
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.PARALYZE_HEAL,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xedff7a
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.MAX_ETHER,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xb9f197
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.MAX_ELIXIR,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0x97f1e4
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.SUPER_POTION,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0xe1978d
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.MAX_POTION,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0x869eee
		));
		FluidRenderHandlerRegistry.INSTANCE.register(CreateCobblemonBrews.FULL_RESTORE,new SimpleFluidRenderHandler(
				new Identifier("minecraft:block/water_still"),
				new Identifier("minecraft:block/water_flow"),
				0x9bd77f
		));
	}
}