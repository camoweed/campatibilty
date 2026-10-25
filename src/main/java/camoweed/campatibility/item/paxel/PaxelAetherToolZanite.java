package camoweed.campatibility.item.paxel;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.MathHelper;
import org.jetbrains.annotations.NotNull;
import teamport.aether.block.AetherBlockTags;
import teamport.aether.item.AetherHasCustomDamageType;

import static teamport.aether.AetherGlobals.ZANITE_MULTIPLIER;

public class PaxelAetherToolZanite extends PaxelAetherTool {
	public PaxelAetherToolZanite(String name, String namespaceId, int id, ToolMaterial toolMaterial) {
		super(name, namespaceId, id, toolMaterial);
	}
	@Override
	public float getStrVsBlock(@NotNull ItemStack itemstack, @NotNull Block<?> block) {
		if (!block.hasTag(AetherBlockTags.MINEABLE_BY_AETHER_PICKAXE)) return 1.0F;
		float durabilityProgress = ((float) itemstack.getMetadata() / this.getMaxDamage());
		// we will 'lerp' between the starting damage and starting damage time ZANITE_MULTIPLIER
		float baseEfficiency = this.material.getEfficiency(false);
		return MathHelper.lerp(baseEfficiency, baseEfficiency * ZANITE_MULTIPLIER, durabilityProgress);
	}
}
