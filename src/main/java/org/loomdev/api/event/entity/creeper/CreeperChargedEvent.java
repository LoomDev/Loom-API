package org.loomdev.api.event.entity.creeper;

import lombok.Getter;
import lombok.NonNull;
import org.loomdev.api.entity.misc.Lightning;
import org.loomdev.api.entity.mob.Creeper;
import org.loomdev.api.event.entity.CancellableEntityEvent;

import java.util.Optional;

public class CreeperChargedEvent extends CancellableEntityEvent {

    @Getter
    private Optional<Lightning> lightning = Optional.empty();

    @Getter
    private final Cause chargeCause;

    public CreeperChargedEvent(@NonNull Creeper creeper, @NonNull Cause chargeCause) {
        super(creeper);
        this.chargeCause = chargeCause;
    }

    public CreeperChargedEvent(@NonNull Creeper creeper, @NonNull Lightning lightning, @NonNull Cause chargeCause) {
        super(creeper);
        this.lightning = Optional.of(lightning);
        this.chargeCause = chargeCause;
    }

    public enum Cause {
        LIGHTNING,
        TRIGGERED
    }
}
