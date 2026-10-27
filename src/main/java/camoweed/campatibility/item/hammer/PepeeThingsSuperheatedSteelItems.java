package camoweed.campatibility.item.hammer;

import net.example.superheatedsteel.item.SuperheatedSteelMaterial;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsSuperheatedSteelItems {
	public static Item TOOL_HAMMER_SUPERHEATED_STEEL;
	public static Item TOOL_SPADE_SUPERHEATED_STEEL;

	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_HAMMER_SUPERHEATED_STEEL = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerSuperheatedSteel(
				"tool.hammer.superheated_steel",
				itemKey("tool_hammer_superheated_steel"),
				20032,
				ItemToolHammer.Tool.PICKAXE,
				SuperheatedSteelMaterial.INSTANCE,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_SPADE_SUPERHEATED_STEEL = (new ItemBuilder(MOD_ID).setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.TOOLS)).build(new ItemToolHammer("tool.spade.superheated_steel", "campatibility:item/tool_spade_superheated_steel", 20039, ItemToolHammer.Tool.SHOVEL, SuperheatedSteelMaterial.INSTANCE, BlockTags.MINEABLE_BY_SHOVEL)));
	}
}
