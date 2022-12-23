
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
	}
}
