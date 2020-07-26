package org.loomdev.api.entity.player;

import net.kyori.adventure.text.TextComponent;
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

    void sendActionbar(@NotNull String message);

    void sendActionbar(@NotNull TextComponent message);

    void sendTitle(@NotNull String top, @NotNull String bottom);

    void sendTitle(@NotNull TextComponent top, @NotNull TextComponent bottom);

    void sendTitle(@NotNull String top, @NotNull String bottom, int fadeIn, int stay, int fadeOut);

    void sendTitle(@NotNull TextComponent top, @NotNull TextComponent bottom, int fadeIn, int stay, int fadeOut);

    void showPlayer(@NotNull Player player);

    void hidePlayer(@NotNull Player player);

    boolean canSee(@NotNull Player player);

    @NotNull Optional<InetSocketAddress> getAddress();

    int getProtocolVersion();

    @NotNull TextComponent getTabListName();

    void setTabListName(@NotNull TextComponent text);

    @NotNull Optional<TextComponent> getTabListHeader();

    void setTabListHeader(@NotNull TextComponent text);

    @NotNull Optional<TextComponent> getTabListFooter();

    void setTabListFooter(@NotNull TextComponent text);

    @NotNull Optional<Location> getBedLocation();

    void setBedLocation(@NotNull Location bed);

    // TODO sleeping ignored toggles

    @NotNull Optional<Location> getCompassTarget();

    void setCompassTarget(@NotNull Location target);

    @NotNull Optional<Entity> getSpectatorTarget();

    void setSpectatorTarget(@NotNull Entity target);

    // TODO food, hunger, saturation shit

    long getTime();

    void setTime(long time, boolean relative);

    long getTimeOffset();

    boolean isTimeRelative();

    void syncTime();

    @NotNull Optional<Weather> getWeather();

    void setWeather(@NotNull Weather weather);

    // TODO update, tick, and sync weather

    void resetWeather();

    void kick(@NotNull String message);

    void kick(@NotNull TextComponent message);

    boolean isOp();

    void playSound(@NotNull Sound sound, @NotNull Location location);
}
