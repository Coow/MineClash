package com.beta.mineclash.GameHandler;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class ClassGiver {

	public static void GiveItems(PlayerInventory inv) {
		inv.clear();
		for (Player player : Bukkit.getOnlinePlayers()) {
			if (Class.isAArcher(player)) {
				inv.addItem(new ItemStack(Material.STONE_SWORD, 1));
				inv.addItem(new ItemStack(Material.BOW, 1));
				inv.setItem(8, new ItemStack(Material.ARROW, 64));
				inv.setHelmet(new ItemStack(Material.LEATHER_HELMET));
				inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				inv.setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
				inv.setBoots(new ItemStack(Material.LEATHER_BOOTS));
				return;
			}
			if (Class.isAFigther(player)) {
				inv.addItem(new ItemStack(Material.IRON_SWORD, 1));
				inv.setItemInOffHand(new ItemStack(Material.SHIELD, 1));
				inv.setHelmet(new ItemStack(Material.IRON_HELMET));
				inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				inv.setBoots(new ItemStack(Material.LEATHER_BOOTS));
				return;
			}
			if (Class.isAMage(player)) {
				inv.addItem(new ItemStack(Material.STONE_AXE, 1));
				inv.addItem(new ItemStack(Material.BLAZE_ROD, 1));
				inv.setHelmet(new ItemStack(Material.IRON_HELMET));
				inv.setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
				inv.setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
				inv.setBoots(new ItemStack(Material.LEATHER_BOOTS));
				return;
			}
			if (Class.isAMiner(player)) {
				inv.addItem(new ItemStack(Material.STONE_SWORD, 1));
				inv.setItem(8, new ItemStack(Material.DIAMOND_PICKAXE, 1));
				inv.setHelmet(new ItemStack(Material.IRON_HELMET));
				inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				inv.setBoots(new ItemStack(Material.IRON_BOOTS));
				return;
			}
			if (Class.isANinja(player)) {
				inv.addItem(new ItemStack(Material.STONE_AXE, 1));
				inv.addItem(new ItemStack(Material.GLOWSTONE_DUST, 1));
				inv.addItem(new ItemStack(Material.SUGAR, 1));
				inv.setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
				inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				inv.setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
				inv.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
				return;
			} else {
				
			}
		}
	}


	public static void GivePick(PlayerInventory inv) {
		for (Player player : Bukkit.getOnlinePlayers()) {
			if(Class.isAMiner(player)) {
				return;
			}else {
				inv.setItem(8, new ItemStack(Material.IRON_PICKAXE, 1));
			}
		}
	}
}
