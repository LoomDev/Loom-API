package org.loomdev.api.event.server;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import net.kyori.adventure.text.TextComponent;
import org.loomdev.api.event.CancellableEvent;

import java.net.InetAddress;

@AllArgsConstructor
public class ServerPingedEvent extends CancellableEvent {

    @Getter
    @NonNull
    private final InetAddress address;

    @Getter
    @Setter
    @NonNull
    private TextComponent motd;

    @Getter
    @Setter
    private int onlinePlayers;

    @Getter
    @Setter
    private int maxPlayerSlots;

    @Getter
    @Setter
    private String favicon;
}
