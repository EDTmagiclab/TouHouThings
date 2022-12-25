
package net.mcreator.touhouthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import net.mcreator.touhouthings.init.TouhouthingsModTabs;

import java.util.List;

public class EelItem extends Item {
	public EelItem() {
		super(new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(1f)

						.meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u5EFA\u8BAE\u70E4\u719F\u4E86\u5403"));
	}
}
