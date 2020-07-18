package org.loomdev.api.event.block;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.event.Cancellable;

/**
 * Fired when an entity bounces on a bounceable block in the world and gains velocity.
 * The entity will not gain any extra velocity if this event is cancelled.
 *
 * This event is fired when:
 * <ul>
 * <li>ands and successfully bounces on a slime block</li>
 * <li>Lands and successfully bounces on a bed block</li>
 * </ul>
 */
public class BlockBouncedEvent extends BlockEvent implements Cancellable {

    private final Entity entity;
    private double multiplier;
    private boolean cancelled;

    public BlockBouncedEvent(@NotNull Block block, @NotNull Entity entity, double multiplier) {
        super(block);
        this.entity = entity;
        this.multiplier = multiplier;
    }

    public @NotNull Entity getEntity() {
        return this.entity;
    }

    public double getBounceMultiplier() {
        return this.multiplier;
    }

    public void setBounceMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void cancel(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
