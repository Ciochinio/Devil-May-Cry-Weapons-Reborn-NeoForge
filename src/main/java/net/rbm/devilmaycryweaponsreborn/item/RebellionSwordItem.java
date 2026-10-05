package net.rbm.devilmaycryweaponsreborn.item;

import net.rbm.devilmaycryweaponsreborn.procedures.RebellionLivingEntityIsHitWithToolProcedure;
import net.rbm.devilmaycryweaponsreborn.init.DevilMayCryWeaponsRebornModItems;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

@EventBusSubscriber
public class RebellionSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 0, 2f, 0, 1, TagKey.create(Registries.ITEM, Identifier.parse("devil_may_cry_weapons_reborn:rebellion_sword_repair_items")));

	public RebellionSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 12f, -2.4f).fireResistant());
	}

	@SubscribeEvent
	public static void modifyDefaultComponents(ModifyDefaultComponentsEvent event) {
		event.modify(DevilMayCryWeaponsRebornModItems.REBELLION_SWORD.get(), (builder, _, _) -> builder.set(DataComponents.MAX_DAMAGE, null));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		RebellionLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ());
	}
}