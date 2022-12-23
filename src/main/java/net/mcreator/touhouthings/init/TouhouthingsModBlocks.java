
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.block.MoneyChestBlock;
import net.mcreator.touhouthings.block.BlockerBlock;
import net.mcreator.touhouthings.TouhouthingsMod;

public class TouhouthingsModBlocks {
	public static Block BLOCKER;
	public static Block MONEY_CHEST;

	public static void load() {
		BLOCKER = Registry.register(Registry.BLOCK, new ResourceLocation(TouhouthingsMod.MODID, "blocker"), new BlockerBlock());
		MONEY_CHEST = Registry.register(Registry.BLOCK, new ResourceLocation(TouhouthingsMod.MODID, "money_chest"), new MoneyChestBlock());
	}

	public static void clientLoad() {
		BlockerBlock.clientInit();
		MoneyChestBlock.clientInit();
	}
}
