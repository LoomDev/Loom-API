package org.loomdev.api.entity.passive;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.entity.effect.StatusEffect;

public interface Mooshroom extends Cow {

    @Nullable StatusEffect getStewEffect();

    void setStewEffect(@Nullable StatusEffect effect);

    @NotNull Variant getVariant();

    void setVariant(@NotNull Variant variant);

    enum Variant {
        RED,
        BROWN
    }

}
