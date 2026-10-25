package camoweed.campatibility.item.paxel;

import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.AtlasStitcher;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import turniplabs.halplibe.helper.TextureHelper;

import static net.minecraft.client.render.item.model.ItemModelDispatcher.*;

public class PaxelAetherModels {
	public static void beforeClientStart() {
		PaxelAetherModels.registerTextures();
	}

	public static void registerTextures() {
		for (final AtlasStitcher stitcher : TextureRegistry.stitcherMap.values()) {
			TextureHelper.initializeAllFiles("campatibility", stitcher, true);
		}
	}
	public static void initItemModels(ItemModelDispatcher dispatcher) {
		dispatcher.addDispatch(new ItemModelStandard(PaxelAetherItems.TOOL_PAXEL_SKYROOT)
			.setIcon("campatibility:item/tool_paxel_skyroot")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND)
			.setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND)
			.setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND)
			.setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PaxelAetherItems.TOOL_PAXEL_HOLYSTONE)
			.setIcon("campatibility:item/tool_paxel_holystone")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND)
			.setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND)
			.setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND)
			.setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PaxelAetherItems.TOOL_PAXEL_ZANITE)
			.setIcon("campatibility:item/tool_paxel_zanite")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND)
			.setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND)
			.setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND)
			.setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PaxelAetherItems.TOOL_PAXEL_GRAVITITE)
			.setIcon("campatibility:item/tool_paxel_gravitite")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND)
			.setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND)
			.setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND)
			.setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PaxelAetherItems.TOOL_PAXEL_VALKYRIE)
			.setIcon("campatibility:item/tool_paxel_valkyrie")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND)
			.setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND)
			.setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND)
			.setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PaxelAetherItems.TOOL_PAXEL_PHEONIX)
			.setIcon("campatibility:item/tool_paxel_phoenix")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND)
			.setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND)
			.setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND)
			.setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
	}
}
