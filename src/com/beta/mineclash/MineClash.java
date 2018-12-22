package com.beta.mineclash;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.beta.mineclash.GameHandler.ClassSelector;
import com.beta.mineclash.GameHandler.DoubleJumper;
import com.beta.mineclash.GameHandler.IslandUpgrades;
import com.beta.mineclash.GameHandler.MainGame;
import com.beta.mineclash.GameHandler.PvP;
import com.beta.mineclash.GameHandler.SlimeJumper;
import com.beta.mineclash.GameHandler.Team;
import com.beta.mineclash.GameHandler.TeamType;
import com.beta.mineclash.GameHandler.VillagerTrader;
import com.beta.mineclash.PartyHandler.PartyHandler;

public class MineClash extends JavaPlugin implements Listener {

	public MineClashBuildCMD BuildCMD = new MineClashBuildCMD(this);
	public PartyHandler partyHandler = new PartyHandler(this);
	public MineClashHelp help = new MineClashHelp(this);
	public MainGame mainGame = new MainGame(this);

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		getLogger().info("MineClash has been enabled!");

		PluginManager pm = getServer().getPluginManager();
		MCListener listener = new MCListener(this);
		PartyHandler party = new PartyHandler(this);
		DoubleJumper doubleJump = new DoubleJumper(this);
		MainGame mainGame = new MainGame(this);
		ClassSelector classSelector = new ClassSelector(this);
		PvP pvp = new PvP(this);
		IslandUpgrades islandUpgrades = new IslandUpgrades(this);
		SlimeJumper slimeJumper = new SlimeJumper(this);

		pm.registerEvents(listener, this);
		pm.registerEvents(party, this);
		pm.registerEvents(doubleJump, this);
		pm.registerEvents(mainGame, this);
		pm.registerEvents(classSelector, this);
		pm.registerEvents(pvp, this);
		pm.registerEvents(islandUpgrades, this);
		pm.registerEvents(slimeJumper, this);
		// ClearTeams
		Team.clearTeam();
	}

	@Override
	public void onDisable() {
		getLogger().info(ChatColor.GREEN + "MineClash succesfully shutdown");

		// ClearTeams
		Team.clearTeam();
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender.hasPermission("mineclash.admin")) {
			if (label.equalsIgnoreCase("assign")) {
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
			if (label.equalsIgnoreCase("debug")) {
				VillagerTrader.summonVillager();
				PvP.inLobby = false;
				if (!Team.isInTeam((Player) sender)) {
					sender.sendMessage("You are currently not a team :/");
					MainGame.beaconHP = 0;
					return true;
				} else {
					sender.sendMessage(Team.getTeamType(((Player) sender)).name());
				}
			}
			if (label.equalsIgnoreCase("mines")) {
				IslandUpgrades.revertGold();
				IslandUpgrades.revertQuartz();

				IslandUpgrades.goldUnlock = false;
				IslandUpgrades.quartzUnlock = false;
			}
			if (label.equalsIgnoreCase("mineclash")) {
				if (args.length == 0) {
					help.onCommand(sender, cmd, label, args);
				} else if (args.length >= 1) {
					if (args[0].equalsIgnoreCase("build")) {
						BuildCMD.onCommand(sender, cmd, label, args);
					} else if (args[0].equalsIgnoreCase("team")) {
						partyHandler.onCommand(sender, cmd, label, args);
					} else {
						help.onCommand(sender, cmd, label, args);
					}
				}
			}

		} else {
			sender.sendMessage(ChatColor.RED + "No permission!");
		}
		return false;
	}

	ArrayList<Block> cooldown = new ArrayList<Block>();

	@EventHandler(ignoreCancelled = true)
	public boolean BlueBreak(BlockBreakEvent event) throws InterruptedException {
		Block block = event.getBlock();
		Player player = event.getPlayer();

		if (Team.isInTeamBlue(player)) {

			if (block.getType() == Material.IRON_ORE) {
				player.getInventory().addItem(new ItemStack(Material.IRON_INGOT));
				player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
				cooldown.add(block);
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						cooldown.remove(block);
						block.setType(Material.IRON_ORE);
					}
				}, 100);
				return true;
			}
			if (block.getType() == Material.GOLD_ORE) {
				event.setCancelled(true);
				player.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
				player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
				cooldown.add(block);
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						cooldown.remove(block);
						block.setType(Material.GOLD_ORE);
					}
				}, 150);
				return true;
			}
			if (block.getType() == Material.QUARTZ_ORE) {
				event.setCancelled(true);
				player.getInventory().addItem(new ItemStack(Material.QUARTZ));
				player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
				cooldown.add(block);
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						cooldown.remove(block);
						block.setType(Material.QUARTZ_ORE);
					}
				}, 200);
				return true;
			}
			if (block.getType() == Material.DIAMOND_ORE) {
				event.setCancelled(true);
				player.getInventory().addItem(new ItemStack(Material.DIAMOND));
				player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
				cooldown.add(block);
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
					public void run() {
						cooldown.remove(block);
						block.setType(Material.DIAMOND_ORE);
					}
				}, 400);
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	@EventHandler
	public boolean sugar(PlayerInteractEvent event) {
		if(!((event.getAction().equals(Action.RIGHT_CLICK_AIR)) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
			return false;
		}
		Player player = event.getPlayer();
		ItemStack item = player.getInventory().getItemInMainHand();
		if (item.getType() == Material.SUGAR) {
			player.sendMessage(ChatColor.GREEN + "Sugar Rush Activated!");
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 60, 2));

			int invSlot = player.getInventory().getHeldItemSlot();
			player.getInventory().setItemInMainHand(new ItemStack(Material.FIREWORK_CHARGE));

			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				@Override
				public void run() {

					player.getInventory().setItem(invSlot, new ItemStack(Material.SUGAR));
				}
			}, 150);
			return true;
		}
		return true;
	}

	@EventHandler
	public boolean glowstone(PlayerInteractEvent event) {
		if(!((event.getAction().equals(Action.RIGHT_CLICK_AIR)) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
			return false;
		}
		Player player = event.getPlayer();
		ItemStack item = player.getInventory().getItemInMainHand();

		int cd = 70;
		if (item.getType() == Material.GLOWSTONE_DUST) {
			event.setCancelled(true);
			player.sendMessage(ChatColor.YELLOW + "Invisibilty Activated!");
			player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, cd, 2));

			int invSlot = player.getInventory().getHeldItemSlot();
			player.getInventory().setItemInMainHand(new ItemStack(Material.AIR));

			ItemStack helmet = player.getInventory().getHelmet();
			ItemStack chest = player.getInventory().getChestplate();
			ItemStack pants = player.getInventory().getLeggings();
			ItemStack boots = player.getInventory().getBoots();

			player.getInventory().setHelmet(new ItemStack(Material.AIR));
			player.getInventory().setChestplate(new ItemStack(Material.AIR));
			player.getInventory().setLeggings(new ItemStack(Material.AIR));
			player.getInventory().setBoots(new ItemStack(Material.AIR));

			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				@Override
				public void run() {
					player.getInventory().setHelmet(helmet);
					player.getInventory().setChestplate(chest);
					player.getInventory().setLeggings(pants);
					player.getInventory().setBoots(boots);
					player.playSound(player.getLocation(), Sound.ENTITY_ENDERDRAGON_FLAP, 1.0F, 0.2F);
					player.getInventory().setItem(invSlot, new ItemStack(Material.FIREWORK_CHARGE));
				}
			}, cd);

			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				@Override
				public void run() {
					player.getInventory().setItem(invSlot, new ItemStack(Material.GLOWSTONE_DUST));
				}
			}, 180);
			return true;
		}
		return true;
	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public boolean blazeRod(PlayerInteractEvent event) {
		if(!((event.getAction().equals(Action.RIGHT_CLICK_AIR)) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
			return false;
		}
		Player player = event.getPlayer();
		ItemStack item = player.getInventory().getItemInMainHand();
		int cd = 120;
		if (item.getType() == Material.BLAZE_ROD) {

			Location location = player.getEyeLocation();
			Entity entity = location.getWorld().spawnEntity(location.add(location.getDirection()), EntityType.FIREBALL);
			entity.setVelocity(location.getDirection().multiply(0.9));
			if (!player.hasPermission("mineclash.fireball.inf")) {
				player.getInventory().removeItem(new ItemStack[] { new ItemStack(Material.BLAZE_ROD, 1) });
				player.updateInventory();
			}
			
			int invSlot = player.getInventory().getHeldItemSlot();
			player.getInventory().setItemInMainHand(new ItemStack(Material.FIREWORK_CHARGE));

			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
				@Override
				public void run() {

					player.getInventory().setItem(invSlot, new ItemStack(Material.BLAZE_ROD));
				}
			}, cd);
			return true;
		}
		return true;
	}
}
