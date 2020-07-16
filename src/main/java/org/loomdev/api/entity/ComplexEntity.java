package org.loomdev.api.entity;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Set;

public interface ComplexEntity {
    @NonNull Set<ComplexEntityPart> getParts();
}
