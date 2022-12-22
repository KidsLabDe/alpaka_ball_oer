package net.mcreator.haecksenball.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.haecksenball.network.HaecksenBallModVariables;

public class TorBlockOrangeWennBlockRechtsGeklicktWirdProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level,
					4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "/bossbar set orange value 0");
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastSystemMessage(Component.literal((entity.getDisplayName().getString() + "" + (" hat "
						+ (Math.round(HaecksenBallModVariables.MapVariables.get(world).punktzahl_orange) + " von Orange zur\u00FCckgesetzt!")))),
						false);
		}
		HaecksenBallModVariables.MapVariables.get(world).punktzahl_orange = 0;
		HaecksenBallModVariables.MapVariables.get(world).syncData(world);
	}
}
