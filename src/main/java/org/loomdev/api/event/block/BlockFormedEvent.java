package org.loomdev.api.event.block;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

public class BlockFormedEvent extends BlockChangedEvent {

    public BlockFormedEvent(@NonNull Block block, @NonNull BlockState newState) {
        super(block, block.getCurrentState(), newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
