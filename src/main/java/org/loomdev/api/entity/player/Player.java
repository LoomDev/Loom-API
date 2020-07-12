package org.loomdev.api.entity.player;

import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
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

    void sendActionbar(@NonNull String message);

    void sendActionbar(@NonNull Component message);

    void sendTitle(@NonNull String top, @NonNull String bottom);

    void sendTitle(@NonNull Component top, @NonNull Component bottom);

    void sendTitle(@NonNull String top, @NonNull String bottom, int fadeIn, int stay, int fadeOut);

    void sendTitle(@NonNull Component top, @NonNull Component bottom, int fadeIn, int stay, int fadeOut);

    void showPlayer(@NonNull Player player);

    void hidePlayer(@NonNull Player player);

    boolean canSee(@NonNull Player player);
}
