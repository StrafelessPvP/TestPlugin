package me.remastered.java.Events;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class onJoinEvent implements Listener {

	public String prefix = (ChatColor.GREEN + "HypedPvP>> ");

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {

		Player player = event.getPlayer();

		event.setJoinMessage("");

		player.sendMessage(prefix + ChatColor.GOLD + "Welcome back, " + player.getName());

		ItemStack item = new ItemStack(Material.BOOK, 1);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Welcome Book");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Read this for instructions and rules");
		meta.setLore(lore);
		item.setItemMeta(meta);

		player.getInventory().setItem(0, item);

		Location spawn = new Location(player.getWorld(), -134, 70, -51);
		player.teleport(spawn);
	}

}
