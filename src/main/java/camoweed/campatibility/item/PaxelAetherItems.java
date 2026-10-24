package camoweed.campatibility.item;

import luke.paxels.ItemToolPaxel;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.Items;
import teamport.aether.item.item_tool.AetherToolMaterial;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class PaxelAetherItems {

	public static Item TOOL_PAXEL_SKYROOT;
	public static Item TOOL_PAXEL_HOLYSTONE;
	public static Item TOOL_PAXEL_ZANITE;
	public static Item TOOL_PAXEL_GRAVITITE;
	public static Item TOOL_PAXEL_VALKYRIE;
	public static Item TOOL_PAXEL_PHEONIX;


	public static String itemKey(String string) {
		return "campatibility" + ":item/" + string;
	}

	public static void initializeItems() {
		TOOL_PAXEL_SKYROOT = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> Items.TOOL_SWORD_STEEL))
			.build(new ItemToolPaxel(
				"tool.paxel.zanite",
				itemKey("tool_paxel_zanite"),
				20020,
				AetherToolMaterial.SKYROOT));
		TOOL_PAXEL_HOLYSTONE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> Items.TOOL_SWORD_STEEL))
			.build(new ItemToolPaxel(
				"tool.paxel.holystone",
				itemKey("tool_paxel_holystone"),
				20021,
				AetherToolMaterial.HOLYSTONE));
		TOOL_PAXEL_ZANITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> Items.TOOL_SWORD_STEEL))
			.build(new ItemToolPaxel(
				"tool.paxel.zanite",
				itemKey("tool_paxel_zanite"),
				20022,
				AetherToolMaterial.ZANITE));
		TOOL_PAXEL_GRAVITITE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> Items.TOOL_SWORD_STEEL))
			.build(new ItemToolPaxel(
				"tool.paxel.gravitite",
				itemKey("tool_paxel_gravitite"),
				20023,
				AetherToolMaterial.GRAVITITE));
		TOOL_PAXEL_VALKYRIE = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> Items.TOOL_SWORD_STEEL))
			.build(new ItemToolPaxel(
				"tool.paxel.valkyrie",
				itemKey("tool_paxel_valkyrie"),
				20024,
				AetherToolMaterial.VALKYRIE));
		TOOL_PAXEL_PHEONIX = new ItemBuilder("campatibility")
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.After(() -> Items.TOOL_SWORD_STEEL))
			.build(new ItemToolPaxel(
				"tool.paxel.pheonix",
				itemKey("tool_paxel_pheonix"),
				20025,
				AetherToolMaterial.PHOENIX));
	}
}
