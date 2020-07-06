package org.loomdev.api.plugin;

import com.google.common.collect.ImmutableList;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 * Represents metadata from a plugin.
 */
public interface PluginMetadata {

    /**
     * Pattern for validating the plugins id.
     */
    Pattern ID_PATTERN = Pattern.compile("[a-z][a-z0-9-_]{0,63}");

    /**
     * Id of the plugin. This id should be unique so it does not conflict with any other plugins and
     * should only contain alphanumeric characters, dashed and underscored.
     *
     * @return The id of the plugin.
     */
    @NotNull String getId();

    /**
     * A human readable name of the plugin.
     *
     * @return The plugin name.
     */
    default Optional<String> getName() {
        return Optional.empty();
    }

    /**
     * The version of the plugin.
     *
     * @return The version of then plugin.
     */
    default Optional<String> getVersion() {
        return Optional.empty();
    }

    /**
     * A human readable description of the plugin.
     *
     * @return The description of the plugin.
     */
    default Optional<String> getDescription() {
        return Optional.empty();
    }

    /**
     * The author(s) of the plugin.
     *
     * @return The names of the author(s) of the plugin.
     */
    default List<String> getAuthors() {
        return ImmutableList.of();
    }

    /**
     * Gets the path to the source location of the plugin.
     *
     * @return The source the plugin was loaded from or {@link Optional#empty()} if unknown.
     */
    default Optional<Path> getSource() {
        return Optional.empty();
    }
}
