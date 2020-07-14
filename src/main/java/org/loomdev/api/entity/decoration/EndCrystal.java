package org.loomdev.api.entity.decoration;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.world.Location;

import java.util.Optional;

public interface EndCrystal extends Entity {

    @NonNull Optional<Location> getBeamTarget();

    void setBeamTarget(@Nullable Location location);

    boolean isBottomShown();

    void setBottomShown(boolean flag);

}
