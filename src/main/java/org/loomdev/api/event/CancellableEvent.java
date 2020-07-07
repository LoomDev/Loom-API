package org.loomdev.api.event;

import lombok.Getter;
import lombok.Setter;

public abstract class CancellableEvent extends Event {

    @Getter
    @Setter
    private boolean cancelled = false;
}
