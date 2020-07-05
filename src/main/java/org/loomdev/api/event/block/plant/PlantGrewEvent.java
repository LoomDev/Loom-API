package org.loomdev.api.event.block.plant;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;
import org.loomdev.api.event.block.BlockChangedEvent;

public class PlantGrewEvent extends BlockChangedEvent {

    public PlantGrewEvent(@NotNull Block block, @Nullable BlockState newState) {
        super(block, block.getCurrentState(), newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
