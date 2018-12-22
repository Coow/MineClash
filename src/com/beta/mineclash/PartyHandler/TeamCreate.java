package com.beta.mineclash.PartyHandler;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.*;

import com.beta.mineclash.MineClash;

public class TeamCreate implements CommandExecutor {

	public TeamCreate(MineClash mineClash) {
		/*
		 * mineClash.board = board; mineClash.team = team;
		 */}

	public TeamCreate(PartyHandler partyHandler) {
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// String player = sender.getName();
		Player player = (Player) sender;
		
		sender.sendMessage(ChatColor.BLUE + "Creating team!");

		Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();

		Objective obj = board.registerNewObjective("noflicker", "dummy");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName("Non Flickering");

		Team timer = board.registerNewTeam("timer");
		timer.addEntry(ChatColor.RED.toString());
		timer.setPrefix(ChatColor.GREEN + "Timer: ");
		timer.setSuffix(ChatColor.YELLOW + "0");
		
		obj.getScore(ChatColor.RED.toString()).setScore(2);
		
		player.getPlayer().setScoreboard(board);
		
		new BukkitRunnable() {
			
			int num = 0;
			@Override
			public void run() {
				num++;
				
				board.getTeam("timer").setSuffix(String.valueOf(ChatColor.YELLOW) + num);
			}
			public void runTaskTimer(TeamCreate teamCreate, int i, int j) {
				// TODO Auto-generated method stub
				
			}
		}.runTaskTimer(this, 20, 20);
		
		sender.sendMessage(ChatColor.GREEN + "Created team succesfully!");

		return true;
	}

}