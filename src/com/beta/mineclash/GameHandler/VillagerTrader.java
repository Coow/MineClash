package com.beta.mineclash.GameHandler;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.beta.mineclash.villagerTrade.VillagerTradeApi;

public class VillagerTrader {

	@EventHandler
	public static void summonVillager() {
		World world = Bukkit.getWorld("world");
		Location location = new Location(world, 23.5, 81, -0.5);
		location.setYaw(90F);
		Villager villager = (Villager) Bukkit.getWorld("world").spawnEntity(location, EntityType.VILLAGER);
		
		villager.setSilent(true);
		villager.setAI(false);
		//villager.getLocation().setYaw(180);

		villager.setProfession(Villager.Profession.LIBRARIAN);
		villager.setCustomName("Trader");
		villager.setInvulnerable(true);
		

		ItemStack btcb = new ItemStack(Material.IRON_INGOT, 4);
		//Sandstone
		ItemStack btc = new ItemStack(Material.SANDSTONE,1);
		ItemMeta btcM = btc.getItemMeta();
		btcM.setDisplayName(ChatColor.UNDERLINE + "Sand Tower");
		ArrayList<String> btcL = new ArrayList<String>();
		btcL.add(ChatColor.GOLD + "Place on a Glowstone to create a Sand Tower!");
		btcM.setLore(btcL);
		btc.setItemMeta(btcM);

		ItemStack btwb = new ItemStack(Material.IRON_INGOT, 2);
		//Sand
		ItemStack btw = new ItemStack(Material.SAND,6);
		ItemMeta btwM = btw.getItemMeta();
		btwM.setDisplayName(ChatColor.UNDERLINE + "Sand Wall");
		ArrayList<String> btwL = new ArrayList<String>();
		btwL.add(ChatColor.GOLD + "Place on a Sponge to create a Sand Wall!");
		btwM.setLore(btwL);
		btw.setItemMeta(btwM);
		
		ItemStack stcb = new ItemStack(Material.GOLD_INGOT, 2);
		//StoneBrick
		ItemStack stc = new ItemStack(Material.SMOOTH_BRICK,1);
		ItemMeta stcM = stc.getItemMeta();
		stcM.setDisplayName(ChatColor.UNDERLINE + "Stone Tower");
		ArrayList<String> stcL = new ArrayList<String>();
		stcL.add(ChatColor.GOLD + "Place on a Glowstone to create a Stone Tower!");
		stcM.setLore(stcL);
		stc.setItemMeta(stcM);

		ItemStack stwb = new ItemStack(Material.GOLD_INGOT, 1);
		//Cobble
		ItemStack stw = new ItemStack(Material.COBBLESTONE,4);
		ItemMeta stwM = stw.getItemMeta();
		stwM.setDisplayName(ChatColor.UNDERLINE + "Stone Wall");
		ArrayList<String> stwL = new ArrayList<String>();
		stwL.add(ChatColor.GOLD + "Place on a Sponge to create a Stone Wall!");
		stwM.setLore(stwL);
		stw.setItemMeta(stwM);
		
		ItemStack gtcb = new ItemStack(Material.QUARTZ, 2);
		//Obsidian
		ItemStack gtc = new ItemStack(Material.OBSIDIAN,1);
		ItemMeta gtcM = gtc.getItemMeta();
		gtcM.setDisplayName(ChatColor.UNDERLINE + "God Tower");
		ArrayList<String> gtcL = new ArrayList<String>();
		gtcL.add(ChatColor.DARK_RED + "Place on a Glowstone to create a God Tower!");
		gtcM.setLore(gtcL);
		gtc.setItemMeta(gtcM);

		ItemStack gtwb = new ItemStack(Material.QUARTZ, 1);
		//NetherBrick
		ItemStack gtw = new ItemStack(Material.NETHER_BRICK,2);
		ItemMeta gtwM = gtw.getItemMeta();
		gtwM.setDisplayName(ChatColor.UNDERLINE + "God Wall");
		ArrayList<String> gtwL = new ArrayList<String>();
		gtwL.add(ChatColor.DARK_RED + "Place on a Sponge to create a God Wall!");
		gtwM.setLore(stwL);
		gtw.setItemMeta(gtwM);
		
		
		//Gold Upgrade
		ItemStack gu = new ItemStack(Material.DIAMOND,2);
		ItemStack gur = new ItemStack(Material.GOLD_BLOCK,1);
		
		//NetherUpgrade
		ItemStack nu = new ItemStack(Material.DIAMOND,3);
		ItemStack nur = new ItemStack(Material.NETHER_WART_BLOCK,1);
				
		
		VillagerTradeApi.clearTrades(villager);
		
		

		VillagerTradeApi.addTrade(villager, btcb, btc);
		VillagerTradeApi.addTrade(villager, btwb, btw);
		VillagerTradeApi.addTrade(villager, stcb, stc);
		VillagerTradeApi.addTrade(villager, stwb, stw);
		VillagerTradeApi.addTrade(villager, gtcb, gtc);
		VillagerTradeApi.addTrade(villager, gtwb, gtw);
		VillagerTradeApi.addTrade(villager, gu, gur);
		VillagerTradeApi.addTrade(villager, nu, nur);
	}
}
