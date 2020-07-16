package org.loomdev.api.event.player.movement;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.Cancellable;
import org.loomdev.api.event.player.PlayerEvent;

/**
 * Fired when a player enters swimming mode in water.
 * The player will not enter swimming mode if this event is cancelled.
 */
public class PlayerEnteredSwimmingEvent extends PlayerEvent implements Cancellable {

    private boolean cancelled;

    public PlayerEnteredSwimmingEvent(@NotNull Player player) {
        super(player);
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void cancel(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
