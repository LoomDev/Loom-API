package org.loomdev.api.entity.mob;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.entity.LivingEntity;

import java.util.Optional;

public interface EvokerFangs extends Entity {

    @NonNull Optional<LivingEntity> getOwner();

    void setOwner(@Nullable LivingEntity entity);

}
