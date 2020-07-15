package org.loomdev.api.item;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.jetbrains.annotations.NotNull;

public interface ItemStack<T extends ItemStack<T>> {

    T type(@NotNull ItemTypes type);

    T amount(int amount);

    T name(@NotNull String name);

    T name(@NotNull Component name);

    T lore(@NotNull String... lore);

    T lore(@NotNull TextComponent... lore);

    T addLore(@NotNull String... lore);

    T appendLore(@NotNull TextComponent... lore);

    T removeLoreLine(int line);

    T unbreakable(boolean unbreakable);
}
