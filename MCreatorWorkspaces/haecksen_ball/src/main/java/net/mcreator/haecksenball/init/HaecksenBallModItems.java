
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haecksenball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.haecksenball.item.SchlaegerItem;
import net.mcreator.haecksenball.HaecksenBallMod;

public class HaecksenBallModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HaecksenBallMod.MODID);
	public static final RegistryObject<Item> FLUGBALL = REGISTRY.register("flugball_spawn_egg",
			() -> new ForgeSpawnEggItem(HaecksenBallModEntities.FLUGBALL, -10079488, -13688571, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TOR_BLOCK_ORANGE = block(HaecksenBallModBlocks.TOR_BLOCK_ORANGE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOR_BLOCK_BLUE = block(HaecksenBallModBlocks.TOR_BLOCK_BLUE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SCHLAEGER = REGISTRY.register("schlaeger", () -> new SchlaegerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
