
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.item.MagicNeddleItem;
import net.mcreator.touhouthings.item.JadeBallItem;
import net.mcreator.touhouthings.item.IzanagiObjectItem;
import net.mcreator.touhouthings.TouhouthingsMod;

public class TouhouthingsModItems {
	public static Item JADE_BALL;
	public static Item MAGIC_NEDDLE;
	public static Item IZANAGI_OBJECT;

	public static void load() {
		JADE_BALL = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "jade_ball"), new JadeBallItem());
		MAGIC_NEDDLE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "magic_neddle"), new MagicNeddleItem());
		IZANAGI_OBJECT = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "izanagi_object"), new IzanagiObjectItem());
	}
}
