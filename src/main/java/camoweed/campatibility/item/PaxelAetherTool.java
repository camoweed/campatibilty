package camoweed.campatibility.item;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLog;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.gamerule.GameRules;
import net.minecraft.core.data.gamerule.TreecapitatorHelper;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import teamport.aether.block.AetherBlockTags;
import teamport.aether.item.item_tool.ItemToolPickaxeAether;

public class PaxelAetherTool extends ItemToolPickaxeAether {
	public PaxelAetherTool(String name, String namespaceId, int id, ToolMaterial enumtoolmaterial) {
		super(name, namespaceId, id, enumtoolmaterial);
	}
	public float getStrVsBlock(@NotNull ItemStack itemstack, Block<?> block) {
		return !block.hasTag(BlockTags.MINEABLE_BY_PICKAXE) && !block.hasTag(BlockTags.MINEABLE_BY_AXE) && !block.hasTag(BlockTags.MINEABLE_BY_SHOVEL) && !block.hasTag(BlockTags.MINEABLE_BY_HOE) ? 1.0F : this.material.getEfficiency(false);
	}
	public boolean canHarvestBlock(ItemStack selfStack, Mob mob, Block<?> block) {
		int miningLevel = aetherMiningLevels.getOrDefault(block, -1);
		if (miningLevel != -1) {
			return this.material.getMiningLevel() >= miningLevel;
		} else {
			return block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) || block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL) || block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_AXE);
		}
	}
	public boolean beforeBlockDestroyed(@NotNull ItemStack selfStack, @NotNull World world, @NotNull Player player, @NotNull Block<?> block, @NotNull TilePosc blockPos, @NotNull Side side) {
		if (!world.isClientSide && (Boolean)world.getGameRuleValue(GameRules.TREECAPITATOR) && !player.isSneaking()) {
			Block<?> b = world.getBlockType(blockPos);
			if (Block.hasLogicClass(b, BlockLogicLog.class)) {
				return !(new TreecapitatorHelper(world, blockPos.x(), blockPos.y(), blockPos.z(), player)).chopTree();
			}
		}
//		if (!world.isClientSide && PaxelCommandlyRules.canVeinMine(world) && !player.isSneaking()) {
//			VeinMining veinMining = VeinMining.veinMining(world, selfStack, blockPos, player);
//			return !veinMining.setMiningTags(new Tag[]{BlockTags.MINEABLE_BY_PICKAXE}).mine(block, side);
//		} else {
			return true;
		}
}
