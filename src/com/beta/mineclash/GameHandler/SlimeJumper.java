package com.beta.mineclash.GameHandler;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.beta.mineclash.MineClash;

public class SlimeJumper implements Listener {

	public SlimeJumper(MineClash mineClash) {
	}

	@EventHandler
	public void onPlayerStep(PlayerInteractEvent e) {
		if (e.getAction().equals(Action.PHYSICAL)) {
			Player p = e.getPlayer();
			if (e.getClickedBlock().getType().equals(Material.STONE_PLATE)) {
				Location l = p.getLocation().add(0.0D, 1.0D, 0.0D);
				p.teleport(l);
				p.setVelocity(p.getVelocity().add(p.getLocation().getDirection().multiply(5.5).setY(0.9)));
			}
		}
	}
}
