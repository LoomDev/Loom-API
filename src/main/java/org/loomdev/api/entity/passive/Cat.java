package org.loomdev.api.entity.passive;

import org.loomdev.api.util.DyeColor;

import java.util.HashMap;
import java.util.Map;

public interface Cat extends TameableEntity, Sittable {

    Variant getVariant();

    void setVariant(Variant variant);

    DyeColor getCollarColor();

    void setCollarColor(DyeColor dyeColor);

    void hiss();

    enum Variant {
        TABBY,
        BLACK,
        RED,
        SIAMESE,
        BRITISH_SHORTHAIR,
        CALICO,
        PERSIAN,
        RAGDOLL,
        WHITE,
        JELLIE,
        ALL_BLACK;
    }
}
