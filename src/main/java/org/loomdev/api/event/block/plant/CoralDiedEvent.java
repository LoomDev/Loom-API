package org.loomdev.api.event.block.plant;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;
import org.loomdev.api.event.block.BlockChangedEvent;

public class CoralDiedEvent extends BlockChangedEvent {

    public CoralDiedEvent(@NonNull Block block, @NonNull BlockState newState) {
        super(block, block.getCurrentState(), newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
