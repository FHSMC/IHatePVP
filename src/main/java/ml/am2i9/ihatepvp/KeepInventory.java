package ml.am2i9.ihatepvp;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.logging.Logger;

public class KeepInventory implements Listener {

    Logger logger = Bukkit.getLogger();

    /*
     * Enable KeepInventory and KeepXP when a player dies,
     * but only if they are slain by another player.
     */
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Entity killer = player.getKiller();
        if (killer != null) {
            logger.info(player.toString());
            logger.info(killer.toString());

            // Enable KeepInventory and KeepXP
            event.setKeepInventory(true);
            event.setKeepLevel(true);

            // Clear Item and XP drops
            event.getDrops().clear();
            event.setDroppedExp(0);
        }

    }
}
