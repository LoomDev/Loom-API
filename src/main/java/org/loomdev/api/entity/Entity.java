package org.loomdev.api.entity;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.HoverEvent;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.command.CommandSource;
import org.loomdev.api.entity.damage.DamageSource;
import org.loomdev.api.item.ItemStack;
import org.loomdev.api.math.BoundingBox;
import org.loomdev.api.math.Vector3d;
import org.loomdev.api.sound.Sounds;
import org.loomdev.api.world.Location;
import org.loomdev.api.world.World;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Entity extends CommandSource {

    @NonNull EntityType getType();

    int getEntityId();

    @NonNull UUID getUniqueId();

    @NonNull String getName();

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

    void destroy();

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

    void addVelocity(@NonNull Vector3d velocity);

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

    boolean isOnFire();

    double getFallDistance();

    void setFallDistance(float distance);

    double getEyeY();

    boolean isSwimming();

    void setSwimming(boolean flag);

    boolean isInvisible();

    void  setInvisible(boolean flag);

    boolean isInvulnerable();

    void setInvulnerable(boolean flag);

    boolean isInvulnerableTo(DamageSource damageSource);

    void setRotation(float yaw, float pitch);

    boolean hasWings();

    void playSound(Sounds sound, float volume, float pitch);

    boolean isFireResistant();

    void  setFireResistant(boolean flag);

    void resetFireResistance();

    boolean isTouchingWater();

    boolean isBeingRainedOn();

    boolean isInsideBubbleColumn();

    default boolean isTouchingRainOrWater() {
        return isTouchingWater() || isBeingRainedOn();
    }

    default boolean isWet() {
        return isTouchingWater() || isBeingRainedOn() || isInsideBubbleColumn();
    }

    default boolean isInsideWaterOrBubbleColumn() {
        return isTouchingWater() || isInsideBubbleColumn();
    }

    boolean isSubmergedInWater();

    boolean isInLava();

    void setInLava(boolean flag);

    boolean isSubmergedInLava();

    float getBrightnessAtEyes();

    float distanceTo(@NonNull Entity entity);

    double squaredDistanceTo(@NonNull Entity entity);

    void pushAwayFrom(@NonNull Entity entity);

    void dropStack(@NonNull ItemStack itemStack);

    void dropStack(@NonNull ItemStack itemStack, float yOffset);

    boolean isInsideWall();

    boolean canFly();

    HoverEvent<HoverEvent.ShowEntity> getHoverEvent();

    // TODO persistent api?

    // TODO Last damage?

    // TODO pose

    // TODO scoreboard stuff

    // TODO getEntitiesNearby(double radius)

}
