
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.touhouthings.world.inventory.MoneyChestGUIMenu;
import net.mcreator.touhouthings.client.gui.MoneyChestGUIScreen;
import net.mcreator.touhouthings.TouhouthingsMod;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;

public class TouhouthingsModMenus {
	public static MenuType<MoneyChestGUIMenu> MONEY_CHEST_GUI;

	public static void load() {
		MONEY_CHEST_GUI = ScreenHandlerRegistry.registerExtended(new ResourceLocation(TouhouthingsMod.MODID, "money_chest_gui"),
				MoneyChestGUIMenu::new);
		MoneyChestGUIScreen.screenInit();
	}
}
