/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rbm.devilmaycryweaponsreborn.init;

import net.rbm.devilmaycryweaponsreborn.entity.*;
import net.rbm.devilmaycryweaponsreborn.DevilMayCryWeaponsRebornMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class DevilMayCryWeaponsRebornModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, DevilMayCryWeaponsRebornMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<CoyoteAProjectileEntity>> COYOTE_A_PROJECTILE = register("coyote_a_projectile",
			EntityType.Builder.<CoyoteAProjectileEntity>of(CoyoteAProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<EbonyProjectileEntity>> EBONY_PROJECTILE = register("ebony_projectile",
			EntityType.Builder.<EbonyProjectileEntity>of(EbonyProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<IvoryProjectileEntity>> IVORY_PROJECTILE = register("ivory_projectile",
			EntityType.Builder.<IvoryProjectileEntity>of(IvoryProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<KalinaAnnIProjectileEntity>> KALINA_ANN_I_PROJECTILE = register("kalina_ann_i_projectile",
			EntityType.Builder.<KalinaAnnIProjectileEntity>of(KalinaAnnIProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<KalinaAnnIIProjectileEntity>> KALINA_ANN_II_PROJECTILE = register("kalina_ann_ii_projectile",
			EntityType.Builder.<KalinaAnnIIProjectileEntity>of(KalinaAnnIIProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BlueRoseProjectileEntity>> BLUE_ROSE_PROJECTILE = register("blue_rose_projectile",
			EntityType.Builder.<BlueRoseProjectileEntity>of(BlueRoseProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<BulletPlaceholderEntity>> BULLET_PLACEHOLDER = register("bullet_placeholder",
			EntityType.Builder.<BulletPlaceholderEntity>of(BulletPlaceholderEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(DevilMayCryWeaponsRebornMod.MODID, registryname))));
	}
}