package org.loomdev.api.command;

import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;

public interface CommandSource {

    void sendMessage(@NonNull String message);

    void sendMessage(@NonNull Component message);
}
