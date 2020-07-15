package org.loomdev.api.scheduler;

import org.loomdev.api.Loom;
import org.loomdev.api.plugin.Plugin;

import java.util.concurrent.TimeUnit;

public interface Task {
    int getTaskId();

    Plugin getPlugin();

    void cancel();

    static Builder builder() {
        return Loom.getServer().getScheduler().createTaskBuilder();
    }

    interface Builder {

        Builder async();

        Builder execute(Runnable runnable);

        Builder delay(long delay, TimeUnit timeUnit);

        Builder delayTicks(long delay);

        Builder interval(long delay, TimeUnit timeUnit);

        Builder intervalTicks(long ticks);

        Task complete(Plugin plugin);
    }
}
