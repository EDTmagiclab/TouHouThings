
package net.mcreator.touhouthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.touhouthings.init.TouhouthingsModTabs;
import net.mcreator.touhouthings.init.TouhouthingsModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class PickaxeOfHimemushiItem extends PickaxeItem {
	public PickaxeOfHimemushiItem() {
		super(new Tier() {
			public int getUses() {
				return 750;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TouhouthingsModItems.IZANAGI_OBJECT));
			}
		}, 1, -3f, new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS));
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u8708\u86A3\u4EEC\u5236\u4F5C\u7684\u9550\u5B50"));
		list.add(Component.literal(
				"\u62E5\u6709\u63A5\u8FD1\u91D1\u9550\u7684\u6316\u6398\u901F\u5EA6\u548C\u63A5\u8FD1\u4E0B\u754C\u5408\u91D1\u9550\u7684\u6316\u6398\u7B49\u7EA7"));
	}
}
