package org.loomdev.api.plugin;

import java.util.Collection;
import java.util.Optional;

/**
 * Manages plugins loaded by Loom.
 */
public interface PluginManager {

    /**
     * Get a plugin based on its id.
     *
     * @param id The id of the plugin to get.
     * @return The plugin, if available.
     */
    Optional<PluginContainer> getPlugin(String id);

    /**
     * Get all the plugins loaded by Loom.
     *
     * @return The plugins loaded by Loom.
     */
    Collection<PluginContainer> getPlugins();

    /**
     * Check if a plugin is loaded based on its id.
     *
     * @param id The id of the plugin to check.
     * @return {@code true} if the plugin is loaded.
     */
    boolean isLoaded(String id);

    /**
     * Enable a plugin.
     *
     * @param id The id of the plugin to enable.
     * @return True if plugin was enabled successfully.
     */
    boolean enablePlugin(String id);

    /**
     * Disable a plugin.
     *
     * @param id The id of the plugin to disable.
     * @return True if plugin was disabled successfully.
     */
    boolean disablePlugin(String id);

}
