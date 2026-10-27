package camoweed.campatibility.item.paxel.aether;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.DamageType;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePos;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import teamport.aether.block.AetherBlockTags;
import teamport.aether.entity.MobUtil;
import teamport.aether.entity.floating_block.EntityFloatingBlock;
import teamport.aether.item.AetherHasCustomDamageType;
import turniplabs.halplibe.helper.EnvironmentHelper;

public class ToolPaxelAetherGravitite extends ToolPaxelAether implements AetherHasCustomDamageType {
	private static final float KNOCKBACK_STRENGTH = 3.0F/4.0F;
	private static final float LIFT = KNOCKBACK_STRENGTH;
	public ToolPaxelAetherGravitite(String name, String namespaceId, int id, ToolMaterial toolMaterial) {
		super(name, namespaceId, id, toolMaterial);
	}
	@Override
	public boolean hitEntity(@NotNull ItemStack itemstack, @NotNull Mob target, @NotNull Mob attacker) {
		if (target instanceof Mob && target.hurtTime == 10) {
			if(attacker.isSneaking() && attacker instanceof Player){
				MobUtil.knockback(target, attacker,KNOCKBACK_STRENGTH, 0.4f);
			}else{
				MobUtil.knockback(target, attacker, 0.4f, LIFT);
			}
		}
		return super.hitEntity(itemstack, target, attacker);
	}
	@Override
	public boolean onUseOnBlock(@NotNull ItemStack itemstack, @NotNull World world, Player player, @NotNull TilePosc blockPos, @NotNull Side side, double xPlaced, double yPlaced) {
		Block<?> block = world.getBlockType(blockPos);
		Block<?> blockAbove = world.getBlockType(blockPos.up(new TilePos()));
		// because otherwise it not possible to open chests
		if (!block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE) || !player.isSneaking() || block.getHardness() < 0 || blockAbove.id() != Blocks.COBWEB.id() && !blockAbove.hasTag(BlockTags.PLACE_OVERWRITES)) {
			return false;
		}

		if (EnvironmentHelper.isMultiplayerClient()) {
			return true;
		}

		TileEntity tileEntity = world.getTileEntity(blockPos);
		int metadata = world.getBlockData(blockPos);
		world.removeTileEntity(blockPos);
		world.setBlockTypeNotify(blockPos, Blocks.AIR);
		EntityFloatingBlock entityFloatingBlock = new EntityFloatingBlock(world, (double) blockPos.x() + 0.5F, (double) blockPos.y() + 0.5F, (double) blockPos.z() + 0.5F, block.id(), metadata, tileEntity);
		entityFloatingBlock.setHasRemovedBlock(true);
		world.entityJoinedWorld(entityFloatingBlock);
		itemstack.damageItem(1, player);
		return true;
	}
	@Override
	public DamageType getDamageType(){
		return DamageType.FALL;
	}
}
