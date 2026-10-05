/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rbm.devilmaycryweaponsreborn.init;

import net.rbm.devilmaycryweaponsreborn.DevilMayCryWeaponsRebornMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class DevilMayCryWeaponsRebornModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DevilMayCryWeaponsRebornMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DEVIL_MAY_CRY_INV = REGISTRY.register("devil_may_cry_inv",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.devil_may_cry_weapons_reborn.devil_may_cry_inv")).icon(() -> new ItemStack(DevilMayCryWeaponsRebornModItems.DMC.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DevilMayCryWeaponsRebornModItems.DR_FAUST_HELMET.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.COYOTE_A.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.EBONY.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.IVORY.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.KALINA_ANN_I.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.KALINA_ANN_II.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.BLUE_ROSE.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.DEVIL_SWORD_DANTE_SWORD.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.RED_QUEEN_SWORD.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.REBELLION_SWORD.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.YAMATO_SWORD.get());
				tabData.accept(DevilMayCryWeaponsRebornModItems.DEVIL_SWORD_SPARDA_SWORD.get());
			}).build());
}