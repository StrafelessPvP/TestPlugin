package me.remastered.java;

import org.bukkit.plugin.java.JavaPlugin;

import me.remastered.java.Events.onInteractEvent;
import me.remastered.java.Items.CustomItems;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new onInteractEvent(), this);
		loadConfig();
		
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
}
