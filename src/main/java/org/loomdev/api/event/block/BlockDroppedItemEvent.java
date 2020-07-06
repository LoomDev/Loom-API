package org.loomdev.api.event.block;

import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.item.ItemStack;

import java.util.Set;

public class BlockDroppedItemEvent extends BlockEvent {

    @Getter
    @NonNull
    private final Player player;

    @Getter
    @Setter
    @NonNull
    private Set<ItemStack> droppedItems;

    public BlockDroppedItemEvent(@NonNull Block block, @NonNull Player player, @NonNull Set<ItemStack> droppedItems) {
        super(block);
        this.player = player;
    }

    @Override
    public String toString() {
        return "BlockDroppedItemEvent{" +
                "player=" + player +
                ", droppedItems=" + droppedItems +
                "} " + super.toString();
    }
}
