package org.loomdev.api.event.block;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.event.CancellableEvent;

@AllArgsConstructor
public class BlockEvent extends CancellableEvent {

    @Getter
    @NotNull
    private final Block block;

    @Override
    public String toString() {
        return "BlockEvent{" +
                "block=" + block +
                "} " + super.toString();
    }
}
