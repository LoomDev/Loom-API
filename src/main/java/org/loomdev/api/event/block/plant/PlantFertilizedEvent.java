package org.loomdev.api.event.block.plant;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;

public class PlantFertilizedEvent extends PlantGrewEvent {

    public PlantFertilizedEvent(@NonNull Block block) {
        super(block);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
