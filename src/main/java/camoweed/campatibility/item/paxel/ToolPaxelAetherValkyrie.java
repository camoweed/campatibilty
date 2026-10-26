package camoweed.campatibility.item.paxel;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
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
import teamport.aether.item.AetherHasCustomDamageType;

public class ToolPaxelAetherValkyrie extends ToolPaxelAether implements AetherHasCustomDamageType {
	public ToolPaxelAetherValkyrie(String name, String namespaceId, int id, ToolMaterial toolMaterial) {
		super(name, namespaceId, id, toolMaterial);
	}
	@Override
	public float getStrVsBlock(@NotNull ItemStack itemstack, Block<?> block) {
		return block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) || block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_AXE) || block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL)
			|| block.hasTag(BlockTags.MINEABLE_BY_AXE) || block.hasTag(BlockTags.MINEABLE_BY_SHOVEL) || block.hasTag(BlockTags.MINEABLE_BY_PICKAXE) || block.hasTag(BlockTags.MINEABLE_BY_HOE)
			? this.material.getEfficiency(false) : 1.0F;
	}
	@Override
	public boolean beforeBlockDestroyed(@NotNull ItemStack selfStack, @NotNull World world, @NotNull Player player, @NotNull Block<?> block, @NotNull TilePosc blockPos, @NotNull Side side) {
		if (!world.isClientSide && AetherCommandlyRules.canVeinMine(world) && !player.isSneaking()) {
			return !VeinMining
				.veinMining(world, selfStack, blockPos, player)
				.setDropCause(PlayerUtil.isSilkTouchPendant(player) ? EnumDropCause.SILK_TOUCH : EnumDropCause.PROPER_TOOL)
				.setMiningTags(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE, BlockTags.MINEABLE_BY_PICKAXE)
				.mine(block, side);
		}
		return true;
	}
	@Override
	public DamageType getDamageType() {
		return AetherMod.HOLY;
	}
}
