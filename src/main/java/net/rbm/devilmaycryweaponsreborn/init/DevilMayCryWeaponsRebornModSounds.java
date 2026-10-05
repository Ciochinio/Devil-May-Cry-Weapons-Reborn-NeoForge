/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rbm.devilmaycryweaponsreborn.init;

import net.rbm.devilmaycryweaponsreborn.DevilMayCryWeaponsRebornMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class DevilMayCryWeaponsRebornModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, DevilMayCryWeaponsRebornMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MAXACT = REGISTRY.register("maxact", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "maxact")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EBONY_SHOT1 = REGISTRY.register("ebony.shot1", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "ebony.shot1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> IVORY_SHOT1 = REGISTRY.register("ivory.shot1", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "ivory.shot1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> COYOTEA_SHOT1 = REGISTRY.register("coyotea.shot1", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "coyotea.shot1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> KALINAANN_SHOT1 = REGISTRY.register("kalinaann.shot1", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "kalinaann.shot1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> KALINAANN_SHOT2 = REGISTRY.register("kalinaann.shot2", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "kalinaann.shot2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BLUEROSE_SHOT1 = REGISTRY.register("bluerose.shot1", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "bluerose.shot1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> YAMATO_SWING1 = REGISTRY.register("yamato.swing1", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "yamato.swing1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> REDQUEEN_SWING1 = REGISTRY.register("redqueen.swing1", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "redqueen.swing1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DEVILSWORDDANTE_SWING1 = REGISTRY.register("devilsworddante.swing1",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "devilsworddante.swing1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> REBELLION_SWING1 = REGISTRY.register("rebellion.swing1", () -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "rebellion.swing1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DEVILSWORDSPARDA_SWING1 = REGISTRY.register("devilswordsparda.swing1",
			() -> SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath("devil_may_cry_weapons_reborn", "devilswordsparda.swing1")));
}