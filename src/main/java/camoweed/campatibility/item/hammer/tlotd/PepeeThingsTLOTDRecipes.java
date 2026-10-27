package camoweed.campatibility.item.hammer.tlotd;

import net.minecraft.core.data.DataLoader;
import turniplabs.halplibe.helper.RecipeBuilder;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsTLOTDRecipes {
	public static void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
	public static void onRecipesReady() {
		DataLoader.loadRecipesFromFile("/assets/campatibility/recipes/tlotd.json");
	}
}
