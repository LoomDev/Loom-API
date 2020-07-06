package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

public class BlockSpreadEvent extends BlockChangedEvent {

    @Getter
    private final Block sourceBlock;

    public BlockSpreadEvent(@NonNull Block block, @NonNull Block sourceBlock, @Nullable BlockState newState) {
        super(block, block.getCurrentState(), newState);
        this.sourceBlock = sourceBlock;
    }

    @Override
    public String toString() {
        return "BlockSpreadEvent{" +
                "sourceBlock=" + sourceBlock +
                "} " + super.toString();
    }
}
