package camoweed.campatibility.item.hammer;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePos;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import qapy.pepeethings.item.ItemToolHammer;
import redart15.commandly.veincapitator.VeinMining;
import teamport.aether.block.AetherBlockTags;
import teamport.aether.block.AetherBlocks;
import teamport.aether.compat.commandly.AetherCommandlyRules;
import teamport.aether.entity.player.PlayerUtil;

import static teamport.aether.item.item_tool.ItemToolPickaxeAether.aetherMiningLevels;

public class ToolHammerAether extends ItemToolHammer {
	public ToolHammerAether(String name, String namespaceId, int id, Tool tool, ToolMaterial toolMaterial, Tag<Block<?>> tagEffectiveAgainst) {
		super(name, namespaceId, id, tool, toolMaterial, tagEffectiveAgainst);
	}
	@Override
	public float getStrVsBlock(@NotNull ItemStack itemstack, Block<?> block) {
		return block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) || block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL) ? this.material.getEfficiency(false) : 1.0F;
	}
	public boolean canHarvestBlock(@NotNull ItemStack selfStack, @NotNull Mob mob, @NotNull Block<?> block) {
		int miningLevel = aetherMiningLevels.getOrDefault(block, -1);
		if (miningLevel != -1) {
			return this.material.getMiningLevel() >= miningLevel;
		} else {
			return this.tool == ItemToolHammer.Tool.SHOVEL ? block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL) : block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE);
		}
	}
	@Override
	public boolean beforeBlockDestroyed(
		@NotNull ItemStack selfStack,
		@NotNull World world,
		@NotNull Player player,
		@NotNull Block<?> block,
		@NotNull TilePosc blockPos,
		@NotNull Side side
	) {
	        if (!world.isClientSide && AetherCommandlyRules.canVeinMine(world) && !player.isSneaking()) {
		return !VeinMining
			.veinMining(world, selfStack, blockPos, player)
			.setDropCause(PlayerUtil.isSilkTouchPendant(player) ? EnumDropCause.SILK_TOUCH : EnumDropCause.PROPER_TOOL)
			.setMiningTags(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE)
			.mine(block, side);
			}

        return true;
	}
	@Override
	public boolean onBlockDestroyed(@NotNull ItemStack itemStack, @NotNull World world, @NotNull Mob mob, @NotNull Block<?> removedBlock, @NotNull TilePosc blockPos, @NotNull Side side) {
		Player player = (Player)mob;
		if (removedBlock.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) || removedBlock.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL)) {
			if (removedBlock.getHardness() > 0.0F || this.isSilkTouch()) {
				itemStack.damageItem(4, player);
				if (player.isSneaking()) {
					return true;
				}

				if (side == Side.NORTH || side == Side.SOUTH) {
					for (int dx = -1; dx <= 1; ++dx) {
						for (int dy = -1; dy <= 1; ++dy) {
							if (dx != 0 || dy != 0) {
								int targetX = blockPos.x() + dx;
								int targetY = blockPos.y() + dy;
								int targetZ = blockPos.z();
								this.mine(itemStack, world, mob, player, targetX, targetY, targetZ);
							}
						}
					}
				}

				if (side == Side.WEST || side == Side.EAST) {
					for (int dz = -1; dz <= 1; ++dz) {
						for (int dy = -1; dy <= 1; ++dy) {
							if (dz != 0 || dy != 0) {
								int targetZ = blockPos.z() + dz;
								int targetY = blockPos.y() + dy;
								int targetX = blockPos.x();
								this.mine(itemStack, world, mob, player, targetX, targetY, targetZ);
							}
						}
					}
				}

				if (side == Side.BOTTOM || side == Side.TOP) {
					for (int dx = -1; dx <= 1; ++dx) {
						for (int dz = -1; dz <= 1; ++dz) {
							if (dx != 0 || dz != 0) {
								int targetX = blockPos.x() + dx;
								int targetZ = blockPos.z() + dz;
								int targetY = blockPos.y();
								this.mine(itemStack, world, mob, player, targetX, targetY, targetZ);
							}
						}
					}
				}
			}
		}
		return true;
	}
	private void mine(@NotNull ItemStack itemStack, @NotNull World world, @NotNull Mob mob, Player player, int targetX, int targetY, int targetZ) {
		TilePosc targetPos = new TilePos(targetX, targetY, targetZ);
		Block<?> targetBlock = world.getBlockType(targetPos);
		if(targetBlock.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) || targetBlock.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL)) {
			if (this.canHarvestBlock(itemStack, mob, targetBlock)) {
				if (player.getGamemode().hasItemDrops()) {
					targetBlock.onHarvest(world, player, targetPos, 0, null);
				}

				world.setBlockTypeNotify(targetPos, Blocks.AIR);
			}
		}

	}

	static {
		aetherMiningLevels.put(AetherBlocks.ICESTONE, 1);
		aetherMiningLevels.put(AetherBlocks.CARVED_STONE, 1);
		aetherMiningLevels.put(AetherBlocks.SLAB_CARVED_STONE, 1);
		aetherMiningLevels.put(AetherBlocks.STAIRS_CARVED_STONE, 1);
		aetherMiningLevels.put(AetherBlocks.CARVED_STONE_LIGHT, 1);
		aetherMiningLevels.put(AetherBlocks.CHEST_DUNGEON_BRONZE, 1);
		aetherMiningLevels.put(AetherBlocks.CHEST_MIMIC_BRONZE, 1);
		aetherMiningLevels.put(AetherBlocks.CARVED_STONE_TRAPPED, 1);
		aetherMiningLevels.put(AetherBlocks.CARVED_ANGELIC, 1);
		aetherMiningLevels.put(AetherBlocks.SLAB_CARVED_ANGELIC, 1);
		aetherMiningLevels.put(AetherBlocks.STAIRS_CARVED_ANGELIC, 1);
		aetherMiningLevels.put(AetherBlocks.CARVED_ANGELIC_LIGHT, 1);
		aetherMiningLevels.put(AetherBlocks.CHEST_DUNGEON_SILVER, 1);
		aetherMiningLevels.put(AetherBlocks.CHEST_MIMIC_SILVER, 1);
		aetherMiningLevels.put(AetherBlocks.CARVED_HELLFIRE, 1);
		aetherMiningLevels.put(AetherBlocks.SLAB_CARVED_HELLFIRE, 1);
		aetherMiningLevels.put(AetherBlocks.STAIRS_CARVED_HELLFIRE, 1);
		aetherMiningLevels.put(AetherBlocks.CARVED_HELLFIRE_LIGHT, 1);
		aetherMiningLevels.put(AetherBlocks.CHEST_DUNGEON_GOLD, 1);
		aetherMiningLevels.put(AetherBlocks.CHEST_MIMIC_GOLD, 1);
		aetherMiningLevels.put(AetherBlocks.PILLAR, 1);
		aetherMiningLevels.put(AetherBlocks.PILLAR_CAPSTONE, 1);
		aetherMiningLevels.put(AetherBlocks.BLOCK_ZANITE, 1);
		aetherMiningLevels.put(AetherBlocks.ORE_ZANITE_HOLYSTONE, 1);
		aetherMiningLevels.put(AetherBlocks.BRICK_ZANITE, 1);
		aetherMiningLevels.put(AetherBlocks.SLAB_BRICK_ZANITE, 1);
		aetherMiningLevels.put(AetherBlocks.STAIRS_BRICK_ZANITE, 1);
		aetherMiningLevels.put(AetherBlocks.BLOCK_GRAVITITE, 2);
		aetherMiningLevels.put(AetherBlocks.ORE_GRAVITITE_HOLYSTONE, 2);
		aetherMiningLevels.put(AetherBlocks.BRICK_GRAVITITE, 2);
		aetherMiningLevels.put(AetherBlocks.SLAB_BRICK_GRAVITITE, 2);
		aetherMiningLevels.put(AetherBlocks.STAIRS_BRICK_GRAVITITE, 2);
		aetherMiningLevels.put(AetherBlocks.AEROGEL, 3);
	}
}
