package camoweed.campatibility.item.paxel;

import net.minecraft.core.block.Block;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import turniplabs.halplibe.helper.EnvironmentHelper;

import static teamport.aether.item.AetherItems.AMBROSIUM;

public class PaxelAetherToolHolystone extends PaxelAetherTool {
	public PaxelAetherToolHolystone(String name, String namespaceId, int id, ToolMaterial toolMaterial) {
		super(name, namespaceId, id, toolMaterial);
	}
	@Override
	public boolean onBlockDestroyed(ItemStack itemstack, World world, Mob mob, Block<?> block, TilePosc blockPos, Side side) {
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
