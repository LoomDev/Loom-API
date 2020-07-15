package org.loomdev.api.command;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.plugin.Plugin;

public interface CommandManager {

    void register(@NonNull Plugin plugin, @NonNull Command command);

    void unregister(@NonNull Plugin plugin);

    int handle(@NonNull CommandSource source, @NonNull String input);
}