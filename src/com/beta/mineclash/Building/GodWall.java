package com.beta.mineclash.Building;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.beta.mineclash.MineClashBuildCMD;

public class GodWall implements CommandExecutor{

	//Constructor
	public GodWall(MineClashBuildCMD mineClashBuildCMD) {}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		Player player = (Player) sender;
		Block block = player.getTargetBlock(null, 5);
		
		Block block1 = block.getRelative(BlockFace.UP,1);
		Block block2 = block.getRelative(BlockFace.UP,2);
		Block block3 = block.getRelative(BlockFace.UP,3);
		Block block4 = block.getRelative(BlockFace.UP,4);
		Block block5 = block.getRelative(BlockFace.UP,5);
		Block block6 = block.getRelative(BlockFace.UP,6);
		Block block7 = block.getRelative(BlockFace.UP,7);
		
		if (block.getType() == Material.SPONGE) {
			player.sendMessage(ChatColor.GOLD + "Building God Wall");
			
			block1.setType(Material.OBSIDIAN);
			block2.setType(Material.NETHER_BRICK);
			block3.setType(Material.NETHER_BRICK);
			block4.setType(Material.NETHER_BRICK);
			block5.setType(Material.NETHER_BRICK);
			block6.setType(Material.NETHER_BRICK);
			block7.setType(Material.NETHER_FENCE);
		}
		else {
			player.sendMessage(ChatColor.GOLD + "Please target a sponge block!");
		}
		return false;
	}

}
