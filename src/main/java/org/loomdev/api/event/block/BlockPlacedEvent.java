package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;
import org.loomdev.api.entity.player.Player;

public class BlockPlacedEvent extends BlockChangedEvent {

    @Getter
    private final Player player;

    @Getter
    private final Block placedAgainst;

    public BlockPlacedEvent(@NonNull Block block, @NonNull Player player, @NonNull Block placedAgainst, @NonNull BlockState newState) {
        super(block, block.getCurrentState(), newState);
        this.player = player;
        this.placedAgainst = placedAgainst;
    }
}
