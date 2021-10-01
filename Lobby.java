package com.zashiki.genbako.lobby;

import org.bukkit.plugin.java.JavaPlugin;

public final class Lobby extends JavaPlugin implements
        CommandExecutor {

    name:lobby
    version:1.12.2


    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("プラグイン有効");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("プラグイン無効");
    }


    @EventHandler
    public void Welcome(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("アジ鯖へようこそ！");
    }
}