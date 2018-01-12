package me.remastered.java.Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.remastered.java.Items.CustomItems;

public class onInteractEvent implements Listener {

	private CustomItems ci = new CustomItems();

	@EventHandler
	public void onPunch(PlayerInteractEvent event) {
		Action action = event.getAction();
		Player player = event.getPlayer();
		Block block = event.getClickedBlock();

		if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
			if (block.getType().equals(Material.EMERALD_BLOCK)) {
				ci.giveItems(player);
			}
		}
	}
}
