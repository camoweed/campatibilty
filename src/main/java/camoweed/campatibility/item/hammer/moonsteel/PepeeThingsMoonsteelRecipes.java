package camoweed.campatibility.item.hammer.moonsteel;

import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import useless.moonsteel.item.MoonSteelItems;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsMoonsteelRecipes {
	public static void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID).setShape("AA ", "AAS", "AA ").addInput('A', MoonSteelItems.INGOT_MOONSTEEL).addInput('S', Items.STICK)
			.create("moonsteel_hammer", new ItemStack(PepeeThingsMoonsteelItems.TOOL_HAMMER_MOONSTEEL, 1));
		RecipeBuilder.Shaped(MOD_ID).setShape(" AA", " SA", "S  ").addInput('A', MoonSteelItems.INGOT_MOONSTEEL).addInput('S', Items.STICK)
			.create("moonsteel_spade", new ItemStack(PepeeThingsMoonsteelItems.TOOL_SPADE_MOONSTEEL, 1));
	}
	public static void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
