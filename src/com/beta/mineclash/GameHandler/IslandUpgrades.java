package com.beta.mineclash.GameHandler;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.meta.FireworkMeta;

import com.beta.mineclash.MineClash;

public class IslandUpgrades implements Listener {

	public IslandUpgrades(MineClash mineClash) {
	}
	
	public static boolean goldUnlock = false;
	public static boolean quartzUnlock = false;
	
	@EventHandler
 	public void onBlockPlace(BlockPlaceEvent event) {
		Block block = event.getBlock();
		Player player = (Player) event.getPlayer();
		if (block.getType() == Material.GOLD_BLOCK) {
			unlockGold();
			goldMessage(player);
			event.getBlock().breakNaturally();
		}
		if(block.getType() == Material.NETHER_WART_BLOCK) {
			unlockQuartz();
			quartzMessage(player);
			event.setCancelled(true);
		}
		else {
			event.setCancelled(false);
		}
	}

	public static void unlockGold() {
		Block block0 = Bukkit.getServer().getWorld("world").getBlockAt(9, 81, -14);
		Block block1 = Bukkit.getServer().getWorld("world").getBlockAt(10, 81, -14);
		Block block2 = Bukkit.getServer().getWorld("world").getBlockAt(11, 81, -14);
		Block block3 = Bukkit.getServer().getWorld("world").getBlockAt(9, 81, -15);
		Block block4 = Bukkit.getServer().getWorld("world").getBlockAt(10, 81, -15);
		Block block5 = Bukkit.getServer().getWorld("world").getBlockAt(11, 81, -15);
		Block block6 = Bukkit.getServer().getWorld("world").getBlockAt(9, 81, -16);
		Block block7 = Bukkit.getServer().getWorld("world").getBlockAt(10, 81, -16);
		Block block8 = Bukkit.getServer().getWorld("world").getBlockAt(11, 81, -16);
		
		block0.setType(Material.AIR);
		block1.setType(Material.AIR);
		block2.setType(Material.AIR);
		block3.setType(Material.AIR);
		block4.setType(Material.AIR);
		block5.setType(Material.AIR);
		block6.setType(Material.AIR);
		block7.setType(Material.AIR);
		block8.setType(Material.AIR);
	}
	
	public static void unlockQuartz() {
		Block block0 = Bukkit.getServer().getWorld("world").getBlockAt(-16, 82, 4);
		Block block1 = Bukkit.getServer().getWorld("world").getBlockAt(-17, 82, 4);
		Block block2 = Bukkit.getServer().getWorld("world").getBlockAt(-16, 82, 5);
		Block block3 = Bukkit.getServer().getWorld("world").getBlockAt(-17, 82, 5);
		
		block0.setType(Material.AIR);
		block1.setType(Material.AIR);
		block2.setType(Material.AIR);
		block3.setType(Material.AIR);
	}
	
	public static void revertGold() {
		Block block0 = Bukkit.getServer().getWorld("world").getBlockAt(9, 81, -14);
		Block block1 = Bukkit.getServer().getWorld("world").getBlockAt(10, 81, -14);
		Block block2 = Bukkit.getServer().getWorld("world").getBlockAt(11, 81, -14);
		Block block3 = Bukkit.getServer().getWorld("world").getBlockAt(9, 81, -15);
		Block block4 = Bukkit.getServer().getWorld("world").getBlockAt(10, 81, -15);
		Block block5 = Bukkit.getServer().getWorld("world").getBlockAt(11, 81, -15);
		Block block6 = Bukkit.getServer().getWorld("world").getBlockAt(9, 81, -16);
		Block block7 = Bukkit.getServer().getWorld("world").getBlockAt(10, 81, -16);
		Block block8 = Bukkit.getServer().getWorld("world").getBlockAt(11, 81, -16);
		
		block0.setType(Material.GOLD_BLOCK);
		block1.setType(Material.GOLD_BLOCK);
		block2.setType(Material.GOLD_BLOCK);
		block3.setType(Material.GOLD_BLOCK);
		block4.setType(Material.GOLD_BLOCK);
		block5.setType(Material.GOLD_BLOCK);
		block6.setType(Material.GOLD_BLOCK);
		block7.setType(Material.GOLD_BLOCK);
		block8.setType(Material.GOLD_BLOCK);
	}
	
	public static void revertQuartz() {
		Block block0 = Bukkit.getServer().getWorld("world").getBlockAt(-16, 82, 4);
		Block block1 = Bukkit.getServer().getWorld("world").getBlockAt(-17, 82, 4);
		Block block2 = Bukkit.getServer().getWorld("world").getBlockAt(-16, 82, 5);
		Block block3 = Bukkit.getServer().getWorld("world").getBlockAt(-17, 82, 5);
		
		block0.setType(Material.NETHER_WART_BLOCK);
		block1.setType(Material.NETHER_WART_BLOCK);
		block2.setType(Material.NETHER_WART_BLOCK);
		block3.setType(Material.NETHER_WART_BLOCK);
	}

	public void goldMessage (Player player) {
		if (goldUnlock == true) {
			return;
		}
		Bukkit.broadcastMessage(ChatColor.GOLD + player.getName().toString() + " Has Unlocked The Gold Mines!");
		Firework fw = (Firework) player.getWorld().spawnEntity(player.getLocation(), EntityType.FIREWORK);
        FireworkMeta fwm = fw.getFireworkMeta();
        
        Type type = Type.BALL_LARGE;
        
        Color c1 = Color.YELLOW;
        Color c2 = Color.LIME;
        
        FireworkEffect effect = FireworkEffect.builder().withColor(c1).withFade(c2).with(type).build();
        
        fwm.addEffect(effect);
        
        fw.setFireworkMeta(fwm);
        goldUnlock = true;
	}
	
	public void quartzMessage(Player player) {
		if (quartzUnlock == true) {
			return;
		}
		Bukkit.broadcastMessage(ChatColor.GRAY + player.getName().toString() + " Has Unlocked The Quartz Mines!");
		Firework fw = (Firework) player.getWorld().spawnEntity(player.getLocation(), EntityType.FIREWORK);
        FireworkMeta fwm = fw.getFireworkMeta();
        
        Type type = Type.BALL_LARGE;
        
        Color c1 = Color.SILVER;
        Color c2 = Color.GRAY;
        
        FireworkEffect effect = FireworkEffect.builder().withColor(c1).withFade(c2).with(type).build();
        
        fwm.addEffect(effect);
        
        fw.setFireworkMeta(fwm);
        quartzUnlock = true;
	}
}
