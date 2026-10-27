package camoweed.campatibility.item.hammer.moonsteel;

import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;
import useless.moonsteel.item.MoonSteelItems;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsMoonsteelItems {
	public static Item TOOL_HAMMER_MOONSTEEL;
	public static Item TOOL_SPADE_MOONSTEEL;

	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_HAMMER_MOONSTEEL = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.moonsteel",
				itemKey("tool_hammer_moonsteel"),
				20059,
				ItemToolHammer.Tool.PICKAXE,
				MoonSteelItems.MOON_STEEL_TOOL,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_SPADE_MOONSTEEL = (new ItemBuilder(MOD_ID).setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.TOOLS)).build(new ItemToolHammer("tool.spade.moonsteel", "campatibility:item/tool_spade_moonsteel", 20060, ItemToolHammer.Tool.SHOVEL, MoonSteelItems.MOON_STEEL_TOOL, BlockTags.MINEABLE_BY_SHOVEL)));
	}
}
