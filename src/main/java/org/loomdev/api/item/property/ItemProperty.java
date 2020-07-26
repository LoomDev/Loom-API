package org.loomdev.api.item.property;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.item.ItemStack;
import org.loomdev.api.item.property.data.ItemPropertyData;

public interface ItemProperty<T extends ItemPropertyData> {

    /**
     * Get the {@link ItemPropertyData} object linked to the {@link ItemProperty} of this {@link ItemStack}
     *
     * @param itemStack The {@link ItemStack} the get the {@link ItemPropertyData} object for.
     * @return The {@link ItemPropertyData} object or null if nnot
     */
    @Nullable  T get(@NotNull ItemStack itemStack);

    /**
     * Apply {@link ItemPropertyData} to an {@link ItemStack}.
     *
     * @param itemStack The {@link ItemStack} to apply the {@link ItemProperty} to.
     * @param data The {@link ItemPropertyData} to apply.
     */
    void apply(@NotNull ItemStack itemStack, @NotNull T data);

    /**
     * Check if the {@link ItemProperty} can be applied to an {@link ItemStack}.
     *
     * @param itemStack The {@link ItemStack} to check the {@link ItemProperty} against.
     * @return True if the {@link ItemProperty van be applied}.
     */
    default boolean canApplyTo(@NotNull ItemStack itemStack) {
        return true;
    }
}
