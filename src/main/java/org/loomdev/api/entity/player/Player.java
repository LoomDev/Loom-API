package org.loomdev.api.entity.player;

import net.kyori.adventure.text.TextComponent;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.entity.LivingEntity;
import org.loomdev.api.sound.Sound;
import org.loomdev.api.world.Location;
import org.loomdev.api.world.Weather;

import java.net.InetSocketAddress;
import java.util.Optional;

public interface Player extends LivingEntity {

    boolean isConnected();

    boolean isSneaking();

    void setSneaking(boolean sneaking);

    boolean isSprinting();

    void setSprinting(boolean sprinting);

    float getWalkSpeed();

    void setWalkSpeed(float speed);

    float getFlySpeed();

    void setFlySpeed(float speed);

    int getViewDistance();

    void updateInventory();

    void sendActionbar(@NonNull String message);

    void sendActionbar(@NonNull TextComponent message);

    void sendTitle(@NonNull String top, @NonNull String bottom);

    void sendTitle(@NonNull TextComponent top, @NonNull TextComponent bottom);

    void sendTitle(@NonNull String top, @NonNull String bottom, int fadeIn, int stay, int fadeOut);

    void sendTitle(@NonNull TextComponent top, @NonNull TextComponent bottom, int fadeIn, int stay, int fadeOut);

    void showPlayer(@NonNull Player player);

    void hidePlayer(@NonNull Player player);

    boolean canSee(@NonNull Player player);

    @NonNull Optional<InetSocketAddress> getAddress();

    int getProtocolVersion();

    @NonNull Optional<TextComponent> getTabListName();

    void setTabListName(@NonNull TextComponent text);

    @NonNull Optional<TextComponent> getTabListHeader();

    void setTabListHeader(@NonNull TextComponent text);

    @NonNull Optional<TextComponent> getTabListFooter();

    void setTabListFooter(@NonNull TextComponent text);

    @NonNull Optional<Location> getBedLocation();

    void setBedLocation(@NonNull Location bed);

    // TODO sleeping ignored toggles

    @NonNull Optional<Location> getCompassTarget();

    void setCompassTarget(@NonNull Location target);

    @NonNull Optional<Entity> getSpectatorTarget();

    void setSpectatorTarget(@NonNull Entity target);

    // TODO food, hunger, saturation shit

    @NonNull Optional<Weather> getWeather();

    void setWeather(@NonNull Weather weather);

    void resetWeather();

    void kick(@NonNull String message);

    void kick(@NonNull TextComponent message);

    boolean isOp();

    void playSound(@NotNull Sound sound, @NotNull Location location);
}
