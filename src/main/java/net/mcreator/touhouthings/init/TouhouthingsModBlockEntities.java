
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.block.entity.MoneyChestBlockEntity;
import net.mcreator.touhouthings.TouhouthingsMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class TouhouthingsModBlockEntities {
	public static BlockEntityType<?> MONEY_CHEST;

	public static void load() {
		MONEY_CHEST = Registry.register(Registry.BLOCK_ENTITY_TYPE, new ResourceLocation(TouhouthingsMod.MODID, "money_chest"),
				FabricBlockEntityTypeBuilder.create(MoneyChestBlockEntity::new, TouhouthingsModBlocks.MONEY_CHEST).build(null));
	}
}
