package com.beta.mineclash.Building;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.beta.mineclash.MineClashBuildCMD;

public class TowerGuard implements CommandExecutor{

	public TowerGuard(MineClashBuildCMD mineClashBuildCMD) {}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		Block block = player.getTargetBlock(null, 5);
		Location location = block.getLocation();
		if(block.getType() == Material.MAGMA || block.getType() == Material.COBBLESTONE || block.getType() == Material.WOOD_STEP) {
			location.add(0.5,1,0.5);
			player.getWorld().spawnEntity(location, EntityType.SKELETON);
		}
		return false;
	}
}