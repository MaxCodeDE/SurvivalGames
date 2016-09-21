package me.MaxCode.Manager;

import java.util.ArrayList;

import org.bukkit.Location;

public class ChestManager {

	
	
	
	/*
	 * 
	 * 
	 * Wird nicht benutzt!
	 * Array ist in ChestEvents.java
	 * 
	 * 
	 */
	
	
	
	public ArrayList<Location> chests = new ArrayList<Location>();
	
	
	public void clearChestArray() {
		chests.clear();
	}
	
	public void addChest(Location loc) {
		chests.add(loc);
	}
	
	public boolean hasOpenChestBefore(Location loc) {
		if (chests.contains(loc)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
}
