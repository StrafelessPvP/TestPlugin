package me.remastered.java.Events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.remastered.java.Main;
import net.md_5.bungee.api.ChatColor;

public class EventClass implements Listener {

	public String prefix = (ChatColor.GREEN + "HypedPvP>> ");
	private Plugin plugin = Main.getPlugin(Main.class);

	@EventHandler
	public void craftingReward(CraftItemEvent event) {
		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();
		if (item.getType().equals(Material.DIAMOND_AXE)) {
			player.sendMessage(prefix + ChatColor.LIGHT_PURPLE + "Your experience rose by: " + ChatColor.GREEN + "10");
			player.giveExp(10);
			// ====================
			plugin.getServer().broadcastMessage(prefix + ChatColor.YELLOW + player.getName() + ChatColor.LIGHT_PURPLE
					+ " has crafted " + ChatColor.AQUA + "AXE OF THE GODS");

			for (Player online : plugin.getServer().getOnlinePlayers()) {
				online.getWorld().playSound(online.getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 1, 1);

			}

		}
	}
}
