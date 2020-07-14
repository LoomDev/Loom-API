package org.loomdev.api.entity.mob;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.LivingEntity;

import java.util.Optional;

public interface Guardian extends HostileEntity {

    boolean areSpikesRetracted();

    void setSpikesRetracted(boolean flag);

    @NonNull Optional<LivingEntity> getBeamTarget();

    void setBeamTarget(@Nullable LivingEntity entity);

    boolean hasBeamTarget();

    // TODO v2 beam progress, ticks and WarmupTime
}
