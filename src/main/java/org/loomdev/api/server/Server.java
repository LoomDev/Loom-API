package org.loomdev.api.server;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.command.CommandManager;
import org.loomdev.api.command.CommandSource;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.EventManager;
import org.loomdev.api.plugin.PluginManager;
import org.loomdev.api.monitoring.Tps;
import org.loomdev.api.monitoring.TickTimes;
import org.loomdev.api.scheduler.Scheduler;
import org.loomdev.api.world.World;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

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
     * Get the version of Minecraft that is currently being ran.
     *
     * @return The version of the Minecraft server software.
     */
    @NonNull String getMinecraftVersion();

    /**
     * Get the path of the root directory container the server files.
     *
     * @return The path of the root directory.
     */
    @NonNull Path getRootDirectory();

    /**
     * Get the path of the folder containing the plugin files.
     *
     * @return The path of the plugin folder.
     */
    @NonNull Path getPluginDirectory();

    /**
     * Get the plugin manager.
     *
     * @return The plugin manager.
     */
    @NonNull PluginManager getPluginManager();

    /**
     * Get the event manager;
     *
     * @return The event manager.
     */
    @NonNull EventManager getEventManager();

    /**
     * Get the command manager.
     *
     * @return The command manager.
     */
    @NonNull CommandManager getCommandManager();

    /**
     * Get the scheduler.
     *
     * @return The scheduler.
     */
    @NonNull Scheduler getScheduler();

    /**
     * Returns all currently online players on the server.
     *
     * @return Immutable collection of all online players.
     */
    @NonNull Collection<? extends Player> getOnlinePlayers();

    /**
     * Send a message to all players on the server.
     *
     * @param message The message to send.
     */
    default void broadcastMessage(@NonNull String message) {
        broadcastMessage(TextComponent.of(message));
    }

    /**
     * Send a message to all players on the server.
     *
     * @param component The component to send.
     */
    void broadcastMessage(@NonNull Component component);

    /**
     * Returns an instance of the console command source.
     *
     * @return The console command source for this server.
     */
    @NonNull CommandSource getConsoleSource();

    /**
     * Get the tps of the server.
     *
     * @return Instance of {@link Tps} containing TPS measurements of the server.
     */
    @NonNull Tps getTps();

    /**
     * Get the tick times of the server.
     *
     * @return Instance of {@link TickTimes} containing tick times measurements of the server.
     */
    @NonNull TickTimes getTickTimes();

    @NonNull Optional<World> getWorld(@NonNull String name);

    @NonNull Optional<World> getWorld(@NonNull UUID uuid);

    int getProtocolVersion();

    int getViewDistance();
}
