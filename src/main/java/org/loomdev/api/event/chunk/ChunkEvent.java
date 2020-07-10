package org.loomdev.api.event.chunk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.loomdev.api.event.CancellableEvent;
import org.loomdev.api.world.Chunk;

@AllArgsConstructor
public abstract class ChunkEvent extends CancellableEvent {

    @Getter
    private final Chunk chunk;
}
