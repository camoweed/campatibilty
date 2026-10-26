package camoweed.campatibility.item.paxel;

import imbacrian.btf.items.ItemsList;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PaxelBTFRecipes {
    public static void onRecipesReady() {
        RecipeBuilderShaped paxelTemplate = new RecipeBuilderShaped(MOD_ID, "A5P", " S ", " S ");
        paxelTemplate
            .addInput('A', ItemsList.IRIDESCITE_AXE)
            .addInput('5', ItemsList.IRIDESCITE_SHOVEL)
            .addInput('P', ItemsList.IRIDESCITE_PICKAXE)
            .addInput('S', Items.STICK)
            .create("iridescite_paxel", new ItemStack(PaxelBTFItems.TOOL_PAXEL_IRIDESCITE));
    }
    public static void initNamespaces() {
        RecipeBuilder.initNameSpace(MOD_ID);
    }
}
