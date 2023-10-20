
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alpakaball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.alpakaball.block.TorBlockOrangeBlock;
import net.mcreator.alpakaball.block.TorBlockBlueBlock;
import net.mcreator.alpakaball.AlpakaBallMod;

public class AlpakaBallModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AlpakaBallMod.MODID);
	public static final RegistryObject<Block> TOR_BLOCK_ORANGE = REGISTRY.register("tor_block_orange", () -> new TorBlockOrangeBlock());
	public static final RegistryObject<Block> TOR_BLOCK_BLUE = REGISTRY.register("tor_block_blue", () -> new TorBlockBlueBlock());
}
