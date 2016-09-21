package me.MaxCode.SurvivalGames;

import me.MaxCode.Ablauf.Start;
import me.MaxCode.Manager.MessageManager;
import me.MaxCode.Manager.ScoreBoardManager;
import me.MaxCode.Manager.SetupManager;
import me.MaxCode.Manager.YAMLManager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Befehle implements CommandExecutor {

	private String prefix = MessageManager.getPrefix();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		
		Player p = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("sg")) {
			
			// /sg - Zeigt Info
			if(args.length == 0) {
				p.sendMessage("");
				p.sendMessage(prefix + "SurvivalGames Befehle:");
				p.sendMessage(prefix + "/sg setPos <id> - Setzt eine Spawnposition");
				p.sendMessage(prefix + "/sg setLobby - Setzt die Lobbyposition");
				p.sendMessage(prefix + "/sg start - Startet das Spiel");
				p.sendMessage(prefix + "/sg reload - Läd YML Neu");
				
				p.sendMessage("");
			}
			
			
			// /sg setPos <id> - Setzt eine Arena Position
			if (args.length >= 2) {
				if (args[0].equalsIgnoreCase("setPos")) {

				String spawn = args[1].toLowerCase();
				if (args[1].equalsIgnoreCase(spawn)) {
				if (p.isOp()) {
					
					
					int id = Integer.parseInt(spawn);
					
					SetupManager sm = new SetupManager();
					sm.setSpawn(p.getLocation(), id);

					p.sendMessage(prefix + "Position " + id + " gesetzt!");
					
				}
				}
				}
			}
			
			
			
			
			// /sg setLobby - Setzt die Lobby
			if (args.length >= 1) {
				if (args[0].equalsIgnoreCase("setLobby")) {
				if (p.isOp()) {
						
					SetupManager sm = new SetupManager();
					sm.setLobbyLocation(p.getLocation());
					
					p.sendMessage(prefix + "Lobby gesetzt!");
	
				}
				}
			}	
			
			
			
			// /sg start - Startet die Arena
			if (args.length >= 1) {
				if (args[0].equalsIgnoreCase("start")) {
				if (p.isOp()) {

					Start start = new Start();
					start.checkPlayersAndStart();
	
				}
				}
			}	
			
			
			// /sg reload - Läd alle YAML Neu
			if (args.length >= 1) {
				if (args[0].equalsIgnoreCase("reload")) {
				if (p.isOp()) {

					YAMLManager fm = new YAMLManager();
					fm.reloadFiles();
					
					p.sendMessage(prefix + "YAML neu geladen!");
	
				}
				}
			}	
			
			
			
			// /sg startDev - Startet die Arena im Development Modus
			if (args.length >= 1) {
				if (args[0].equalsIgnoreCase("startDev")) {
				if (p.isOp()) {
					
					Start start = new Start();
					start.startDev();
					
					p.sendMessage(prefix + "SurvivalGames starten jetzt im Dev-Modus!");
					
				}
				}
			}
			
			
			// /sg info - Zeigt Info-Scoreboard
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("info")) {
					p.sendMessage(prefix + "Benutze: / sg info <an/aus>");
				}
			}
			
			
			// /sg info <an/aus> - Zeigt Info-Scoreboard
			if (args.length == 2) {
				if (args[0].equalsIgnoreCase("info")) {
					if(args[1].equalsIgnoreCase("an"))  {
						ScoreBoardManager sm = new ScoreBoardManager();
						sm.showInfoScoreboard(p);
					}
					if(args[1].equalsIgnoreCase("aus"))  {
						ScoreBoardManager sm = new ScoreBoardManager();
						sm.closeScoreboard(p);
					}
					
				}
			}
			
			
			
			
			
		}
		
		
		
		
		
		return false;
	}

	
	
	
	
}
