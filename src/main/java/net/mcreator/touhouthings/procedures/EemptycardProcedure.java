package net.mcreator.touhouthings.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.touhouthings.TouhouthingsMod;

import java.util.Map;

public class EemptycardProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TouhouthingsMod.LOGGER.warn("Failed to load dependency entity for procedure Eemptycard!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
	}
}
