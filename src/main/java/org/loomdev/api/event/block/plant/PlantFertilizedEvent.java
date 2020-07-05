package org.loomdev.api.event.block.plant;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

public class PlantFertilizedEvent extends PlantGrewEvent {

    public PlantFertilizedEvent(@NotNull Block block, @Nullable BlockState newState) {
        super(block, newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
