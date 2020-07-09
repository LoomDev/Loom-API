package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;

import java.util.Set;

public class BlockExplodedEvent extends BlockEvent {

    @Getter
    @NonNull
    private final Set<Block> brokenBlocks;

    public BlockExplodedEvent(@NonNull Block block, @NonNull Set<Block> brokenBlocks) {
        super(block);
        this.brokenBlocks = brokenBlocks;
    }

    @Override
    public String toString() {
        return "BlockExplodedEvent{" +
                "brokenBlocks=" + brokenBlocks +
                "} " + super.toString();
    }
}
