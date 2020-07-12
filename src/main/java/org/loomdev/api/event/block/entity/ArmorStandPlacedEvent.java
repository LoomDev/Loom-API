package org.loomdev.api.event.block.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.loomdev.api.entity.decoration.ArmorStand;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.event.CancellableEvent;
import org.loomdev.api.world.Location;

@AllArgsConstructor
public class ArmorStandPlacedEvent extends CancellableEvent {

    @Getter
    @NonNull
    private final ArmorStand armorStand;

    @Getter
    @NonNull
    private final Location location;

    @Getter
    @NonNull
    private final Player player;

    @Override
    public String toString() {
        return "ArmorStandPlaceEvent{" +
                "armorStand=" + armorStand +
                ", location=" + location +
                ", player=" + player +
                "} " + super.toString();
    }
}
