package org.loomdev.api.item;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.Loom;
import org.loomdev.api.item.property.ItemProperty;
import org.loomdev.api.util.builder.BuilderBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public interface ItemStack {

    static Builder builder() {
        return Loom.getRegistry().createBuilder(ItemStack.class);
    }

    @NotNull ItemTypes getType();

    void setType(@NotNull ItemTypes type);

    int getAmount();

    void setAmount(int amount);

    @NotNull Component getName();

    default void setName(@NotNull String name) {
        setName(TextComponent.of(name));
    }

    void setName(@NotNull Component name);

    void removeCustomName();

    @NotNull List<Component> getLore();

    void setLore(@NotNull String... lore);

    void setLore(@NotNull List<Component> lore);

    <T> T getProperty(ItemProperty<T> property);

    <T> void setProperty(ItemProperty<T> property, T data);

    Component getHoverText();

    boolean isFood();

    boolean isStackable();

    void increment(int amount);

    void decrement(int amount);

    ItemStack spit(int newStackCount);

    // Properties:
    // Damage
    // Item flags (hide stuff, unbreakable?)
    // Persistence data



    interface Builder extends BuilderBase<ItemStack, Builder> {

        Builder type(@NotNull ItemTypes type);

        Builder amount(int amount);

        Builder name(@NotNull String name);

        Builder name(@NotNull Component name);

        default Builder lore(@NotNull String... lore) {
            return lore((TextComponent[]) Arrays.stream(lore).map(TextComponent::of).toArray());
        }

        Builder lore(@NotNull TextComponent... lore);

        Builder appendLore(@NotNull String... lore);

        Builder appendLore(@NotNull TextComponent... lore);

        Builder removeLoreLine(int line);

        // Builder unbreakable(boolean unbreakable); //

        Builder enchant(Enchantment enchantment, int level);

        <T> Builder property(ItemProperty<T> property, Consumer<T> data);

        // attribute modifier
        // model data?

    }
}
