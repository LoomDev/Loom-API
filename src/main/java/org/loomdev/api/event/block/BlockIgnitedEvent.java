package org.loomdev.api.event.block;

import lombok.Getter;
import lombok.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.Entity;

import java.util.Optional;

public class BlockIgnitedEvent extends BlockEvent {

    @Getter
    private Optional<Block> ignitingBlock;

    @Getter
    private Optional<Entity> ignitingEntity;

    @Getter
    private final Cause cause;

    public BlockIgnitedEvent(@NonNull Block block, @NonNull Cause cause, @Nullable Block ignitingBlock, @Nullable Entity ignitingEntity) {
        super(block);
        this.cause = cause;
        this.ignitingBlock = Optional.ofNullable(ignitingBlock);
        this.ignitingEntity = Optional.ofNullable(ignitingEntity);
    }

    @Override
    public String toString() {
        return "BlockIgnitedEvent{" +
                "ignitingBlock=" + ignitingBlock +
                ", ignitingEntity=" + ignitingEntity +
                ", cause=" + cause +
                '}';
    }

    public enum Cause {
        LAVA,
        FLINT_AND_STEEL,
        SPREAD,
        LIGHTNING,
        FIREBALL,
        EXPLOSION
    }
}
