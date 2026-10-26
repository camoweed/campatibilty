package camoweed.campatibility.item.paxel;

import net.example.superheatedsteel.item.ModItems;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;

import static camoweed.campatibility.Campatibility.MOD_ID;

public class PaxelSuperheatedSteelRecipes {
    public static void onRecipesReady() {
        RecipeBuilderShaped paxelTemplate = new RecipeBuilderShaped(MOD_ID, "A5P", " S ", " S ");
        paxelTemplate
            .addInput('A', ModItems.superheatedSteelAxe)
            .addInput('5', ModItems.superheatedSteelShovel)
            .addInput('P', ModItems.superheatedSteelPickaxe)
            .addInput('S', Items.STICK)
            .create("superheated_steel_paxel", new ItemStack(PaxelSuperheatedSteelItems.TOOL_PAXEL_SUPERHEATED_STEEL));
    }
    public static void initNamespaces() {
        RecipeBuilder.initNameSpace(MOD_ID);
    }
}
