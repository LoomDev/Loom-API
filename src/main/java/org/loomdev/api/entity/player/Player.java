package org.loomdev.api.entity.player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.entity.LivingEntity;

public interface Player extends LivingEntity {

    void sendMessage(@NonNull Component component);

    default void sendMessage(@NonNull String message) {
        this.sendMessage(TextComponent.of(message));
    }

    boolean isSneaking();

    void setSneaking(boolean flag);

    boolean isSprinting();

    void setSprinting(boolean flag);

    float getWalkSpeed();

    void setWalkSpeed(float speed);

    float getFlySpeed();

    void setFlySpeed(float speed);

}
