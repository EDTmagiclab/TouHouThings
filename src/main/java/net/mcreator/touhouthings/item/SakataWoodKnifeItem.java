
package net.mcreator.touhouthings.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.touhouthings.init.TouhouthingsModTabs;

public class SakataWoodKnifeItem extends AxeItem {
	public SakataWoodKnifeItem() {
		super(new Tier() {
			public int getUses() {
				return 275;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 1, -2.8f, new Item.Properties().tab(TouhouthingsModTabs.TAB_TOUHOU_THINGS));
	}
}
