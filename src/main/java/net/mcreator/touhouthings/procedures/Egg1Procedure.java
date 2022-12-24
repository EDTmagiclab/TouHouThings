package net.mcreator.touhouthings.procedures;

import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.touhouthings.TouhouthingsMod;

import java.util.Map;

public class Egg1Procedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TouhouthingsMod.LOGGER.warn("Failed to load dependency entity for procedure Egg1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getDisplayName().getString()).equals("\u6613\u8005")) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.ILLAGER : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("\u88AB\u5FA1\u5E01\u5288\u5F00\u4E86\u8111\u888B").bypassArmor(), 9961);
			}
		}
	}
}
