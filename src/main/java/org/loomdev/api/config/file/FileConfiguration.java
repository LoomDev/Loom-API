package org.loomdev.api.config.file;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.config.VolatileConfiguration;

import java.io.*;

public abstract class FileConfiguration extends VolatileConfiguration {

    public FileConfiguration() {
        super();
    }

    public void save(@NonNull File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(saveToString());
        writer.close();
    }

    public abstract String saveToString();

    public void load(@NonNull File file) throws IOException {
        load(new FileReader(file));
    }

    public void load(@NonNull Reader reader) throws IOException {
        BufferedReader input = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();
        try {
            String line;

            while ((line = input.readLine()) != null) {
                builder.append(line);
                builder.append("\n");
            }
        } finally {
            input.close();
        }

        load(builder.toString());
    }

    public abstract void load(@NonNull String string);
}
