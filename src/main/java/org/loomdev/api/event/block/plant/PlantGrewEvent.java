package org.loomdev.api.event.block.plant;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.event.block.BlockEvent;

public class PlantGrewEvent extends BlockEvent {

    public PlantGrewEvent(@NonNull Block block) {
        super(block);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
