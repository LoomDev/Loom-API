package org.loomdev.api.event.entity.creeper;

import lombok.NonNull;
import org.loomdev.api.entity.mob.Creeper;
import org.loomdev.api.event.entity.CancellableEntityEvent;

public class CreeperIgnitedEvent extends CancellableEntityEvent {

    public CreeperIgnitedEvent(@NonNull Creeper creeper) {
        super(creeper);
    }
}
