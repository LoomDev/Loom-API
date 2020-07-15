package org.loomdev.api.event.entity.decoration;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.decoration.ArmorStand;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.Cancellable;
import org.loomdev.api.event.entity.EntityEvent;

import java.util.Optional;

/**
 * Fires when an armor stand is placed by a player or dispenser.
 * The armor stand will not be placed if this event is cancelled.
 */
public class ArmorStandPlacedEvent extends EntityEvent implements Cancellable {

    private Player player;
    private Block dispenser; // TODO change to dispenser block
    private final Cause cause;
    private boolean cancelled;

    public ArmorStandPlacedEvent(@NotNull ArmorStand armorStand, @NotNull Player player, @NotNull Cause cause) {
        super(armorStand);
        this.player = player;
        this.cause = Cause.PLAYER;
    }

    public ArmorStandPlacedEvent(@NotNull ArmorStand armorStand, @NotNull Block dispenser, @NotNull Cause cause) { // TODO change to dispenser block
        super(armorStand);
        this.dispenser = dispenser;
        this.cause = Cause.DISPENSER;
    }

    public Optional<Player> getPlayer() {
        return Optional.ofNullable(this.player);
    }

    public Optional<Block> getDispenser() { // TODO change to dispenser block
        return Optional.ofNullable(this.dispenser);
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
     * Represents whether a dispenser or
     * player placed the armor stand.
     */
    public enum Cause {
        PLAYER,
        DISPENSER
    }
}
