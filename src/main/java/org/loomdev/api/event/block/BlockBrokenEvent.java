package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;
import org.loomdev.api.entity.player.Player;

public class BlockBrokenEvent extends BlockChangedEvent {

    @Getter
    @NonNull
    private final Player player;

    public BlockBrokenEvent(@NonNull Block block, @NonNull Player player, @Nullable BlockState newState) {
        super(block, block.getCurrentState(), newState);
        this.player = player;
    }

    @Override
    public String toString() {
        return "BlockBrokenEvent{" +
                "player=" + player +
                "} " + super.toString();
    }
}
