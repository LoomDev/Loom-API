package org.loomdev.api.command;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

    protected Command(@NotNull String name, @Nullable String... aliases) {
        this.name = name;
        this.aliases = aliases;
    }

    public abstract void execute(@NotNull CommandSource source, String alias, String[] args);

    public List<String> tabComplete(@NotNull CommandSource source, String alias, @Nullable String[] args) {
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
