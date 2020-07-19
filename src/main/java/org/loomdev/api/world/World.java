package org.loomdev.api.world;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.entity.EntityType;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.particle.ParticleEffects;
import org.loomdev.api.sound.Sounds;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface World {

    @NotNull String getName();

    @NotNull UUID getUUID();

    @NotNull Block getBlock(int x, int y, int z);

    @NotNull Block getBlock(@NotNull Location location);

    @NotNull Chunk getChunk(int x, int z);

    boolean isChunkGenerated(int x, int z);

    boolean isChunkGenerated(@NotNull Chunk chunk);

    boolean isChunkLoaded(int x, int z);

    boolean isChunkLoaded(@NotNull Chunk chunk);

    @NotNull Optional<Entity> spawnEntity(@NotNull EntityType type, @NotNull Location location);

    void spawnParticle(@NotNull Location location, @NotNull ParticleEffects particleEffect);

    void spawnParticle(@NotNull Location location, @NotNull ParticleEffects particleEffect, int amount);

    // TODO offsets + data vars void spawnParticle(@NotNull Location location, @NotNull ParticleEffects particleEffect);

    void playSound(@NotNull Location location, @NotNull Sounds sound, float volume, float pitch);

    @NotNull Collection<? extends Player> getPlayers();

    long getTime();

    void setTime(long ticks);
}
