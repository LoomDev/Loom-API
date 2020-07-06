package org.loomdev.api.event;

import lombok.Getter;
import lombok.Setter;

public class CancellableEvent extends Event {

    @Getter
    @Setter
    private boolean cancelled;
}
