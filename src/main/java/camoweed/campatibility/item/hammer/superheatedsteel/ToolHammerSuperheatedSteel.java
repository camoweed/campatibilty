package camoweed.campatibility.item.hammer.superheatedsteel;

import net.example.superheatedsteel.item.SuperheatedIgnite;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.tag.Tag;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qapy.pepeethings.item.ItemToolHammer;

public class ToolHammerSuperheatedSteel extends ItemToolHammer {
	public ToolHammerSuperheatedSteel(String name, String namespaceId, int id, Tool tool, ToolMaterial toolMaterial, Tag<Block<?>> tagEffectiveAgainst) {
		super(name, namespaceId, id, tool, toolMaterial, tagEffectiveAgainst);
	}
	public boolean onUseOnBlock(@NotNull ItemStack selfStack, @NotNull World world, @Nullable Player player, @NotNull TilePosc blockPos, @NotNull Side side, double xHit, double yHit) {
		return SuperheatedIgnite.igniteGround(selfStack, world, player, blockPos, side);
	}
	public boolean hitEntity(@NotNull ItemStack selfStack, @NotNull Mob target, @NotNull Mob attacker) {
		boolean result = super.hitEntity(selfStack, target, attacker);
		SuperheatedIgnite.apply(target);
		return result;
	}
}
