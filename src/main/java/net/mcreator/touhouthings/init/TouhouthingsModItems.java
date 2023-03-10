
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.item.UndyingSmokeItem;
import net.mcreator.touhouthings.item.SpoonItem;
import net.mcreator.touhouthings.item.SakataWoodKnifeItem;
import net.mcreator.touhouthings.item.PickaxeOfHimemushiItem;
import net.mcreator.touhouthings.item.PPointItem;
import net.mcreator.touhouthings.item.NewGoheiItem;
import net.mcreator.touhouthings.item.MasterSpark1Item;
import net.mcreator.touhouthings.item.MagicNeddleItem;
import net.mcreator.touhouthings.item.LunaticPrincessItem;
import net.mcreator.touhouthings.item.LittleJadeRed2xItem;
import net.mcreator.touhouthings.item.LittleJadeRed1xItem;
import net.mcreator.touhouthings.item.LittleJadeItem;
import net.mcreator.touhouthings.item.LittleJadeBlueItem;
import net.mcreator.touhouthings.item.LittleJadeBlue2xItem;
import net.mcreator.touhouthings.item.LittleJadeBlue1xItem;
import net.mcreator.touhouthings.item.KonpakuSwordItem;
import net.mcreator.touhouthings.item.KnifeOfSakuyaItem;
import net.mcreator.touhouthings.item.JadeBallItem;
import net.mcreator.touhouthings.item.IzanagiObjectItem;
import net.mcreator.touhouthings.item.IzanagiMetalItem;
import net.mcreator.touhouthings.item.IronstickItem;
import net.mcreator.touhouthings.item.HistoryOfTheMoonItem;
import net.mcreator.touhouthings.item.HatOfKoishiItem;
import net.mcreator.touhouthings.item.GunOfRisenItem;
import net.mcreator.touhouthings.item.EmptyDiscItem;
import net.mcreator.touhouthings.item.EmptyCardItem;
import net.mcreator.touhouthings.item.EelItem;
import net.mcreator.touhouthings.item.DreamBattleItem;
import net.mcreator.touhouthings.item.CardPrinterItem;
import net.mcreator.touhouthings.item.CardOfNitoriItem;
import net.mcreator.touhouthings.item.BulletToolItem;
import net.mcreator.touhouthings.item.BigJadeRedItem;
import net.mcreator.touhouthings.item.BigJadeRed1xItem;
import net.mcreator.touhouthings.item.BigJadeBlueItem;
import net.mcreator.touhouthings.item.BigJadeBlue2xItem;
import net.mcreator.touhouthings.item.BigJadeBlue1xItem;
import net.mcreator.touhouthings.item.BigJade2xItem;
import net.mcreator.touhouthings.item.BaGuaStoveItem;
import net.mcreator.touhouthings.item.BBQEelItem;
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
	public static Item MONEY_CHEST;
	public static Item EEL;
	public static Item BBQ_EEL;
	public static Item LUNATIC_PRINCESS;
	public static Item EMPTY_DISC;
	public static Item UNDYING_SMOKE;
	public static Item HISTORY_OF_THE_MOON;
	public static Item MASTER_SPARK_1;
	public static Item DREAM_BATTLE;
	public static Item SPOON;
	public static Item LITTLE_JADE;
	public static Item LITTLE_JADE_BLUE;
	public static Item LITTLE_JADE_RED_1X;
	public static Item LITTLE_JADE_BLUE_1X;
	public static Item LITTLE_JADE_RED_2X;
	public static Item LITTLE_JADE_BLUE_2X;
	public static Item BIG_JADE_RED;
	public static Item BIG_JADE_BLUE;
	public static Item BIG_JADE_RED_1X;
	public static Item BIG_JADE_BLUE_1X;
	public static Item BIG_JADE_2X;
	public static Item BIG_JADE_BLUE_2X;
	public static Item BULLET_TOOL;
	public static Item HAT_OF_KOISHI_HELMET;
	public static Item KNIFE_OF_SAKUYA;
	public static Item GUN_OF_RISEN;
	public static Item CARD_PRINTER;
	public static Item EMPTY_CARD;
	public static Item CARD_OF_NITORI;

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
		MONEY_CHEST = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "money_chest"),
				new BlockItem(TouhouthingsModBlocks.MONEY_CHEST, new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS)));
		EEL = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "eel"), new EelItem());
		BBQ_EEL = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "bbq_eel"), new BBQEelItem());
		LUNATIC_PRINCESS = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "lunatic_princess"),
				new LunaticPrincessItem());
		EMPTY_DISC = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "empty_disc"), new EmptyDiscItem());
		UNDYING_SMOKE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "undying_smoke"), new UndyingSmokeItem());
		HISTORY_OF_THE_MOON = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "history_of_the_moon"),
				new HistoryOfTheMoonItem());
		MASTER_SPARK_1 = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "master_spark_1"), new MasterSpark1Item());
		DREAM_BATTLE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "dream_battle"), new DreamBattleItem());
		SPOON = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "spoon"), new SpoonItem());
		LITTLE_JADE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "little_jade"), new LittleJadeItem());
		LITTLE_JADE_BLUE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_blue"),
				new LittleJadeBlueItem());
		LITTLE_JADE_RED_1X = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_red_1x"),
				new LittleJadeRed1xItem());
		LITTLE_JADE_BLUE_1X = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_blue_1x"),
				new LittleJadeBlue1xItem());
		LITTLE_JADE_RED_2X = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_red_2x"),
				new LittleJadeRed2xItem());
		LITTLE_JADE_BLUE_2X = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_blue_2x"),
				new LittleJadeBlue2xItem());
		BIG_JADE_RED = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_red"), new BigJadeRedItem());
		BIG_JADE_BLUE = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_blue"), new BigJadeBlueItem());
		BIG_JADE_RED_1X = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_red_1x"), new BigJadeRed1xItem());
		BIG_JADE_BLUE_1X = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_blue_1x"), new BigJadeBlue1xItem());
		BIG_JADE_2X = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_2x"), new BigJade2xItem());
		BIG_JADE_BLUE_2X = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_blue_2x"), new BigJadeBlue2xItem());
		BULLET_TOOL = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "bullet_tool"), new BulletToolItem());
		HAT_OF_KOISHI_HELMET = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "hat_of_koishi_helmet"),
				new HatOfKoishiItem.Helmet());
		KNIFE_OF_SAKUYA = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "knife_of_sakuya"), new KnifeOfSakuyaItem());
		GUN_OF_RISEN = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "gun_of_risen"), new GunOfRisenItem());
		CARD_PRINTER = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "card_printer"), new CardPrinterItem());
		EMPTY_CARD = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "empty_card"), new EmptyCardItem());
		CARD_OF_NITORI = Registry.register(Registry.ITEM, new ResourceLocation(TouhouthingsMod.MODID, "card_of_nitori"), new CardOfNitoriItem());
	}
}
