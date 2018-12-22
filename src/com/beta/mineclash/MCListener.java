package com.beta.mineclash;

import java.util.Iterator;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class MCListener implements Listener {
 
	
	//Constructor
	public MCListener(MineClash mineClash) {
	
	}

	
	//EventHandler
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {		
		Player player = event.getPlayer();
		String name = player.toString();
		player.sendMessage(ChatColor.DARK_AQUA + "Welcome to MineClash, " + name +"!");
		
	}

	
	//Structure creation
	@EventHandler
	public void OnBlockPlace(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		Block block = player.getTargetBlock(null, 5);
		
		
		
		if(player.getInventory().getItemInMainHand().getType().equals(Material.NETHER_BRICK)) {
			block.breakNaturally();
			player.chat("/mineclash build godwall");
		}
		else if(player.getInventory().getItemInMainHand().getType().equals(Material.OBSIDIAN)) {
			block.breakNaturally();
			player.chat("/mineclash build godtower");
		}
		else if(player.getInventory().getItemInMainHand().getType().equals(Material.SMOOTH_BRICK)) {
			block.breakNaturally();
			player.chat("/mineclash build stonetower");
		}
		else if(player.getInventory().getItemInMainHand().getType().equals(Material.COBBLESTONE)) {
			block.breakNaturally();
			player.chat("/mineclash build stonewall");
		}
		else if(player.getInventory().getItemInMainHand().getType().equals(Material.SANDSTONE)) {
			block.breakNaturally();
			player.chat("/mineclash build basictower");
		}
		else if(player.getInventory().getItemInMainHand().getType().equals(Material.SAND)) {
			block.breakNaturally();
			player.chat("/mineclash build basicwall");
		}
		else if(player.getInventory().getItemInMainHand().getType().equals(Material.MOB_SPAWNER)) {
			block.breakNaturally();
			player.chat("/mineclash build guard");
		}
		else {
			//TODO Give player back item
			if(!player.hasPermission("mineclash.build")) {
			player.sendMessage(ChatColor.DARK_PURPLE + "This is not a valid place");
			}
		}
	}
	@EventHandler
	public void onExplosionPrime(ExplosionPrimeEvent event) {
		event.setFire(false); //Only really needed for fireballs
		
		Entity ent = event.getEntity();
		if (ent instanceof Fireball)
			event.setRadius(2); //Increased from default(1), since the fireball now don't cause fire
	}
	//Anti Explode
	@EventHandler
	public void Grass(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.GRASS)
		        iter.remove();
	}
	@EventHandler
	public void Glowstone(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.GLOWSTONE)
		        iter.remove();
	}
	@EventHandler
	public void Sponge(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.SPONGE)
		        iter.remove();
	}
	@EventHandler
	public void Dirt(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.DIRT)
		        iter.remove();
	}
	@EventHandler
	public void Stone(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.STONE)
		        iter.remove();
	}
	@EventHandler
	public void Log(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.LOG)
		        iter.remove();
	}
	@EventHandler
	public void Wood(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.WOOD)
		        iter.remove();
	}
	@EventHandler
	public void Stairs(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.WOOD_STAIRS)
		        iter.remove();
	}
	@EventHandler
	public void Fence(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.FENCE)
		        iter.remove();
	}
	@EventHandler
	public void BookShelf(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.BOOKSHELF)
		        iter.remove();
	}
	@EventHandler
	public void Torch(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.TORCH)
		        iter.remove();
	}
	@EventHandler
	public void WoodSlab(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.WOOD_STEP)
		        iter.remove();
	}
	@EventHandler
	public void RedStoneBlock(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.REDSTONE_BLOCK)
		        iter.remove();
	}
	@EventHandler
	public void GoldBlock(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.GOLD_BLOCK)
		        iter.remove();
	}
	@EventHandler
	public void CoalBlock(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.COAL_BLOCK)
		        iter.remove();
	}
	@EventHandler
	public void Rails(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.RAILS)
		        iter.remove();
	}
	@EventHandler
	public void StoneStairs(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.SMOOTH_STAIRS)
		        iter.remove();
	}
	@EventHandler
	public void PurpurPillar(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.PURPUR_PILLAR)
		        iter.remove();
	}
	@EventHandler
	public void PurpurBlock(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.PURPUR_BLOCK)
		        iter.remove();
	}
	@EventHandler
	public void PurpurStairs(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.PURPUR_STAIRS)
		        iter.remove();
	}
	@EventHandler
	public void NetherwartBlock(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.NETHER_WART_BLOCK)
		        iter.remove();
	}
	@EventHandler
	public void Netherrack(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.NETHERRACK)
		        iter.remove();
	}
	@EventHandler
	public void Quartz(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.QUARTZ_ORE)
		        iter.remove();
	}
	@EventHandler
	public void DiamondOre(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.DIAMOND_ORE)
		        iter.remove();
	}
	@EventHandler
	public void IronOre(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.IRON_ORE)
		        iter.remove();
	}
	@EventHandler
	public void GoldOre(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.GOLD_ORE)
		        iter.remove();
	}
	@EventHandler
	public void Beacon(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.BEACON)
		        iter.remove();
	}
	@EventHandler
	public void Glass(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.GLASS)
		        iter.remove();
	}
	@EventHandler
	public void Wool(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.WOOL)
		        iter.remove();
	}
	@EventHandler
	public void GlassPanes(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.THIN_GLASS)
		        iter.remove();
	}
	@EventHandler
	public void Lamp(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.REDSTONE_LAMP_ON)
		        iter.remove();
	}
	@EventHandler
	public void Trapdoor(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.TRAP_DOOR)
		        iter.remove();
	}
	@EventHandler
	public void StainedGlass(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.STAINED_GLASS)
		        iter.remove();
	}
	@EventHandler
	public void SlimeBlock(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.SLIME_BLOCK)
		        iter.remove();
	}
	@EventHandler
	public void PressurePlate(EntityExplodeEvent event) {
		Iterator<Block> iter = event.blockList().iterator();
		while(iter.hasNext())
		    if(iter.next().getType() == Material.STONE_PLATE)
		        iter.remove();
	}
}
