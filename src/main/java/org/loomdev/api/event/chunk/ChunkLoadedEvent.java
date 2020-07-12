package org.loomdev.api.event.chunk;

import lombok.Getter;
import lombok.NonNull;
import org.loomdev.api.event.Cancellable;
import org.loomdev.api.world.Chunk;

public class ChunkLoadedEvent extends ChunkEvent implements Cancellable {

    @Getter
    private final boolean newChunk;

    private boolean cancelled;

    public ChunkLoadedEvent(@NonNull Chunk chunk, boolean newChunk) {
        super(chunk);
        this.newChunk = newChunk;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
