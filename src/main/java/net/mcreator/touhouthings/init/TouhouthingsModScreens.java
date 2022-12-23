
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.mcreator.touhouthings.client.gui.MoneyChestGUIScreen;

import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

public class TouhouthingsModScreens {
	public static void load() {
		ScreenRegistry.register(TouhouthingsModMenus.MONEY_CHEST_GUI, MoneyChestGUIScreen::new);
	}
}
