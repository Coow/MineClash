package com.beta.mineclash.GameHandler;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public class Class {
	
	private static List<String> ninja = new ArrayList<String>();
	private static List<String> archer = new ArrayList<String>();
	private static List<String> miner = new ArrayList<String>();
	private static List<String> fighter = new ArrayList<String>();
	private static List<String> mage = new ArrayList<String>();
	
	public static void addToClass(ClassType type, Player player) {
		if (isInClass(player)) {
			removePlayer(player);
		}
		switch(type) {
		case NINJA:
			ninja.add(player.getName());
			break;
		case ARCHER:
			archer.add(player.getName());
			break;
		case FIGHTER:
			fighter.add(player.getName());
			break;
		case MINER:
			miner.add(player.getName());
			break;
		case MAGE:
			mage.add(player.getName());
			break;
		}
	}
	
	public static boolean isInClass(Player player) {
		return ninja.contains(player.getName()) || 
				archer.contains(player.getName()) || 
				miner.contains(player.getName()) || 
				fighter.contains(player.getName()) ||
				mage.contains(player.getName());
	}
	
	public static void removePlayer(Player player) {
		ninja.remove(player.getName());
		archer.remove(player.getName());
		miner.remove(player.getName());
		fighter.remove(player.getName());
		mage.remove(player.getName());
	}
	
	public static boolean isANinja(Player player) {
		return ninja.contains(player.getName());
	}
	public static boolean isAArcher(Player player) {
		return archer.contains(player.getName());
	}
	public static boolean isAMiner(Player player) {
		return miner.contains(player.getName());
	}
	public static boolean isAFigther(Player player) {
		return fighter.contains(player.getName());
	}
	public static boolean isAMage(Player player) {
		return mage.contains(player.getName());
	}
}
