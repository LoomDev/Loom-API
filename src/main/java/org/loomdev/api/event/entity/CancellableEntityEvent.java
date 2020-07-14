package org.loomdev.api.event.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.event.CancellableEvent;

@AllArgsConstructor
public class CancellableEntityEvent extends CancellableEvent {

    @Getter
    private final Entity entity;
}
