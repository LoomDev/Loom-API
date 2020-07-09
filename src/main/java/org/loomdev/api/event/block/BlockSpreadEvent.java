package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;

public class BlockSpreadEvent extends BlockEvent {

    @Getter
    private final Block sourceBlock;

    public BlockSpreadEvent(@NonNull Block block, @NonNull Block sourceBlock) {
        super(block);
        this.sourceBlock = sourceBlock;
    }

    @Override
    public String toString() {
        return "BlockSpreadEvent{" +
                "sourceBlock=" + sourceBlock +
                "} " + super.toString();
    }
}
