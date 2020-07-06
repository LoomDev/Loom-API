package org.loomdev.api.event.block;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;
import org.loomdev.api.entity.player.Player;

public class BlockPlacedEvent extends BlockChangedEvent {

    @Getter
    private final Player player;

    @Getter
    private final Block placedAgainst;

    public BlockPlacedEvent(@NotNull Block block, @NotNull Player player, @NotNull Block placedAgainst, @NotNull BlockState newState) {
        super(block, block.getCurrentState(), newState);
        this.player = player;
        this.placedAgainst = placedAgainst;
    }
}
