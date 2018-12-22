package com.beta.mineclash;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.beta.mineclash.Building.BasicTower;
import com.beta.mineclash.Building.BasicWall;
import com.beta.mineclash.Building.GodTower;
import com.beta.mineclash.Building.GodWall;
import com.beta.mineclash.Building.StoneTower;
import com.beta.mineclash.Building.StoneWall;
import com.beta.mineclash.Building.TowerGuard;

public class MineClashBuildCMD implements CommandExecutor {

	// Constructor
	public MineClashBuildCMD(MineClash mineClash) {
	}

	public BasicTower basicTower = new BasicTower(this);
	public BasicWall basicWall = new BasicWall(this);
	public StoneTower stoneTower = new StoneTower(this);
	public StoneWall stoneWall = new StoneWall(this);
	public GodTower godTower = new GodTower(this);
	public GodWall godWall = new GodWall(this);
	public TowerGuard towerGuard = new TowerGuard(this);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;

		if (args.length == 2) {
			// player.sendMessage(ChatColor.RED + "Getting argument: 1");

			if (args[1].equalsIgnoreCase("basictower")) {
				basicTower.onCommand(sender, cmd, label, args);
			} else if (args[1].equalsIgnoreCase("basicwall")) {
				basicWall.onCommand(sender, cmd, label, args);
			} else if (args[1].equalsIgnoreCase("stonetower")) {
				stoneTower.onCommand(sender, cmd, label, args);
			} else if (args[1].equalsIgnoreCase("stonewall")) {
				stoneWall.onCommand(sender, cmd, label, args);
			} else if (args[1].equalsIgnoreCase("godtower")) {
				godTower.onCommand(sender, cmd, label, args);
			} else if (args[1].equalsIgnoreCase("godwall")) {
				godWall.onCommand(sender, cmd, label, args);
			} else if (args[1].equalsIgnoreCase("guard")) {
				towerGuard.onCommand(sender, cmd, label, args);
			}

			else {
				player.sendMessage(ChatColor.RED + "This is not a valid building");
			}
		} else {
			player.sendMessage(ChatColor.RED + "Please specify a building");
		}
		// TODO If there is no arguments. Call Helper Class
		return true;
	}

}