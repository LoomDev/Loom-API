package org.loomdev.api.bossbar;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.entity.player.Player;

import java.util.Collection;
import java.util.UUID;

public interface BossBar {

    @NotNull UUID getUUID();

    @NotNull Component getText();

    void setText(@NotNull String text);

    void setText(@NotNull Component text);

    float getPercent();

    void setPercent(float percent);

    @NotNull Color getColor();

    void setColor(@NotNull Color color);

    @NotNull Style getStyle();

    void setStyle(@NotNull Style style);

    boolean isVisible();

    void setVisible(boolean visible);

    boolean isDarkenSky();

    void setDarkenSky(boolean darkenSky);

    boolean isThickenFog();

    void setThickenFog(boolean thickenFog);

    boolean hasDragonMusic();

    void setDragonMusic(boolean music);

    @NotNull Collection<? extends Player> getPlayers();

    void addPlayer(@NotNull Player player);

    void removePlayer(@NotNull Player player);

    void removeAll();

    enum Color {
        PINK,
        BLUE,
        RED,
        GREEN,
        YELLOW,
        PURPLE,
        WHITE
    }

    enum Style {
        PROGRESS,
        NOTCHED_6,
        NOTCHED_10,
        NOTCHED_12,
        NOTCHED_20
    }
}
