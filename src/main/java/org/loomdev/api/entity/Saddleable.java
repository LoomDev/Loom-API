package org.loomdev.api.entity;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.loomdev.api.sound.SoundCategories;

public interface Saddleable {

    boolean canBeSaddled();

    void saddle(@Nullable SoundCategories soundCategory);

    boolean isSaddled();
}
