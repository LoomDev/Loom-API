package org.loomdev.api.world;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.loomdev.api.math.Vector3d;

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

    public int getBlockX() {
        return (int) Math.floor(this.x);
    }

    public int getBlockY() {
        return (int) Math.floor(this.x);
    }

    public int getBlockZ() {
        return (int) Math.floor(this.x);
    }

    public @NonNull Vector3d toVector() {
        return new Vector3d(this.x, this.y, this.z);
    }

    // TODO add(), subtract(), multiply(), zero()

    // TODO equals(), hash, clone(), and toString()


    @Override
    public String toString() {
        return "Location{" +
                "world=" + world +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", pitch=" + pitch +
                ", yaw=" + yaw +
                '}';
    }
}
