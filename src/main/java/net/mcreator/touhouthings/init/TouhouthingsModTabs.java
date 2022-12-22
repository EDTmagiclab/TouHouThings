
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class TouhouthingsModTabs {
	public static CreativeModeTab TAB_TOUHOU_THINGS;

	public static void load() {
		TAB_TOUHOU_THINGS = FabricItemGroupBuilder.create(new ResourceLocation("touhouthings", "touhou_things"))
				.icon(() -> new ItemStack(TouhouthingsModItems.JADE_BALL)).build();
	}
}
