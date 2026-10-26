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
	public static Item TOOL_HAMMER_ZANITE;
	public static Item TOOL_HAMMER_GRAVITITE;
	public static Item TOOL_HAMMER_VALKYRIE;
	public static Item TOOL_HAMMER_PHOENIX;

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
		TOOL_HAMMER_ZANITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherZanite(
				"tool.hammer.zanite",
				itemKey("tool_hammer_zanite"),
				20034,
				ItemToolHammer.Tool.PICKAXE,
				AetherToolMaterial.GRAVITITE,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_GRAVITITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherGravitite(
				"tool.hammer.gravitite",
				itemKey("tool_hammer_gravitite"),
				20035,
				ItemToolHammer.Tool.PICKAXE,
				AetherToolMaterial.GRAVITITE,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_VALKYRIE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherValkyrie(
				"tool.hammer.valkyrie",
				itemKey("tool_hammer_valkyrie"),
				20036,
				ItemToolHammer.Tool.PICKAXE,
				AetherToolMaterial.VALKYRIE,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_PHOENIX = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherPhoenix(
				"tool.hammer.phoenix",
				itemKey("tool_hammer_phoenix"),
				20037,
				ItemToolHammer.Tool.PICKAXE,
				AetherToolMaterial.PHOENIX,
				BlockTags.MINEABLE_BY_PICKAXE));
	}
}
