package me.remastered.java.Inventorys;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

import me.remastered.java.Main;
import net.md_5.bungee.api.ChatColor;

public class CustomItemShop implements Listener {
	
	private Plugin plugin = Main.getPlugin(Main.class);
	
	public void newInventory(Player player){
		Inventory i = plugin.getServer().createInventory(null,27, ChatColor.DARK_GREEN + "CustomItemShop");
		player.openInventory(i);
		//ToDo create the item
	}

}
