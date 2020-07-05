package org.loomdev.api.event.block;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;
import org.loomdev.api.entity.Player;

public class BlockBrokenEvent extends BlockChangedEvent {

    @Getter
    @NotNull
    private final Player player;

    public BlockBrokenEvent(@NotNull Block block, @NotNull Player player, @Nullable BlockState newState) {
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
