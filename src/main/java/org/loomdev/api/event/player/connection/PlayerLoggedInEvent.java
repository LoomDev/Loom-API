package org.loomdev.api.event.player.connection;

import lombok.Getter;
import lombok.NonNull;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.player.CancellablePlayerEvent;

import java.net.InetAddress;

public class PlayerLoggedInEvent extends CancellablePlayerEvent {

    @Getter
    String hostname;

    @Getter
    InetAddress address;

    public PlayerLoggedInEvent(@NonNull Player player, @NonNull String hostname, @NonNull InetAddress address) {
        super(player);
        this.hostname = hostname;
        this.address = address;
    }
}
