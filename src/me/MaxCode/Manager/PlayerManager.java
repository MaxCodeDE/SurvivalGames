package me.MaxCode.Manager;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

public class PlayerManager {

	
	private String prefix = MessageManager.getPrefix();
	
	
	public void teleportPlayerToLobby(Player p) {
		
		File file = new File("plugins/SurvivalGames/" + "Lobby.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
		World world = Bukkit.getWorld(cfg.getString("Lobby." + ".World"));
		double locX = cfg.getInt("Lobby." + ".PosX");
		double locY = cfg.getInt("Lobby." + ".PosY");
		double locZ = cfg.getInt("Lobby." + ".PosZ");
		float yaw = cfg.getInt("Lobby." + ".Yaw");
		float pitch = cfg.getInt("Lobby." + ".Pitch");
		Location loc = new Location(world, locX, locY, locZ, yaw, pitch);
	
		p.teleport(loc);
		p.sendMessage(prefix + "Du bist jetzt in der Lobby!");
		
		
	}
	
	
	
	public void clearInventory(Player p) {
		p.setNoDamageTicks(0);
		p.setFireTicks(0);
		p.setFoodLevel(20);
		p.setLevel(0);
		p.setHealth(20);
		p.setLevel(0);
		p.getInventory().clear();
		p.updateInventory();
		p.getInventory().setHelmet(null);
		p.getInventory().setLeggings(null);
		p.getInventory().setChestplate(null);
		p.getInventory().setBoots(null);
		
		if (p.getActivePotionEffects() != null) {
			for (PotionEffect pe : p.getActivePotionEffects()) {
				p.removePotionEffect(pe.getType());
			}
		}
	}
	
	
	public void teleportPlayerToArena(Player p, int arenaPosId) {
		
		File file = new File("plugins/SurvivalGames/" + "Arena.yml");
		FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
		World world = Bukkit.getWorld(cfg.getString("Arena." + arenaPosId + ".World"));
		double locX = cfg.getInt("Arena." + arenaPosId + ".PosX");
		double locY = cfg.getInt("Arena." + arenaPosId + ".PosY");
		double locZ = cfg.getInt("Arena." + arenaPosId + ".PosZ");
		float yaw = cfg.getInt("Arena." + arenaPosId + ".Yaw");
		float pitch = cfg.getInt("Arena." + arenaPosId + ".Pitch");
		Location loc = new Location(world, locX, locY, locZ, yaw, pitch);
	
		p.teleport(loc);
		p.sendMessage(prefix + "Du bist jetzt in der Arena!");
		
	}
	
	
	
	
}
