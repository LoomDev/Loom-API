package org.loomdev.api.event.block;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

public class BlockFormedEvent extends BlockChangedEvent {

    public BlockFormedEvent(@NotNull Block block, @NotNull BlockState newState) {
        super(block, block.getCurrentState(), newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
