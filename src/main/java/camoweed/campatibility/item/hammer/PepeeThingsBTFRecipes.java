package camoweed.campatibility.item.hammer;

import imbacrian.btf.items.ItemsList;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsBTFRecipes {
	public static void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID).setShape("AA ", " S ", "  ").addInput('A', ItemsList.INGOT_IRIDESCITE).addInput('S', qapy.pepeethings.ModItems.TOOL_HAMMER_IRON)
			.create("iridescite_hammer", new ItemStack(PepeeThingsBTFItems.TOOL_HAMMER_IRIDESCITE, 1));
	}
	public static void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
