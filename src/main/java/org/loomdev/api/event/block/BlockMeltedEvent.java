package org.loomdev.api.event.block;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

public class BlockMeltedEvent extends BlockChangedEvent {

    public BlockMeltedEvent(@NotNull Block block, @Nullable BlockState newState) {
        super(block, block.getCurrentState(), newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
