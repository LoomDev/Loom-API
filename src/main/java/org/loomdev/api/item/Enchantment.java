package org.loomdev.api.item;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.util.EquipmentSlot;

public interface Enchantment {

    /**
     * Get the id of the enchantment.
     *
     * @return The id.
     */
    @NotNull String getId();

    /**
     * Get the name of the enchantment.
     *
     * @param level The level to get the name for.
     * @return The name.
     */
    @NotNull Component getName(int level);

    /**
     * Get the minimum possible enchantment level of this enchantment.
     *
     * @return The minimum level.
     */
    int getMinLevel();

    /**
     * Get the maximum possible enchantment level of this enchantment.
     *
     * @return The maximum level.
     */
    int getMaxLevel();

    /**
     * Check if this enchantment can by applied to an {@link ItemStack}.
     *
     * <p>
     *     Note: All enchantments can be applied to any item.
     *     This method returns whether the enchantment can occur on a specific
     *     {@link ItemStack} in vanilla Minecraft.
     * </p>
     *
     * @param itemStack The {@link ItemStack} to check against.
     * @return True if the enchantment can be applied.
     */
    boolean isAcceptableItem(@NotNull ItemStack itemStack);

    /**
     * Check if this enchantment can be combined with another enchantment.
     *
     * <p>
     *     Note: All enchantments can be combined in Loom.
     *     This method returns whether two enchantments can occur combined on the same
     *     {@link ItemStack} in vanilla Minecraft.
     * </p>
     *
     * @param enchantment The enchantment to check against.
     * @return True if the enchantments can be combined on the same {@link ItemStack}.
     */
    boolean canCombineWith(@NotNull Enchantment enchantment);

    /**
     * Checks if this {@link Enchantment} is a curse.
     *
     * <p>
     *     Example of a curse enchantment is {@link Enchantments#CURSE_OF_BINDING}
     * </p>
     *
     * @return True if the enchantment is a curse, otherwise false.
     */
    boolean isCurse();

    /**
     * Check if this {@link Enchantment} is traded by villagers.
     *
     * @return True if the enchantment is traded by villagers, otherwise false.
     */
    boolean isTraded();

    // attack amount
    // protection amount
    // rarity
}
