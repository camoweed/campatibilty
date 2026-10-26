package camoweed.campatibility.item.paxel;

import camoweed.rosesword.ModItems;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PaxelRoseToolsRecipes {
    public static void onRecipesReady() {
        RecipeBuilderShaped paxelTemplate = new RecipeBuilderShaped(MOD_ID, "A5P", " S ", " S ");
        paxelTemplate
            .addInput('A', ModItems.roseAxe)
            .addInput('5', ModItems.roseSword)
            .addInput('P', ModItems.rosePick)
            .addInput('S', Items.STICK)
            .create("rose_paxel", new ItemStack(PaxelRoseToolsItems.TOOL_PAXEL_ROSE));
    }
    public static void initNamespaces() {
        RecipeBuilder.initNameSpace(MOD_ID);
        LookupFuelFurnace.instance.addFuelEntry(PaxelRoseToolsItems.TOOL_PAXEL_ROSE.id, 500);

    }
}
