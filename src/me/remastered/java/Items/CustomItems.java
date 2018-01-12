package me.remastered.java.Items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import me.remastered.java.Main;
import net.md_5.bungee.api.ChatColor;

public class CustomItems implements Listener {

	private Plugin plugin = Main.getPlugin(Main.class);
	private ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
	private ItemMeta meta = item.getItemMeta();

	public void giveItems(Player player) {
		meta.setDisplayName(ChatColor.AQUA + "AXE OF THE GODS");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Used by THE GODS");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);

		player.getInventory().addItem(item);
	}

	public void customRecipe() {
		meta.setDisplayName(ChatColor.AQUA + "AXE OF THE GODS");
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Used by THE GODS");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		ShapedRecipe r = new ShapedRecipe(item);

		r.shape("#% ", "#$ ", " $ ");
		r.setIngredient('#', Material.DIAMOND);
		r.setIngredient('%', Material.IRON_INGOT);
		r.setIngredient('$', Material.STICK);

		plugin.getServer().addRecipe(r);
	}

	public void unshaped() {
		ItemStack item = new ItemStack(Material.ENDER_PEARL, 1);

		ShapelessRecipe slr = new ShapelessRecipe(item);

		slr.addIngredient(3, Material.LAVA_BUCKET);
		slr.addIngredient(3, Material.FLINT);
		plugin.getServer().addRecipe(slr);
	}
}