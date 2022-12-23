
package net.mcreator.touhouthings.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.touhouthings.init.TouhouthingsModTabs;
import net.mcreator.touhouthings.init.TouhouthingsModItems;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class KonpakuSwordItem extends SwordItem {
	public KonpakuSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 530;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TouhouthingsModItems.IRONSTICK));
			}
		}, 3, -1.5f, new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS));
	}

	@Override
	@Environment(EnvType.CLIENT)
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u697C\u89C2\u5251\u7684\u4EFF\u5236\u54C1"));
		list.add(Component.literal("\u65A9\u4E0D\u65AD\u7684\u4E1C\u897F\u6BCF\u5929\u90FD\u5728\u589E\u52A0"));
	}
}
