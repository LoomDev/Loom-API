package org.loomdev.api.block;

import org.jetbrains.annotations.NotNull;

public interface BlockState {

    @NotNull Block getBlock();

    @NotNull BlockType getType(); // TODO change from material??
}
