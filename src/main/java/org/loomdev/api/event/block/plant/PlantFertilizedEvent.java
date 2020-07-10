package org.loomdev.api.event.block.plant;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.block.BlockEvent;

public class PlantFertilizedEvent extends BlockEvent {

    @Getter
    private final Player player;

    public PlantFertilizedEvent(@NonNull Block block, Player player) {
        super(block);
        this.player = player;
    }

    @Override
    public String toString() {
        return "PlantFertilizedEvent{" +
                "player=" + player +
                "} " + super.toString();
    }
}
