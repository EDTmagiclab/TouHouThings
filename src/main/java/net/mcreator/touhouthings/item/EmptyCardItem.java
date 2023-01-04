
package net.mcreator.touhouthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.touhouthings.procedures.EemptycardProcedure;
import net.mcreator.touhouthings.init.TouhouthingsModTabs;

import java.util.List;

public class EmptyCardItem extends Item {
	public EmptyCardItem() {
		super(new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u7A7A\u767D\u7684\u80FD\u529B\u5361\u7247"));
		list.add(Component.literal("\u662F\u5370\u5236\u80FD\u529B\u5361\u724C\u7684\u6750\u6599"));
		list.add(Component.literal("\u76F4\u63A5\u4F7F\u7528\u4F1A\u6D88\u9664\u6240\u6709buff"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EemptycardProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return retval;
	}
}
