package me.MaxCode.Manager;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreBoardManager {

	private String prefix = MessageManager.getPrefix();
	
	
	public void showInfoScoreboard(Player p) {
		
		FileConfiguration cfg = YAMLManager.config;
		if (cfg.get("Config." + "Scoreboard-Info anzeigen").equals("an")) {
			
			
		
			ScoreboardManager m = Bukkit.getScoreboardManager();
			
			Scoreboard b = m.getNewScoreboard();
			
			Objective o = b.registerNewObjective("test", "test2");
			
			o.setDisplayName(prefix);
			o.setDisplaySlot(DisplaySlot.SIDEBAR);
			
			//Freie zeile
			Score s0 = o.getScore("");
			s0.setScore(4);
			
			
			//Kontostand
			String status = ""; //TODO
			Score s1 = o.getScore(ChatColor.GRAY + "Status: " + ChatColor.RED + status);
			s1.setScore(3);
			
			
			
			
			
			
			
			
			p.setScoreboard(b);
			
			p.sendMessage(prefix + "Info wird jetzt angezeigt!");
		
		} else {
			p.sendMessage(prefix + "Die Info ist zurzeit deaktiviert!");
		}
		
		
	}
	
	
	
	
	
	public void closeScoreboard(Player p) {
		p.getScoreboard().clearSlot(DisplaySlot.SIDEBAR);
		p.sendMessage(prefix + "Info wird jetzt nichtmehr angezeigt!");
	}
	
	
	
}

