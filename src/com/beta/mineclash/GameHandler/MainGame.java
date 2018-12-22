package com.beta.mineclash.GameHandler;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import com.beta.mineclash.MineClash;

public class MainGame implements Listener {

	public MainGame(MineClash mineClash) {

	}

	public static boolean assignTeams() {
		int i = 0;
		for (Player player : Bukkit.getOnlinePlayers()) {
			if (i < Bukkit.getOnlinePlayers().size() / 2) {
				Team.addToTeam(TeamType.RED, player);
			} else {
				Team.addToTeam(TeamType.BLUE, player);
			}
			i++;
		}
		return true;
	}

	public static void deadPlayer(Player player) {
	}

	public static void livesLeft(Player player) {
	}

	public static int beaconHP;

	public static void beaconAlive() {
		Block block = Bukkit.getServer().getWorld("world").getBlockAt(0, 68, 0);
		if (block.getType() == Material.ENDER_PORTAL_FRAME) {
			Bukkit.broadcastMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "The Core Has Been Destroyed!");
			return;
			
		} else if (block.getType() == Material.BEACON) {
			Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "The Core Is Under Attack!");
			return;
		}
	}

	@SuppressWarnings("deprecation")
	@EventHandler(ignoreCancelled = true)
	public void BeaconBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Block color = event.getBlock().getRelative(BlockFace.DOWN, 1);

		if ((block.getType() == Material.BEACON) && Team.isInTeamRed(player)) {
			beaconHP++;
			if (beaconHP <= 7) {
				Bukkit.broadcastMessage(ChatColor.DARK_GREEN + "The Core has " + (20 - beaconHP) + "HP left!");
				event.setCancelled(true);
				color.setType(Material.STAINED_GLASS);
				color.setData((byte) 5);
				// beaconAlive();
				return;
			}
			if (beaconHP <= 13) {
				Bukkit.broadcastMessage(ChatColor.GOLD + "The Core has " + (20 - beaconHP) + "HP left!");
				event.setCancelled(true);
				color.setData((byte) 1);
				// beaconAlive();
				return;
			}
			if (beaconHP <= 19) {
				Bukkit.broadcastMessage(ChatColor.RED + "The Core has " + (20 - beaconHP) + "HP left!");
				event.setCancelled(true);
				color.setData((byte) 14);
				// beaconAlive();
				return;
			}

			if (beaconHP >= 20) {
				event.setCancelled(true);
				block.setType(Material.ENDER_PORTAL_FRAME);
				Bukkit.broadcastMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "The Core Has Been Destroyed!");
				color.setData((byte) 10);
				// beaconAlive();
				return;
			}
		} else if ((block.getType() == Material.BEACON) && Team.isInTeamBlue(player)) {
			event.setCancelled(true);
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You're supposed to defend it...");
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Not attack it!!");
		}
	}

	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent event) {
		Player player = (Player) event.getPlayer();
		Block block = Bukkit.getServer().getWorld("world").getBlockAt(0, 68, 0);

		if ((block.getType() == Material.BEACON) && Team.isInTeamBlue(player)) {
			event.setRespawnLocation(new Location(Bukkit.getWorld("world"), 6, 82, 0));
			return;
		} else {
			Team.removePlayer(player);
			Team.addToTeam(TeamType.SPEC, player);
			player.setAllowFlight(true);
			player.setFlying(false);
		}
	}

	@EventHandler
	public void onLeave(PlayerQuitEvent event) {
		Player player = (Player) event.getPlayer();
		Team.moveTeam(player);
	}

	public static int coalHP = 50;

	@EventHandler
	public static void CoalBreak(BlockBreakEvent event) throws InterruptedException {
		Player player = event.getPlayer();
		Block block = event.getBlock();

		if ((block.getType() == Material.COAL_BLOCK) && Team.isInTeamRed(player)) {
			coalHP--;
			for (Player players : Bukkit.getOnlinePlayers()) {
				if (Team.isInTeamBlue(players)) {
					players.setLevel(coalHP);
					players.playSound(players.getLocation(), Sound.ENTITY_CAT_HURT, 1.0F, 1.0F);
				}
			}
			if (coalHP == 0) {
				for (Player players : Bukkit.getOnlinePlayers()) {
					Team.removePlayer(players);
					Team.addToTeam(TeamType.SPEC, players);
					players.setAllowFlight(true);
					players.setFlying(true);
				}
			}
		}

	}

	@EventHandler(ignoreCancelled = true)
	public boolean BlueBreak(BlockBreakEvent event) throws InterruptedException {
		Block block = event.getBlock();
		Player player = event.getPlayer();
		if (player.hasPermission("mineclash.admin")) {
			return false;
		}
		if (Team.isInTeamBlue(player)) {
			if (block.getType() == Material.IRON_ORE) {
				return true;
			}
			if (block.getType() == Material.GOLD_ORE) {
				return true;
			}
			if (block.getType() == Material.QUARTZ_ORE) {
				return true;
			}
			if (block.getType() == Material.DIAMOND_ORE) {
				return true;
			}
			if (block.getType() == Material.BEACON) {
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "You're supposed to defend it...");
				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Not attack it!!");
			} else {
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "Can't destory this block!");
				return true;
			}

		}
		return true;
	}

	@EventHandler(ignoreCancelled = true)
	public boolean RedBreak(BlockBreakEvent event) throws InterruptedException {
		Block block = event.getBlock();
		Player player = event.getPlayer();
		if (player.hasPermission("mineclash.admin")) {
			return false;
		}

		if (Team.isInTeamRed(player)) {
			if (block.getType() == Material.BEACON) {

			}
			if (block.getType() == Material.NETHER_BRICK) {

			} else {
				event.setCancelled(true);
				player.sendMessage(ChatColor.RED + "Can't destory this block!");
			}
		}
		return false;
	}

}
