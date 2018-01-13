package me.remastered.java;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import me.remastered.java.Commands.CustomItemCMD;
import me.remastered.java.Events.EventClass;
import me.remastered.java.Events.onInteractEvent;
import me.remastered.java.Events.onJoinEvent;
import me.remastered.java.Inventorys.CustomItemShop;
import me.remastered.java.Items.CustomItems;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		loadConfig();
		Events();
		
		this.getCommand("customitem").setExecutor((CommandExecutor)new CustomItemCMD());

		CustomItems items = new CustomItems();
		items.customRecipe();
		items.unshaped();
	}

	@Override
	public void onDisable() {
	}

	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	public void Events() {
		getServer().getPluginManager().registerEvents(new onInteractEvent(), this);
		getServer().getPluginManager().registerEvents(new onJoinEvent(), this);
		getServer().getPluginManager().registerEvents(new EventClass(), this);
		getServer().getPluginManager().registerEvents(new CustomItemShop(), this);
	}
}