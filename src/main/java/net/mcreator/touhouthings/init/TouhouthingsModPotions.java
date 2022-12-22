
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.touhouthings.init;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.TouhouthingsMod;

public class TouhouthingsModPotions {
	public static Potion HOURAI_POISON;
	public static Potion GSWS;
	public static Potion GSWSMAX;

	public static void load() {
		HOURAI_POISON = Registry.register(Registry.POTION, new ResourceLocation(TouhouthingsMod.MODID, "hourai_poison"),
				new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 12000, 10, false, false),
						new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 10, false, false),
						new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 10, false, true)));
		GSWS = Registry.register(Registry.POTION, new ResourceLocation(TouhouthingsMod.MODID, "gsws"),
				new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 10, true, false),
						new MobEffectInstance(MobEffects.ABSORPTION, 300, 10, true, false),
						new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0, true, false)));
		GSWSMAX = Registry.register(Registry.POTION, new ResourceLocation(TouhouthingsMod.MODID, "gswsmax"),
				new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 10, true, false),
						new MobEffectInstance(MobEffects.ABSORPTION, 300, 10, true, false),
						new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 10, true, false),
						new MobEffectInstance(MobEffects.LEVITATION, 60, 5, false, false),
						new MobEffectInstance(MobEffects.GLOWING, 60, 5, false, false)));
	}
}
