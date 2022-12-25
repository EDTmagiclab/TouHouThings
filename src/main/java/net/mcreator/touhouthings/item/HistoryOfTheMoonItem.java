
package net.mcreator.touhouthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.touhouthings.init.TouhouthingsModTabs;
import net.mcreator.touhouthings.init.TouhouthingsModSounds;

import java.util.List;

public class HistoryOfTheMoonItem extends RecordItem {
	public HistoryOfTheMoonItem() {
		super(0, TouhouthingsModSounds.HISTORYOFTHEMOON,
				new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS).stacksTo(1).rarity(Rarity.RARE), 100);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u539F\u4F5C\uFF1A\u4E0A\u6D77\u7231\u4E3D\u4E1D\u5E7B\u4E50\u56E2"));
	}
}
