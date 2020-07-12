package org.loomdev.api.event.block.plant;

import lombok.Getter;
import lombok.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.block.BlockEvent;

public class PlantHarvestedEvent extends BlockEvent {

    @Getter
    private final Player player;

    public PlantHarvestedEvent(@NonNull Block block, @NonNull Player player) {
        super(block);
        this.player = player;
    }

    @Override
    public String toString() {
        return "PlantHarvestedEvent{" +
                "player=" + player +
                "} " + super.toString();
    }
}
