package org.loomdev.api.event.block;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.block.Block;

import java.util.Optional;

public class BlockIgnitedEvent extends BlockEvent {

    @Getter
    private final Optional<Block> ignitingBlock;

    public BlockIgnitedEvent(@NotNull Block block, @Nullable Block ignitingBlock) {
        super(block);
        this.ignitingBlock = Optional.ofNullable(ignitingBlock);
    }

    @Override
    public String toString() {
        return "BlockIgnitedEvent{" +
                "ignitingBlock=" + ignitingBlock +
                "} " + super.toString();
    }
}
