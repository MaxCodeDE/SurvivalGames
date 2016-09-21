package me.MaxCode.Manager;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

	
	
	
	
	public int getMaxSpieler() {
	
		FileConfiguration cfg = YAMLManager.config;
		
		int maxSpieler = cfg.getInt("Config." + "Max-Spieler");
		
		return maxSpieler;
	}
	
	public int getMinSpieler() {
		
		FileConfiguration cfg = YAMLManager.config;
		
		int minSpieler = cfg.getInt("Config." + "Min-Spieler");
		
		return minSpieler;
	}
	
	public int getMaxArenaPos() {
		
		FileConfiguration cfg = YAMLManager.arena;
		
		int arenaPos = 0;
		
		for (@SuppressWarnings("unused") String arena : cfg.getConfigurationSection("Arena.").getKeys(false)) {
			arenaPos++;
		}

		return arenaPos;
	}
	
	
	
	
}
