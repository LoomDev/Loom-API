package org.loomdev.api.event.plugin;

/**
 * Event called when disabling a plugin.
 */
public class PluginDisableEvent {

    private final Reason reason;

    public PluginDisableEvent(Reason reason) {
        this.reason = reason;
    }

    public Reason getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "PluginShutdownEvent";
    }

    public enum Reason {
        SERVER_SHUTDOWN, // server is closing
        ADMINISTRATOR, // administrator has disabled plugin
        UNRESOLVED_DEPENDENCIES, // not all dependencies were found
        UNKNOWN, // an unknown reason
        PLUGIN // triggered by an other plugin.
    }

}
