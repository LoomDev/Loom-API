package org.loomdev.api.event.player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.loomdev.api.entity.player.Player;

public class PlayerJoinedEvent extends PlayerEvent {

    private Component joinMessage;

    public PlayerJoinedEvent(Player player, Component joinMessage) {
        super(player);
        this.joinMessage = joinMessage;
    }

    public String getJoinMessageString() {
        return joinMessage.toString();
    }

    public Component getJoinMessage() {
        return joinMessage;
    }

    public void setJoinMessage(String joinMessage) {
        this.setJoinMessage(TextComponent.of(joinMessage));
    }

    public void setJoinMessage(Component joinMessage) {
        this.joinMessage = joinMessage;
    }
}
