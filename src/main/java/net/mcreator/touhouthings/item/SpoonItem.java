
package net.mcreator.touhouthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.touhouthings.procedures.ColdspoonProcedure;
import net.mcreator.touhouthings.procedures.BbloodProcedure;
import net.mcreator.touhouthings.init.TouhouthingsModTabs;
import net.mcreator.touhouthings.init.TouhouthingsModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class SpoonItem extends ShovelItem {
	public SpoonItem() {
		super(new Tier() {
			public int getUses() {
				return 375;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -1.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TouhouthingsModItems.IZANAGI_OBJECT));
			}
		}, 1, -3f, new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;
		BbloodProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return retval;
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u9955\u992E\u5C24\u9B54\u7684\u52FA\u5B50"));
		list.add(Component.literal("\u6211\u80FD\u53BB\u4F60\u5BB6\u5403\u996D\u5417\uFF1F\u5C31\u4E00\u52FA"));
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		ColdspoonProcedure
				.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).put("itemstack", itemstack).build());
	}
}
