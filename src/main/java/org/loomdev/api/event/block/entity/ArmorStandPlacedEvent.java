package org.loomdev.api.event.block.entity;

import lombok.Getter;
import lombok.NonNull;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.CancellableEvent;
import org.loomdev.api.world.Location;

import java.util.Optional;

public class ArmorStandPlacedEvent extends CancellableEvent {

    @Getter
    @NonNull
    private final Entity armorStand;

    @Getter
    @NonNull
    private final Location location;

    @Getter
    private final Optional<Player> player;

    // TODO change entity to an armor stand entity field
    public ArmorStandPlacedEvent(@NonNull Entity armorStand, @NonNull Location location, Player player) {
        this.armorStand = armorStand;
        this.location = location;
        this.player = Optional.ofNullable(player);
    }

    public boolean placedByPlayer() {
        return player.isPresent();
    }

    @Override
    public String toString() {
        return "ArmorStandPlaceEvent{" +
                "armorStand=" + armorStand +
                ", location=" + location +
                ", player=" + player +
                "} " + super.toString();
    }
}
