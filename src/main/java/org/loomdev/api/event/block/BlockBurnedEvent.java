package org.loomdev.api.event.block;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;

public class BlockBurnedEvent extends BlockIgnitedEvent {

    public BlockBurnedEvent(@NonNull Block block, @Nullable Block ignitingBlock) {
        super(block, ignitingBlock);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
