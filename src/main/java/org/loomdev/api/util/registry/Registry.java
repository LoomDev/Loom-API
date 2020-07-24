package org.loomdev.api.util.registry;

import org.loomdev.api.item.property.ItemProperty;
import org.loomdev.api.util.builder.BuilderBase;

public interface Registry {

    <T> ItemProperty<T> getItemProperty(Class<T> dataType);

    <V, B extends BuilderBase<V, B>> B createBuilder(Class<V> type);

}
