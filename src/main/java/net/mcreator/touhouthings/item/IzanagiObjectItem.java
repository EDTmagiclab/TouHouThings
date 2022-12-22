
package net.mcreator.touhouthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.touhouthings.init.TouhouthingsModTabs;

import java.util.List;

public class IzanagiObjectItem extends Item {
	public IzanagiObjectItem() {
		super(new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u4F0A\u5958\u8BFA\u7269\u8D28"));
		list.add(Component.literal("\u7389\u9020\u9B45\u987B\u4E38\u5236\u9020\u9634\u9633\u7389\u7684\u539F\u6750\u6599"));
	}
}
