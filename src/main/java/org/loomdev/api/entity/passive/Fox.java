package org.loomdev.api.entity.passive;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;

public interface Fox extends AnimalEntity {

    @NotNull Variant getVariant();

    void setVariant(@NotNull Variant variant);

    boolean isCrouching();

    void setCrouching(boolean flag);

    void setSleeping(boolean flag);

    boolean isChasing();

    void setChasing(boolean flag);

    boolean isRollingHead();

    void setRollingHead(boolean flag);

    List<UUID> getTrusted();

    enum Variant {
        RED,
        SNOW
    }
}
