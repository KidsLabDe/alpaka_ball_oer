
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haecksenball.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.haecksenball.client.renderer.FlugballRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HaecksenBallModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HaecksenBallModEntities.FLUGBALL.get(), FlugballRenderer::new);
	}
}
