package foldable.technique.squid;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/*================================([    YAGOLOGY    ])===============================*/
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

public class Main extends JavaPlugin
{
	public static Plugin MCPlugin;
	@Override
	public void onEnable()
	{
		System.out.println("========================================");
		System.out.println();
		System.out.println("        THE FOLDABLE TECHNIQUE          ");
		System.out.println("               PRESENTS:                ");
		System.out.println("       OFFICIAL YAGOLOGY PLUGIN         ");
		System.out.println();
		System.out.println("========================================");
		
		System.out.println("OOOOOOOOOOOOOO00000c..        ..........");
		System.out.println("OOOOOOOOOOOOOO00000c.. .      ..........");
		System.out.println("OOOOO0000OxxxxkOO0Od:::::'....'cccc'....");
		System.out.println("OOOO00000kddddxOOOOxooooo;....;dddd;.   ");
		System.out.println("kkkkO0000kddddxkkkkdooooo:''''cdddd;....");
		System.out.println("ddddkOOOOkddddooooooooooooooooodddd;....");
		System.out.println("ddddkOOOOkddddooooooooooooooooodddd;....");
		System.out.println("ooook0000o,,',''''''''''''''''''',,;::::");
		System.out.println("ooook0000c.........................;oooo");
		System.out.println("ooookKXXKl.   .''''''''''.    '::::loooo");
		System.out.println("oooo0WMMWl    'looooooool'    lWWWW0oooo");
		System.out.println("oooo0WMMWl    'oooooooooo'    lWMWW0oooo");
		System.out.println("oooodkkkko:;;;:cccccccccc:::::okkkkxdddd");
		System.out.println("ooooooooooooool::::::::::ldddddooooddddd");
		System.out.println("ooooooooolllllc::::::::::clllloooooddddd");
		System.out.println("oooooooooc,,,,;::::::::::;,,,,cooooodddd");
		System.out.println("ooooooooo:,,,,;::::::::::;,,,,:ooooodddd");
		System.out.println("ddddooooolccccc::::::::::ccccclooooodddd");
		System.out.println("ddddooooooooool::::::::::loooooooooodddd");
		System.out.println("ddddooooooooooc::::::::::coooooooooodddd");
		
		
		MCPlugin = this;
		
		// Adding commands and eventlisteners:
		Bukkit.getPluginManager().registerEvents(new Events(),  this);
		Bukkit.getPluginManager().registerEvents(new ChestGUI(), this);
		this.getCommand("yagnose").setExecutor(new Commands());
		this.getCommand("yagbread").setExecutor(new Commands());
		this.getCommand("yagrecipes").setExecutor(new Commands());
		this.getCommand("yr").setExecutor(new Commands());
		
		// -------------------------------------------------------------------------------------------
		// Adding recipes:
		String[] formulaVerticalSides = {"W  ", "W  ", "W  "};
		String[] formulaVerticalMiddle = {" W ", " W ", " W "};
		String[] formulaDiagonal = {"W  ", " W ", "  W"};
		String[] formulaX = {"W W", " W ", "W W"};
		Recipes.makeBreadRecipe(this, "advanced_bread", YagItems.createSemiYagBread(1), formulaVerticalSides);
		Recipes.makeBreadRecipe(this, "advanced_bread_0", YagItems.createSemiYagBread(1), formulaVerticalMiddle);
		Recipes.makeBreadRecipe(this, "advanced_bread_1", YagItems.createSemiYagBread(1), formulaDiagonal);
		Recipes.makeBreadRecipe(this, "advanced_bread_2", YagItems.createSemiYagBread(2), formulaX);
		//Yag tools:
		//Yag pickaxe:
		Recipes.makeYagtoolRecipe(this,  "yaganese_pickaxe", YagItems.createYaganesePickaxe(), new String[] {"NNN", " B ", " B "});
		//Yag sword:
		Recipes.makeYagtoolRecipe(this, "yaganese_sword", YagItems.createYaganeseSword(), new String[] {" N ", " N ", " B "});
		Recipes.makeYagtoolRecipe(this, "yaganese_sword_alt", YagItems.createYaganeseSword(), new String[] {"N  ", "N  ", "B  "});
		//Yag axe:
		Recipes.makeYagtoolRecipe(this, "yaganese_axe", YagItems.createYaganeseAxe(), new String[] {"NN ", "NB ", " B "});
		//Yag shovel:
		Recipes.makeYagtoolRecipe(this, "yaganese_shovel", YagItems.createYaganeseShovel(), new String[] {" N ", " B ", " B "});
		Recipes.makeYagtoolRecipe(this, "yaganese_shovel_alt", YagItems.createYaganeseShovel(), new String[] {"N  ", "B  ", "B  "});
		//Yag nose:
		Recipes.makeYagNoseRecipe(this, "yaganese_nose", YagItems.createYagNose(), new String[] {"DBD", "BNB", "DBD"});
		//Gucci belt buckle:
		Recipes.makeBeltBuckleRecipe(this,  "gucci_belt_buckle", YagItems.createGucciBeltBuckle(), new String[] {"   ", "DND", "   "});
		Recipes.makeBeltBuckleRecipe(this,  "gucci_belt_buckle_alt", YagItems.createGucciBeltBuckle(), new String[] {"DND", "   ", "   "});
		Recipes.makeBeltBuckleRecipe(this,  "gucci_belt_buckle_alt0", YagItems.createGucciBeltBuckle(), new String[] {"   ", "   ", "DND"});
		//Yag helmet
		Recipes.makeYagHelmetRecipe(this, "yagaganese_helmet", YagItems.createYagHelmet(), new String[] {"YBY", "Y Y", "   "});
		Recipes.makeYagHelmetRecipe(this, "yagaganese_helmet_alt", YagItems.createYagHelmet(), new String[] {"   ", "YBY", "Y Y"});
		//Yag chestplate
		Recipes.makeYagChestplateRecipe(this,  "yaganese_chestplate", YagItems.createYagChestplate(), new String[] {"Y Y","YBY","YYY"});
		//Yag leggings:
		Recipes.makeYagLeggingsRecipe(this, "yaganese_leggings", YagItems.createYagLeggings(), new String[] {"BGB", "Y Y", "Y Y"});
		//Yag boots:
		Recipes.makeYagBootsRecipe(this, "yaganese_boots", YagItems.createYagBoots(), new String[] {"L L", "Y Y", "   "});
		Recipes.makeYagBootsRecipe(this, "yaganese_boots_alt", YagItems.createYagBoots(), new String[] {"   ", "L L", "Y Y"});
		//Yag crossbow:
		Recipes.makeYagBowRecipe(this, "yaganese_crossbow", YagItems.createYagCrossBow(), new String[] {"SYS", "TWT", " S "});
		// --------------------------------------------------------------------------------------------
	}
	public void onDisable()
	{
		System.out.println("YAGOLOGY plugin disabling...");
	}
}
