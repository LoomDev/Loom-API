package org.loomdev.api.plugin;

import java.util.Optional;

/**
 * Wrapper around a loaded plugin
 */
public interface PluginContainer {

    /**
     * Returns the plugins metadata
     *
     * @return The metadata of the plugin.
     */
    PluginMetadata getMetadata();

    /**
     * Returns the instance of the plugin class if available.
     *
     * @return The instance of the plugin.
     */
    default Optional<Plugin> getInstance() {
        return Optional.empty();
    }

    /**
     * Check if the plugin is enabled.
     *
     * @return {@code true} id the plugin in enabled.
     */
    boolean isEnabled();

    /**
     * Check if the plugin is disabled.
     *
     * @return {@code true} id the plugin in disabled.
     */
    boolean isDisabled();

    /**
     * Returns this plugin's classloader.
     *
     * @return The classloader instance for this plugin.
     */
    ClassLoader getClassLoader();
}
