package org.loomdev.api.event.block.entity;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.event.block.BlockEvent;

public class MultiBlockEntityCreatedEvent extends BlockEvent {

    @Getter
    private final Entity entity;

    public MultiBlockEntityCreatedEvent(@NotNull Entity entity, @NotNull Block block) {
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
