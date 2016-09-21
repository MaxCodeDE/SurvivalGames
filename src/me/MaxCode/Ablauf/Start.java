package me.MaxCode.Ablauf;

import java.util.Timer;
import java.util.TimerTask;

import me.MaxCode.Manager.ArenaManager;
import me.MaxCode.Manager.ConfigManager;
import me.MaxCode.Manager.MessageManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Start {

	private int countdown = 30;
	private String prefix = MessageManager.getPrefix();
	
	
	public void checkPlayersAndStart() {
		
		Bukkit.broadcastMessage(prefix + "SurvivalGames starten gleich!");
		
		ConfigManager cm = new ConfigManager();
		if (Bukkit.getServer().getOnlinePlayers().size() <= cm.getMinSpieler()) {
			this.startCountdown();
		} 
		
		
	}
	
	
	private void startCountdown() {
		
		
				for (Player p : Bukkit.getServer().getOnlinePlayers()) {	
					if (countdown == 30) {
						p.sendMessage(prefix + "In " + countdown + " sekunden geht es los!");
					}
					if (countdown == 15) {
						p.sendMessage(prefix + "In " + countdown + " sekunden geht es los!");
						ArenaManager am = new ArenaManager();
						am.teleportAllPlayerToArena();
					}
					if (countdown <= 10) {
						p.sendMessage(prefix + "In " + countdown + " sekunden geht es los!");
					}
					p.setLevel(countdown);
				}
		
			countdown --;
			
			
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					
					if (countdown == 0) {
						ArenaManager ae = new ArenaManager();
						ae.clearInventoryFromAllPlayers();
						startArena();
					} else {
						startCountdown();
					}
				}
				
			
		}, 1000); //1000 Tickts = 1 Sekunde
		
	}
	
	
	
	
	
	
	public void startDev() {
		Bukkit.broadcastMessage(prefix + "SurvivalGames starten gleich!");
		countdown = 5;
		startCountdown();
		ArenaManager am = new ArenaManager();
		am.teleportAllPlayerToArena();
	}
	
	
	
	public void startArena() {
		
		ConfigManager cm = new ConfigManager();
		if (Bukkit.getServer().getOnlinePlayers().size() >= cm.getMinSpieler()) {
			
			
		
			Bukkit.broadcastMessage(prefix + "SurvivalGames starten jetzt!");
			
		} else {
			Bukkit.broadcastMessage(prefix + "Zuwenig Spieler!");
		}
		
		
	}
	
	
}
