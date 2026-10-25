package camoweed.campatibility.item.hammer;

import camoweed.rosesword.ModItems;
import camoweed.rosesword.ModMain;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;

public class PepeeThingsRoseToolsRecipes  {
	public static void onRecipesReady() {
		LookupFuelFurnace.instance.addFuelEntry(ModItems.roseSword.id, 12800);
		LookupFuelFurnace.instance.addFuelEntry(ModItems.roseAxe.id, 12800);
		RecipeBuilder.Shaped(ModMain.MOD_ID).setShape(new String[]{"ARA", "TST", "ARA"}).addInput('A', Blocks.ALGAE).addInput('R', Blocks.FLOWER_RED).addInput('S', qapy.pepeethings.ModItems.TOOL_HAMMER_IRON).addInput('T', Items.INGOT_STEEL).create("rose_sword", new ItemStack(PepeeThingsRoseToolsItems.TOOL_HAMMER_ROSE, 1));
		ModMain.LOGGER.info("Recipes initialized.");
	}

	public static void initNamespaces() {
		RecipeBuilder.initNameSpace(ModMain.MOD_ID);
	}
}
