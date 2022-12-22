
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

import net.mcreator.touhouthings.entity.JadeBallEntity;
import net.mcreator.touhouthings.TouhouthingsMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

public class TouhouthingsModEntities {
	public static EntityType<JadeBallEntity> JADE_BALL;

	public static void load() {
		JADE_BALL = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "jade_ball"),
				createArrowEntityType(JadeBallEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1)
				.trackedUpdateRate(64).build();
	}
}
