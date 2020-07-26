package org.loomdev.api.event.world;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.event.Event;
import org.loomdev.api.world.World;

// TODO javadocs
public class WorldEvent implements Event {

    private final World world;

    public WorldEvent(@NotNull World world) {
        this.world = world;
    }

    public World getWorld() {
        return world;
    }
}
