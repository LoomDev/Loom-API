package org.loomdev.api.event.block.plant;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.block.BlockState;

public class PlantFertilizedEvent extends PlantGrewEvent {

    public PlantFertilizedEvent(@NonNull Block block, @Nullable BlockState newState) {
        super(block, newState);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
