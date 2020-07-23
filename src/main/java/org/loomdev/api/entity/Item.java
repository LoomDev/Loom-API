package org.loomdev.api.entity;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.item.ItemStack;

import java.util.Optional;
import java.util.UUID;

public interface Item extends Entity {

    @NonNull Optional<UUID> getOwner();

    void setOwner(@Nullable UUID uuid);

    @NonNull Optional<UUID> getThrower();

    void setThrower(@Nullable UUID uuid);

    @NonNull ItemStack getItemStack();

    void setItemStack(@NonNull ItemStack itemstack);

    int getPickupDelay();

    void setPickupDelay(int ticks);
}
