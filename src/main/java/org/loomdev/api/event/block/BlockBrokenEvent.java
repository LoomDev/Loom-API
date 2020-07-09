package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.player.Player;

public class BlockBrokenEvent extends BlockEvent {

    @Getter
    @NonNull
    private final Player player;

    public BlockBrokenEvent(@NonNull Block block, @NonNull Player player) {
        super(block);
        this.player = player;
    }

    @Override
    public String toString() {
        return "BlockBrokenEvent{" +
                "player=" + player +
                "} " + super.toString();
    }
}
