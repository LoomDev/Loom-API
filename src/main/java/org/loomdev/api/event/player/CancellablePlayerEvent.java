package org.loomdev.api.event.player;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.loomdev.api.entity.player.Player;

public class CancellablePlayerEvent extends PlayerEvent {

    @Getter
    @Setter
    private boolean cancelled = false;

    public CancellablePlayerEvent(@NonNull Player player) {
        super(player);
    }
}
