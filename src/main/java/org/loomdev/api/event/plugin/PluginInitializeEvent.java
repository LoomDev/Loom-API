package org.loomdev.api.event.plugin;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.loomdev.api.event.Event;

/**
 * Event called when starting the plugin.
 */
@NoArgsConstructor
public class PluginInitializeEvent extends Event {

    @Getter
    private boolean pluginDisabled;

    public void disablePlugin() {
        this.pluginDisabled = true;
    }

    @Override
    public String toString() {
        return "PluginInitializeEvent{" +
                "pluginDisabled=" + pluginDisabled +
                '}';
    }
}
