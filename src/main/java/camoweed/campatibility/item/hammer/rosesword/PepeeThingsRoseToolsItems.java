package camoweed.campatibility.item.hammer.rosesword;

import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsRoseToolsItems {
	public static Item TOOL_HAMMER_ROSE;
	public static Item TOOL_SPADE_ROSE;

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
		TOOL_SPADE_ROSE = (new ItemBuilder(MOD_ID).setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.TOOLS)).build(new ItemToolHammer("tool.spade.rose", "campatibility:item/tool_spade_rose", 20037, ItemToolHammer.Tool.SHOVEL, camoweed.rosesword.ModItems.roseToolMaterial, BlockTags.MINEABLE_BY_SHOVEL)));
	}
}
