package org.loomdev.api.event.block;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

public class BlockFormedEvent extends BlockEvent {

    public BlockFormedEvent(@NonNull Block block, @NonNull BlockState newState) {
        super(block);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
