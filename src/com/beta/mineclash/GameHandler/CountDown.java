package com.beta.mineclash.GameHandler;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_12_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_12_R1.PacketPlayOutTitle.EnumTitleAction;

@SuppressWarnings("unused")
public class CountDown {

	@SuppressWarnings("deprecation")
	public static void startCountDown() throws InterruptedException{
		for (Player players : Bukkit.getOnlinePlayers()) {
			players.sendTitle(ChatColor.GOLD + "Game starts in 10 seconds!",ChatColor.GREEN + "Select your class!");
			Thread.sleep(7000);
			players.sendTitle(ChatColor.GOLD + "Game starting in:",ChatColor.RED + "3");
			Thread.sleep(1000);
			players.sendTitle(ChatColor.GOLD + "Game starting in:",ChatColor.RED + "2");
			Thread.sleep(1000);
			players.sendTitle(ChatColor.GOLD + "Game starting in:",ChatColor.RED + "1");
			MainGame.assignTeams();
			ClassGiver.GiveItems(players.getInventory());
		}
	}
	
}
