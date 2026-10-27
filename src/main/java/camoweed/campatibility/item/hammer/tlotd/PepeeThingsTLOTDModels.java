package camoweed.campatibility.item.hammer.tlotd;

import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.AtlasStitcher;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import turniplabs.halplibe.helper.TextureHelper;

import static net.minecraft.client.render.item.model.ItemModelDispatcher.*;

public class PepeeThingsTLOTDModels {
	public static void beforeClientStart() {
		PepeeThingsTLOTDModels.registerTextures();
	}

	public static void registerTextures() {
		for (final AtlasStitcher stitcher : TextureRegistry.stitcherMap.values()) {
			TextureHelper.initializeAllFiles("campatibility", stitcher, true);
		}
	}
	public static void initItemModels(ItemModelDispatcher dispatcher) {
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_HAMMER_HELIORITE)
			.setIcon("campatibility:item/tool_hammer_heliorite")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_SPADE_HELIORITE)
			.setIcon("campatibility:item/tool_spade_heliorite")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_HAMMER_ENDURIUM)
			.setIcon("campatibility:item/tool_hammer_endurium")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_SPADE_ENDURIUM)
			.setIcon("campatibility:item/tool_spade_endurium")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_HAMMER_PALLADIUM)
			.setIcon("campatibility:item/tool_hammer_palladium")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_SPADE_PALLADIUM)
			.setIcon("campatibility:item/tool_spade_palladium")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_HAMMER_JURASSOLINE)
			.setIcon("campatibility:item/tool_hammer_jurassoline")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_SPADE_JURASSOLINE)
			.setIcon("campatibility:item/tool_spade_jurassoline")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_HAMMER_CINNABAR)
			.setIcon("campatibility:item/tool_hammer_cinnabar")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_SPADE_CINNABAR)
			.setIcon("campatibility:item/tool_spade_cinnabar")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_HAMMER_NEBULAR)
			.setIcon("campatibility:item/tool_hammer_nebular")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_SPADE_NEBULAR)
			.setIcon("campatibility:item/tool_spade_nebular")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_HAMMER_MITHRIL)
			.setIcon("campatibility:item/tool_hammer_mithril")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsTLOTDItems.TOOL_SPADE_MITHRIL)
			.setIcon("campatibility:item/tool_spade_mithril")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
	}
}
