package org.loomdev.api.item.property;

import org.loomdev.api.item.ItemStack;

public interface ItemProperty<T> {
    T get(ItemStack itemStack);
    void apply(ItemStack itemStack, T data);
}
