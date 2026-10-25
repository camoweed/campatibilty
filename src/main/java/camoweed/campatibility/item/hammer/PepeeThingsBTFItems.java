package camoweed.campatibility.item.hammer;

import imbacrian.btf.items.ItemMaterials;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class PepeeThingsBTFItems {
	public static Item TOOL_HAMMER_IRIDESCITE;

	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_HAMMER_IRIDESCITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.iridescite",
				itemKey("tool_hammer_iridescite"),
				20030,
				ItemToolHammer.Tool.PICKAXE,
				ItemMaterials.iridesciteItem,
				BlockTags.MINEABLE_BY_PICKAXE));
	}
}
