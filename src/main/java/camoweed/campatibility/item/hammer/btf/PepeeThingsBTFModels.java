package camoweed.campatibility.item.hammer.btf;

import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.AtlasStitcher;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import turniplabs.halplibe.helper.TextureHelper;

import static net.minecraft.client.render.item.model.ItemModelDispatcher.*;

public class PepeeThingsBTFModels {
	public static void beforeClientStart() {
		PepeeThingsBTFModels.registerTextures();
	}

	public static void registerTextures() {
		for (final AtlasStitcher stitcher : TextureRegistry.stitcherMap.values()) {
			TextureHelper.initializeAllFiles("campatibility", stitcher, true);
		}
	}
	public static void initItemModels(ItemModelDispatcher dispatcher) {
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsBTFItems.TOOL_HAMMER_IRIDESCITE)
			.setIcon("campatibility:item/tool_hammer_iridescite")
			.setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND)
			.setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND)
			.setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND)
			.setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
		dispatcher.addDispatch(new ItemModelStandard(PepeeThingsBTFItems.TOOL_SPADE_IRIDESCITE)
			.setIcon("campatibility:item/tool_spade_iridescite").setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND)
		);
	}
}
