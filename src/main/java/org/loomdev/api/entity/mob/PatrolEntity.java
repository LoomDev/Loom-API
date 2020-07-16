package org.loomdev.api.entity.mob;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.world.Location;

import java.util.Optional;

public interface PatrolEntity extends HostileEntity {

    boolean isPatrolLeader();

    void setPatrolLeader(boolean flag);

    boolean isPatrolling();

    void setPatrolling(boolean flag);

    @NonNull Optional<Location> getPatrolTarget();

    void setPatrolTarget(@Nullable Location location);

}
