package org.loomdev.api.event.block;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

public class BlockMeltedEvent extends BlockChangedEvent {

    public BlockMeltedEvent(@NonNull Block block, @Nullable BlockState newState) {
        super(block, block.getCurrentState(), newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
