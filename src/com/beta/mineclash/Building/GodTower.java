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

public class GodTower implements CommandExecutor{
	
	//Constructor
	public GodTower(MineClashBuildCMD mineClashBuildCMD) {}

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
		Block starter_4 = block.getRelative(BlockFace.UP,6);

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
		
		//Layer 5
		Block starter_5 = block.getRelative(BlockFace.UP,5);

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
		
		//Layer 5 Middle blocks
		Block layer6_16 = starter_5.getRelative(BlockFace.UP,2);
		
		Block layer6_17 = layer6_16.getRelative(BlockFace.NORTH,1);
		Block layer6_18 = layer6_17.getRelative(BlockFace.WEST,1);
		Block layer6_19 = layer6_17.getRelative(BlockFace.EAST,1);
		
		Block layer6_20 = layer6_16.getRelative(BlockFace.NORTH,2);
		Block layer6_21 = layer6_20.getRelative(BlockFace.WEST,1);
		Block layer6_22 = layer6_20.getRelative(BlockFace.EAST,1);
		
		Block layer6_23 = layer6_16.getRelative(BlockFace.SOUTH,1);
		Block layer6_24 = layer6_23.getRelative(BlockFace.WEST,1);
		Block layer6_25 = layer6_23.getRelative(BlockFace.EAST,1);
		
		Block layer6_26 = layer6_16.getRelative(BlockFace.SOUTH,2);
		Block layer6_27 = layer6_26.getRelative(BlockFace.WEST,1);
		Block layer6_28 = layer6_26.getRelative(BlockFace.EAST,1);
		
		Block layer6_29 = layer6_16.getRelative(BlockFace.WEST,1);
		Block layer6_30 = layer6_29.getRelative(BlockFace.NORTH,1);
		Block layer6_31 = layer6_29.getRelative(BlockFace.SOUTH,1);
		
		Block layer6_32 = layer6_16.getRelative(BlockFace.WEST,2);
		Block layer6_33 = layer6_32.getRelative(BlockFace.NORTH,1);
		Block layer6_34 = layer6_32.getRelative(BlockFace.SOUTH,1);
		
		Block layer6_35 = layer6_16.getRelative(BlockFace.EAST,1);
		Block layer6_36 = layer6_35.getRelative(BlockFace.NORTH,1);
		Block layer6_37 = layer6_35.getRelative(BlockFace.SOUTH,1);
		
		Block layer6_38 = layer6_16.getRelative(BlockFace.EAST,2);
		Block layer6_39 = layer6_38.getRelative(BlockFace.NORTH,1);
		Block layer6_40 = layer6_38.getRelative(BlockFace.SOUTH,1);
		
		//Layer 6
		Block starter_6 = block.getRelative(BlockFace.UP,7);

		Block layer6_0 = starter_6.getRelative(BlockFace.NORTH,3);
		Block layer6_1 = layer6_0.getRelative(BlockFace.WEST,1);
		Block layer6_2 = layer6_0.getRelative(BlockFace.EAST,1);
		
		Block layer6_3 = layer6_1.getRelative(BlockFace.SOUTH_WEST,1);
		Block layer6_4 = layer6_2.getRelative(BlockFace.SOUTH_EAST,1);
		
		Block layer6_5 = starter_6.getRelative(BlockFace.EAST,3);
		Block layer6_6 = layer6_5.getRelative(BlockFace.NORTH,1);
		Block layer6_7 = layer6_5.getRelative(BlockFace.SOUTH,1);
		
		Block layer6_8 = starter_6.getRelative(BlockFace.SOUTH,3);
		Block layer6_9 = layer6_8.getRelative(BlockFace.WEST,1);
		Block layer6_10 = layer6_8.getRelative(BlockFace.EAST,1);
		
		Block layer6_11 = layer6_9.getRelative(BlockFace.NORTH_WEST,1);
		Block layer6_12 = layer6_10.getRelative(BlockFace.NORTH_EAST,1);
		
		Block layer6_13 = starter_6.getRelative(BlockFace.WEST,3);
		Block layer6_14 = layer6_13.getRelative(BlockFace.NORTH,1);
		Block layer6_15 = layer6_13.getRelative(BlockFace.SOUTH,1);
		
		//Layer 9
		Block starter_9 = block.getRelative(BlockFace.UP,8);

		Block layer7_0 = starter_9.getRelative(BlockFace.NORTH,3);
		Block layer7_1 = layer7_0.getRelative(BlockFace.WEST,1);
		Block layer7_2 = layer7_0.getRelative(BlockFace.EAST,1);
		
		Block layer7_3 = layer7_1.getRelative(BlockFace.SOUTH_WEST,1);
		Block layer7_4 = layer7_2.getRelative(BlockFace.SOUTH_EAST,1);
		
		Block layer7_5 = starter_9.getRelative(BlockFace.EAST,3);
		Block layer7_6 = layer7_5.getRelative(BlockFace.NORTH,1);
		Block layer7_7 = layer7_5.getRelative(BlockFace.SOUTH,1);
		
		Block layer7_8 = starter_9.getRelative(BlockFace.SOUTH,3);
		Block layer7_9 = layer7_8.getRelative(BlockFace.WEST,1);
		Block layer7_10 = layer7_8.getRelative(BlockFace.EAST,1);
		
		Block layer7_11 = layer7_9.getRelative(BlockFace.NORTH_WEST,1);
		Block layer7_12 = layer7_10.getRelative(BlockFace.NORTH_EAST,1);
		
		Block layer7_13 = starter_9.getRelative(BlockFace.WEST,3);
		Block layer7_14 = layer7_13.getRelative(BlockFace.NORTH,1);
		Block layer7_15 = layer7_13.getRelative(BlockFace.SOUTH,1);
		
		
		player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Building: God Tower selected!");		
			
			if (block.getType() == Material.GLOWSTONE) {
				player.sendMessage(ChatColor.GOLD + "Building God Tower");
				
				//Start the building of the tower
				starter_0.setType(Material.BEDROCK);
				//Layer 0
				layer0_0.setType(Material.OBSIDIAN);
				layer0_1.setType(Material.OBSIDIAN);
				layer0_2.setType(Material.OBSIDIAN);
				layer0_3.setType(Material.OBSIDIAN);
				layer0_4.setType(Material.OBSIDIAN);
				layer0_5.setType(Material.OBSIDIAN);
				layer0_6.setType(Material.OBSIDIAN);
				layer0_7.setType(Material.OBSIDIAN);
				layer0_8.setType(Material.OBSIDIAN);
				layer0_9.setType(Material.OBSIDIAN);
				layer0_10.setType(Material.OBSIDIAN);
				layer0_11.setType(Material.OBSIDIAN);
				layer0_12.setType(Material.OBSIDIAN);
				layer0_13.setType(Material.OBSIDIAN);
				layer0_14.setType(Material.OBSIDIAN);
				layer0_15.setType(Material.OBSIDIAN);
				
				//Layer 1
				layer1_0.setType(Material.NETHER_BRICK);
				layer1_1.setType(Material.NETHER_BRICK);
				layer1_2.setType(Material.NETHER_BRICK);
				layer1_3.setType(Material.OBSIDIAN);
				layer1_4.setType(Material.OBSIDIAN);
				layer1_5.setType(Material.NETHER_BRICK);
				layer1_6.setType(Material.NETHER_BRICK);
				layer1_7.setType(Material.NETHER_BRICK);
				layer1_8.setType(Material.NETHER_BRICK);
				layer1_9.setType(Material.NETHER_BRICK);
				layer1_10.setType(Material.NETHER_BRICK);
				layer1_11.setType(Material.OBSIDIAN);
				layer1_12.setType(Material.OBSIDIAN);
				layer1_13.setType(Material.NETHER_BRICK);
				layer1_14.setType(Material.NETHER_BRICK);
				layer1_15.setType(Material.NETHER_BRICK);
				
				//Layer 2
				layer2_0.setType(Material.NETHER_FENCE);
				layer2_1.setType(Material.NETHER_BRICK);
				layer2_2.setType(Material.NETHER_BRICK);
				layer2_3.setType(Material.OBSIDIAN);
				layer2_4.setType(Material.OBSIDIAN);
				layer2_5.setType(Material.NETHER_FENCE);
				layer2_6.setType(Material.NETHER_BRICK);
				layer2_7.setType(Material.NETHER_BRICK);
				layer2_8.setType(Material.NETHER_FENCE);
				layer2_9.setType(Material.NETHER_BRICK);
				layer2_10.setType(Material.NETHER_BRICK);
				layer2_11.setType(Material.OBSIDIAN);
				layer2_12.setType(Material.OBSIDIAN);
				layer2_13.setType(Material.NETHER_FENCE);
				layer2_14.setType(Material.NETHER_BRICK);
				layer2_15.setType(Material.NETHER_BRICK);
				
				//Layer 3
				layer3_0.setType(Material.NETHER_FENCE);
				layer3_1.setType(Material.NETHER_BRICK);
				layer3_2.setType(Material.NETHER_BRICK);
				layer3_3.setType(Material.OBSIDIAN);
				layer3_4.setType(Material.OBSIDIAN);
				layer3_5.setType(Material.NETHER_FENCE);
				layer3_6.setType(Material.NETHER_BRICK);
				layer3_7.setType(Material.NETHER_BRICK);
				layer3_8.setType(Material.NETHER_FENCE);
				layer3_9.setType(Material.NETHER_BRICK);
				layer3_10.setType(Material.NETHER_BRICK);
				layer3_11.setType(Material.OBSIDIAN);
				layer3_12.setType(Material.OBSIDIAN);
				layer3_13.setType(Material.NETHER_FENCE);
				layer3_14.setType(Material.NETHER_BRICK);
				layer3_15.setType(Material.NETHER_BRICK);

				//Layer 4
				layer4_0.setType(Material.NETHER_FENCE);
				layer4_1.setType(Material.NETHER_BRICK);
				layer4_2.setType(Material.NETHER_BRICK);
				layer4_3.setType(Material.OBSIDIAN);
				layer4_4.setType(Material.OBSIDIAN);
				layer4_5.setType(Material.NETHER_FENCE);
				layer4_6.setType(Material.NETHER_BRICK);
				layer4_7.setType(Material.NETHER_BRICK);
				layer4_8.setType(Material.NETHER_FENCE);
				layer4_9.setType(Material.NETHER_BRICK);
				layer4_10.setType(Material.NETHER_BRICK);
				layer4_11.setType(Material.OBSIDIAN);
				layer4_12.setType(Material.OBSIDIAN);
				layer4_13.setType(Material.NETHER_FENCE);
				layer4_14.setType(Material.NETHER_BRICK);
				layer4_15.setType(Material.NETHER_BRICK);
				
				//Layer 5
				layer5_0.setType(Material.NETHER_FENCE);
				layer5_1.setType(Material.NETHER_BRICK);
				layer5_2.setType(Material.NETHER_BRICK);
				layer5_3.setType(Material.OBSIDIAN);
				layer5_4.setType(Material.OBSIDIAN);
				layer5_5.setType(Material.NETHER_FENCE);
				layer5_6.setType(Material.NETHER_BRICK);
				layer5_7.setType(Material.NETHER_BRICK);
				layer5_8.setType(Material.NETHER_FENCE);
				layer5_9.setType(Material.NETHER_BRICK);
				layer5_10.setType(Material.NETHER_BRICK);
				layer5_11.setType(Material.OBSIDIAN);
				layer5_12.setType(Material.OBSIDIAN);
				layer5_13.setType(Material.NETHER_FENCE);
				layer5_14.setType(Material.NETHER_BRICK);
				layer5_15.setType(Material.NETHER_BRICK);
				
				//Layer 6
				layer6_0.setType(Material.NETHER_BRICK);
				layer6_1.setType(Material.NETHER_BRICK);
				layer6_2.setType(Material.NETHER_BRICK);
				layer6_3.setType(Material.OBSIDIAN);
				layer6_4.setType(Material.OBSIDIAN);
				layer6_5.setType(Material.NETHER_BRICK);
				layer6_6.setType(Material.NETHER_BRICK);
				layer6_7.setType(Material.NETHER_BRICK);
				layer6_8.setType(Material.NETHER_BRICK);
				layer6_9.setType(Material.NETHER_BRICK);
				layer6_10.setType(Material.NETHER_BRICK);
				layer6_11.setType(Material.OBSIDIAN);
				layer6_12.setType(Material.OBSIDIAN);
				layer6_13.setType(Material.NETHER_BRICK);
				layer6_14.setType(Material.NETHER_BRICK);
				layer6_15.setType(Material.NETHER_BRICK);
				
				//Layer 6 Middle Blocks
				layer6_16.setType(Material.MAGMA);
				layer6_17.setType(Material.NETHER_BRICK);
				layer6_18.setType(Material.NETHER_BRICK);
				layer6_19.setType(Material.NETHER_BRICK);
				layer6_20.setType(Material.NETHER_BRICK);
				layer6_21.setType(Material.NETHER_BRICK);
				layer6_22.setType(Material.NETHER_BRICK);
				layer6_23.setType(Material.NETHER_BRICK);
				layer6_24.setType(Material.NETHER_BRICK);
				layer6_25.setType(Material.NETHER_BRICK);
				layer6_26.setType(Material.NETHER_BRICK);
				layer6_27.setType(Material.NETHER_BRICK);
				layer6_28.setType(Material.NETHER_BRICK);
				layer6_29.setType(Material.NETHER_BRICK);
				layer6_30.setType(Material.NETHER_BRICK);
				layer6_31.setType(Material.NETHER_BRICK);
				layer6_32.setType(Material.NETHER_BRICK);
				layer6_33.setType(Material.NETHER_BRICK);
				layer6_34.setType(Material.NETHER_BRICK);
				layer6_35.setType(Material.NETHER_BRICK);
				layer6_36.setType(Material.NETHER_BRICK);
				layer6_37.setType(Material.NETHER_BRICK);
				layer6_38.setType(Material.NETHER_BRICK);
				layer6_39.setType(Material.NETHER_BRICK);
				layer6_40.setType(Material.NETHER_BRICK);
				
				//Layer 7
				layer7_0.setType(Material.NETHER_FENCE);
				layer7_1.setType(Material.NETHER_FENCE);
				layer7_2.setType(Material.NETHER_FENCE);
				layer7_3.setType(Material.OBSIDIAN);
				layer7_4.setType(Material.OBSIDIAN);
				layer7_5.setType(Material.NETHER_FENCE);
				layer7_6.setType(Material.NETHER_FENCE);
				layer7_7.setType(Material.NETHER_FENCE);
				layer7_8.setType(Material.NETHER_FENCE);
				layer7_9.setType(Material.NETHER_FENCE);
				layer7_10.setType(Material.NETHER_FENCE);
				layer7_11.setType(Material.OBSIDIAN);
				layer7_12.setType(Material.OBSIDIAN);
				layer7_13.setType(Material.NETHER_FENCE);
				layer7_14.setType(Material.NETHER_FENCE);
				layer7_15.setType(Material.NETHER_FENCE);
				
				
				if (block2.getType() == Material.GLOWSTONE ) {
		
					Loc.add(0, 10, 0);
					player.teleport(Loc);
				}
			}
			else {
				player.sendMessage(ChatColor.GOLD + "Please target a glowstone block!");
			}
		return false;
	}		
}

