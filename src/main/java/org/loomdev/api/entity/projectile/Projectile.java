package org.loomdev.api.entity.projectile;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.entity.Entity;

import java.util.Optional;

public interface Projectile extends Entity {

    @NonNull Optional<Entity> getOwner();

    void setOwner(@NonNull Entity entity);

    void setVelocity(double d0, double d1, double d2, float f, float f1);

}
