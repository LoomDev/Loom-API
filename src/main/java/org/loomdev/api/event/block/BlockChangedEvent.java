package org.loomdev.api.event.block;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

import java.util.Optional;

public class BlockChangedEvent extends BlockEvent {

    @Getter
    private final BlockState currentState;

    @Getter
    @Setter
    private Optional<BlockState> newState;

    public BlockChangedEvent(@NotNull Block block, @NotNull BlockState currentState, @Nullable BlockState newState) {
        super(block);
        this.currentState = currentState;
        this.newState = Optional.ofNullable(newState);
    }

    @Override
    public String toString() {
        return "BlockChangedEvent{" +
                "currentState=" + currentState +
                ", newState=" + newState +
                "} " + super.toString();
    }
}
