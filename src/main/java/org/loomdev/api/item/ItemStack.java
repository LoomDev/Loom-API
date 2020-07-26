package org.loomdev.api.item;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.Loom;
import org.loomdev.api.item.property.ItemProperty;
import org.loomdev.api.item.property.data.EnchantmentData;
import org.loomdev.api.item.property.data.ItemPropertyData;
import org.loomdev.api.item.property.data.LoreData;
import org.loomdev.api.item.property.data.NameData;
import org.loomdev.api.util.builder.BuilderBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Represents an ItemStack.
 */
public interface ItemStack extends NameData, LoreData, EnchantmentData {

    /**
     * An empty ItemStack.
     */
    ItemStack EMPTY = ItemStack.builder().type(ItemTypes.AIR).build();

    static Builder builder() {
        return Loom.getRegistry().createBuilder(ItemStack.class);
    }

    /**
     * Get the item type of this ItemStack.
     *
     * @return The type of the item.
     * @see ItemTypes
     */
    @NotNull ItemTypes getType();

    /**
     * Set the item type of this ItemStack.
     *
     * @param type The item type.
     * @see ItemTypes
     */
    void setType(@NotNull ItemTypes type);

    /**
     * Get the amount of items in the ItemStack.
     *
     * @return The amount of items in the ItemStack.
     */
    int getAmount();

    /**
     * Set the amount of items in the ItemStack.
     *
     * @param amount The new amount of items.
     */
    void setAmount(int amount);

    /**
     * Increment the amount of items in the ItemStack by 1.
     */
    default void increment() {
        increment(1);
    }

    /**
     * Increment the amount of items in the ItemStack by a specific amount.
     *
     * @param amount The amount to increment the ItemStack size with.
     */
    void increment(int amount);

    /**
     * Decrement the amount of items in the ItemStack by 1.
     */
    default void decrement() {
        decrement(1);
    }

    /**
     * Decrement the amount of items in the ItemStack by a specific amount.
     *
     * @param amount The amount to decrement the ItemStack size with.
     */
    void decrement(int amount);

    /**
     * Split the ItemStack into two stacks.
     *
     * <pre>{@code
     * ItemStack firstStack = ItemStack.builder().type(ItemTypes.STONE).amount(45).build();
     *
     * // Split the original ItemStack in two.
     * ItemStack secondStack = firstStack.split(15);
     *
     * firstStack.getAmount(); // Amount = 30
     * secondStack.getAmount(); // Amount = 15
     * }</pre>
     *
     * @param splitCount The amount of items in the returned stack.
     * @return A the split of ItemStack.
     */
    @NotNull ItemStack split(int splitCount);

    <T extends ItemPropertyData> @NotNull T getProperty(@NotNull ItemProperty<T> property);

    <T extends ItemPropertyData> void setProperty(@NotNull ItemProperty<T> property, @NotNull T data);

    <T extends ItemPropertyData> void changeProperty(@NotNull ItemProperty<T> property, @NotNull Consumer<T> data);

    /**
     * Get whether the itemstack is a food item.
     *
     * @return True if the item can be consumed, otherwise false.
     */
    boolean isFood();

    /**
     * Get whether the item is stackable or not.
     *
     * @return True if stackable, otherwise false.
     */
    boolean isStackable();

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

        Builder enchant(@NotNull Enchantment enchantment, int level);

        <T extends ItemPropertyData> Builder property(@NotNull ItemProperty<T> property, @NotNull Consumer<T> data);

    }
}
