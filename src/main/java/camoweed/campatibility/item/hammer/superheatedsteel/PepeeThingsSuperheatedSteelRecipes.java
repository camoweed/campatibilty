package camoweed.campatibility.item.hammer.superheatedsteel;

import net.example.superheatedsteel.item.ModItems;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsSuperheatedSteelRecipes {
	public static void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID).setShape("AA ", "AAS", "AA ").addInput('A', ModItems.superheatedSteelIngot).addInput('S', Items.STICK)
			.create("superheated_steel_hammer", new ItemStack(PepeeThingsSuperheatedSteelItems.TOOL_HAMMER_SUPERHEATED_STEEL, 1));
	}
	public static void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
