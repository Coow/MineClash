package com.beta.mineclash.GameHandler;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class Team {

	private static List<String> redTeam = new ArrayList<String>();
	private static List<String> blueTeam = new ArrayList<String>();
	private static List<String> specTeam = new ArrayList<String>();

	public static void addToTeam(TeamType type, Player player) {

		if (isInTeam(player)) {
			player.sendMessage("You are already in a team");
			return;
		}

		switch (type) {
		case RED:
			redTeam.add(player.getName());
			break;
		case BLUE:
			blueTeam.add(player.getName());
			break;
		case SPEC:
			specTeam.add(player.getName());
			player.setGameMode(GameMode.SPECTATOR);
		}
		player.sendMessage("Added to " + type.name() + " team!");
	}

	public static boolean isInTeam(Player player) {
		return redTeam.contains(player.getName()) || blueTeam.contains(player.getName());
	}

	public static boolean isInTeamBlue(Player player) {
		return blueTeam.contains(player.getName());
	}

	public static boolean isInTeamRed(Player player) {
		return redTeam.contains(player.getName());
	}

	public static void removePlayer(Player player) {
		redTeam.remove(player.getName());
		blueTeam.remove(player.getName());
	}

	public static void moveTeam(Player player) {
		specTeam.add(player.getName());
	}

	public static void clearTeam() {
		redTeam.clear();
		blueTeam.clear();
	}

	public static List<String> getRedTeam() {
		return redTeam;
	}

	public static List<String> getBlueTeam() {
		return blueTeam;
	}

	public static List<String> getSpecTeam() {
		return specTeam;
	}

	public static List<String> getAllPlayersInTeams() {
		List<String> combinedTeams = new ArrayList<String>();
		combinedTeams.addAll(redTeam);
		combinedTeams.addAll(blueTeam);
		combinedTeams.addAll(specTeam);
		return combinedTeams;
	}

	public static TeamType getTeamType(Player player) {
		if (!isInTeam(player))
			return null;
		return (redTeam.contains(player.getName()) ? TeamType.RED : TeamType.BLUE);
	}
}
