package org.loomdev.api.command;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.plugin.Plugin;

public interface CommandManager {

    void register(@NotNull Plugin plugin, @NotNull Command command);

    void unregister(@NotNull Plugin plugin);
}
