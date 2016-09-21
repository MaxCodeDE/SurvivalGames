package me.MaxCode.SurvivalGames;

import me.MaxCode.Events.ChestEvents;
import me.MaxCode.Events.MoveEvents;
import me.MaxCode.Events.PlayerEvents;
import me.MaxCode.Manager.YAMLManager;
import me.MaxCode.Manager.MessageManager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SurvivalGames extends JavaPlugin {

	
	private String prefix = MessageManager.getPrefix();
	
	public void onEnable() {
		
		System.out.println(prefix + "SurvivalGames erfolgreich geladen!");
		
		YAMLManager fm = new YAMLManager();
		fm.setupFiles();
		fm.checkFiles();
		
		this.getCommand("sg").setExecutor(new Befehle());
		
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PlayerEvents(), this);
		pm.registerEvents(new ChestEvents(), this);
		pm.registerEvents(new MoveEvents(), this);
		
		
	}
	
	
	
	
	
	public void onDisable() {
		System.out.println(prefix + "Gestopt!");
	}
	
	
	
	
	
	
	
	
}
