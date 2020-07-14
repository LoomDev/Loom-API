package org.loomdev.api.config;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface ImmutableConfiguration {

    @NonNull Set<String> getKeys();

    @NonNull Set<String> getKeys(boolean deep);

    boolean hasKey(@NonNull String key);

    @Nullable Object get(@NonNull String key);

    @Nullable Object get(@NonNull String key, @Nullable Object defaultValue);

    @Nullable <T> T get(@NonNull Class<T> cls, @NonNull String key);

    @Nullable <T> T get(@NonNull Class<T> cls, @NonNull String key, @Nullable T defaultValue);

    default @Nullable String getString(@NonNull String key) {
        return getString(key, null);
    }

    @Nullable String getString(@NonNull String key, @Nullable String defaultValue);

    default int getInt(@NonNull String key) {
        return getInt(key, 0);
    }

    int getInt(@NonNull String key, int defaultValue);

    default double getDouble(@NonNull String key) {
        return getDouble(key, 0);
    }

    double getDouble(@NonNull String key, double defaultValue);

    default float getFloat(@NonNull String key) {
        return getFloat(key, 0f);
    }

    float getFloat(@NonNull String key, float defaultValue);

    default byte getByte(@NonNull String key) {
        return getByte(key, (byte) 0);
    }

    byte getByte(@NonNull String key, byte defaultValue);

    default long getLong(@NonNull String key) {
        return getLong(key, 0L);
    }

    long getLong(@NonNull String key, long defaultValue);

    default short getShort(@NonNull String key) {
        return getShort(key, (short)0);
    }

    short getShort(@NonNull String key, short defaultValue);

    default boolean getBoolean(@NonNull String key) {
        return getBoolean(key, false);
    }

    boolean getBoolean(@NonNull String key, boolean defaultValue);

    @Nullable <T> Collection<T> getCollection(@NonNull Class<T> cls, @NonNull String key, @NonNull Collection<T> target);

    default @Nullable <T> List<T> getList(@NonNull Class<T> cls, @NonNull String key) {
        return getList(cls, key, new ArrayList<>());
    }

    @Nullable <T> List<T> getList(@NonNull Class<T> cls, @NonNull String key, @Nullable List<T> defaultValue);

    default @NonNull <T> T[] getArray(@NonNull Class<T> cls, @NonNull String key) {
        return getArray(cls, key, (T[]) Array.newInstance(cls, 0));
    }

    @NonNull <T> T[] getArray(@NonNull Class<T> cls, @NonNull String key, @Nullable T[] defaultValue);

    default <T extends Enum<T>> T getEnum(Class<T> enumType, @NonNull String key) {
        try {
            return Enum.valueOf(enumType, getString(key));
        } catch (IllegalArgumentException e) {
            throw new ConfigurationException(e);
        }
    }

    default <T extends Enum<T>> T getEnum(Class<T> enumType, @NonNull String key, T defaultValue) {
        String stringValue = getString(key);
        if (stringValue == null) {
            return defaultValue;
        }

        try {
            return Enum.valueOf(enumType, stringValue);
        } catch (IllegalArgumentException e) {
            throw new ConfigurationException(e);
        }
    }

}
