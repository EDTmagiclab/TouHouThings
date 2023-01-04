
package net.mcreator.touhouthings.entity;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;

import net.mcreator.touhouthings.procedures.UguneffectProcedure;
import net.mcreator.touhouthings.init.TouhouthingsModItems;
import net.mcreator.touhouthings.init.TouhouthingsModEntities;

public class GunOfRisenEntity extends AbstractArrow implements ItemSupplier {
	public GunOfRisenEntity(EntityType<? extends GunOfRisenEntity> type, Level world) {
		super(type, world);
	}

	public GunOfRisenEntity(EntityType<? extends GunOfRisenEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public GunOfRisenEntity(EntityType<? extends GunOfRisenEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public ItemStack getItem() {
		return new ItemStack(TouhouthingsModItems.BIG_JADE_RED);
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
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		Entity entity = entityHitResult.getEntity();
		Entity sourceentity = this.getOwner();
		Entity imediatesourceentity = this;
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Level world = this.level;
		UguneffectProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static GunOfRisenEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		GunOfRisenEntity entityarrow = new GunOfRisenEntity(TouhouthingsModEntities.GUN_OF_RISEN, entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.RABBIT_ATTACK, SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static GunOfRisenEntity shoot(LivingEntity entity, LivingEntity target) {
		GunOfRisenEntity entityarrow = new GunOfRisenEntity(TouhouthingsModEntities.GUN_OF_RISEN, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(4);
		entityarrow.setKnockback(3);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z, SoundEvents.RABBIT_ATTACK, SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
