package me.remastered.java.Inventorys;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.remastered.java.Main;
import net.md_5.bungee.api.ChatColor;

public class CustomItemShop implements Listener {
	
	private Plugin plugin = Main.getPlugin(Main.class);
	
	public void newInventory(Player player){
		Inventory i = plugin.getServer().createInventory(null,9, ChatColor.DARK_GREEN + "CustomItemShop");
		player.openInventory(i);
		
		ItemStack axe = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta meta = axe.getItemMeta();
		
		ItemStack empty = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
		ItemMeta emptyMeta = empty.getItemMeta();
		emptyMeta.setDisplayName("'");
		empty.setItemMeta(emptyMeta);
		
		meta.setDisplayName(ChatColor.AQUA + "AXE OF THE GODS");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Used by THE GODS");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		axe.setItemMeta(meta);
		
		i.setItem(0,empty);
		i.setItem(1,axe);
		i.setItem(2,empty);
		i.setItem(3,empty);
		i.setItem(4,empty);
		i.setItem(5,empty);
		i.setItem(6,empty);
		i.setItem(7,empty);
		i.setItem(8,empty);;
	}

}
