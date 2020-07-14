package org.loomdev.api.particle;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;

public enum ParticleEffect {

    AMBIENT_ENTITY_EFFECT("minecraft:ambient_entity_effect"),
    ANGRY_VILLAGER("minecraft:angry_villager"),
    ASH("minecraft:ash"),
    BARRIER("minecraft:barrier"),
    BLOCK("minecraft:block"),
    BUBBLE("minecraft:bubble"),
    BUBBLE_COLUMN_UP("minecraft:bubble_column_up"),
    BUBBLE_POP("minecraft:bubble_pop"),
    CAMPFIRE_COSY_SMOKE("minecraft:campfire_cosy_smoke"),
    CAMPFIRE_SIGNAL_SMOKE("minecraft:campfire_signal_smoke"),
    CLOUD("minecraft:cloud"),
    COMPOSTER("minecraft:composter"),
    CRIMSON_SPORE("minecraft:crimson_spore"),
    CRIT("minecraft:crit"),
    CURRENT_DOWN("minecraft:current_down"),
    DAMAGE_INDICATOR("minecraft:damage_indicator"),
    DOLPHIN("minecraft:dolphin"),
    DRAGON_BREATH("minecraft:dragon_breath"),
    DRIPPING_HONEY("minecraft:dripping_honey"),
    DRIPPING_LAVA("minecraft:dripping_lava"),
    DRIPPING_OBSIDIAN_TEAR("minecraft:dripping_obsidian_tear"),
    DRIPPING_WATER("minecraft:dripping_water"),
    DUST("minecraft:dust"),
    EFFECT("minecraft:effect"),
    ELDER_GUARDIAN("minecraft:elder_guardian"),
    ENCHANT("minecraft:enchant"),
    ENCHANTED_HIT("minecraft:enchanted_hit"),
    END_ROD("minecraft:end_rod"),
    ENTITY_EFFECT("minecraft:entity_effect"),
    EXPLOSION("minecraft:explosion"),
    EXPLOSION_EMITTER("minecraft:explosion_emitter"),
    FALLING_DUST("minecraft:falling_dust"),
    FALLING_HONEY("minecraft:falling_honey"),
    FALLING_LAVA("minecraft:falling_lava"),
    FALLING_NECTAR("minecraft:falling_nectar"),
    FALLING_OBSIDIAN_TEAR("minecraft:falling_obsidian_tear"),
    FALLING_WATER("minecraft:falling_water"),
    FIREWORK("minecraft:firework"),
    FISHING("minecraft:fishing"),
    FLAME("minecraft:flame"),
    FLASH("minecraft:flash"),
    HAPPY_VILLAGER("minecraft:happy_villager"),
    HEART("minecraft:heart"),
    INSTANT_EFFECT("minecraft:instant_effect"),
    ITEM("minecraft:item"),
    ITEM_SLIME("minecraft:item_slime"),
    ITEM_SNOWBALL("minecraft:item_snowball"),
    LANDING_HONEY("minecraft:landing_honey"),
    LANDING_LAVA("minecraft:landing_lava"),
    LANDING_OBSIDIAN_TEAR("minecraft:landing_obsidian_tear"),
    LARGE_SMOKE("minecraft:large_smoke"),
    LAVA("minecraft:lava"),
    MYCELIUM("minecraft:mycelium"),
    NAUTILUS("minecraft:nautilus"),
    NOTE("minecraft:note"),
    POOF("minecraft:poof"),
    PORTAL("minecraft:portal"),
    RAIN("minecraft:rain"),
    REVERSE_PORTAL("minecraft:reverse_portal"),
    SMOKE("minecraft:smoke"),
    SNEEZE("minecraft:sneeze"),
    SOUL("minecraft:soul"),
    SOUL_FIRE_FLAME("minecraft:soul_fire_flame"),
    SPIT("minecraft:spit"),
    SPLASH("minecraft:splash"),
    SQUID_INK("minecraft:squid_ink"),
    SWEEP_ATTACK("minecraft:sweep_attack"),
    TOTEM_OF_UNDYING("minecraft:totem_of_undying"),
    UNDERWATER("minecraft:underwater"),
    WARPED_SPORE("minecraft:warped_spore"),
    WHITE_ASH("minecraft:white_ash"),
    WITCH("minecraft:witch");

    private static Map<String, ParticleEffect> mapById = new HashMap<>();
    private final String id;

    ParticleEffect(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public static @Nullable ParticleEffect getById(String id) {
        return mapById.get(id);
    }

    static {
        for (ParticleEffect type : values()) {
            mapById.put(type.id, type);
        }
    }
}
