package org.loomdev.api.entity.passive;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.item.ItemType;

import java.util.UUID;

public interface AnimalEntity extends PassiveEntity {

    int getLoveTicks();

    void setLoveTicks(int ticks);

    void resetLoveTicks();

    boolean isInLove();

    UUID getBreedCause();

    void setBreedCause(@NonNull UUID uuid);

    boolean isBreedingItem(@NonNull ItemType material); // TODO Material or item?

    @NotNull ItemType getBreedingItem(); // TODO Material or item?

    void setBreedingItem(@NonNull ItemType material); // TODO Material or item?
}
