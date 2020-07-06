package org.loomdev.api.event;

import org.loomdev.api.plugin.Plugin;

public interface EventManager {

    void register(Plugin plugin, Object listener);

    default <E extends Event> void register(Plugin plugin, Class<E> eventClass, EventHandler<E> handler) {
        register(plugin, eventClass, EventOrder.NORMAL, handler);
    }

    <E extends Event> void register(Plugin plugin, Class<E> eventClass, EventOrder order, EventHandler<E> handler);

    void unregister(Plugin plugin);

    void unregister(Plugin plugin, Object listener);

    <E extends Event> void unregister(EventHandler<E> handler);

    <E extends Event> void unregister(Plugin plugin, EventHandler<E> handler);

    <E extends Event> E fire(E event);

    default <E extends Event> void fireAndForget(E event) {
        fire(event);
    }

}
