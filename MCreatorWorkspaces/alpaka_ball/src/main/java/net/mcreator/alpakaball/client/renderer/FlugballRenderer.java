
package net.mcreator.haecksenball.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.haecksenball.entity.FlugballEntity;

public class FlugballRenderer extends MobRenderer<FlugballEntity, GhastModel<FlugballEntity>> {
	public FlugballRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FlugballEntity entity) {
		return new ResourceLocation("alpaka_ball:textures/entities/flugball-texture.png");
	}
}
