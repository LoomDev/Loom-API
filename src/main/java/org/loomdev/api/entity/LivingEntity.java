package org.loomdev.api.entity;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.effect.StatusEffect;
import org.loomdev.api.entity.effect.StatusEffectType;
import org.loomdev.api.util.Hand;

import java.util.List;
import java.util.Optional;

public interface LivingEntity extends Damageable {

    @NonNull List<StatusEffect> getStatusEffects();

    @NonNull Optional<StatusEffect> getStatusEffect(@NonNull StatusEffectType type);

    void addStatusEffect(@NonNull StatusEffect effect);

    void removeStatusEffect(@NonNull StatusEffectType type);

    void clearStatusEffects();

    boolean hasStatusEffect(@NonNull StatusEffectType type);

    int getAir();

    void setAir(int ticks);

    int getMaxAir();

    void setMaxAir(int ticks);

    void resetMaxAir();

    int getNoDamageTicks();

    void setNoDamageTicks(int ticks);

    void swingHand(@NonNull Hand hand);

    boolean isUsingRiptide();

    boolean isSleeping();

    boolean hasLineOfSight(@NonNull Entity other);

    boolean canPickupItems();

    void setCanPickItems(boolean flag);

    // colidable enable/disable

    // equipment

}
