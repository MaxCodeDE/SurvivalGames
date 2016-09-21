package me.MaxCode.Events;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class ChestEvents implements Listener {
	
	
	private ArrayList<Location> chests = new ArrayList<Location>();
	
	
	@EventHandler
    public void chestOpen(PlayerInteractEvent event) {
       
    if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
    if (event.getClickedBlock().getType() == Material.CHEST) {
    Location locchest = event.getClickedBlock().getLocation();
    Chest chest = (Chest) locchest.getBlock().getState();
    
    if (!chests.contains(locchest)) {

	    ArrayList<ItemStack> sgitems = new ArrayList<ItemStack>();
	
	    chest.getBlockInventory().clear();
	    
	    //Items
		sgitems.add(new ItemStack(Material.WOOD_SWORD));
		sgitems.add(new ItemStack(Material.BOW));
		sgitems.add(new ItemStack(Material.ARROW));
		sgitems.add(new ItemStack(Material.ARROW, 2));
		sgitems.add(new ItemStack(Material.ARROW, 4));
		sgitems.add(new ItemStack(Material.ARROW, 5));
		sgitems.add(new ItemStack(Material.ARROW, 10));
		sgitems.add(new ItemStack(Material.BREAD));
		sgitems.add(new ItemStack(Material.STONE_SWORD));
		sgitems.add(new ItemStack(Material.IRON_SWORD));
		sgitems.add(new ItemStack(Material.IRON_INGOT));
		sgitems.add(new ItemStack(Material.IRON_INGOT, 2));
		sgitems.add(new ItemStack(Material.STICK));
		sgitems.add(new ItemStack(Material.STICK, 2));
		sgitems.add(new ItemStack(Material.STICK, 3));
		sgitems.add(new ItemStack(Material.APPLE));
		sgitems.add(new ItemStack(Material.APPLE));
		sgitems.add(new ItemStack(Material.APPLE));
		sgitems.add(new ItemStack(Material.APPLE));
		sgitems.add(new ItemStack(Material.APPLE));
		sgitems.add(new ItemStack(Material.WOOD_AXE));
		sgitems.add(new ItemStack(Material.PORK));
		sgitems.add(new ItemStack(Material.PORK));
		sgitems.add(new ItemStack(Material.PORK));
		sgitems.add(new ItemStack(Material.PORK));
		sgitems.add(new ItemStack(Material.IRON_AXE));
		sgitems.add(new ItemStack(Material.DIAMOND_AXE));
		sgitems.add(new ItemStack(Material.DIAMOND));
		sgitems.add(new ItemStack(Material.STICK));
		sgitems.add(new ItemStack(Material.MUSHROOM_SOUP));
		sgitems.add(new ItemStack(Material.GOLDEN_APPLE));
		sgitems.add(new ItemStack(Material.SNOW_BALL, 5));
		sgitems.add(new ItemStack(Material.FISHING_ROD));
		sgitems.add(new ItemStack(Material.FISHING_ROD));
		sgitems.add(new ItemStack(Material.FISHING_ROD));
		sgitems.add(new ItemStack(Material.FISHING_ROD));
		sgitems.add(new ItemStack(Material.RAW_FISH));
		sgitems.add(new ItemStack(Material.RAW_FISH));
		sgitems.add(new ItemStack(Material.RAW_FISH));
		sgitems.add(new ItemStack(Material.RAW_CHICKEN));
		sgitems.add(new ItemStack(Material.RAW_CHICKEN));
		sgitems.add(new ItemStack(Material.RAW_CHICKEN));
		sgitems.add(new ItemStack(Material.RAW_CHICKEN));
		sgitems.add(new ItemStack(Material.RAW_BEEF));
		sgitems.add(new ItemStack(Material.RAW_BEEF));
		sgitems.add(new ItemStack(Material.ROTTEN_FLESH));
		sgitems.add(new ItemStack(Material.ROTTEN_FLESH));
		sgitems.add(new ItemStack(Material.ROTTEN_FLESH));
		sgitems.add(new ItemStack(Material.ROTTEN_FLESH));
		sgitems.add(new ItemStack(Material.COOKIE, 5));
		sgitems.add(new ItemStack(Material.EXP_BOTTLE));
		sgitems.add(new ItemStack(Material.EXP_BOTTLE, 3));
		sgitems.add(new ItemStack(Material.EXP_BOTTLE, 5));
		sgitems.add(new ItemStack(Material.EXP_BOTTLE, 6));
		sgitems.add(new ItemStack(Material.WOOD_SWORD));
		sgitems.add(new ItemStack(Material.WOOD_SWORD));
		sgitems.add(new ItemStack(Material.WOOD_SWORD));
		sgitems.add(new ItemStack(Material.WOOD_SWORD));
		
		//Ruestung
		sgitems.add(new ItemStack(Material.LEATHER_HELMET));
		sgitems.add(new ItemStack(Material.LEATHER_CHESTPLATE));
		sgitems.add(new ItemStack(Material.LEATHER_LEGGINGS));
		sgitems.add(new ItemStack(Material.LEATHER_BOOTS));
		sgitems.add(new ItemStack(Material.LEATHER_HELMET));
		sgitems.add(new ItemStack(Material.LEATHER_CHESTPLATE));
		sgitems.add(new ItemStack(Material.LEATHER_LEGGINGS));
		sgitems.add(new ItemStack(Material.LEATHER_BOOTS));
		sgitems.add(new ItemStack(Material.LEATHER_HELMET));
		sgitems.add(new ItemStack(Material.LEATHER_CHESTPLATE));
		sgitems.add(new ItemStack(Material.LEATHER_LEGGINGS));
		sgitems.add(new ItemStack(Material.LEATHER_BOOTS));
		sgitems.add(new ItemStack(Material.LEATHER_HELMET));
		sgitems.add(new ItemStack(Material.LEATHER_CHESTPLATE));
		sgitems.add(new ItemStack(Material.LEATHER_LEGGINGS));
		sgitems.add(new ItemStack(Material.LEATHER_BOOTS));
		sgitems.add(new ItemStack(Material.GOLD_HELMET));
		sgitems.add(new ItemStack(Material.GOLD_CHESTPLATE));
		sgitems.add(new ItemStack(Material.GOLD_LEGGINGS));
		sgitems.add(new ItemStack(Material.GOLD_BOOTS));
		sgitems.add(new ItemStack(Material.GOLD_HELMET));
		sgitems.add(new ItemStack(Material.GOLD_CHESTPLATE));
		sgitems.add(new ItemStack(Material.GOLD_LEGGINGS));
		sgitems.add(new ItemStack(Material.GOLD_BOOTS));
		sgitems.add(new ItemStack(Material.GOLD_HELMET));
		sgitems.add(new ItemStack(Material.GOLD_CHESTPLATE));
		sgitems.add(new ItemStack(Material.GOLD_LEGGINGS));
		sgitems.add(new ItemStack(Material.GOLD_BOOTS));
		sgitems.add(new ItemStack(Material.GOLD_HELMET));
		sgitems.add(new ItemStack(Material.GOLD_CHESTPLATE));
		sgitems.add(new ItemStack(Material.GOLD_LEGGINGS));
		sgitems.add(new ItemStack(Material.GOLD_BOOTS));
		sgitems.add(new ItemStack(Material.IRON_HELMET));
		sgitems.add(new ItemStack(Material.IRON_CHESTPLATE));
		sgitems.add(new ItemStack(Material.IRON_LEGGINGS));
		sgitems.add(new ItemStack(Material.IRON_BOOTS));
		sgitems.add(new ItemStack(Material.DIAMOND_HELMET));
		sgitems.add(new ItemStack(Material.DIAMOND_CHESTPLATE));
		sgitems.add(new ItemStack(Material.DIAMOND_LEGGINGS));
		sgitems.add(new ItemStack(Material.DIAMOND_BOOTS));
		
			Random r = new Random();
			int n = 1;
			n = r.nextInt(6);
	   
		while ( n != 0) {
			   
			n--;
			Random r2 = new Random();
			
			Random r3 = new Random();
			
			int n3 = r3.nextInt(27);
			
			int n2 = r2.nextInt(sgitems.size());
			
			chest.getInventory().setItem(n3, (ItemStack)sgitems.get(n2));
	
		}
		
		
		
		chests.add(locchest);
	   	
	    sgitems.clear();
    }
    }
    }
  }
	
	
	
}
