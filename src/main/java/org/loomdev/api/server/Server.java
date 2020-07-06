package org.loomdev.api.server;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.entity.Player;
import org.loomdev.api.plugin.PluginManager;
import org.loomdev.api.monitoring.Tps;
import org.loomdev.api.monitoring.TickTimes;

import java.nio.file.Path;
import java.util.Collection;

public interface Server {

    /**
     * Get the name of the server implementation that is currently being ran.
     *
     * @return The name of the server implementation.
     */
    @NonNull String getName();

    /**
     * Get the version of the server implementation that is currently being ran.
     *
     * @return The version of the server implementation.
     */
    @NonNull String getVersion();

    /**
     * Get the path of the root directory container the server files.
     *
     * @return The path of the root directory.
     */
    @NotNull Path getRootDirectory();

    /**
     * Get the path of the folder containing the plugin files.
     *
     * @return The path of the plugin folder.
     */
    @NotNull Path getPluginDirectory();

    /**
     * Get the plugin manager.
     *
     * @return The plugin manager.
     */
    @NotNull PluginManager getPluginManager();

    /**
     * Returns all currently online players on the server.
     *
     * @return Immutable collection of all online players.
     */
    @NotNull Collection<? extends Player> getOnlinePlayers();

    /**
     * Send a message to all players on the server.
     *
     * @param message The message to send.
     */
    default void broadcastMessage(@NotNull String message) {
        broadcastMessage(TextComponent.of(message));
    }

    /**
     * Send a message to all players on the server.
     *
     * @param component The component to send.
     */
    void broadcastMessage(@NotNull Component component);

    /**
     * Get the tps of the server.
     * @return Instance of {@link Tps} containing TPS measurements of the server.
     */
    @NotNull Tps getTps();

    /**
     * Get the tick times of the server.
     *
     * @return Instance of {@link TickTimes} containing tick times measurements of the server.
     */
    @NotNull TickTimes getTickTimes();
}
