
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.mcreator.touhouthings.client.model.Modelcustom_model;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class TouhouthingsModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
