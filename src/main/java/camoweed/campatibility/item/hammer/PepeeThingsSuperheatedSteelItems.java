package camoweed.campatibility.item.hammer;

import net.example.superheatedsteel.item.SuperheatedSteelMaterial;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class PepeeThingsSuperheatedSteelItems {
	public static Item TOOL_HAMMER_SUPERHEATED_STEEL;

	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_HAMMER_SUPERHEATED_STEEL = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.superheated_steel",
				itemKey("tool_hammer_superheated_steel"),
				20032,
				ItemToolHammer.Tool.PICKAXE,
				SuperheatedSteelMaterial.INSTANCE,
				BlockTags.MINEABLE_BY_PICKAXE));
	}
}
