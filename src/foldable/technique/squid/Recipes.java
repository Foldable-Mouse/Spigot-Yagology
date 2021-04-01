package foldable.technique.squid;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.Plugin;
/*================================([    RECIPES    ])-===============================*/
/*																					 */
//                                       ./#%%%/*.                                   //
//                               .@@@@@@@&       *@@@@                               //
//                           /@@@@@@.                @@@(                            //
//                        @@@%((@@@                    &@@.                          //
//                      @@%(((((@@                      (@@(                         //
//                    &@@(((((((@&     ,**/*           (@@@@.                        //
//                   ,@&(((((((#@,    @@@@@@@@       @@@@@@@@                        //
//                   @@((((((((@@     @@@@@@@@       @@@@@@@@                        //
//                   @@((((((((@@                         ,@@                        //
//                   @@#((((((((@%                         @@                        //
//                    @@((((((((@@             @@@@@      .@@                        //
//                    @@#(((((((#@@            @@@@@      %@@                        //
//                     &@#((((((((@@/                     @@*                        //
//                      @@((((((((#(@@#                  (@@                         //
//                      @@((((((((((((%@@#               @@@                         //
//                      @@@((((((((((((@@@@@@@@@@@@@&@@@@@@                          //
//                      @@@((((((((((#@@*.@@@#((((((((((@@.                          //
//                      @@(((((((((((@@    @@&((((((((((%@                           //
//                     %@%((((((((((@@      @@(((((((((((@@(                         //
//                    (@@(((((((((&@@        @@#((((((((((@@                         //
//                  ,@@(((((((((@@/          @@((((((((((#@@                         //
//                  @@%((((((((@@&            &@@((((((((((@@                        //
//                @@@((((((((&@@               @@@((((((((((@*                       //
//              @@@@%(((#(#@@@&                 @@@((((((##@@@@@@&%.                 //
//            .@@@@@@@@@@@@@@@@@@@@@@           @@@@@@@@@@@@@@@@&&@@@@@@             //
//            @@%                   @@@         @@@/                 .@@@            //
//            @@@.                  .@@@         @@@*               #@@@.            //
//             .@@@@@@@@@@@@@@@@@@@@@@.           %@@@@@@@@@@@@@@@@@@(               //
/*																				 	 */
/*===================================================================================*/
public class Recipes
{
	public static void makeBreadRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('W', Material.WHEAT);
		Bukkit.addRecipe(recipe);
	}
	@SuppressWarnings("deprecation")
	public static void makeYagtoolRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		//USING new RecipeChoice.ExactChoice LETS ME USE CUSTOM ITEMSTACK (YAG NOSE)!!! :)
		recipe.setIngredient('N', new RecipeChoice.ExactChoice(YagItems.createYagNose()));
		Bukkit.addRecipe(recipe);
	}
	public static void makeYagNoseRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('N', Material.NETHERITE_INGOT);
		recipe.setIngredient('B', Material.BREAD);
		recipe.setIngredient('D', Material.DIAMOND);
		Bukkit.addRecipe(recipe);
	}
	@SuppressWarnings("deprecation")
	public static void makeYagHelmetRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('Y', new RecipeChoice.ExactChoice(YagItems.createYagNose()));
		recipe.setIngredient('B', Material.BREAD);
		Bukkit.addRecipe(recipe);
	}
	@SuppressWarnings("deprecation")
	public static void makeYagChestplateRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('Y', new RecipeChoice.ExactChoice(YagItems.createYagNose()));
		recipe.setIngredient('B', Material.BREAD);
		Bukkit.addRecipe(recipe);
	}
	@SuppressWarnings("deprecation")
	public static void makeYagLeggingsRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('Y', new RecipeChoice.ExactChoice(YagItems.createYagNose()));
		recipe.setIngredient('B', Material.BREAD);
		recipe.setIngredient('G', new RecipeChoice.ExactChoice(YagItems.createGucciBeltBuckle()));
		Bukkit.addRecipe(recipe);
	}
	@SuppressWarnings("deprecation")
	public static void makeYagBootsRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('Y', new RecipeChoice.ExactChoice(YagItems.createYagNose()));
		recipe.setIngredient('L', Material.LEATHER);
		Bukkit.addRecipe(recipe);
	}
	public static void makeBeltBuckleRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('N', Material.NETHERITE_INGOT);
		recipe.setIngredient('D', Material.DIAMOND);
		Bukkit.addRecipe(recipe);
	}
	@SuppressWarnings("deprecation")
	public static void makeYagBowRecipe(Plugin plugin, String name, ItemStack item, String[] formula)
	{
		NamespacedKey key = new NamespacedKey(plugin, name);
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		recipe.shape(formula[0], formula[1], formula[2]);
		recipe.setIngredient('S', Material.BLAZE_ROD);
		recipe.setIngredient('T', Material.STRING);
		recipe.setIngredient('W', Material.TRIPWIRE_HOOK);
		recipe.setIngredient('Y', new RecipeChoice.ExactChoice(YagItems.createYagNose()));
		Bukkit.addRecipe(recipe);
	}
}
