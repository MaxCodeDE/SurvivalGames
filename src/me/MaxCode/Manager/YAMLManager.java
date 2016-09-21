package me.MaxCode.Manager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class YAMLManager {

	
	public static FileConfiguration lobby;
	public static FileConfiguration arena;
	public static FileConfiguration config;
	
	
	public void setupFiles() {
		
		File file1 = new File("plugins/SurvivalGames/" + "Lobby.yml");
		lobby = YamlConfiguration.loadConfiguration(file1);
		
		File file2 = new File("plugins/SurvivalGames/" + "Arena.yml");
		arena = YamlConfiguration.loadConfiguration(file2);
		
		File file3 = new File("plugins/SurvivalGames/" + "Config.yml");
		config = YamlConfiguration.loadConfiguration(file3);
		
		
		
	}
	
	public void reloadFiles() {
		setupFiles();
	}
	
	
	public void checkFiles() {
		
		ArrayList<String> daten = new ArrayList<String>();
		
		daten.add("Lobby.yml");
		daten.add("Arena.yml");
		daten.add("Config.yml");
		
		for (String s : daten) {
			
			
			File file = new File("plugins/SurvivalGames/" + s);
			FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
			
			if (!file.exists()) {
				try {
					cfg.save(file);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
				if (file.getName().equals("Lobby.yml")) {
					this.lobbyBeschreiben();
				}
				if (file.getName().equals("Arena.yml")) {
					this.arenaBeschreiben();
				}
				if (file.getName().equals("Config.yml")) {
					this.configBeschreiben();
				}
				
				
				
			} 

		}
		
		
		
	}
	
	
	
	private void lobbyBeschreiben() {
		
		
		File file = new File("plugins/SurvivalGames/" + "Lobby.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
		
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private void arenaBeschreiben() {
		
		
		File file = new File("plugins/SurvivalGames/" + "Arena.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
		
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void configBeschreiben() {
		
		
		File file = new File("plugins/SurvivalGames/" + "Config.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
		
		
		cfg.set("Config." + "Max-Spieler", 24);
		cfg.set("Config." + "Min-Spieler", 1);
		cfg.set("Config." + "Scoreboard-Info anzeigen", "an");
		
		try {
			cfg.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
