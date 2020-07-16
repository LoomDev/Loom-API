package org.loomdev.api.entity.boss.dragon;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.entity.ComplexEntityPart;
import org.loomdev.api.entity.Entity;

public interface EnderDragonPart extends Entity, ComplexEntityPart {
    @Override
    @NonNull EnderDragon getParent();
}
