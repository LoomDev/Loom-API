package org.loomdev.api.math;

import lombok.Getter;

@Getter
public class BoundingBox {

    public final double minX;
    public final double minY;
    public final double minZ;
    public final double maxX;
    public final double maxY;
    public final double maxZ;

    public BoundingBox() {
        this(0, 0, 0, 0, 0, 0);
    }

    public BoundingBox(Vector3d vec1, Vector3d vec2) {
        this(vec1.x, vec1.y, vec1.z, vec2.x, vec2.y, vec2.z);
    }

    public BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        this.minX = Math.min(minX, maxX);
        this.minY = Math.min(minY, maxY);
        this.minZ = Math.min(minZ, maxZ);
        this.maxX = Math.max(minX, maxX);
        this.maxY = Math.max(minY, maxY);
        this.maxZ = Math.max(minZ, maxZ);
    }

}
