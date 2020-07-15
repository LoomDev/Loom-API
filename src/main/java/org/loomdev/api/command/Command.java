package org.loomdev.api.command;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public abstract class Command {

    private final String name;

    private final String[] aliases;

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

    public String getName() {
        return this.name;
    }

    public String[] getAliases() {
        return this.aliases;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    public Optional<String> getUsage() {
        return Optional.ofNullable(this.usage);
    }

    public void setUsage(@NotNull String usage) {
        this.usage = usage;
    }

    public Optional<String> getPermission() {
        return Optional.ofNullable(this.permission);
    }

    public void setPermission(@NotNull String permission) {
        this.permission = permission;
    }
}
