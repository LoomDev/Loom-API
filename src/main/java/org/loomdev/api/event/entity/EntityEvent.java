package org.loomdev.api.event.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.event.Event;

@AllArgsConstructor
public class EntityEvent extends Event {

    @Getter
    private final Entity entity;
}
