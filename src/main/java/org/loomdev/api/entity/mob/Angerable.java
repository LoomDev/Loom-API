package org.loomdev.api.entity.mob;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.LivingEntity;
import org.loomdev.api.entity.player.Player;

import java.util.Optional;
import java.util.UUID;

public interface Angerable {

    int getAngerTime();

    void setAngerTime(int ticks);

    boolean isAngry();

    void stopAnger();

    Optional<UUID> getAngryAt();

    void setAngryAt(@Nullable UUID uuid);

    Optional<LivingEntity> getTarget();

    void setTarget(@NonNull LivingEntity entity);

    void forgive(@NonNull Player player); // TODO not server player (npc)

}
