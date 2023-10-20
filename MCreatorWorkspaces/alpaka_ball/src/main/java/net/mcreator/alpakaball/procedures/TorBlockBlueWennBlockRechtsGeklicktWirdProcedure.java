package net.mcreator.alpakaball.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.alpakaball.network.AlpakaBallModVariables;

public class TorBlockBlueWennBlockRechtsGeklicktWirdProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"/bossbar set blue value 0");
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + "" + (" hat " + (Math.round(AlpakaBallModVariables.MapVariables.get(world).punktzahl_blau) + " Punkte von Blau zur\u00FCckgesetzt!")))), false);
		AlpakaBallModVariables.MapVariables.get(world).punktzahl_blau = 0;
		AlpakaBallModVariables.MapVariables.get(world).syncData(world);
	}
}
