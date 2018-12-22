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

public class StoneWall implements CommandExecutor{

	//Constructor
	public StoneWall(MineClashBuildCMD mineClashBuildCMD) {}
	
	
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
		
		if (block.getType() == Material.SPONGE) {
			player.sendMessage(ChatColor.GOLD + "Building Stone Wall");
			
			block1.setType(Material.SMOOTH_BRICK);
			block2.setType(Material.COBBLESTONE);
			block3.setType(Material.COBBLESTONE);
			block4.setType(Material.COBBLESTONE);
			block5.setType(Material.COBBLESTONE);
			block6.setType(Material.COBBLE_WALL);
		}
		else {
			player.sendMessage(ChatColor.GOLD + "Please target a sponge block!");
		}
		return false;
	}

}
