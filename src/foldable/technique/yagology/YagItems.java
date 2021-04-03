package foldable.technique.yagology;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
/*================================([    YAG-ITEMS    ])==============================*/
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
public class YagItems
{
	public static ItemStack createYagNose()
	{
		ItemStack is = new ItemStack(Material.BRICK);
		ItemMeta im = is.getItemMeta();
		//im.setDisplayName("OFFICIAL YAG-NOSE");
		im.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&5&k!!!&r &d&lOFFICIAL YAG-NOSE &5&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Dropped by: Yaganese (NOT STEVE)");
		im.setLore(lore);
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		is.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
		is.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		is.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 10);
		return is;
	}
	public static void giveYagNose(Player p)
	{
		p.getInventory().addItem(createYagNose());
	}
	public static void dropYagNose(Location loc, Player yag)
	{
		yag.getWorld().dropItem(loc.add(0,1,0), createYagNose());
	}
	
	public static ItemStack createYagBread()
	{
		ItemStack is = new ItemStack(Material.BREAD);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&k!!!&r &b&lOFFICIAL YAG-BREAD &9&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("OFFICIAL YAGANESE BREAD (NOT REGULAR BREAD)");
		im.setLore(lore);
		is.setItemMeta(im);
		
		//Add unsafeEnchants here:
		is.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		is.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10);
		is.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 10);
		is.addUnsafeEnchantment(Enchantment.MENDING, 1);
		is.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		is.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE, 3);
		
		return is;
	}
	public static void giveYagBread(Player p)
	{
		p.getInventory().addItem(createYagBread());
	}
	public static void dropYagBread(Location loc, Player p)
	{
		p.getWorld().dropItem(loc.add(0,1,0), createYagBread());
	}
	public static ItemStack createSemiYagBread(int amount)
	{
		ItemStack breadItem = new ItemStack(Material.BREAD);
		ItemMeta breadIm = breadItem.getItemMeta();		
		
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Bonus 0.5 saturation per bread");
		
		breadIm.setLore(lore);
		breadItem.setItemMeta(breadIm);
		breadItem.setAmount(amount);
		return breadItem;
	}
	public static ItemStack createYaganesePickaxe()
	{
		ItemStack yagPick = new ItemStack(Material.GOLDEN_PICKAXE);
		ItemMeta pickIm = yagPick.getItemMeta();
		pickIm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &e&lYaganese Pickaxe&r &6&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Yagologician approved.");
		pickIm.setLore(lore);
		
		yagPick.setItemMeta(pickIm);
		yagPick.setAmount(1);
		
		yagPick.addUnsafeEnchantment(Enchantment.DIG_SPEED, 8);
		yagPick.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		yagPick.addUnsafeEnchantment(Enchantment.MENDING, 1);
		yagPick.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 5);
		
		return yagPick;
	}
	public static ItemStack createYaganeseSword()
	{
		ItemStack yagSword = new ItemStack(Material.GOLDEN_SWORD);
		ItemMeta swordIm = yagSword.getItemMeta();
		swordIm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &e&lYaganese Sword&r &6&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Manufactured by © The Foldable Technique™");
		lore.add("(get that)");
		swordIm.setLore(lore);
		yagSword.setItemMeta(swordIm);
		yagSword.setAmount(1);
		
		yagSword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 25);
		yagSword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 3);
		yagSword.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		yagSword.addUnsafeEnchantment(Enchantment.KNOCKBACK, 3);
		yagSword.addUnsafeEnchantment(Enchantment.MENDING, 1);
		yagSword.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
		
		return yagSword;
	}
	public static ItemStack createYaganeseAxe()
	{
		ItemStack yagAxe = new ItemStack(Material.GOLDEN_AXE);
		ItemMeta axeIm = yagAxe.getItemMeta();
		axeIm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &e&lYaganese Axe&r &6&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Yaggalations");
		axeIm.setLore(lore);
		yagAxe.setItemMeta(axeIm);
		yagAxe.setAmount(1);
		
		yagAxe.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 15);
		yagAxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 7);
		yagAxe.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		yagAxe.addUnsafeEnchantment(Enchantment.MENDING, 1);
		
		return yagAxe;
	}
	public static ItemStack createYaganeseShovel()
	{
		ItemStack yagShovel = new ItemStack(Material.GOLDEN_SHOVEL);
		ItemMeta shovelIm = yagShovel.getItemMeta();
		shovelIm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &e&lYaganese Shovel&r &6&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("YAGOLOGICIAN-IN-TRAINING");
		shovelIm.setLore(lore);
		yagShovel.setItemMeta(shovelIm);
		yagShovel.setAmount(1);
		
		yagShovel.addUnsafeEnchantment(Enchantment.DIG_SPEED, 5);
		yagShovel.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		yagShovel.addUnsafeEnchantment(Enchantment.MENDING, 1);
		yagShovel.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10);
		
		return yagShovel;
	}
	public static ItemStack createGucciBeltBuckle()
	{
		ItemStack beltBuckle = new ItemStack(Material.CLOCK);
		ItemMeta buckleIm = beltBuckle.getItemMeta();
		buckleIm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&2&k!!!&r &a&lGucci Belt Buckle&r &2&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Chanel, Balenciaga, Louis Vuitton");
		buckleIm.setLore(lore);
		beltBuckle.setItemMeta(buckleIm);
		beltBuckle.setAmount(1);
		
		beltBuckle.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 10);
		return beltBuckle;
	}
	public static ItemStack createYagHelmet()
	{
		ItemStack yagHelmet = new ItemStack(Material.TURTLE_HELMET);
		ItemMeta meta = yagHelmet.getItemMeta();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &e&lYagologician's Helmet&r &6&k!!!"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("SWORDFISH (NO WAY)");
		meta.setLore(lore);
		yagHelmet.setItemMeta(meta);
		yagHelmet.setAmount(1);
		
		yagHelmet.addUnsafeEnchantment(Enchantment.DURABILITY, 2750);
		yagHelmet.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 35);
		yagHelmet.addUnsafeEnchantment(Enchantment.MENDING, 1);
		yagHelmet.addUnsafeEnchantment(Enchantment.OXYGEN, 5);
		yagHelmet.addUnsafeEnchantment(Enchantment.WATER_WORKER, 5);
		
		return yagHelmet;
		
	}
	public static ItemStack createYagChestplate()
	{
		ItemStack yagChestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) yagChestplate.getItemMeta();
		leatherMeta.setColor(Color.WHITE);
		leatherMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &e&lYagologician's Chestplate&r &6&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Bread at the heart");
		leatherMeta.setLore(lore);
		yagChestplate.setItemMeta(leatherMeta);
		yagChestplate.setAmount(1);
		
		yagChestplate.addUnsafeEnchantment(Enchantment.DURABILITY, 2850);
		yagChestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 35);
		yagChestplate.addUnsafeEnchantment(Enchantment.MENDING, 1);
		yagChestplate.addUnsafeEnchantment(Enchantment.THORNS, 5);
		
		return yagChestplate;
	}
	public static ItemStack createYagLeggings()
	{
		ItemStack yagLeggings = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) yagLeggings.getItemMeta();
		leatherMeta.setColor(Color.WHITE);
		leatherMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &E&lYagologician's Leggings&r &6&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("WHO CAN'T CRAFT AN ANVIL???");
		leatherMeta.setLore(lore);
		yagLeggings.setItemMeta(leatherMeta);
		yagLeggings.setAmount(1);
		
		yagLeggings.addUnsafeEnchantment(Enchantment.DURABILITY, 2850);
		yagLeggings.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 35);
		yagLeggings.addUnsafeEnchantment(Enchantment.MENDING, 1);
		yagLeggings.addUnsafeEnchantment(Enchantment.THORNS, 5);
		
		return yagLeggings;
	}
	public static ItemStack createYagBoots()
	{
		ItemStack yagBoots = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta leatherMeta = (LeatherArmorMeta) yagBoots.getItemMeta();
		leatherMeta.setColor(Color.ORANGE);
		leatherMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &e&lYagologician's Timbs&r &6&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("TWITCH STREAMER LARGOCARGO44136(7) CONFIRMED");
		leatherMeta.setLore(lore);
		yagBoots.setItemMeta(leatherMeta);
		yagBoots.setAmount(1);
		
		yagBoots.addUnsafeEnchantment(Enchantment.DURABILITY, 2750);
		yagBoots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 35);
		yagBoots.addUnsafeEnchantment(Enchantment.MENDING, 1);
		yagBoots.addUnsafeEnchantment(Enchantment.SOUL_SPEED, 3);
		yagBoots.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 5);
		yagBoots.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 3);
		
		return yagBoots;
	}
	public static ItemStack createYagCrossBow()
	{
		ItemStack yagBow = new ItemStack(Material.CROSSBOW);
		ItemMeta bowMeta = yagBow.getItemMeta();
		bowMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6&k!!!&r &e&lYagologician's Crossbow&r &6&k!!!&r"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("This is a robbery, Jason said.");
		lore.add("A man went to Microcenter");
		lore.add("for a certain GPU.");
		lore.add("He got a defective ");
		lore.add("AMD Sapphire RX5700XT instead");
		lore.add("of a 2070 super, which is the");
		lore.add("\"equivalent\" of the 2070 super.");
		bowMeta.setLore(lore);
		yagBow.setItemMeta(bowMeta);
		yagBow.setAmount(1);
		
		yagBow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 10);
		yagBow.addUnsafeEnchantment(Enchantment.PIERCING, 5);
		yagBow.addUnsafeEnchantment(Enchantment.MULTISHOT, 3);
		yagBow.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		yagBow.addUnsafeEnchantment(Enchantment.MENDING, 1);
		yagBow.addUnsafeEnchantment(Enchantment.QUICK_CHARGE, 3);
		
		return yagBow;
	}
	public static ItemStack createBackFeather()
	{
		ItemStack backFeather = new ItemStack(Material.FEATHER);
		ItemMeta meta = backFeather.getItemMeta();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lGo back"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Return to recipes");
		meta.setLore(lore);
		backFeather.setItemMeta(meta);
		return backFeather;
	}
	public static ItemStack createCreditBook()
	{
		ItemStack creditBook = new ItemStack(Material.BOOK);
		ItemMeta meta = creditBook.getItemMeta();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&oThe Foldable Technique"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("Developed by Foldable Mouse");
		lore.add("");
		lore.add("                .-=+++++++.             ");
		lore.add("             -*@%-.        :*#:           ");
		lore.add("          .*%#%@.             :@-          ");
		lore.add("         .%###%+  -==.     .=%@.         ");
		lore.add("         *####%- -@@@   *@@@+         ");
		lore.add("         %####%-  ---:    .:-#+         ");
		lore.add("         *%###%*       =#*   *+         ");
		lore.add("         :@####@=     +@%   #-         ");
		lore.add("          +%####%+.          .@.         ");
		lore.add("          :@######@*=-:.  .##          ");
		lore.add("          .@######%*@%#%%%%@:          ");
		lore.add("          =%#####@. -@#####@+          ");
		lore.add("         .%#####@-   *%#####@.         ");
		lore.add("        .%#####%:       .@#####%+         ");
		lore.add("       =@####%+       +@#####%         ");
		lore.add("      *@%%%%@@*+=.    .@@%%%%%%##*+.   ");
		lore.add("     +%          .-%=     @#            .@+   ");
		lore.add("     :#*++++++++*#-    -%#*+===+*#+    ");
		meta.setLore(lore);
		creditBook.setItemMeta(meta);
		return creditBook;
	}
}
