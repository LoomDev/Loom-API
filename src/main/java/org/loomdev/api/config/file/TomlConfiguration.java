package org.loomdev.api.config.file;

import com.moandjiezana.toml.Toml;
import com.moandjiezana.toml.TomlWriter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.config.Configuration;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class TomlConfiguration extends FileConfiguration {

    public static TomlConfiguration fromFile(File file) throws IOException {
        TomlConfiguration configuration = new TomlConfiguration();
        configuration.load(file);
        return configuration;
    }

    public static TomlConfiguration fromReader(Reader reader) throws IOException {
        TomlConfiguration configuration = new TomlConfiguration();
        configuration.load(reader);
        return configuration;
    }

    public static TomlConfiguration fromString(String config) {
        TomlConfiguration configuration = new TomlConfiguration();
        configuration.load(config);
        return configuration;
    }

    private TomlConfiguration() {
        super();
    }

    @Override
    public String saveToString() {
        // TODO
        throw new UnsupportedOperationException("Saving has not yet been implemented fot toml files.");
    }

    @Override
    public void load(@NonNull String string) {
        Map<String, Object> input = new Toml().read(string).toMap();

        if (input != null && !input.isEmpty()) {
            convertMapToConfiguration(input, this);
        }
    }

    protected void convertMapToConfiguration(Map<String, Object> input, @NonNull Configuration configuration) {
        for (Map.Entry<String, Object> entry : input.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value instanceof Map) {
                convertMapToConfiguration((Map<String, Object>) value, configuration.createSubset(key));
            } else {
                configuration.set(key, value);
            }
        }
    }
}
