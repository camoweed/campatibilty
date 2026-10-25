package camoweed.campatibility.item.hammer;

import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class PepeeThingsRoseToolsItems {
	public static Item TOOL_HAMMER_ROSE;

	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_HAMMER_ROSE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.rose",
				itemKey("tool_hammer_rose"),
				20030,
				ItemToolHammer.Tool.PICKAXE,
				camoweed.rosesword.ModItems.roseToolMaterial,
				BlockTags.MINEABLE_BY_PICKAXE));
	}
}
