package org.loomdev.api.event.player.connection;

import lombok.Getter;
import lombok.NonNull;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.player.PlayerEvent;

public class PlayerJoinedEvent extends PlayerEvent {

    @Getter
    private Component joinMessage;

    public PlayerJoinedEvent(@NonNull Player player, @NonNull Component joinMessage) {
        super(player);
        this.joinMessage = joinMessage;
    }

    public void setJoinMessage(String message) {
        this.setJoinMessage(TextComponent.of(message));
    }

    public void setJoinMessage(Component message) {
        this.joinMessage = message;
    }
}
