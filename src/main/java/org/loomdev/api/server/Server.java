package org.loomdev.api.server;

import net.kyori.adventure.text.TextComponent;
import org.loomdev.api.entity.Player;
import org.loomdev.api.plugin.PluginManager;

import java.nio.file.Path;
import java.util.Collection;

public interface Server {

    /**
     * Get the name of the server implementation that is currently being ran.
     *
     * @return The name of the server implementation.
     */
    String getName();

    /**
     * Get the version of the server implementation that is currently being ran.
     *
     * @return The version of the server implementation.
     */
    String getVersion();

    /**
     * Get the path of the root directory container the server files.
     *
     * @return The path of the root directory.
     */
    Path getRootDirectory();

    /**
     * Get the path of the folder containing the plugin files.
     *
     * @return The path of the plugin folder.
     */
    Path getPluginDirectory();

    /**
     * Get the plugin manager.
     *
     * @return The plugin manager.
     */
    PluginManager getPluginManager();

    /**
     * Returns all currently online players on the server.
     *
     * @return Immutable collection of all online players.
     */
    Collection<? extends Player> getOnlinePlayers();

    /**
     * Send a message to all players on the server.
     *
     * @param message The message to send.
     */
    void broadcastMessage(String message);

    /**
     * Send a message to all players on the server.
     *
     * @param message The message to send.
     */
    void broadcastMessage(TextComponent message);

}
