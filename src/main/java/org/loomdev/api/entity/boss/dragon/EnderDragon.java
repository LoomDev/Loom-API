package org.loomdev.api.entity.boss.dragon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.entity.ComplexEntity;
import org.loomdev.api.entity.ComplexEntityPart;
import org.loomdev.api.entity.mob.MobEntity;
import org.loomdev.api.entity.mob.Monster;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public interface EnderDragon extends MobEntity, Monster, ComplexEntity {

    int getTicksSinceDeath();

    void setTicksSinceDeath(int ticks);

    Optional<DragonFight> getFight();

    @NonNull Phase getPhase();

    void setPhase(@NonNull Phase phase);

    default @NonNull Set<EnderDragonPart> getDragonParts() {
        return getParts().stream()
                .map(cep -> (EnderDragonPart)cep)
                .collect(Collectors.toSet());
    }

    @Override
    @NonNull Set<ComplexEntityPart> getParts();

    enum Phase {
        HOLDING_PATTERN("HoldingPattern"),
        STRAFE_PLAYER("StrafePlayer"),
        LANDING_APPROACH("LandingApproach"),
        LANDING("Landing"),
        TAKEOFF("Takeoff"),
        SITTING_FLAMING("SittingFlaming"),
        SITTING_SCANNING("SittingScanning"),
        SITTING_ATTACKING("SittingAttacking"),
        CHARGING_PLAYER("ChargingPlayer"),
        DYING("Dying"),
        HOVER("Hover");

        private final static Map<String, Phase> mapByName = new HashMap<>();
        private final String name;

        Phase(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static Phase getByName(String name) {
            return mapByName.get(name);
        }

        static {
            for(Phase phase : values()) {
                mapByName.put(phase.getName(), phase);
            }
        }
    }
}