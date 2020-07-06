package org.loomdev.api.plugin;

import org.jetbrains.annotations.NotNull;

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
    @NotNull Optional<PluginContainer> getPlugin(String id);

    /**
     * Get all the plugins loaded by Loom.
     *
     * @return The plugins loaded by Loom.
     */
    @NotNull Collection<PluginContainer> getPlugins();

    /**
     * Check if a plugin is loaded based on its id.
     *
     * @param id The id of the plugin to check.
     * @return {@code true} if the plugin is loaded.
     */
    boolean isLoaded(String id);

    /**
     * Check if a plugin is enabled.
     *
     * @param id The id of the plugin to check.
     * @return {@code true} id the plugin in enabled.
     */
    boolean isEnabled(String id);

    /**
     * Check if a plugin is disabled.
     *
     * @param id The id of the plugin to check.
     * @return {@code true} id the plugin in disabled.
     */
    boolean isDisabled(String id);

    /**
     * Enable a plugin.
     *
     * @param id The id of the plugin to enable.
     * @return The results of the action.
     */
    @NotNull Result enablePlugin(String id);

    /**
     * Disable a plugin.
     *
     * @param id The id of the plugin to disable.
     * @return The results of the action.
     */
    @NotNull Result disablePlugin(String id);

    /**
     * Results of a plugin enable/disable call.
     */
    enum Result {
        /**
         * The requested plugin was not found among the loaded plugins.
         */
        NOT_FOUND,

        /**
         * The plugin was already enabled/disabled. No state changes occurred.
         */
        ALREADY_IN_STATE,

        /**
         * The plugin was successfully enabled/disabled.
         */
        SUCCESS,

        /**
         * Failed to enable/disable the plugin.
         */
        FAILED;

        /**
         * Check if the results is an error result.
         *
         * @return {@code true} if {@link Result#FAILED} or {@link Result#NOT_FOUND}.
         */
        boolean isError() {
            return this == FAILED || this == NOT_FOUND;
        }

        /**
         * Check if the result is an success result.
         *
         * @return {@code true} if {@link Result#SUCCESS} or {@link Result#ALREADY_IN_STATE}.
         */
        boolean isSuccess() {
            return this == SUCCESS || this == ALREADY_IN_STATE;
        }
    }
}
