package org.loomdev.api.entity.boss.dragon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.bossbar.BossBar;
import org.loomdev.api.world.Location;

public interface DragonFight {

    @NonNull BossBar getBossBar();

    @NonNull EnderDragon getDragon();

    Location getEndPortalLocation();

    boolean hasBeenPreviouslyKilled();

    void respawnDragon();

    void resetCrystals();

    void generateEndPortal(boolean withPortals);

    @NonNull SpawnState getSpawnState();

    void setSpawnState(@NonNull SpawnState spawnState);

    enum SpawnState {
        NONE,
        START,
        PREPARING_TO_SUMMON_PILLARS,
        SUMMONING_PILLARS,
        SUMMONING_DRAGON,
        END
    }
}
