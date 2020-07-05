package org.loomdev.api.event.block;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.block.Block;

public class BlockBurnedEvent extends BlockIgnitedEvent {

    public BlockBurnedEvent(@NotNull Block block, @Nullable Block ignitingBlock) {
        super(block, ignitingBlock);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
