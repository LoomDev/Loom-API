package org.loomdev.api.event.plugin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.loomdev.api.event.Event;

/**
 * Event called when disabling a plugin.
 */
@AllArgsConstructor
public class PluginDisableEvent extends Event {

    @Getter
    private final Reason reason;

    @Override
    public String toString() {
        return "PluginDisableEvent{" +
                "reason=" + reason +
                '}';
    }

    public enum Reason {
        SERVER_SHUTDOWN, // server is closing
        ADMINISTRATOR, // administrator has disabled plugin
        UNRESOLVED_DEPENDENCIES, // not all dependencies were found
        UNKNOWN, // an unknown reason
        PLUGIN // triggered by an other plugin.
    }
}
