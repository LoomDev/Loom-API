package org.loomdev.api.event.block.sponge;

import lombok.NonNull;
import org.loomdev.api.block.Block;;
import org.loomdev.api.event.block.BlockEvent;

public class SpongeAbsorbedEvent extends BlockEvent {

    public SpongeAbsorbedEvent(@NonNull Block block) {
        super(block);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
