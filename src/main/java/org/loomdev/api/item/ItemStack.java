package org.loomdev.api.item;

import lombok.NonNull;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;

public interface ItemStack<T extends ItemStack<T>> {

    T type(@NonNull ItemTypes type);

    T amount(int amount);

    T name(@NonNull String name);

    T name(@NonNull Component name);

    T lore(@NonNull String... lore);

    T lore(@NonNull TextComponent... lore);

    T addLore(@NonNull String... lore);

    T appendLore(@NonNull TextComponent... lore);

    T removeLoreLine(int line);

    T unbreakable(boolean unbreakable);
}
