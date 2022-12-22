package net.mcreator.haecksenball.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

public class SchlaegerBeimTickDesGegenstandesInDerHandProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (!(itemstack).isEnchanted()) {
			(itemstack).enchant(Enchantments.KNOCKBACK, 3);
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("Verzaubert!"), false);
			}
		}
	}
}
