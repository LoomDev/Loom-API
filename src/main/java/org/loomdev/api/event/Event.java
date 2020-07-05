package org.loomdev.api.event;

import lombok.Getter;
import lombok.Setter;

public abstract class Event {

    @Getter
    @Setter
    private boolean cancelled;
}
