/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rbm.devilmaycryweaponsreborn.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class DevilMayCryWeaponsRebornModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.COYOTE_A_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.EBONY_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.IVORY_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_I_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.KALINA_ANN_II_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.BLUE_ROSE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(DevilMayCryWeaponsRebornModEntities.BULLET_PLACEHOLDER.get(), ThrownItemRenderer::new);
	}
}