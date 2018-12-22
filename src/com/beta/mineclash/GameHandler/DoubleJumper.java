package com.beta.mineclash.GameHandler;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

import com.beta.mineclash.MineClash;

public class DoubleJumper implements Listener {

	public DoubleJumper(MineClash mineClash) {
	}

	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if ((p.getGameMode() == GameMode.CREATIVE) || (p.getGameMode() == GameMode.SPECTATOR)) {
			return;
		}
		if ((p.isOnGround()) && (!p.getAllowFlight())) {
			p.setAllowFlight(true);
		}
	}

	@EventHandler
	public void onPlayerToggleFly(PlayerToggleFlightEvent e) {
		Player p = e.getPlayer();
		if ((p.getGameMode() == GameMode.CREATIVE) || (p.getGameMode() == GameMode.SPECTATOR)) {
			return;
		}
		if(!Team.isInTeam(p)) {
			return;
		}
		e.setCancelled(true);
		p.setFlying(false);
		p.setAllowFlight(false);
		p.setFallDistance(6.0F);
		Location loc = p.getLocation();
		Vector v = loc.getDirection().multiply(0.9F).setY(1D);
		p.setVelocity(v);
		loc.getWorld().playSound(loc, Sound.ENTITY_FIREWORK_LARGE_BLAST, 1.0F, 0.2F);
	}
}
