package org.loomdev.api.block;

import org.jetbrains.annotations.NotNull;

public interface BlockState {

    @NotNull Block getBlock();

    @NotNull Material getType(); // TODO change from material??
}
