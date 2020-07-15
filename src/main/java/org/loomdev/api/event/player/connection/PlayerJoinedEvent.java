package org.loomdev.api.event.player.connection;

import net.kyori.adventure.text.TextComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.player.PlayerEvent;

import java.util.Optional;

/**
 * Fired when a player joins the server and is about to log into the world.
 * This event cannot be cancelled.
 */
public class PlayerJoinedEvent extends PlayerEvent {

    private TextComponent message;

    public PlayerJoinedEvent(@NotNull Player player, @Nullable TextComponent message) {
        super(player);
        this.message = message;
    }

    public Optional<TextComponent> getMessage() {
        return Optional.ofNullable(this.message);
    }

    public void setMessage(@NotNull TextComponent message) {
        this.message = message;
    }
}
