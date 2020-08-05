package org.loomdev.api.entity.passive;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.item.ItemStack;

import java.util.UUID;

public interface AnimalEntity extends PassiveEntity {

    int getLoveTicks();

    void setLoveTicks(int ticks);

    void resetLoveTicks();

    boolean isInLove();

    UUID getBreedCause();

    void setBreedCause(@NonNull UUID uuid);

    boolean isBreedingItem(@NonNull ItemStack itemStack);
}
