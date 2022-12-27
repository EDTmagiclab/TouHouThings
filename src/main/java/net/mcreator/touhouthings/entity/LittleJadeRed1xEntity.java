
package net.mcreator.touhouthings.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;

import net.mcreator.touhouthings.init.TouhouthingsModItems;
import net.mcreator.touhouthings.init.TouhouthingsModEntities;

public class LittleJadeRed1xEntity extends AbstractArrow implements ItemSupplier {
	public LittleJadeRed1xEntity(EntityType<? extends LittleJadeRed1xEntity> type, Level world) {
		super(type, world);
	}

	public LittleJadeRed1xEntity(EntityType<? extends LittleJadeRed1xEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public LittleJadeRed1xEntity(EntityType<? extends LittleJadeRed1xEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public ItemStack getItem() {
		return new ItemStack(TouhouthingsModItems.LITTLE_JADE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(TouhouthingsModItems.P_POINT);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static LittleJadeRed1xEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		LittleJadeRed1xEntity entityarrow = new LittleJadeRed1xEntity(TouhouthingsModEntities.LITTLE_JADE_RED_1X, entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static LittleJadeRed1xEntity shoot(LivingEntity entity, LivingEntity target) {
		LittleJadeRed1xEntity entityarrow = new LittleJadeRed1xEntity(TouhouthingsModEntities.LITTLE_JADE_RED_1X, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(2);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z, SoundEvents.ARROW_SHOOT, SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
