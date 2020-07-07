package org.loomdev.api.entity.player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.loomdev.api.entity.LivingEntity;

public interface Player extends LivingEntity {

    void sendMessage(Component component);

    default void sendMessage(String message) {
        this.sendMessage(TextComponent.of(message));
    }

}
