package camoweed.campatibility.item.hammer.aether;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePos;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import teamport.aether.block.AetherBlockTags;
import turniplabs.halplibe.helper.EnvironmentHelper;

import static teamport.aether.item.AetherItems.AMBROSIUM;

public class ToolHammerAetherHolystone extends ToolHammerAether {
	public ToolHammerAetherHolystone(String name, String namespaceId, int id, Tool tool, ToolMaterial toolMaterial, Tag<Block<?>> tagEffectiveAgainst) {
		super(name, namespaceId, id, tool, toolMaterial, tagEffectiveAgainst);
	}
	@Override
	public boolean onBlockDestroyed(@NotNull ItemStack itemStack, @NotNull World world, @NotNull Mob mob, @NotNull Block<?> removedBlock, @NotNull TilePosc blockPos, @NotNull Side side) {
		Player player = (Player)mob;
		if (removedBlock.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) || removedBlock.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL)) {
			if (!EnvironmentHelper.isMultiplayerClient() && itemRand.nextInt(16) == 0 && removedBlock.getHardness() > 0.0F) {
				world.dropItem(blockPos.x(), blockPos.y(), blockPos.z(), new ItemStack(AMBROSIUM, 1));
			}
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
			if (targetBlock.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) || targetBlock.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL)) {
				if (!EnvironmentHelper.isMultiplayerClient() && itemRand.nextInt(16) == 0 && targetBlock.getHardness() > 0.0F) {
					world.dropItem(targetPos.x(), targetPos.y(), targetPos.z(), new ItemStack(AMBROSIUM, 1));
				}
					if (this.canHarvestBlock(itemStack, mob, targetBlock)) {
						if (player.getGamemode().hasItemDrops()) {
							targetBlock.onHarvest(world, player, targetPos, 0, null);
						}

						world.setBlockTypeNotify(targetPos, Blocks.AIR);
					}
				}
			}
}
