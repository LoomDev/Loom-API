package org.loomdev.api.entity.effect;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;

public enum StatusEffectType {
    SPEED(1),
    SLOWNESS(2),
    HASTE(3),
    MINING_FATIGUE(4),
    STRENGTH(5),
    INSTANT_HEALTH(6),
    INSTANT_DAMAGE(7),
    JUMP_BOOST(8),
    NAUSEA(9),
    REGENERATION(10),
    RESISTANCE(11),
    FIRE_RESISTANCE(12),
    WATER_BREATHING(13),
    INVISIBILITY(14),
    BLINDNESS(15),
    NIGHT_VISION(16),
    HUNGER(17),
    WEAKNESS(18),
    POISON(19),
    WITHER(20),
    HEALTH_BOOST(21),
    ABSORPTION(22),
    SATURATION(23),
    GLOWING(24),
    LEVITATION(25),
    LUCK(26),
    UNLUCK(27),
    SLOW_FALLING(28),
    CONDUIT_POWER(29),
    DOLPHINS_GRACE(30),
    BAD_OMEN(31),
    HERO_OF_THE_VILLAGE(32);

    static Map<Integer, StatusEffectType> lookupByRawId = new HashMap<>();
    int rawId;

    StatusEffectType(int rawId) {
        this.rawId = rawId;
    }

    public int rawId() {
        return rawId;
    }

    public static @Nullable StatusEffectType getByRawId(int rawId) {
        return lookupByRawId.get(rawId);
    }

    static {
        for (StatusEffectType type : values()) {
            StatusEffectType.lookupByRawId.put(type.rawId, type);
        }
    }
}
