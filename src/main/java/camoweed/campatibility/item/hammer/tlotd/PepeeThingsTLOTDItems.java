package camoweed.campatibility.item.hammer.tlotd;

import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import qapy.pepeethings.ModItems;
import qapy.pepeethings.item.ItemToolHammer;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class PepeeThingsTLOTDItems {
	public static Item TOOL_HAMMER_HELIORITE;
	public static Item TOOL_HAMMER_ENDURIUM;
	public static Item TOOL_HAMMER_PALLADIUM;
	public static Item TOOL_HAMMER_JURASSOLINE;
	public static Item TOOL_HAMMER_CINNABAR;
	public static Item TOOL_HAMMER_NEBULAR;
	public static Item TOOL_HAMMER_MITHRIL;
	public static Item TOOL_SPADE_HELIORITE;
	public static Item TOOL_SPADE_ENDURIUM;
	public static Item TOOL_SPADE_PALLADIUM;
	public static Item TOOL_SPADE_JURASSOLINE;
	public static Item TOOL_SPADE_CINNABAR;
	public static Item TOOL_SPADE_NEBULAR;
	public static Item TOOL_SPADE_MITHRIL;

	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_HAMMER_HELIORITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.heliorite",
				itemKey("tool_hammer_heliorite"),
				20045,
				ItemToolHammer.Tool.PICKAXE,
				net.tlotd.bta.item.ModItems.HELIORITE,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_ENDURIUM = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.endurium",
				itemKey("tool_hammer_endurium"),
				20046,
				ItemToolHammer.Tool.PICKAXE,
				net.tlotd.bta.item.ModItems.ENDURIUM,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_PALLADIUM = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.palladium",
				itemKey("tool_hammer_palladium"),
				20047,
				ItemToolHammer.Tool.PICKAXE,
				net.tlotd.bta.item.ModItems.PALLADIUM,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_JURASSOLINE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.jurassoline",
				itemKey("tool_hammer_jurassoline"),
				20048,
				ItemToolHammer.Tool.PICKAXE,
				net.tlotd.bta.item.ModItems.JURASSOLINE,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_CINNABAR = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.cinnabar",
				itemKey("tool_hammer_cinnabar"),
				20049,
				ItemToolHammer.Tool.PICKAXE,
				net.tlotd.bta.item.ModItems.CINNABAR,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_NEBULAR = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.nebular",
				itemKey("tool_hammer_nebular"),
				20050,
				ItemToolHammer.Tool.PICKAXE,
				net.tlotd.bta.item.ModItems.NEBULAR,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_HAMMER_MITHRIL = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.hammer.mithril",
				itemKey("tool_hammer_mithril"),
				20051,
				ItemToolHammer.Tool.PICKAXE,
				net.tlotd.bta.item.ModItems.MITHRIL,
				BlockTags.MINEABLE_BY_PICKAXE));
		TOOL_SPADE_HELIORITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.spade.heliorite",
				itemKey("tool_spade_heliorite"),
				20052,
				ItemToolHammer.Tool.SHOVEL,
				net.tlotd.bta.item.ModItems.HELIORITE,
				BlockTags.MINEABLE_BY_SHOVEL));
		TOOL_SPADE_ENDURIUM = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.spade.endurium",
				itemKey("tool_spade_endurium"),
				20053,
				ItemToolHammer.Tool.SHOVEL,
				net.tlotd.bta.item.ModItems.ENDURIUM,
				BlockTags.MINEABLE_BY_SHOVEL));
		TOOL_SPADE_PALLADIUM = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.spade.palladium",
				itemKey("tool_spade_palladium"),
				20054,
				ItemToolHammer.Tool.SHOVEL,
				net.tlotd.bta.item.ModItems.PALLADIUM,
				BlockTags.MINEABLE_BY_SHOVEL));
		TOOL_SPADE_JURASSOLINE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.spade.jurassoline",
				itemKey("tool_spade_jurassoline"),
				20055,
				ItemToolHammer.Tool.SHOVEL,
				net.tlotd.bta.item.ModItems.JURASSOLINE,
				BlockTags.MINEABLE_BY_SHOVEL));
		TOOL_SPADE_CINNABAR = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.spade.cinnabar",
				itemKey("tool_spade_cinnabar"),
				20056,
				ItemToolHammer.Tool.SHOVEL,
				net.tlotd.bta.item.ModItems.CINNABAR,
				BlockTags.MINEABLE_BY_SHOVEL));
		TOOL_SPADE_NEBULAR = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.spade.nebular",
				itemKey("tool_spade_nebular"),
				20057,
				ItemToolHammer.Tool.SHOVEL,
				net.tlotd.bta.item.ModItems.NEBULAR,
				BlockTags.MINEABLE_BY_SHOVEL));
		TOOL_SPADE_MITHRIL = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> ModItems.TOOL_HAMMER_STEEL))
			.build(new ItemToolHammer(
				"tool.spade.mithril",
				itemKey("tool_spade_mithril"),
				20058,
				ItemToolHammer.Tool.SHOVEL,
				net.tlotd.bta.item.ModItems.MITHRIL,
				BlockTags.MINEABLE_BY_SHOVEL));
	}
}
