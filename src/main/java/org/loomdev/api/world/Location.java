package org.loomdev.api.world;

import lombok.Getter;
import lombok.Setter;

public class Location {

    @Getter
    @Setter
    private World world;

    @Getter
    @Setter
    private double x, y, z;

    @Getter
    @Setter
    private float pitch, yaw;

    public Location(World world, double x, double y, double z) {
        this(world, x, y, z, 0, 0);
    }

    public Location(World world, double x, double y, double z, float pitch, float yaw) {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pitch = pitch;
        this.yaw = yaw;
    }

    // TODO normalizePitch(), normalizeYaw()

    // TODO getBlock()

    // TODO getChunk()

    // TODO getDirection(), setDirection()

    // TODO toVector()

    // TODO add(), subtract(), multiply(), zero()

    // TODO equals(), hash, clone(), and toString()
}
