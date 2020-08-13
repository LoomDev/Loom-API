package org.loomdev.api.entity.passive;

public interface Llama extends AbstractDonkey {

    int getStrength();

    void setStrength(int strength);

    Variant getVariant();

    void setVariant(Variant color);

    // TODO inventory

    enum Variant {
        CREAMY,
        WHITE,
        BROWN,
        GRAY
    }
}
