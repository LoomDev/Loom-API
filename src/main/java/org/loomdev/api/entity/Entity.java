package org.loomdev.api.entity;

import net.kyori.adventure.text.Component;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.math.BoundingBox;
import org.loomdev.api.math.Vector3d;
import org.loomdev.api.world.Location;
import org.loomdev.api.world.World;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Entity {

    @NonNull EntityType getType();

    int getEntityId();

    @NonNull UUID getUniqueId();

    @NonNull Component getName();

    @NonNull Component getDisplayName();

    @NonNull Optional<Component> getCustomName();

    void setCustomName(@NonNull Component component);

    boolean hasCustomName();

    boolean isCustomNameVisible();

    void setCustomNameVisible(boolean flag);

    @NonNull BoundingBox getBoundingBox();

    @NonNull Location getLocation();

    @NonNull World getWorld();

    boolean teleport(@NonNull Entity entity); // TODO add tp cause

    boolean teleport(@NonNull Location location); // TODO add tp cause

    void remove();

    boolean isDead();

    @NonNull Optional<Entity> getVehicle();

    void leaveVehicle();

    boolean isOnVehicle(); // TODO find a better name.

    @NonNull List<Entity> getPassengers();

    void addPassenger(@NonNull Entity passenger);

    @NonNull Optional<Entity> getPassenger();

    void setPassenger(@NonNull Entity passenger);

    void removePassenger(@NonNull Entity passenger);

    boolean hasPassengers();

    void ejectPassengers();

    @NonNull Vector3d getVelocity();

    void setVelocity(@NonNull Vector3d velocity);

    boolean isOnGround();

    boolean isSilent();

    void setSilent(boolean flag);

    boolean isGlowing();

    void setGlowing(boolean flag);

    boolean hasNoGravity();

    void setNoGravity(boolean flag);

    int getAge();

    int getPortalCooldown();

    void setPortalCooldown(int ticks);

    int getFireTicks();

    void setFireTicks(int ticks);

    void setOnFireFor(int ticks);

    double getFallDistance();

    void setFallDistance(float distance);

    double getEyeY(); // TODO move to Living entity?

    boolean isSwimming();

    void setSwimming(boolean flag);

    boolean isInvisible();

    void  setInvisible(boolean flag);

    boolean isInvulnerable(); // TODO move to Living entity?

    void setInvulnerable(boolean flag); // TODO move to Living entity?

    void setRotation(float yaw, float pitch);

    // TODO persistent api?

    // TODO Last damage?

    // TODO pose

    // TODO scoreboard stuff

    // TODO getEntitiesNearby(double radius)

}
