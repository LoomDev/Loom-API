package org.loomdev.api.event.block.fluid;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;
import org.loomdev.api.event.block.BlockChangedEvent;

public class FluidLevelChangedEvent extends BlockChangedEvent {

    public FluidLevelChangedEvent(@NonNull Block block, @Nullable BlockState newState) {
        super(block, block.getCurrentState(), newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
