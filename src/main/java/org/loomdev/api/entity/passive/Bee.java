package org.loomdev.api.entity.passive;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.mob.Angerable;
import org.loomdev.api.world.Location;

import java.util.Optional;

public interface Bee extends AnimalEntity, Angerable {

    Optional<Location> getFlowerLocation();

    void setFlowerLocation(@Nullable Location location);

    boolean hasFlower();

    Optional<Location> getHiveLocation();

    void setHiveLocation(@Nullable Location location);

    boolean hasHive();

    boolean hasNectar();

    void setHasNectar(boolean flag);

    boolean hasStung();

    void setHasString(boolean flag);

    int getTicksUntilCanPollinate();

    void setTicksUntilCanPollinate(int ticks);

    int getCannotEnterHiveTicks();

    void setCannotEnterHiveTicks(int ticks);

}
