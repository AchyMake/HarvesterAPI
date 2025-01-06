package org.achymake.harvester;

import org.bukkit.plugin.java.JavaPlugin;

public final class Harvester extends JavaPlugin {
    private static Harvester instance;
    @Override
    public void onEnable() {
        instance = this;
    }
    @Override
    public void onDisable() {
    }
    public static Harvester getInstance() {
        return instance;
    }
}