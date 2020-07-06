package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

import java.util.Set;

public class BlockExplodedEvent extends BlockChangedEvent {

    @Getter
    @NonNull
    private final Set<Block> brokenBlocks;

    public BlockExplodedEvent(@NonNull Block block, @Nullable BlockState newState, @NonNull Set<Block> brokenBlocks) {
        super(block, block.getCurrentState(), newState);
        this.brokenBlocks = brokenBlocks;
    }

    @Override
    public String toString() {
        return "BlockExplodedEvent{" +
                "brokenBlocks=" + brokenBlocks +
                "} " + super.toString();
    }
}
