package org.loomdev.api.entity.effect;

import lombok.Getter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.entity.LivingEntity;

import java.util.Objects;

@Getter
public class StatusEffect {

    private StatusEffectType type;
    private int duration;
    private int amplifier;
    private boolean ambient;
    private boolean showParticles;
    private boolean showIcon;
    @Nullable
    private StatusEffect hiddenEffect;

    public StatusEffect(StatusEffectType type, int duration) {
        this(type, duration, 0);
    }

    public StatusEffect(StatusEffectType type, int duration, int amplifier) {
        this(type, duration, amplifier, false, true);
    }

    public StatusEffect(StatusEffectType type, int duration, int amplifier, boolean ambient, boolean showParticles) {
        this(type, duration, amplifier, ambient, showParticles, showParticles);
    }

    public StatusEffect(StatusEffectType type, int duration, int amplifier, boolean ambient, boolean showParticles, boolean showIcon) {
        this(type, duration, amplifier, ambient, showParticles, showIcon, (StatusEffect) null);
    }
    
    public StatusEffect(StatusEffectType type, int duration, int amplifier, boolean ambient, boolean showParticles, boolean showIcon, @Nullable StatusEffect statuseffectinstance) {
        this.type = type;
        this.duration = duration;
        this.amplifier = amplifier;
        this.ambient = ambient;
        this.showParticles = showParticles;
        this.showIcon = showIcon;
        this.hiddenEffect = statuseffectinstance;
    }

    public StatusEffect(StatusEffect effect) {
        this.type = effect.type;
        copyFrom(effect);
    }

    void copyFrom(StatusEffect statuseffectinstance) {
        this.duration = statuseffectinstance.duration;
        this.amplifier = statuseffectinstance.amplifier;
        this.ambient = statuseffectinstance.ambient;
        this.showParticles = statuseffectinstance.showParticles;
        this.showIcon = statuseffectinstance.showIcon;
    }

    public void apply(@NonNull LivingEntity entity) {
        // TODO
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusEffect that = (StatusEffect) o;
        return duration == that.duration &&
                amplifier == that.amplifier &&
                ambient == that.ambient &&
                showParticles == that.showParticles &&
                showIcon == that.showIcon &&
                type == that.type &&
                Objects.equals(hiddenEffect, that.hiddenEffect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, duration, amplifier, ambient, showParticles, showIcon, hiddenEffect);
    }

    @Override
    public String toString() {
        return "StatusEffect{" +
                "type=" + type +
                ", duration=" + duration +
                ", amplifier=" + amplifier +
                ", ambient=" + ambient +
                ", showParticles=" + showParticles +
                ", showIcon=" + showIcon +
                ", hiddenEffect=" + hiddenEffect +
                '}';
    }
}
