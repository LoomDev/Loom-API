package org.loomdev.api.event.block.sponge;

import lombok.NonNull;
import org.loomdev.api.block.Block;;
import org.loomdev.api.event.block.BlockChangedEvent;

public class SpongeAbsorbedEvent extends BlockChangedEvent {

    public SpongeAbsorbedEvent(@NonNull Block block) {
        super(block, block.getCurrentState(), null);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
