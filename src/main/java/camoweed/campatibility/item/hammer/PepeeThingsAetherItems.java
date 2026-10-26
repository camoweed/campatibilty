package camoweed.campatibility.item.hammer;

import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import teamport.aether.item.item_tool.AetherToolMaterial;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class PepeeThingsAetherItems {
	public static Item TOOL_HAMMER_HOLYSTONE;

	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_HAMMER_HOLYSTONE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherHolystone(
				"tool.hammer.holystone",
				itemKey("tool_hammer_holystone"),
				20033,
				ItemToolHammer.Tool.PICKAXE,
				AetherToolMaterial.HOLYSTONE,
				BlockTags.MINEABLE_BY_PICKAXE));
	}
}
