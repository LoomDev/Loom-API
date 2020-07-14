package org.loomdev.api.world;

import lombok.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.particle.ParticleEffects;
import org.loomdev.api.sound.Sounds;

import java.util.UUID;

public interface World {

    @NonNull UUID getUUID();

    @NonNull Block getBlock(int x, int y, int z);

    @NonNull Block getBlock(@NonNull Location location);

    @NonNull Chunk getChunk(int x, int z);

    @NonNull boolean isChunkGenerated(int x, int z);

    @NonNull boolean isChunkGenerated(@NonNull Chunk chunk);

    @NonNull boolean isChunkLoaded(int x, int z);

    @NonNull boolean isChunkLoaded(@NonNull Chunk chunk);

    @NonNull Entity spawnEntity(@NonNull Entity entity, @NonNull Location location);

    void spawnParticle(@NonNull Location location, @NonNull ParticleEffects particleEffect, int amount);

    void playSound(@NonNull Location location, @NonNull Sounds sound, float volume, float pitch);
}
