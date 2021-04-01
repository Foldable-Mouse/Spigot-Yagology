package foldable.technique.squid;

import java.util.ArrayList;
import java.util.Collection;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
/*================================([     EVENTS     ])===============================*/
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
public class Events implements Listener
{	
	@EventHandler
	public void onPlayerDeathEvent(PlayerDeathEvent e)
	{
		// Handling the death of player by username Yaganese having chance to drop yag-nose
		if(e.getEntity().getName().equals("Yaganese"))
		{
			int rand = (int) (Math.random() * 10000); // .1% chance that yaganese drops yagnose
			if(rand == 0)
			{
				YagItems.dropYagNose(e.getEntity().getLocation(), e.getEntity());
			}
		}
	}
	
	@EventHandler
	public void onPrepareItemEnchantEvent(PrepareItemEnchantEvent e) throws InterruptedException
	{
		// Handling the level 1000 ultimate YAGANESE BREAD enchanting process: 
		if(e.getEnchanter().getExpToLevel() >= 1000) // If the player has at least 1000 levels
		{
			if(e.getItem() != null && (e.getItem().isSimilar(new ItemStack(Material.BREAD)))
					|| e.getItem().isSimilar(new ItemStack(YagItems.createSemiYagBread(1)))) // If the item inside is "similar to" bread
			{
				e.getItem().setAmount(0); // Making the item being enchanted disappear. 
				
				e.getEnchanter().closeInventory();
				e.getEnchanter().playSound(e.getEnchanter().getLocation(), Sound.ENTITY_ENDER_DRAGON_DEATH, 10, 10);
				//Take the player's experience:
				e.getEnchanter().giveExp(-4339720); // 4339720 is 1000 levels in xp. Works well enough for me. 
				YagItems.dropYagBread(e.getEnchantBlock().getLocation(), e.getEnchanter());
			}
		}
	}
	
	// Used to make YAG-BREAD fill entire hunger bar
	// And to give special effects like a golden apple
	@EventHandler
	public void onFoodLevelChangeEvent(FoodLevelChangeEvent e)
	{
		if(e.getItem() != null && e.getItem().isSimilar(new ItemStack(YagItems.createYagBread())))
		{
			// If YAG BREAD is consumed:
			e.setFoodLevel(20); // Gives full food
			Collection<PotionEffect> effects = new ArrayList<PotionEffect>();
			// Duration is stored as ticks
			// Amplifier intensity starts at 0 
			// PotionEffect(PotionEffectType type, int durationTicks, int amplifier)
			// 18,000 ticks = 15 minutes
			effects.add(new PotionEffect(PotionEffectType.ABSORPTION, 18000, 4));
			effects.add(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 18000, 0));
			effects.add(new PotionEffect(PotionEffectType.REGENERATION, 18000, 2));
			effects.add(new PotionEffect(PotionEffectType.GLOWING, 18000, 0));
			effects.add(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 18000, 4));
			effects.add(new PotionEffect(PotionEffectType.FAST_DIGGING, 18000, 2));
			e.getEntity().addPotionEffects(effects);
			
		}
		if(e.getItem() != null && e.getItem().isSimilar(new ItemStack(YagItems.createSemiYagBread(1))))
		{
			// Makes weirdly crafted yag breads award more hunger
			e.setFoodLevel(e.getFoodLevel() + 1);
		}
	}
}
