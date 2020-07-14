package org.loomdev.api.event.block;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;

import java.util.Optional;

public class BlockBurnedEvent extends BlockEvent {

    @Getter
    private Optional<Block> ignitingBlock;

    public BlockBurnedEvent(@NonNull Block block, @Nullable Block ignitingBlock) {
        super(block);
        this.ignitingBlock = Optional.ofNullable(ignitingBlock);
    }

    @Override
    public String toString() {
        return "BlockBurnedEvent{" +
                "ignitingBlock=" + ignitingBlock +
                '}';
    }
}
