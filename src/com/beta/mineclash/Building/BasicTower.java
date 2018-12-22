package com.beta.mineclash.Building;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.beta.mineclash.MineClashBuildCMD;

public class BasicTower implements CommandExecutor{
	
	//Constructor
	public BasicTower(MineClashBuildCMD mineClashBuildCMD) {}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		Block block = player.getTargetBlock(null, 5);
		Location Loc = player.getLocation();
		Block block2 = player.getTargetBlock(null, 4);
		
		//Start array of the tower...
		//Naming: Layer(Layer Number)_(Block Number)
		Block starter_0 = block.getRelative(BlockFace.UP,1);
		//Layer0
		Block layer0_0 = starter_0.getRelative(BlockFace.NORTH,3);
		Block layer0_1 = layer0_0.getRelative(BlockFace.WEST,1);
		Block layer0_2 = layer0_0.getRelative(BlockFace.EAST,1);
		
		Block layer0_3 = layer0_1.getRelative(BlockFace.SOUTH_WEST,1);
		Block layer0_4 = layer0_2.getRelative(BlockFace.SOUTH_EAST,1);
		
		Block layer0_5 = starter_0.getRelative(BlockFace.EAST,3);
		Block layer0_6 = layer0_5.getRelative(BlockFace.NORTH,1);
		Block layer0_7 = layer0_5.getRelative(BlockFace.SOUTH,1);
		
		Block layer0_8 = starter_0.getRelative(BlockFace.SOUTH,3);
		Block layer0_9 = layer0_8.getRelative(BlockFace.WEST,1);
		Block layer0_10 = layer0_8.getRelative(BlockFace.EAST,1);
		
		Block layer0_11 = layer0_9.getRelative(BlockFace.NORTH_WEST,1);
		Block layer0_12 = layer0_10.getRelative(BlockFace.NORTH_EAST,1);
		
		Block layer0_13 = starter_0.getRelative(BlockFace.WEST,3);
		Block layer0_14 = layer0_13.getRelative(BlockFace.NORTH,1);
		Block layer0_15 = layer0_13.getRelative(BlockFace.SOUTH,1);
		
		//Layer1
		Block starter_1 = block.getRelative(BlockFace.UP,2);

		Block layer1_0 = starter_1.getRelative(BlockFace.NORTH,3);
		Block layer1_1 = layer1_0.getRelative(BlockFace.WEST,1);
		Block layer1_2 = layer1_0.getRelative(BlockFace.EAST,1);
		
		Block layer1_3 = layer1_1.getRelative(BlockFace.SOUTH_WEST,1);
		Block layer1_4 = layer1_2.getRelative(BlockFace.SOUTH_EAST,1);
		
		Block layer1_5 = starter_1.getRelative(BlockFace.EAST,3);
		Block layer1_6 = layer1_5.getRelative(BlockFace.NORTH,1);
		Block layer1_7 = layer1_5.getRelative(BlockFace.SOUTH,1);
		
		Block layer1_8 = starter_1.getRelative(BlockFace.SOUTH,3);
		Block layer1_9 = layer1_8.getRelative(BlockFace.WEST,1);
		Block layer1_10 = layer1_8.getRelative(BlockFace.EAST,1);
		
		Block layer1_11 = layer1_9.getRelative(BlockFace.NORTH_WEST,1);
		Block layer1_12 = layer1_10.getRelative(BlockFace.NORTH_EAST,1);
		
		Block layer1_13 = starter_1.getRelative(BlockFace.WEST,3);
		Block layer1_14 = layer1_13.getRelative(BlockFace.NORTH,1);
		Block layer1_15 = layer1_13.getRelative(BlockFace.SOUTH,1);
		
		//Layer 2
		Block starter_2 = block.getRelative(BlockFace.UP,3);

		Block layer2_0 = starter_2.getRelative(BlockFace.NORTH,3);
		Block layer2_1 = layer2_0.getRelative(BlockFace.WEST,1);
		Block layer2_2 = layer2_0.getRelative(BlockFace.EAST,1);
		
		Block layer2_3 = layer2_1.getRelative(BlockFace.SOUTH_WEST,1);
		Block layer2_4 = layer2_2.getRelative(BlockFace.SOUTH_EAST,1);
		
		Block layer2_5 = starter_2.getRelative(BlockFace.EAST,3);
		Block layer2_6 = layer2_5.getRelative(BlockFace.NORTH,1);
		Block layer2_7 = layer2_5.getRelative(BlockFace.SOUTH,1);
		
		Block layer2_8 = starter_2.getRelative(BlockFace.SOUTH,3);
		Block layer2_9 = layer2_8.getRelative(BlockFace.WEST,1);
		Block layer2_10 = layer2_8.getRelative(BlockFace.EAST,1);
		
		Block layer2_11 = layer2_9.getRelative(BlockFace.NORTH_WEST,1);
		Block layer2_12 = layer2_10.getRelative(BlockFace.NORTH_EAST,1);
		
		Block layer2_13 = starter_2.getRelative(BlockFace.WEST,3);
		Block layer2_14 = layer2_13.getRelative(BlockFace.NORTH,1);
		Block layer2_15 = layer2_13.getRelative(BlockFace.SOUTH,1);
		
		//Layer 3
		Block starter_3 = block.getRelative(BlockFace.UP,4);

		Block layer3_0 = starter_3.getRelative(BlockFace.NORTH,3);
		Block layer3_1 = layer3_0.getRelative(BlockFace.WEST,1);
		Block layer3_2 = layer3_0.getRelative(BlockFace.EAST,1);
		
		Block layer3_3 = layer3_1.getRelative(BlockFace.SOUTH_WEST,1);
		Block layer3_4 = layer3_2.getRelative(BlockFace.SOUTH_EAST,1);
		
		Block layer3_5 = starter_3.getRelative(BlockFace.EAST,3);
		Block layer3_6 = layer3_5.getRelative(BlockFace.NORTH,1);
		Block layer3_7 = layer3_5.getRelative(BlockFace.SOUTH,1);
		
		Block layer3_8 = starter_3.getRelative(BlockFace.SOUTH,3);
		Block layer3_9 = layer3_8.getRelative(BlockFace.WEST,1);
		Block layer3_10 = layer3_8.getRelative(BlockFace.EAST,1);
		
		Block layer3_11 = layer3_9.getRelative(BlockFace.NORTH_WEST,1);
		Block layer3_12 = layer3_10.getRelative(BlockFace.NORTH_EAST,1);
		
		Block layer3_13 = starter_3.getRelative(BlockFace.WEST,3);
		Block layer3_14 = layer3_13.getRelative(BlockFace.NORTH,1);
		Block layer3_15 = layer3_13.getRelative(BlockFace.SOUTH,1);
		
		//Layer 4
		Block starter_4 = block.getRelative(BlockFace.UP,5);

		Block layer4_0 = starter_4.getRelative(BlockFace.NORTH,3);
		Block layer4_1 = layer4_0.getRelative(BlockFace.WEST,1);
		Block layer4_2 = layer4_0.getRelative(BlockFace.EAST,1);
		
		Block layer4_3 = layer4_1.getRelative(BlockFace.SOUTH_WEST,1);
		Block layer4_4 = layer4_2.getRelative(BlockFace.SOUTH_EAST,1);
		
		Block layer4_5 = starter_4.getRelative(BlockFace.EAST,3);
		Block layer4_6 = layer4_5.getRelative(BlockFace.NORTH,1);
		Block layer4_7 = layer4_5.getRelative(BlockFace.SOUTH,1);
		
		Block layer4_8 = starter_4.getRelative(BlockFace.SOUTH,3);
		Block layer4_9 = layer4_8.getRelative(BlockFace.WEST,1);
		Block layer4_10 = layer4_8.getRelative(BlockFace.EAST,1);
		
		Block layer4_11 = layer4_9.getRelative(BlockFace.NORTH_WEST,1);
		Block layer4_12 = layer4_10.getRelative(BlockFace.NORTH_EAST,1);
		
		Block layer4_13 = starter_4.getRelative(BlockFace.WEST,3);
		Block layer4_14 = layer4_13.getRelative(BlockFace.NORTH,1);
		Block layer4_15 = layer4_13.getRelative(BlockFace.SOUTH,1);
		//Layer 4 Middle blocks
		Block layer4_16 = starter_4.getRelative(BlockFace.DOWN,0);
		
		Block layer4_17 = starter_4.getRelative(BlockFace.NORTH,1);
		Block layer4_18 = layer4_17.getRelative(BlockFace.WEST,1);
		Block layer4_19 = layer4_17.getRelative(BlockFace.EAST,1);
		
		Block layer4_20 = starter_4.getRelative(BlockFace.NORTH,2);
		Block layer4_21 = layer4_20.getRelative(BlockFace.WEST,1);
		Block layer4_22 = layer4_20.getRelative(BlockFace.EAST,1);
		
		Block layer4_23 = starter_4.getRelative(BlockFace.SOUTH,1);
		Block layer4_24 = layer4_23.getRelative(BlockFace.WEST,1);
		Block layer4_25 = layer4_23.getRelative(BlockFace.EAST,1);
		
		Block layer4_26 = starter_4.getRelative(BlockFace.SOUTH,2);
		Block layer4_27 = layer4_26.getRelative(BlockFace.WEST,1);
		Block layer4_28 = layer4_26.getRelative(BlockFace.EAST,1);
		
		Block layer4_29 = starter_4.getRelative(BlockFace.WEST,1);
		Block layer4_30 = layer4_29.getRelative(BlockFace.NORTH,1);
		Block layer4_31 = layer4_29.getRelative(BlockFace.SOUTH,1);
		
		Block layer4_32 = starter_4.getRelative(BlockFace.WEST,2);
		Block layer4_33 = layer4_32.getRelative(BlockFace.NORTH,1);
		Block layer4_34 = layer4_32.getRelative(BlockFace.SOUTH,1);
		
		Block layer4_35 = starter_4.getRelative(BlockFace.EAST,1);
		Block layer4_36 = layer4_35.getRelative(BlockFace.NORTH,1);
		Block layer4_37 = layer4_35.getRelative(BlockFace.SOUTH,1);
		
		Block layer4_38 = starter_4.getRelative(BlockFace.EAST,2);
		Block layer4_39 = layer4_38.getRelative(BlockFace.NORTH,1);
		Block layer4_40 = layer4_38.getRelative(BlockFace.SOUTH,1);
		
		//Layer 5
		Block starter_5 = block.getRelative(BlockFace.UP,6);

		Block layer5_0 = starter_5.getRelative(BlockFace.NORTH,3);
		Block layer5_1 = layer5_0.getRelative(BlockFace.WEST,1);
		Block layer5_2 = layer5_0.getRelative(BlockFace.EAST,1);
		
		Block layer5_3 = layer5_1.getRelative(BlockFace.SOUTH_WEST,1);
		Block layer5_4 = layer5_2.getRelative(BlockFace.SOUTH_EAST,1);
		
		Block layer5_5 = starter_5.getRelative(BlockFace.EAST,3);
		Block layer5_6 = layer5_5.getRelative(BlockFace.NORTH,1);
		Block layer5_7 = layer5_5.getRelative(BlockFace.SOUTH,1);
		
		Block layer5_8 = starter_5.getRelative(BlockFace.SOUTH,3);
		Block layer5_9 = layer5_8.getRelative(BlockFace.WEST,1);
		Block layer5_10 = layer5_8.getRelative(BlockFace.EAST,1);
		
		Block layer5_11 = layer5_9.getRelative(BlockFace.NORTH_WEST,1);
		Block layer5_12 = layer5_10.getRelative(BlockFace.NORTH_EAST,1);
		
		Block layer5_13 = starter_5.getRelative(BlockFace.WEST,3);
		Block layer5_14 = layer5_13.getRelative(BlockFace.NORTH,1);
		Block layer5_15 = layer5_13.getRelative(BlockFace.SOUTH,1);
		
		
		player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Building: Basic Tower selected!");		
			
			if (block.getType() == Material.GLOWSTONE) {
				player.sendMessage(ChatColor.GOLD + "Building Basic Tower");
				
				//Start the building of the tower
				//starter_0.setType(Material.BEDROCK);
				//Layer 0
				layer0_0.setType(Material.SANDSTONE);
				layer0_1.setType(Material.SANDSTONE);
				layer0_2.setType(Material.SANDSTONE);
				layer0_3.setType(Material.SANDSTONE);
				layer0_4.setType(Material.SANDSTONE);
				layer0_5.setType(Material.SANDSTONE);
				layer0_6.setType(Material.SANDSTONE);
				layer0_7.setType(Material.SANDSTONE);
				layer0_8.setType(Material.SANDSTONE);
				layer0_9.setType(Material.SANDSTONE);
				layer0_10.setType(Material.SANDSTONE);
				layer0_11.setType(Material.SANDSTONE);
				layer0_12.setType(Material.SANDSTONE);
				layer0_13.setType(Material.SANDSTONE);
				layer0_14.setType(Material.SANDSTONE);
				layer0_15.setType(Material.SANDSTONE);
				
				//Layer 1
				layer1_0.setType(Material.SAND);
				layer1_1.setType(Material.SAND);
				layer1_2.setType(Material.SAND);
				layer1_3.setType(Material.SANDSTONE);
				layer1_4.setType(Material.SANDSTONE);
				layer1_5.setType(Material.SAND);
				layer1_6.setType(Material.SAND);
				layer1_7.setType(Material.SAND);
				layer1_8.setType(Material.SAND);
				layer1_9.setType(Material.SAND);
				layer1_10.setType(Material.SAND);
				layer1_11.setType(Material.SANDSTONE);
				layer1_12.setType(Material.SANDSTONE);
				layer1_13.setType(Material.SAND);
				layer1_14.setType(Material.SAND);
				layer1_15.setType(Material.SAND);
				
				//Layer 2
				layer2_0.setType(Material.IRON_FENCE);
				layer2_1.setType(Material.SAND);
				layer2_2.setType(Material.SAND);
				layer2_3.setType(Material.SANDSTONE);
				layer2_4.setType(Material.SANDSTONE);
				layer2_5.setType(Material.IRON_FENCE);
				layer2_6.setType(Material.SAND);
				layer2_7.setType(Material.SAND);
				layer2_8.setType(Material.IRON_FENCE);
				layer2_9.setType(Material.SAND);
				layer2_10.setType(Material.SAND);
				layer2_11.setType(Material.SANDSTONE);
				layer2_12.setType(Material.SANDSTONE);
				layer2_13.setType(Material.IRON_FENCE);
				layer2_14.setType(Material.SAND);
				layer2_15.setType(Material.SAND);
				
				//Layer 3
				layer3_0.setType(Material.IRON_FENCE);
				layer3_1.setType(Material.SAND);
				layer3_2.setType(Material.SAND);
				layer3_3.setType(Material.SANDSTONE);
				layer3_4.setType(Material.SANDSTONE);
				layer3_5.setType(Material.IRON_FENCE);
				layer3_6.setType(Material.SAND);
				layer3_7.setType(Material.SAND);
				layer3_8.setType(Material.IRON_FENCE);
				layer3_9.setType(Material.SAND);
				layer3_10.setType(Material.SAND);
				layer3_11.setType(Material.SANDSTONE);
				layer3_12.setType(Material.SANDSTONE);
				layer3_13.setType(Material.IRON_FENCE);
				layer3_14.setType(Material.SAND);
				layer3_15.setType(Material.SAND);
				
				//Layer 4
				layer4_0.setType(Material.SAND);
				layer4_1.setType(Material.SAND);
				layer4_2.setType(Material.SAND);
				layer4_3.setType(Material.SANDSTONE);
				layer4_4.setType(Material.SANDSTONE);
				layer4_5.setType(Material.SAND);
				layer4_6.setType(Material.SAND);
				layer4_7.setType(Material.SAND);
				layer4_8.setType(Material.SAND);
				layer4_9.setType(Material.SAND);
				layer4_10.setType(Material.SAND);
				layer4_11.setType(Material.SANDSTONE);
				layer4_12.setType(Material.SANDSTONE);
				layer4_13.setType(Material.SAND);
				layer4_14.setType(Material.SAND);
				layer4_15.setType(Material.SAND);
				
				//Layer 4 Middle Blocks
				layer4_16.setType(Material.SOUL_SAND);
				layer4_17.setType(Material.SANDSTONE);
				layer4_18.setType(Material.SANDSTONE);
				layer4_19.setType(Material.SANDSTONE);
				layer4_20.setType(Material.SANDSTONE);
				layer4_21.setType(Material.SANDSTONE);
				layer4_22.setType(Material.SANDSTONE);
				layer4_23.setType(Material.SANDSTONE);
				layer4_24.setType(Material.SANDSTONE);
				layer4_25.setType(Material.SANDSTONE);
				layer4_26.setType(Material.SANDSTONE);
				layer4_27.setType(Material.SANDSTONE);
				layer4_28.setType(Material.SANDSTONE);
				layer4_29.setType(Material.SANDSTONE);
				layer4_30.setType(Material.SANDSTONE);
				layer4_31.setType(Material.SANDSTONE);
				layer4_32.setType(Material.SANDSTONE);
				layer4_33.setType(Material.SANDSTONE);
				layer4_34.setType(Material.SANDSTONE);
				layer4_35.setType(Material.SANDSTONE);
				layer4_36.setType(Material.SANDSTONE);
				layer4_37.setType(Material.SANDSTONE);
				layer4_38.setType(Material.SANDSTONE);
				layer4_39.setType(Material.SANDSTONE);
				layer4_40.setType(Material.SANDSTONE);
				
				//Layer 5
				layer5_0.setType(Material.IRON_FENCE);
				layer5_1.setType(Material.IRON_FENCE);
				layer5_2.setType(Material.IRON_FENCE);
				layer5_3.setType(Material.SANDSTONE);
				layer5_4.setType(Material.SANDSTONE);
				layer5_5.setType(Material.IRON_FENCE);
				layer5_6.setType(Material.IRON_FENCE);
				layer5_7.setType(Material.IRON_FENCE);
				layer5_8.setType(Material.IRON_FENCE);
				layer5_9.setType(Material.IRON_FENCE);
				layer5_10.setType(Material.IRON_FENCE);
				layer5_11.setType(Material.SANDSTONE);
				layer5_12.setType(Material.SANDSTONE);
				layer5_13.setType(Material.IRON_FENCE);
				layer5_14.setType(Material.IRON_FENCE);
				layer5_15.setType(Material.IRON_FENCE);
				
				
				if (block2.getType() == Material.GLOWSTONE ) {
					
					Loc.add(0, 8, 0);
					player.teleport(Loc);
				}
			}
			else {
				player.sendMessage(ChatColor.GOLD + "Please target a glowstone block!");
			}
		return false;
	}		
}

