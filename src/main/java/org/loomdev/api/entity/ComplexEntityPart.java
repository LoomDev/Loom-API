package org.loomdev.api.entity;

import org.checkerframework.checker.nullness.qual.NonNull;

public interface ComplexEntityPart {
    @NonNull ComplexEntity getParent();
}
