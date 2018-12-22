package com.beta.mineclash.GameHandler;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.beta.mineclash.MineClash;

public class ClassSelector implements Listener {

	public ClassSelector(MineClash mineClash) {

	}

	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if (!player.hasPermission("mineclash.admin")) {
			player.getInventory().clear();
			player.teleport(new Location(Bukkit.getServer().getWorld("world"), -59, 118, -36));
			player.setGameMode(GameMode.SURVIVAL);
			player.setLevel(0);
		}

		// Ninja
		ItemStack ninja = new ItemStack(Material.FEATHER);
		ItemMeta ninjaMeta = ninja.getItemMeta();
		ninjaMeta.setDisplayName(ChatColor.DARK_GRAY + "Ninja Class");
		ArrayList<String> ninjaLore = new ArrayList<String>();
		ninjaLore.add(ChatColor.GOLD + "Be a ninja and excel at sneaking behind enemy lines...");
		ninjaLore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "UNDETECTED!");
		ninjaMeta.setLore(ninjaLore);
		ninja.setItemMeta(ninjaMeta);

		// Mage
		ItemStack mage = new ItemStack(Material.BOOK);
		ItemMeta mageMeta = mage.getItemMeta();
		mageMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Mage Class");
		ArrayList<String> mageLore = new ArrayList<String>();
		mageLore.add(ChatColor.GOLD + "Be a powerful mage, capable of destorying");
		mageLore.add(ChatColor.GOLD + "enemy structures with your blast attack!");
		mageMeta.setLore(mageLore);
		mage.setItemMeta(mageMeta);

		// Archer
		ItemStack archer = new ItemStack(Material.BOW);
		ItemMeta archerMeta = archer.getItemMeta();
		archerMeta.setDisplayName(ChatColor.DARK_GREEN + "Archer Class");
		ArrayList<String> archerLore = new ArrayList<String>();
		archerLore.add(ChatColor.GOLD + "Be an archer, dealing damage at range,");
		archerLore.add(ChatColor.GOLD + "and agile with a grappling hook!");
		archerMeta.setLore(archerLore);
		archer.setItemMeta(archerMeta);

		// Fighter
		ItemStack fighter = new ItemStack(Material.STONE_SWORD);
		ItemMeta fighterMeta = fighter.getItemMeta();
		fighterMeta.setDisplayName(ChatColor.DARK_RED + "Fighter Class");
		ArrayList<String> fighterLore = new ArrayList<String>();
		fighterLore.add(ChatColor.GOLD + "Be a swordsman and fight face to face");
		fighterLore.add(ChatColor.GOLD + "with your " + ChatColor.DARK_RED + "ENEMY!!");
		fighterMeta.setLore(fighterLore);
		fighter.setItemMeta(fighterMeta);

		// Miner
		ItemStack miner = new ItemStack(Material.GOLD_PICKAXE);
		ItemMeta minerMeta = miner.getItemMeta();
		minerMeta.setDisplayName(ChatColor.DARK_AQUA + "Miner Class");
		ArrayList<String> minerLore = new ArrayList<String>();
		minerLore.add(ChatColor.GOLD + "Be a miner, heavly armored, but slow..");
		minerLore.add(ChatColor.GOLD + "Mine the enemies fuel faster!");
		minerMeta.setLore(minerLore);
		miner.setItemMeta(minerMeta);
		if(player.hasPermission("mineclash.admin")) {
			return;
		}
		player.getInventory().addItem(fighter, archer, miner, mage, ninja);
		player.updateInventory();
	}

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		if (PvP.inLobby == false) {
			return;
		}
		if(!event.hasItem()) {
			return;
		}
		
		Player player = event.getPlayer();
		ItemStack item = event.getItem();
		ItemMeta itemMeta = item.getItemMeta();
		String name = itemMeta.getDisplayName();
		
		if(name == null) {
			return;
		}
		
		//player.sendMessage(name);
		if ((player.getInventory().getItemInMainHand().getType().equals(Material.STONE_SWORD)) && name.equals(ChatColor.DARK_RED + "Fighter Class")) {
			player.sendMessage(ChatColor.YELLOW + "Selected class: " + ChatColor.DARK_RED + "FIGHTER");
			Class.addToClass(ClassType.FIGHTER, player);
			return;
		}
		if ((player.getInventory().getItemInMainHand().getType().equals(Material.BOW)) && name.equals(ChatColor.DARK_GREEN + "Archer Class")){
			player.sendMessage(ChatColor.YELLOW + "Selected class: " + ChatColor.DARK_GREEN + "ARCHER");
			Class.addToClass(ClassType.ARCHER, player);
			return;
		}
		if ((player.getInventory().getItemInMainHand().getType().equals(Material.GOLD_PICKAXE)) && name.equals(ChatColor.DARK_AQUA + "Miner Class")){
			player.sendMessage(ChatColor.YELLOW + "Selected class: " + ChatColor.DARK_AQUA + "MINER");
			Class.addToClass(ClassType.MINER, player);
			return;
		}
		if ((player.getInventory().getItemInMainHand().getType().equals(Material.BOOK)) && name.equals(ChatColor.LIGHT_PURPLE + "Mage Class")){
			player.sendMessage(ChatColor.YELLOW + "Selected class: " + ChatColor.LIGHT_PURPLE + "MAGE");
			Class.addToClass(ClassType.MAGE, player);
			return;
		}
		if ((player.getInventory().getItemInMainHand().getType().equals(Material.FEATHER)) && name.equals(ChatColor.DARK_GRAY + "Ninja Class")){
			player.sendMessage(ChatColor.YELLOW + "Selected class: " + ChatColor.DARK_GRAY + "NINJA");
			Class.addToClass(ClassType.NINJA, player);
			return;
		}
		else {
			return;
		}

	}
}
