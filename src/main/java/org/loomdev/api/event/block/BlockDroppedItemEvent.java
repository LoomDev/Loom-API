package org.loomdev.api.event.block;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;
import org.loomdev.api.entity.player.Player;
import org.loomdev.api.item.ItemStack;

import java.util.Set;

public class BlockDroppedItemEvent extends BlockEvent {

    @Getter
    @NotNull
    private final Player player;

    @Getter
    @Setter
    @NotNull
    private Set<ItemStack> droppedItems;

    public BlockDroppedItemEvent(@NotNull Block block, @NotNull Player player, @NotNull Set<ItemStack> droppedItems) {
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
