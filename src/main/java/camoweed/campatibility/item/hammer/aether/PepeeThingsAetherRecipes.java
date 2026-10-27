package camoweed.campatibility.item.hammer.aether;

import net.minecraft.core.item.ItemStack;
import teamport.aether.block.AetherBlocks;
import teamport.aether.item.AetherItems;
import turniplabs.halplibe.helper.RecipeBuilder;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PepeeThingsAetherRecipes {
	public static void onRecipesReady() {
		RecipeBuilder.Shaped(MOD_ID).setShape("AA ", "AAS", "AA ").addInput('A', AetherBlocks.COBBLE_HOLYSTONE).addInput('S', AetherItems.STICK_SKYROOT)
			.create("holystone_hammer", new ItemStack(PepeeThingsAetherItems.TOOL_HAMMER_HOLYSTONE, 1));
		RecipeBuilder.Shaped(MOD_ID).setShape(" AA", " SA", "S  ").addInput('A', AetherBlocks.COBBLE_HOLYSTONE).addInput('S', AetherItems.STICK_SKYROOT)
			.create("holystone_spade", new ItemStack(PepeeThingsAetherItems.TOOL_SPADE_HOLYSTONE, 1));
		RecipeBuilder.Shaped(MOD_ID).setShape("AA ", "AAS", "AA ").addInput('A', AetherItems.ZANITE).addInput('S', AetherItems.STICK_SKYROOT)
			.create("zanite_hammer", new ItemStack(PepeeThingsAetherItems.TOOL_HAMMER_ZANITE, 1));
		RecipeBuilder.Shaped(MOD_ID).setShape(" AA", " SA", "S  ").addInput('A', AetherItems.ZANITE).addInput('S', AetherItems.STICK_SKYROOT)
			.create("zanite_spade", new ItemStack(PepeeThingsAetherItems.TOOL_SPADE_ZANITE, 1));
		RecipeBuilder.Shaped(MOD_ID).setShape("AA ", "AAS", "AA ").addInput('A', AetherBlocks.BLOCK_GRAVITITE).addInput('S', AetherItems.STICK_SKYROOT)
			.create("gravitite_hammer", new ItemStack(PepeeThingsAetherItems.TOOL_HAMMER_GRAVITITE, 1));
		RecipeBuilder.Shaped(MOD_ID).setShape(" AA", " SA", "S  ").addInput('A', AetherBlocks.BLOCK_GRAVITITE).addInput('S', AetherItems.STICK_SKYROOT)
			.create("gravitite_spade", new ItemStack(PepeeThingsAetherItems.TOOL_SPADE_GRAVITITE, 1));
	}
	public static void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}
}
