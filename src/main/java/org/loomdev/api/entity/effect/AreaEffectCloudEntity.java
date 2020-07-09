package org.loomdev.api.entity.effect;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.entity.LivingEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AreaEffectCloudEntity extends Entity {

    @NonNull List<StatusEffect> getStatusEffects();

    @NonNull Optional<StatusEffect> getStatusEffect(@NonNull StatusEffectType type);

    void addStatusEffect(@NonNull StatusEffect effect);

    void removeStatusEffect(@NonNull StatusEffectType type);

    void clearStatusEffects();

    boolean hasStatusEffect(@NonNull StatusEffectType type);

    int getDuration();

    void setDuration(int ticks);

    float getRadius();

    void setRadius(float radius);

    int getColor();

    void setColor(int color);

    int getWaitTime();

    void setWaitTime(int ticks);

    boolean isWaiting();

    void  setWaiting(boolean flag);

    float getRadiusOnUse();

    void setRadiusOnUse(float radius);

    float getRadiusPerTick();

    void setRadiusPerTick(float radius);

    @NonNull Optional<LivingEntity> getOwner();

    void setOwner(@NonNull LivingEntity livingEntity);

    @NonNull Map<Entity, Integer> getAffectedEntities(); // TODO is this useful?

    // get/set particle effect

}
