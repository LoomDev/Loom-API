package org.loomdev.api.event.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.Event;

@AllArgsConstructor
public class PlayerEvent extends Event {

    @Getter
    private final Player player;
}
