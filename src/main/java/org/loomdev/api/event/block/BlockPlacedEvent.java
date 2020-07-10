package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;;
import org.loomdev.api.entity.player.Player;

public class BlockPlacedEvent extends BlockEvent {

    @Getter
    private final Player player;

    public BlockPlacedEvent(@NonNull Block block, @NonNull Player player) {
        super(block);
        this.player = player;
    }

    @Override
    public String toString() {
        return "BlockPlacedEvent{" +
                "player=" + player +
                "} " + super.toString();
    }
}
