package me.remastered.java.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.remastered.java.Inventorys.CustomItemShop;
import net.md_5.bungee.api.ChatColor;

public class CustomItemCMD implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			CustomItemShop i = new CustomItemShop();
			i.newInventory(player);
		} else {
			sender.sendMessage(ChatColor.RED + "Only players can use this command!");
		}
		return true;
	}

}
