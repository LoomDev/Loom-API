package org.loomdev.api.event.block;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;

public class BlockFormedEvent extends BlockEvent {

    public BlockFormedEvent(@NonNull Block block) {
        super(block);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
