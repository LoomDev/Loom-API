package org.loomdev.api.entity.player;

import net.kyori.adventure.text.Component;
import org.loomdev.api.entity.LivingEntity;

public interface Player extends LivingEntity {

    boolean isSneaking();

    void setSneaking(boolean flag);

    boolean isSprinting();

    void setSprinting(boolean flag);

    float getWalkSpeed();

    void setWalkSpeed(float speed);

    float getFlySpeed();

    void setFlySpeed(float speed);

    void updateInventory();

    void sendActionbar(String message);

    void sendActionbar(Component message);

    void sendTitle(String top, String bottom);

    void sendTitle(Component top, Component bottom);

    void sendTitle(String top, String bottom, int fadeIn, int stay, int fadeOut);

    void sendTitle(Component top, Component bottom, int fadeIn, int stay, int fadeOut);
}
