package org.loomdev.api.event.block.fluid;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.event.block.BlockEvent;

public class FluidLevelChangedEvent extends BlockEvent {

    public FluidLevelChangedEvent(@NonNull Block block) {
        super(block);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
