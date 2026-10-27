package camoweed.campatibility.item.hammer.aether;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.DamageType;
import org.jetbrains.annotations.NotNull;
import teamport.aether.block.AetherBlockTags;
import teamport.aether.helper.ParticleMaker;
import teamport.aether.item.AetherHasCustomDamageType;
import teamport.aether.item.item_tool.item_tool_phoenix.PhoenixAdjustBlockDropped;
import teamport.aether.mixin.accessors.EntityAccessor;

public class ToolHammerAetherPhoenix extends ToolHammerAether implements AetherHasCustomDamageType, PhoenixAdjustBlockDropped {
	public ToolHammerAetherPhoenix(String name, String namespaceId, int id, Tool tool, ToolMaterial toolMaterial, Tag<Block<?>> tagEffectiveAgainst) {
		super(name, namespaceId, id, tool, toolMaterial, tagEffectiveAgainst);
	}
	@Override
	public boolean hitEntity(@NotNull ItemStack itemstack, @NotNull Mob target, @NotNull Mob attacker) {
		if (!(target instanceof EntityAccessor accessor)
			|| accessor.isFireImmune()
			|| target.hurtTime != 10
			|| (target instanceof Player player && player.gamemode.hasInvulnerablePlayer())
			|| !attacker.isSneaking()
		) {
			return false;
		}
		ParticleMaker.spawnFireSwordParticles(target);
		target.maxFireTicks = 600;
		target.remainingFireTicks = 600;
		return super.hitEntity(itemstack, target, attacker);
	}
	@Override
	public float getStrVsBlock(@NotNull ItemStack itemstack, Block<?> block) {
		return !block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) && !block.hasTag(BlockTags.MINEABLE_BY_PICKAXE) ? 1.0F : this.material.getEfficiency(false);
	}

	@Override
	public DamageType getDamageType() {
		return DamageType.FIRE;
	}
}
