
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alpakaball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.alpakaball.item.SchlaegerItem;
import net.mcreator.alpakaball.AlpakaBallMod;

public class AlpakaBallModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlpakaBallMod.MODID);
	public static final RegistryObject<Item> FLUGBALL_SPAWN_EGG = REGISTRY.register("flugball_spawn_egg", () -> new ForgeSpawnEggItem(AlpakaBallModEntities.FLUGBALL, -10079488, -13688571, new Item.Properties()));
	public static final RegistryObject<Item> TOR_BLOCK_ORANGE = block(AlpakaBallModBlocks.TOR_BLOCK_ORANGE);
	public static final RegistryObject<Item> TOR_BLOCK_BLUE = block(AlpakaBallModBlocks.TOR_BLOCK_BLUE);
	public static final RegistryObject<Item> SCHLAEGER = REGISTRY.register("schlaeger", () -> new SchlaegerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
