package org.loomdev.api.event.block.entity;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.event.block.BlockEvent;

public class MultiBlockEntityCreatedEvent extends BlockEvent {

    @Getter
    private final Entity entity;

    public MultiBlockEntityCreatedEvent(@NonNull Entity entity, @NonNull Block block) {
        super(block);
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "MultiBlockEntityCreatedEvent{" +
                "entity=" + entity +
                "} " + super.toString();
    }
}
