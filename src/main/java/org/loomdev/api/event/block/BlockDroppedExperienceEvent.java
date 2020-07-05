package org.loomdev.api.event.block;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Block;

public class BlockDroppedExperienceEvent extends BlockEvent {

    @Getter
    @Setter
    private int experience;

    public BlockDroppedExperienceEvent(@NotNull Block block, int experience) {
        super(block);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "BlockDroppedExperienceEvent{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}
