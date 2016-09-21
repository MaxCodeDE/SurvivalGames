package me.MaxCode.Manager;

import java.io.File;
import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class SetupManager {

	
	
	public void setLobbyLocation(Location loc) {
		File file = new File("plugins/SurvivalGames/" + "Lobby.yml");
		FileConfiguration lobby = YamlConfiguration.loadConfiguration(file);
		
		lobby.addDefault("Lobby." + ".World", 0);
		lobby.addDefault("Lobby." + ".PosX", 0);
		lobby.addDefault("Lobby." + ".PosY", 0);
		lobby.addDefault("Lobby." + ".PosZ", 0);
		lobby.addDefault("Lobby." + ".Yaw", 0);
		lobby.addDefault("Lobby." + ".Pitch", 0);
		
		String world = loc.getWorld().getName();
		double PosX = loc.getX();
		double PosY = loc.getY();
		double PosZ = loc.getZ();
		float yaw = loc.getYaw();
		float pitch = loc.getPitch();
		
		lobby.set("Lobby." + ".World", world);
		lobby.set("Lobby." + ".PosX", PosX);
		lobby.set("Lobby." + ".PosY", PosY);
		lobby.set("Lobby." + ".PosZ", PosZ);
		lobby.set("Lobby." + ".Yaw", yaw);
		lobby.set("Lobby." + ".Pitch", pitch);
		try {
			lobby.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void setSpawn(Location loc, int id) {
		File file = new File("plugins/SurvivalGames/" + "Arena.yml");
		FileConfiguration arena = YamlConfiguration.loadConfiguration(file);
		try {
			arena.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		arena.addDefault("Arena." + id + ".World", 0);
		arena.addDefault("Arena." + id + ".PosX", 0);
		arena.addDefault("Arena." + id + ".PosY", 0);
		arena.addDefault("Arena." + id + ".PosZ", 0);
		arena.addDefault("Arena." + id + ".Yaw", 0);
		arena.addDefault("Arena." + id + ".Pitch", 0);
		
		String world = loc.getWorld().getName();
		double PosX = loc.getX();
		double PosY = loc.getY();
		double PosZ = loc.getZ();
		float yaw = loc.getYaw();
		float pitch = loc.getPitch();
		
		arena.set("Arena." + id + ".World", world);
		arena.set("Arena." + id + ".PosX", PosX);
		arena.set("Arena." + id + ".PosY", PosY);
		arena.set("Arena." + id + ".PosZ", PosZ);
		arena.set("Arena." + id + ".Yaw", yaw);
		arena.set("Arena." + id + ".Pitch", pitch);
		try {
			arena.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
