package org.loomdev.api.event;

@FunctionalInterface
public interface EventHandler<T extends Event> {
    void execute(T event);
}
