
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.entity.LittleJadeRed2xEntity;
import net.mcreator.touhouthings.entity.LittleJadeRed1xEntity;
import net.mcreator.touhouthings.entity.LittleJadeEntity;
import net.mcreator.touhouthings.entity.LittleJadeBlueEntity;
import net.mcreator.touhouthings.entity.LittleJadeBlue2xEntity;
import net.mcreator.touhouthings.entity.LittleJadeBlue1xEntity;
import net.mcreator.touhouthings.entity.KnifeOfSakuyaEntity;
import net.mcreator.touhouthings.entity.JadeBallEntity;
import net.mcreator.touhouthings.entity.GunOfRisenEntity;
import net.mcreator.touhouthings.entity.BigJadeRedEntity;
import net.mcreator.touhouthings.entity.BigJadeRed1xEntity;
import net.mcreator.touhouthings.entity.BigJadeBlueEntity;
import net.mcreator.touhouthings.entity.BigJadeBlue2xEntity;
import net.mcreator.touhouthings.entity.BigJadeBlue1xEntity;
import net.mcreator.touhouthings.entity.BigJade2xEntity;
import net.mcreator.touhouthings.entity.BaGuaStoveEntity;
import net.mcreator.touhouthings.TouhouthingsMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

public class TouhouthingsModEntities {
	public static EntityType<JadeBallEntity> JADE_BALL;
	public static EntityType<BaGuaStoveEntity> BA_GUA_STOVE;
	public static EntityType<LittleJadeEntity> LITTLE_JADE;
	public static EntityType<LittleJadeBlueEntity> LITTLE_JADE_BLUE;
	public static EntityType<LittleJadeRed1xEntity> LITTLE_JADE_RED_1X;
	public static EntityType<LittleJadeBlue1xEntity> LITTLE_JADE_BLUE_1X;
	public static EntityType<LittleJadeRed2xEntity> LITTLE_JADE_RED_2X;
	public static EntityType<LittleJadeBlue2xEntity> LITTLE_JADE_BLUE_2X;
	public static EntityType<BigJadeRedEntity> BIG_JADE_RED;
	public static EntityType<BigJadeBlueEntity> BIG_JADE_BLUE;
	public static EntityType<BigJadeRed1xEntity> BIG_JADE_RED_1X;
	public static EntityType<BigJadeBlue1xEntity> BIG_JADE_BLUE_1X;
	public static EntityType<BigJade2xEntity> BIG_JADE_2X;
	public static EntityType<BigJadeBlue2xEntity> BIG_JADE_BLUE_2X;
	public static EntityType<KnifeOfSakuyaEntity> KNIFE_OF_SAKUYA;
	public static EntityType<GunOfRisenEntity> GUN_OF_RISEN;

	public static void load() {
		JADE_BALL = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "jade_ball"),
				createArrowEntityType(JadeBallEntity::new));
		BA_GUA_STOVE = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "ba_gua_stove"),
				createArrowEntityType(BaGuaStoveEntity::new));
		LITTLE_JADE = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "little_jade"),
				createArrowEntityType(LittleJadeEntity::new));
		LITTLE_JADE_BLUE = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_blue"),
				createArrowEntityType(LittleJadeBlueEntity::new));
		LITTLE_JADE_RED_1X = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_red_1x"),
				createArrowEntityType(LittleJadeRed1xEntity::new));
		LITTLE_JADE_BLUE_1X = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_blue_1x"),
				createArrowEntityType(LittleJadeBlue1xEntity::new));
		LITTLE_JADE_RED_2X = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_red_2x"),
				createArrowEntityType(LittleJadeRed2xEntity::new));
		LITTLE_JADE_BLUE_2X = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "little_jade_blue_2x"),
				createArrowEntityType(LittleJadeBlue2xEntity::new));
		BIG_JADE_RED = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_red"),
				createArrowEntityType(BigJadeRedEntity::new));
		BIG_JADE_BLUE = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_blue"),
				createArrowEntityType(BigJadeBlueEntity::new));
		BIG_JADE_RED_1X = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_red_1x"),
				createArrowEntityType(BigJadeRed1xEntity::new));
		BIG_JADE_BLUE_1X = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_blue_1x"),
				createArrowEntityType(BigJadeBlue1xEntity::new));
		BIG_JADE_2X = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_2x"),
				createArrowEntityType(BigJade2xEntity::new));
		BIG_JADE_BLUE_2X = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "big_jade_blue_2x"),
				createArrowEntityType(BigJadeBlue2xEntity::new));
		KNIFE_OF_SAKUYA = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "knife_of_sakuya"),
				createArrowEntityType(KnifeOfSakuyaEntity::new));
		GUN_OF_RISEN = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "gun_of_risen"),
				createArrowEntityType(GunOfRisenEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1)
				.trackedUpdateRate(64).build();
	}
}
