package camoweed.campatibility.item.paxel.aether;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;
import turniplabs.halplibe.helper.EnvironmentHelper;

import static teamport.aether.item.AetherItems.AMBROSIUM;

public class ToolPaxelAetherHolystone extends ToolPaxelAether {
	public ToolPaxelAetherHolystone(String name, String namespaceId, int id, ToolMaterial toolMaterial) {
		super(name, namespaceId, id, toolMaterial);
	}
	@Override
	public boolean onBlockDestroyed(@NotNull ItemStack itemstack, @NotNull World world, @NotNull Mob mob, @NotNull Block<?> block, @NotNull TilePosc blockPos, @NotNull Side side) {
		if (block != null) {
			if (block.getHardness() > 0.0F || this.isSilkTouch()) {
				itemstack.damageItem(1, mob);
			}
			if (!EnvironmentHelper.isMultiplayerClient() && itemRand.nextInt(16) == 0 && block.getHardness() > 0.0F) {
				world.dropItem(blockPos.x(), blockPos.y(), blockPos.z(), new ItemStack(AMBROSIUM, 1));
			}
		}
		return true;
	}
}
