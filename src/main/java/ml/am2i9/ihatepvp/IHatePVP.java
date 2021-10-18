package ml.am2i9.ihatepvp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class IHatePVP extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("I Hate PVP!");
        getServer().getPluginManager().registerEvents(new KeepInventory(), this);
    }

    @Override
    public void onDisable() {}
}
