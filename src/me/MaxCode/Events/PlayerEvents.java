package me.MaxCode.Events;

import me.MaxCode.Manager.MessageManager;
import me.MaxCode.Manager.PlayerManager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerEvents implements Listener {

	
	private String prefix = MessageManager.getPrefix();
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		
		p.sendMessage(prefix + "Willkommen bei SurvivalGames!");
		
		PlayerManager am = new PlayerManager();
		am.teleportPlayerToLobby(p);
		am.clearInventory(p);

		
		
	}
	
	
	
}
