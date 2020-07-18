package org.loomdev.api.config.file;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.config.Configuration;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class YamlConfiguration extends FileConfiguration {

    public static YamlConfiguration fromFile(File file) throws IOException {
        YamlConfiguration configuration = new YamlConfiguration();
        configuration.load(file);
        return configuration;
    }

    public static YamlConfiguration fromReader(Reader reader) throws IOException {
        YamlConfiguration configuration = new YamlConfiguration();
        configuration.load(reader);
        return configuration;
    }

    public static YamlConfiguration fromString(String config) {
        YamlConfiguration configuration = new YamlConfiguration();
        configuration.load(config);
        return configuration;
    }

    private YamlConfiguration() {
        super();
    }

    @Override
    public String saveToString() {
        return null;
    }

    @Override
    public void load(@NonNull String string) {
        Map<String, Object> input = new Yaml().load(string);

        if (input != null && !input.isEmpty()) {
            convertMapToConfiguration(input, this);
        }
    }

    protected void convertMapToConfiguration(Map<String, Object> input, @NonNull Configuration configuration) {
        for (Map.Entry<String, Object> entry : input.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value instanceof Map) {
                convertMapToConfiguration((Map<String, Object>) value, configuration.createSection(key));
            } else {
                configuration.set(key, value);
            }
        }
    }
}
