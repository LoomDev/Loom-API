package org.loomdev.api.event.block.plant;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.event.block.BlockEvent;

public class LeavesDecayedEvent extends BlockEvent {

    public LeavesDecayedEvent(@NonNull Block block) {
        super(block);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
