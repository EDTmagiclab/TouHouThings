
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.TouhouthingsMod;

public class TouhouthingsModPaintings {
	public static void load() {
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(TouhouthingsMod.MODID, "logo"), new PaintingVariant(16, 16));
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(TouhouthingsMod.MODID, "koishi"), new PaintingVariant(16, 16));
	}
}
