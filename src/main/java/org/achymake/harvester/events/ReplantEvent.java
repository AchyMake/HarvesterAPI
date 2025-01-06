package org.achymake.harvester.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.checkerframework.checker.nullness.qual.NonNull;

public class ReplantEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final Block block;
    private boolean cancelled;
    public ReplantEvent(Player player, Block block) {
        this.player = player;
        this.block = block;
    }
    public Player getPlayer() {
        return player;
    }
    public Block getBlock() {
        return block;
    }
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
    public boolean isCancelled() {
        return cancelled;
    }
    public @NonNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}