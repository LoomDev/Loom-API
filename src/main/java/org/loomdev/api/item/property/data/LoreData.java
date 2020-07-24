package org.loomdev.api.item.property.data;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface LoreData {
    @NotNull List<Component> getLore();

    void setLore(@NotNull List<Component> components);
}
