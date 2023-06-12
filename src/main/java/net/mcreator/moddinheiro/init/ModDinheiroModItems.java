
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moddinheiro.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.moddinheiro.item.WalletItem;
import net.mcreator.moddinheiro.item.Euros5Item;
import net.mcreator.moddinheiro.item.Euros50Item;
import net.mcreator.moddinheiro.item.Euros500Item;
import net.mcreator.moddinheiro.item.Euros20Item;
import net.mcreator.moddinheiro.item.Euros200Item;
import net.mcreator.moddinheiro.item.Euros10Item;
import net.mcreator.moddinheiro.item.Euros100Item;
import net.mcreator.moddinheiro.item.EuroItem;
import net.mcreator.moddinheiro.ModDinheiroMod;

public class ModDinheiroModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModDinheiroMod.MODID);
	public static final RegistryObject<Item> EUROS_5 = REGISTRY.register("euros_5", () -> new Euros5Item());
	public static final RegistryObject<Item> EUROS_10 = REGISTRY.register("euros_10", () -> new Euros10Item());
	public static final RegistryObject<Item> EUROS_20 = REGISTRY.register("euros_20", () -> new Euros20Item());
	public static final RegistryObject<Item> EUROS_50 = REGISTRY.register("euros_50", () -> new Euros50Item());
	public static final RegistryObject<Item> EUROS_100 = REGISTRY.register("euros_100", () -> new Euros100Item());
	public static final RegistryObject<Item> EUROS_200 = REGISTRY.register("euros_200", () -> new Euros200Item());
	public static final RegistryObject<Item> EUROS_500 = REGISTRY.register("euros_500", () -> new Euros500Item());
	public static final RegistryObject<Item> EURO = REGISTRY.register("euro", () -> new EuroItem());
	public static final RegistryObject<Item> WALLET = REGISTRY.register("wallet", () -> new WalletItem());
}
