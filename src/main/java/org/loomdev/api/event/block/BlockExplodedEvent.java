package org.loomdev.api.event.block;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

import java.util.Set;

public class BlockExplodedEvent extends BlockChangedEvent {

    @Getter
    @NotNull
    private final Set<Block> brokenBlocks;

    public BlockExplodedEvent(@NotNull Block block, @Nullable BlockState newState, @NotNull Set<Block> brokenBlocks) {
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
