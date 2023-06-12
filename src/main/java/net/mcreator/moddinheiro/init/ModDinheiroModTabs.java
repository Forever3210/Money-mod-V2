
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moddinheiro.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModDinheiroModTabs {
	public static CreativeModeTab TAB_MONEY_MOD;

	public static void load() {
		TAB_MONEY_MOD = new CreativeModeTab("tabmoney_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.EMERALD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
