
package net.mcreator.touhouthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.touhouthings.procedures.HOVProcedure;
import net.mcreator.touhouthings.init.TouhouthingsModTabs;

import java.util.List;

public class CardOfNitoriItem extends Item {
	public CardOfNitoriItem() {
		super(new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u6CB3\u6210\u8377\u53D6\u7684\u80FD\u529B\u5361"));
		list.add(Component.literal("\u6CB3\u7AE5\u7684\u673A\u68B0\u4F7F\u4FDD\u62A4\u6751\u5E84\u53D8\u5F97\u66F4\u52A0\u5BB9\u6613"));
		list.add(Component.literal("\u4ED6\u4EEC\u5F88\u53D7\u6751\u6C11\u7684\u6B22\u8FCE"));
		list.add(Component.literal("\u4F7F\u7528\u540E\u83B7\u5F97\u5341\u4E94\u79D2\u6751\u5E84\u82F1\u96C42"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HOVProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
		return retval;
	}
}
