
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.item.SakataWoodKnifeItem;
import net.mcreator.touhouthings.item.PickaxeOfHimemushiItem;
import net.mcreator.touhouthings.item.PPointItem;
import net.mcreator.touhouthings.item.NewGoheiItem;
import net.mcreator.touhouthings.item.MagicNeddleItem;
import net.mcreator.touhouthings.item.KonpakuSwordItem;
import net.mcreator.touhouthings.item.JadeBallItem;
import net.mcreator.touhouthings.item.IzanagiObjectItem;
import net.mcreator.touhouthings.item.IzanagiMetalItem;
import net.mcreator.touhouthings.item.IronstickItem;
import net.mcreator.touhouthings.item.BaGuaStoveItem;
import net.mcreator.touhouthings.TouhouthingsMod;

public class TouhouthingsModItems {
	public static Item JADE_BALL;
	public static Item MAGIC_NEDDLE;
	public static Item IZANAGI_OBJECT;
	public static Item PICKAXE_OF_HIMEMUSHI;
	public static Item IZANAGI_METAL;
	public static Item NEW_GOHEI;
	public static Item IRONSTICK;
	public static Item KONPAKU_SWORD;
	public static Item SAKATA_WOOD_KNIFE;
	public static Item BA_GUA_STOVE;
	public static Item P_POINT;
	public static Item BLOCKER;

	public static void load() {
		JADE_BALL = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "jade_ball"), new JadeBallItem());
		MAGIC_NEDDLE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "magic_neddle"), new MagicNeddleItem());
		IZANAGI_OBJECT = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "izanagi_object"), new IzanagiObjectItem());
		PICKAXE_OF_HIMEMUSHI = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "pickaxe_of_himemushi"),
				new PickaxeOfHimemushiItem());
		IZANAGI_METAL = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "izanagi_metal"), new IzanagiMetalItem());
		NEW_GOHEI = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "new_gohei"), new NewGoheiItem());
		IRONSTICK = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "ironstick"), new IronstickItem());
		KONPAKU_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "konpaku_sword"), new KonpakuSwordItem());
		SAKATA_WOOD_KNIFE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "sakata_wood_knife"),
				new SakataWoodKnifeItem());
		BA_GUA_STOVE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "ba_gua_stove"), new BaGuaStoveItem());
		P_POINT = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "p_point"), new PPointItem());
		BLOCKER = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "blocker"),
				new BlockItem(TouhouthingsModBlocks.BLOCKER, new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS)));
	}
}
