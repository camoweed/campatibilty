package camoweed.campatibility.item.paxel;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import redart15.commandly.veincapitator.VeinMining;
import teamport.aether.AetherMod;
import teamport.aether.block.AetherBlockTags;
import teamport.aether.compat.commandly.AetherCommandlyRules;
import teamport.aether.entity.player.PlayerUtil;
import teamport.aether.helper.ParticleMaker;
import teamport.aether.item.AetherHasCustomDamageType;
import teamport.aether.item.item_tool.item_tool_phoenix.PhoenixAdjustBlockDropped;
import teamport.aether.mixin.accessors.EntityAccessor;

public class PaxelAetherToolPhoenix extends PaxelAetherTool implements AetherHasCustomDamageType, PhoenixAdjustBlockDropped {
	public PaxelAetherToolPhoenix(String name, String namespaceId, int id, ToolMaterial toolMaterial) {
		super(name, namespaceId, id, toolMaterial);
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
