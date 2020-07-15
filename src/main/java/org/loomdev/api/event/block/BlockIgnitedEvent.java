package org.loomdev.api.event.block;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.event.Cancellable;

import java.util.Optional;

public class BlockIgnitedEvent extends BlockEvent implements Cancellable {

    private Block sourceBlock;
    private Entity sourceEntity;
    private final Cause cause;
    private boolean cancelled;

    public BlockIgnitedEvent(@NotNull Block block, @NotNull Block source, @NotNull Cause cause) {
        super(block);
        this.sourceBlock = source;
        this.cause = cause;
    }

    public BlockIgnitedEvent(@NotNull Block block, @NotNull Entity source, @NotNull Cause cause) {
        super(block);
        this.sourceEntity = source;
        this.cause = cause;
    }

    public Optional<Block> getSourceBlock() {
        return Optional.ofNullable(this.sourceBlock);
    }

    public Optional<Entity> getSourceEntity() {
        return Optional.ofNullable(this.sourceEntity);
    }

    public Cause getCause() {
        return this.cause;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void cancel(boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * Represents the source of the fire
     * which ignited this block.
     */
    public enum Cause {
        LAVA,
        FLINT_AND_STEEL,
        FIREBALL,
        EXPLOSION,
        LIGHTNING,
        FIRE_SPREAD
    }
}
