package com.beta.mineclash.GameHandler;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import com.beta.mineclash.MineClash;

public class PvP implements Listener {

	public PvP(MineClash mineClash) {
	}

	public static boolean inLobby = true;

	@EventHandler
	public void disablePvP(EntityDamageEvent e) {
		if (inLobby == true) {
			if (e.getEntity() instanceof Player) {
				Player p = (Player) e.getEntity();
				if (p instanceof Player) {
					e.setCancelled(true);
				}
			}
		}
	}

	@EventHandler
	public void disableTeamHit(EntityDamageByEntityEvent event) {
		if (inLobby == false) {
			if (event.getEntity() instanceof Player) {
				Player player = (Player) event.getEntity();
				Player dealer = (Player) event.getDamager();
				if ((player instanceof Player) && (dealer instanceof Player)) {
					if ((Team.isInTeamBlue(player)) && (Team.isInTeamBlue(dealer))) {
						player.sendMessage("Blue");
						event.setCancelled(true);
						return;
					}
					if ((Team.isInTeamRed(player)) && (Team.isInTeamRed(dealer))) {
						player.sendMessage("Red");
						event.setCancelled(true);
						return;
					} else {
						event.setCancelled(false);
					}
				}
			}
		}
	}
}
