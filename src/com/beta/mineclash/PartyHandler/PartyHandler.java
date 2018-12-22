package com.beta.mineclash.PartyHandler;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.ScoreboardManager;

import com.beta.mineclash.MineClash;

public class PartyHandler implements CommandExecutor, Listener {

	public TeamCreate teamCreate = new TeamCreate(this);
	public TeamInvite teamInvite = new TeamInvite(this);

	public PartyHandler(MineClash mineClash) {
	}

	ScoreboardManager manager = Bukkit.getScoreboardManager();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;

		if (args.length == 2) {
			if (args[1].equalsIgnoreCase("create")) {
				teamCreate.onCommand(sender, cmd, label, args);
			}

			else if (args[1].equalsIgnoreCase("leave")) {
				// teamInvite.onCommand(sender, cmd, label, args);
				player.sendMessage(ChatColor.RED + "Feature not implemented");
			}

			return false;
		}
		if (args.length >= 2) {
			if (args[1].equalsIgnoreCase("invite")) {
				teamInvite.onCommand(sender, cmd, label, args);
				player.sendMessage("Working on it");
			} else if (args[1].equalsIgnoreCase("join")) {
				// teamInvite.onCommand(sender, cmd, label, args);
				player.sendMessage(ChatColor.RED + "Feature not implemented");
			} else {
				player.sendMessage("MineClash Command not regonized!");
			}
			return false;
		}

		player.sendMessage("MineClash Command not regonized!");
		return false;
	}
}