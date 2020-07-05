package org.loomdev.api.plugin;

import java.util.Optional;

/**
 * Wrapper around a loaded plugin
 */
public interface PluginContainer {

    /**
     * Returns the plugins metadata
     *
     * @return
     */
    PluginMetadata getMetadata();

    /**
     * Returns the instance of the plugin class if available.
     *
     * @return The instance of the plugin.
     */
    default Optional<?> getInstance() {
        return Optional.empty();
    }
}
