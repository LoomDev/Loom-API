package org.loomdev.api.event.player.connection;

import lombok.Getter;
import lombok.NonNull;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.player.PlayerEvent;

public class PlayerDisconnectedEvent extends PlayerEvent {

    @Getter
    private Component disconnectMessage;

    public PlayerDisconnectedEvent(@NonNull Player player, @NonNull Component disconnectMessage) {
        super(player);
        this.disconnectMessage = disconnectMessage;
    }

    public void setDisconnectMessage(String message) {
        this.setDisconnectMessage(TextComponent.of(message));
    }

    public void setDisconnectMessage(Component message) {
        this.disconnectMessage = message;
    }
}
