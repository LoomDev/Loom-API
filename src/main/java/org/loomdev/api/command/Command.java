package org.loomdev.api.command;

import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Collections;
import java.util.List;

public abstract class Command {

    @Getter
    private final String name;

    @Getter
    private final String[] aliases;

    @Getter
    @Setter
    private String description, usage, permission;

    protected Command(String name) {
        this.name = name;
        this.aliases = new String[0];
    }

    protected Command(@NonNull String name, @Nullable String... aliases) {
        this.name = name;
        this.aliases = aliases;
    }

    public abstract void execute(@NonNull CommandSource source, String[] args);

    public List<String> tabComplete(@NonNull CommandSource source, @Nullable String[] args) {
        return Collections.emptyList();
    }
}
