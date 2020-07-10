package org.loomdev.api.event.chunk;

import lombok.Getter;
import lombok.NonNull;
import org.loomdev.api.world.Chunk;

public class ChunkLoadedEvent extends ChunkEvent {

    @Getter
    private final boolean newChunk;

    public ChunkLoadedEvent(@NonNull Chunk chunk, @NonNull boolean newChunk) {
        super(chunk);
        this.newChunk = newChunk;
    }
}
