package org.loomdev.api.util.registry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.loomdev.api.item.Enchantment;
import org.loomdev.api.item.property.ItemProperty;
import org.loomdev.api.item.property.data.ItemPropertyData;
import org.loomdev.api.util.builder.BuilderBase;

public interface Registry {

    <T extends ItemPropertyData> void registerItemProperty(@NotNull Class<T> dataType, @NotNull ItemProperty<T> itemProperty);

    <T extends ItemPropertyData> @Nullable ItemProperty<T> getItemProperty(@NotNull Class<T> dataType);

    <V, B extends BuilderBase<V, B>> @Nullable B createBuilder(@NotNull Class<V> type);

    @Nullable Enchantment getEnchantment(String name);

}
