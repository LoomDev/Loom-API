package org.loomdev.api.entity.passive;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.entity.JumpingMount;
import org.loomdev.api.entity.Saddleable;
import org.loomdev.api.entity.passive.AnimalEntity;

import java.util.Optional;
import java.util.UUID;

public interface HorseBase extends AnimalEntity, JumpingMount, Saddleable {
    boolean isInAir();

    void setInAir(boolean flag);

    boolean isTame();

    void setTame(boolean flag);

    boolean isEatingGrass();

    boolean isAngry();

    boolean isBred();

    void setBred(boolean flag);

    int getTemper();

    void setTemper(int temper);

    int addTemper(int temper);

    int getMaxTemper();

    void setMaxTemper(int temper);

    void resetMaxTemper();

    Optional<UUID> getOwner();

    void setOwner(@NonNull UUID uuid);

}
