/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rbm.devilmaycryweaponsreborn.init;

import net.rbm.devilmaycryweaponsreborn.item.*;
import net.rbm.devilmaycryweaponsreborn.DevilMayCryWeaponsRebornMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import java.util.function.Function;

public class DevilMayCryWeaponsRebornModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DevilMayCryWeaponsRebornMod.MODID);
	public static final DeferredItem<Item> DMC;
	public static final DeferredItem<Item> DR_FAUST_HELMET;
	public static final DeferredItem<Item> KALINA_ANN_1_BULLET;
	public static final DeferredItem<Item> KALINA_ANN_2_BULLET;
	public static final DeferredItem<Item> BLUE_ROSE_BULLET;
	public static final DeferredItem<Item> COYOTE_A;
	public static final DeferredItem<Item> EBONY;
	public static final DeferredItem<Item> IVORY;
	public static final DeferredItem<Item> KALINA_ANN_I;
	public static final DeferredItem<Item> KALINA_ANN_II;
	public static final DeferredItem<Item> BLUE_ROSE;
	public static final DeferredItem<Item> DEVIL_SWORD_DANTE_SWORD;
	public static final DeferredItem<Item> RED_QUEEN_SWORD;
	public static final DeferredItem<Item> REBELLION_SWORD;
	public static final DeferredItem<Item> YAMATO_SWORD;
	public static final DeferredItem<Item> DEVIL_SWORD_SPARDA_SWORD;
	static {
		DMC = register("dmc", DMCItem::new);
		DR_FAUST_HELMET = register("dr_faust_helmet", DrFaustItem.Helmet::new);
		KALINA_ANN_1_BULLET = register("kalina_ann_1_bullet", KalinaAnn1BulletItem::new);
		KALINA_ANN_2_BULLET = register("kalina_ann_2_bullet", KalinaAnn2BulletItem::new);
		BLUE_ROSE_BULLET = register("blue_rose_bullet", BlueRoseBulletItem::new);
		COYOTE_A = register("coyote_a", CoyoteAItem::new);
		EBONY = register("ebony", EbonyItem::new);
		IVORY = register("ivory", IvoryItem::new);
		KALINA_ANN_I = register("kalina_ann_i", KalinaAnnIItem::new);
		KALINA_ANN_II = register("kalina_ann_ii", KalinaAnnIIItem::new);
		BLUE_ROSE = register("blue_rose", BlueRoseItem::new);
		DEVIL_SWORD_DANTE_SWORD = register("devil_sword_dante_sword", DevilSwordDanteSwordItem::new);
		RED_QUEEN_SWORD = register("red_queen_sword", RedQueenSwordItem::new);
		REBELLION_SWORD = register("rebellion_sword", RebellionSwordItem::new);
		YAMATO_SWORD = register("yamato_sword", YamatoSwordItem::new);
		DEVIL_SWORD_SPARDA_SWORD = register("devil_sword_sparda_sword", DevilSwordSpardaSwordItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}
}