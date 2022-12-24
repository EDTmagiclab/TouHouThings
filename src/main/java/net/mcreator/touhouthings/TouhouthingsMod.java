/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.touhouthings;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.touhouthings.init.TouhouthingsModTabs;
import net.mcreator.touhouthings.init.TouhouthingsModProcedures;
import net.mcreator.touhouthings.init.TouhouthingsModPotions;
import net.mcreator.touhouthings.init.TouhouthingsModItems;
import net.mcreator.touhouthings.init.TouhouthingsModEntities;
import net.mcreator.touhouthings.init.TouhouthingsModBrewingRecipes;
import net.mcreator.touhouthings.init.TouhouthingsModBlocks;

import net.fabricmc.api.ModInitializer;

public class TouhouthingsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "touhouthings";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing TouhouthingsMod");
		TouhouthingsModTabs.load();

		TouhouthingsModPotions.load();

		TouhouthingsModEntities.load();
		TouhouthingsModBlocks.load();
		TouhouthingsModItems.load();

		TouhouthingsModProcedures.load();

		TouhouthingsModBrewingRecipes.load();

	}
}
