package camoweed.campatibility.item.hammer;

import imbacrian.btf.items.ItemMaterials;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsBTFItems {
	public static Item TOOL_HAMMER_IRIDESCITE;
	public static Item TOOL_SPADE_IRIDESCITE;

	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_HAMMER_IRIDESCITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.iridescite",
				itemKey("tool_hammer_iridescite"),
				20031,
				ItemToolHammer.Tool.PICKAXE,
				ItemMaterials.iridesciteItem,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_SPADE_IRIDESCITE = (new ItemBuilder(MOD_ID).setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.TOOLS)).build(new ItemToolHammer("tool.spade.iridescite", "campatibility:item/tool_spade_iridescite", 20038, ItemToolHammer.Tool.SHOVEL, ItemMaterials.iridesciteItem, BlockTags.MINEABLE_BY_SHOVEL)));
	}
}
