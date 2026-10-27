package camoweed.campatibility.item.hammer;

import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import teamport.aether.block.AetherBlockTags;
import teamport.aether.item.item_tool.AetherToolMaterial;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class PepeeThingsAetherItems {
	public static Item TOOL_HAMMER_HOLYSTONE;
	public static Item TOOL_HAMMER_ZANITE;
	public static Item TOOL_HAMMER_GRAVITITE;
	public static Item TOOL_HAMMER_VALKYRIE;
	public static Item TOOL_HAMMER_PHOENIX;
	public static Item TOOL_SPADE_HOLYSTONE;
	public static Item TOOL_SPADE_ZANITE;
	public static Item TOOL_SPADE_GRAVITITE;
	public static Item TOOL_SPADE_VALKYRIE;
	public static Item TOOL_SPADE_PHOENIX;

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
		TOOL_SPADE_HOLYSTONE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherHolystone(
				"tool.spade.holystone",
				itemKey("tool_spade_holystone"),
				20040,
				ItemToolHammer.Tool.SHOVEL,
				AetherToolMaterial.HOLYSTONE,
				AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL));
		TOOL_SPADE_ZANITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherZanite(
				"tool.spade.zanite",
				itemKey("tool_spade_zanite"),
				20041,
				ItemToolHammer.Tool.SHOVEL,
				AetherToolMaterial.GRAVITITE,
				AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL));
		TOOL_SPADE_GRAVITITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherGravitite(
				"tool.spade.gravitite",
				itemKey("tool_spade_gravitite"),
				20042,
				ItemToolHammer.Tool.SHOVEL,
				AetherToolMaterial.GRAVITITE,
				AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL));
		TOOL_SPADE_VALKYRIE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherValkyrie(
				"tool.spade.valkyrie",
				itemKey("tool_spade_valkyrie"),
				20043,
				ItemToolHammer.Tool.SHOVEL,
				AetherToolMaterial.VALKYRIE,
				AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL));
		TOOL_SPADE_PHOENIX = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ToolHammerAetherPhoenix(
				"tool.spade.phoenix",
				itemKey("tool_spade_phoenix"),
				20044,
				ItemToolHammer.Tool.SHOVEL,
				AetherToolMaterial.PHOENIX,
				AetherBlockTags.MINEABLE_BY_AETHER_SHOVEL));
	}
}
