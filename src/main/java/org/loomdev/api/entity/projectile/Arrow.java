package org.loomdev.api.entity.projectile;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.entity.effect.StatusEffect;
import org.loomdev.api.entity.effect.StatusEffectType;
import org.loomdev.api.util.Color;

import java.util.List;
import java.util.Optional;

public interface Arrow extends PersistentProjectile {

    @NonNull List<StatusEffect> getStatusEffects();

    @NonNull Optional<StatusEffect> getStatusEffect(@NonNull StatusEffectType type);

    void addStatusEffect(@NonNull StatusEffect effect);

    void removeStatusEffect(@NonNull StatusEffectType type);

    void clearStatusEffects();

    boolean hasStatusEffect(@NonNull StatusEffectType type);

    Color getColor();

    void setColor(Color color);

    // TODO potion?
}
