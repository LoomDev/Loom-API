package org.loomdev.api.config;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface Configuration extends ImmutableConfiguration {

    @NonNull Configuration getRoot();

    @Nullable Configuration getParent();

    @NonNull String getPath();

    @NonNull String getFullPath();

    default String createPath(@NonNull Configuration configuration, @Nullable String key) {
        return createPath(configuration, key, configuration.getRoot());
    }

    String createPath(@NonNull Configuration configuration, @Nullable String key, @NonNull Configuration relativeTo);

    @Nullable Configuration section(@NonNull String path);

    @NonNull Configuration createSection(@NonNull String path);

    void add(@NonNull String key, @Nullable Object value);

    void set(@NonNull String key, @Nullable Object value);

    void remove(@NonNull String key);
}
