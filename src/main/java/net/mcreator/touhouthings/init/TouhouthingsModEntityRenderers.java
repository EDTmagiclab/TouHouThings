
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class TouhouthingsModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(TouhouthingsModEntities.JADE_BALL, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.BA_GUA_STOVE, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.LITTLE_JADE, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.LITTLE_JADE_BLUE, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.LITTLE_JADE_RED_1X, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.LITTLE_JADE_BLUE_1X, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.LITTLE_JADE_RED_2X, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.LITTLE_JADE_BLUE_2X, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.BIG_JADE_RED, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.BIG_JADE_BLUE, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.BIG_JADE_RED_1X, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.BIG_JADE_BLUE_1X, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.BIG_JADE_2X, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.BIG_JADE_BLUE_2X, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.KNIFE_OF_SAKUYA, ThrownItemRenderer::new);
		EntityRendererRegistry.register(TouhouthingsModEntities.GUN_OF_RISEN, ThrownItemRenderer::new);
	}
}
