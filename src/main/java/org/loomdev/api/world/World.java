package org.loomdev.api.world;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.particle.ParticleEffects;
import org.loomdev.api.sound.Sounds;

import java.util.UUID;

public interface World {

    @NotNull UUID getUUID();

    @NotNull Block getBlock(int x, int y, int z);

    @NotNull Block getBlock(@NotNull Location location);

    @NotNull Chunk getChunk(int x, int z);

    boolean isChunkGenerated(int x, int z);

    boolean isChunkGenerated(@NotNull Chunk chunk);

    boolean isChunkLoaded(int x, int z);

    boolean isChunkLoaded(@NotNull Chunk chunk);

    @NotNull Entity spawnEntity(@NotNull Entity entity, @NotNull Location location);

    void spawnParticle(@NotNull Location location, @NotNull ParticleEffects particleEffect, int amount);

    void playSound(@NotNull Location location, @NotNull Sounds sound, float volume, float pitch);
}
