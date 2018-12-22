package com.beta.mineclash;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MineClashHelp implements CommandExecutor {

	MineClash plugin;

	public MineClashHelp(MineClash passedPlugin) {

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;

		sender.sendMessage(ChatColor.BOLD + "" + "Working on it!");
		player.sendMessage(ChatColor.GOLD + "Help is on the way!");
		return false;
	}

}
