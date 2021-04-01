package foldable.technique.squid;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
/*================================([    CHESTGUI    ])===============================*/
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
public class ChestGUI implements Listener
{
	public final Inventory inv;
	public Inventory recipeInv;
	public ChestGUI()
	{
		inv = Bukkit.createInventory(null,  18, ChatColor.translateAlternateColorCodes('&', "&e&lYagology GUI"));
		initializeItems();
	}
	public ChestGUI(Player p)
	{
		// Initialize inv, with nine slots:
		inv = Bukkit.createInventory(p, 18, ChatColor.translateAlternateColorCodes('&', "&e&lYagology GUI"));
		// Initializing the inventory (putting items in it)
		initializeItems();
	}
	
	public void initializeItems()
	{
		inv.addItem(YagItems.createYagHelmet());
		inv.addItem(YagItems.createYagChestplate());
		inv.addItem(YagItems.createYagLeggings());
		inv.addItem(YagItems.createYagBoots());
		inv.addItem(YagItems.createYaganeseSword());
		inv.addItem(YagItems.createYaganesePickaxe());
		inv.addItem(YagItems.createYaganeseAxe());
		inv.addItem(YagItems.createYaganeseShovel());
		inv.addItem(YagItems.createGucciBeltBuckle());
		inv.addItem(YagItems.createYagCrossBow());
		inv.addItem(YagItems.createYagNose());
		inv.setItem(17, YagItems.createCreditBook());
	}
	
	// Conveniently adds items on the spot to be added into the GUI. 
	protected ItemStack createGuiItem(final Material material, final String name, final String... lore)
	{
		final ItemStack item = new ItemStack(material, 1);
		final ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
		meta.setLore(Arrays.asList(lore));
		item.setItemMeta(meta);
		return item;
	}
	
	// Opens GUI inventory for player
	public void openInventory(final HumanEntity ent)
	{
		ent.openInventory(inv);
	}
	// Opens recipe GUI for player
	public void openRecipe(final HumanEntity ent)
	{
		ent.openInventory(recipeInv);
	}
	// Checks for clicking of the items. Event handler. 
	@EventHandler
	public void onInventoryClick(final InventoryClickEvent e)
	{
		if(e.getClickedInventory() == null) return;
		if((e.getInventory().contains(YagItems.createCreditBook())) || (e.getInventory().contains(YagItems.createBackFeather())))
		{
			// Make sure that item selected is not null
			final ItemStack clickedItem = e.getCurrentItem();
			if(clickedItem == null || clickedItem.getType() == Material.AIR) return; 
			
			// Check what item was clicked, then open a new inventory for the recipe of clicked item. 
			if(clickedItem.equals(YagItems.createYagHelmet()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Helmet"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(3, YagItems.createYagNose());
				recipeInv.setItem(4, new ItemStack(Material.BREAD));
				recipeInv.setItem(5, YagItems.createYagNose());
				recipeInv.setItem(12, YagItems.createYagNose());
				recipeInv.setItem(14, YagItems.createYagNose());
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYagChestplate()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Chestplate"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(3, YagItems.createYagNose());
				recipeInv.setItem(5, YagItems.createYagNose());
				recipeInv.setItem(12, YagItems.createYagNose());
				recipeInv.setItem(13, new ItemStack(Material.BREAD));
				recipeInv.setItem(14, YagItems.createYagNose());
				recipeInv.setItem(21, YagItems.createYagNose());
				recipeInv.setItem(22, YagItems.createYagNose());
				recipeInv.setItem(23, YagItems.createYagNose());
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYagLeggings()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Leggings"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(3, new ItemStack(Material.BREAD));
				recipeInv.setItem(4, YagItems.createGucciBeltBuckle());
				recipeInv.setItem(5, new ItemStack(Material.BREAD));
				recipeInv.setItem(12, YagItems.createYagNose());
				recipeInv.setItem(14, YagItems.createYagNose());
				recipeInv.setItem(21, YagItems.createYagNose());
				recipeInv.setItem(23, YagItems.createYagNose());
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYagBoots()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Boots"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(12, new ItemStack(Material.LEATHER));
				recipeInv.setItem(14, new ItemStack(Material.LEATHER));
				recipeInv.setItem(21, YagItems.createYagNose());
				recipeInv.setItem(23, YagItems.createYagNose());
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYaganeseSword()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Sword"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(4, YagItems.createYagNose());
				recipeInv.setItem(13, YagItems.createYagNose());
				recipeInv.setItem(22, new ItemStack(Material.BLAZE_ROD));
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYagNose()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&d&lYaganese Nose"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(3, new ItemStack(Material.DIAMOND));
				recipeInv.setItem(4, new ItemStack(Material.BREAD));
				recipeInv.setItem(5, new ItemStack(Material.DIAMOND));
				recipeInv.setItem(12, new ItemStack(Material.BREAD));
				recipeInv.setItem(13, new ItemStack(Material.NETHERITE_INGOT));
				recipeInv.setItem(14, new ItemStack(Material.BREAD));
				recipeInv.setItem(21, new ItemStack(Material.DIAMOND));
				recipeInv.setItem(22, new ItemStack(Material.BREAD));
				recipeInv.setItem(23, new ItemStack(Material.DIAMOND));
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYaganesePickaxe()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Pickaxe"));
				
				// Setting the recipe to that of a Yaganese pickaxe, manually
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(3, YagItems.createYagNose());
				recipeInv.setItem(4, YagItems.createYagNose());
				recipeInv.setItem(5, YagItems.createYagNose());
				recipeInv.setItem(13, new ItemStack(Material.BLAZE_ROD));
				recipeInv.setItem(22, new ItemStack(Material.BLAZE_ROD));
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYaganeseAxe()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Axe"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(3, YagItems.createYagNose());
				recipeInv.setItem(4, YagItems.createYagNose());
				recipeInv.setItem(12, YagItems.createYagNose());
				recipeInv.setItem(13, new ItemStack(Material.BLAZE_ROD));
				recipeInv.setItem(22, new ItemStack(Material.BLAZE_ROD));
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYaganeseShovel()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Shovel"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(4, YagItems.createYagNose());
				recipeInv.setItem(13, new ItemStack(Material.BLAZE_ROD));
				recipeInv.setItem(22, new ItemStack(Material.BLAZE_ROD));
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createGucciBeltBuckle()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27, ChatColor.translateAlternateColorCodes('&', "&a&lGucci Belt Buckle"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
				
				recipeInv.setItem(12, new ItemStack(Material.DIAMOND));
				recipeInv.setItem(13, new ItemStack(Material.NETHERITE_INGOT));
				recipeInv.setItem(14, new ItemStack(Material.DIAMOND));
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createYagCrossBow()))
			{
				recipeInv = Bukkit.createInventory(e.getWhoClicked(), 27,  ChatColor.translateAlternateColorCodes('&', "&e&lYaganese Crossbow"));
				
				recipeInv.setItem(18, YagItems.createBackFeather());
							recipeInv.setItem(3, new ItemStack(Material.BLAZE_ROD));
				recipeInv.setItem(4, YagItems.createYagNose());
				recipeInv.setItem(5, new ItemStack(Material.BLAZE_ROD));
				recipeInv.setItem(12, new ItemStack(Material.STRING));
				recipeInv.setItem(13, new ItemStack(Material.TRIPWIRE_HOOK));
				recipeInv.setItem(14, new ItemStack(Material.STRING));
				recipeInv.setItem(22, new ItemStack(Material.BLAZE_ROD));
				
				openRecipe(e.getWhoClicked());
			}
			if(clickedItem.equals(YagItems.createBackFeather()))
			{
				openInventory(e.getWhoClicked());
			}
			e.setCancelled(true);
		}
	}
	
}
