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

public class BasicWall implements CommandExecutor{

	//Constructor
	public BasicWall(MineClashBuildCMD mineClashBuildCMD) {}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
		Player player = (Player) sender;
		Block block = player.getTargetBlock(null, 5);
		
		Block block1 = block.getRelative(BlockFace.UP,1);
		Block block2 = block.getRelative(BlockFace.UP,2);
		Block block3 = block.getRelative(BlockFace.UP,3);
		Block block4 = block.getRelative(BlockFace.UP,4);
		Block block5 = block.getRelative(BlockFace.UP,5);
		
		if (block.getType() == Material.SPONGE) {
			player.sendMessage(ChatColor.GOLD + "Building Basic Wall");
			
			block1.setType(Material.SANDSTONE);
			block2.setType(Material.SAND);
			block3.setType(Material.SAND);
			block4.setType(Material.SAND);
			block5.setType(Material.IRON_FENCE);
		}
		else {
			player.sendMessage(ChatColor.GOLD + "Please target a sponge block!");
		}
		return false;
	}

}
