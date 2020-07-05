package org.loomdev.api.event.block.plant;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;
import org.loomdev.api.event.block.BlockChangedEvent;

public class CoralDiedEvent extends BlockChangedEvent {

    public CoralDiedEvent(@NotNull Block block, @NotNull BlockState newState) {
        super(block, block.getCurrentState(), newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
