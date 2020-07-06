package org.loomdev.api.plugin.ap;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.plugin.LoomPlugin;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SerializedPluginMetadata {

    public static Pattern ID_PATTERN = Pattern.compile("[a-z][a-z0-9-_]{0,63}");

    // @Nullable is used here to make GSON skip these in the serialized file
    private final String id;
    private final @Nullable String name;
    private final @Nullable String version;
    private final @Nullable String description;
    private final @Nullable List<String> authors;
    private final String main;

    public SerializedPluginMetadata(String id, @Nullable String name, @Nullable String version, @Nullable String description, @Nullable List<String> authors, String main) {
        Preconditions.checkNotNull(id, "id");
        Preconditions.checkArgument(ID_PATTERN.matcher(id).matches(), "id is not valid");
        this.id = id;
        this.name = Strings.emptyToNull(name);
        this.version = Strings.emptyToNull(version);
        this.description = Strings.emptyToNull(description);
        this.authors = authors.isEmpty() ? ImmutableList.of() : authors;
        this.main = Preconditions.checkNotNull(main, "main");
    }

    public static SerializedPluginMetadata from(LoomPlugin loomPlugin, String qualifiedName) {
        List<String> authors = Arrays.stream(loomPlugin.authors()).filter(a -> !a.isEmpty()).collect(Collectors.toList());
        return new SerializedPluginMetadata(loomPlugin.id(), loomPlugin.name(), loomPlugin.version(), loomPlugin.description(), authors, qualifiedName);
    }

    public String getId() {
        return id;
    }

    public @Nullable String getName() {
        return name;
    }

    public @Nullable String getVersion() {
        return version;
    }

    public @Nullable String getDescription() {
        return description;
    }

    public List<String> getAuthors() {
        return authors == null ? ImmutableList.of() : authors;
    }

    public String getMain() {
        return main;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SerializedPluginMetadata that = (SerializedPluginMetadata) o;
        return Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(version, that.version)
                && Objects.equals(description, that.description)
                && Objects.equals(authors, that.authors)
                && Objects.equals(main, that.main);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, version, description, authors);
    }

    @Override
    public String toString() {
        return "SerializedPluginDescription{"
                + "id='" + id + '\''
                + ", name='" + name + '\''
                + ", version='" + version + '\''
                + ", description='" + description + '\''
                + ", authors=" + authors
                + ", main='" + main + '\''
                + '}';
    }
}
