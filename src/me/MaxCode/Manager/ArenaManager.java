package me.MaxCode.Manager;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ArenaManager {

	
	
	
	public void teleportAllPlayerToArena() {
		
		int arenaPosId = 0;
		ConfigManager cm = new ConfigManager();
		
		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
			PlayerManager pm = new PlayerManager();
			pm.teleportPlayerToArena(p, arenaPosId);
			arenaPosId++;
			if (arenaPosId >= cm.getMaxArenaPos()) {
				break;
			}
		}

	}
	
	
	public void clearInventoryFromAllPlayers() {
		
		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
			PlayerManager pm = new PlayerManager();
			pm.clearInventory(p);
		}
		
	}
	
	
	
}
