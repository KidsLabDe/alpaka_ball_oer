
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haecksenball.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.haecksenball.block.TorBlockOrangeBlock;
import net.mcreator.haecksenball.block.TorBlockBlueBlock;
import net.mcreator.haecksenball.HaecksenBallMod;

public class HaecksenBallModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HaecksenBallMod.MODID);
	public static final RegistryObject<Block> TOR_BLOCK_ORANGE = REGISTRY.register("tor_block_orange", () -> new TorBlockOrangeBlock());
	public static final RegistryObject<Block> TOR_BLOCK_BLUE = REGISTRY.register("tor_block_blue", () -> new TorBlockBlueBlock());
}
