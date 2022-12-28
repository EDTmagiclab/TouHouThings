package net.mcreator.touhouthings.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Registry;

import net.mcreator.touhouthings.TouhouthingsMod;

import java.util.Map;

public class Egg2Procedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TouhouthingsMod.LOGGER.warn("Failed to load dependency entity for procedure Egg2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("touhouorigins:vampire")))) {
			entity.hurt(DamageSource.GENERIC, 0);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						Component.literal("\u4F60\u65E0\u6CD5\u4F7F\u7528\u54B2\u591C\u7684\u98DE\u5200\u4F24\u5BB3\u5438\u8840\u9B3C\uFF01"),
						(true));
		}
	}
}
