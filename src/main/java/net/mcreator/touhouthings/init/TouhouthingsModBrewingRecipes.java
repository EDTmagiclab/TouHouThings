/*
* MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.touhouthings.init;

import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.Items;

public class TouhouthingsModBrewingRecipes {
	public static void load() {
		PotionBrewing.addMix(Potions.AWKWARD, Items.ENCHANTED_GOLDEN_APPLE, TouhouthingsModPotions.HOURAI_POISON);
		PotionBrewing.addMix(Potions.AWKWARD, Items.GOLDEN_APPLE, TouhouthingsModPotions.GSWS);
		PotionBrewing.addMix(TouhouthingsModPotions.GSWSMAX, Items.GLOWSTONE_DUST, TouhouthingsModPotions.GSWS);
		PotionBrewing.addMix(TouhouthingsModPotions.GSWSMAX, Items.GLOWSTONE_DUST, TouhouthingsModPotions.GSWS);
	}
}
