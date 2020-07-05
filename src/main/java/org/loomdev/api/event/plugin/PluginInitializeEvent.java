package org.loomdev.api.event.plugin;

/**
 * Event called when starting the plugin.
 */
public class PluginInitializeEvent {

    private boolean pluginDisabled;

    public PluginInitializeEvent() {
        this.pluginDisabled = false;
    }

    public void disablePlugin() {
        this.pluginDisabled = true;
    }

    public boolean isPluginDisabled() {
        return pluginDisabled;
    }

    @Override
    public String toString() {
        return "ServerInitializeEvent";
    }

}
