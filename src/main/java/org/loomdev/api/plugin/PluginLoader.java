package org.loomdev.api.plugin;

import java.nio.file.Path;

/**
 * Represents a plugin loader.
 */
public interface PluginLoader {

    /**
     * Loads a plugin from source.
     *
     * @param source The source to load the plugin from.
     * @return The metadata of the plugin.
     * @throws Exception an error was occurred when loading the plugin.
     */
    PluginMetadata loadPlugin(Path source) throws Exception;

    /**
     * Create a plugin instance.
     *
     * @param plugin The plugin metadata of the the plugin to load.
     * @return The instance of the plugin.
     */
    Object createPlugin(PluginMetadata plugin);

}
