package org.loomdev.api.scheduler;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.Loom;
import org.loomdev.api.plugin.Plugin;

import java.util.concurrent.TimeUnit;

public interface Task {

    int getTaskId();

    @NonNull Plugin getPlugin();

    void cancel();

    void cancelInterrupt();

    static @NonNull  Builder builder() {
        return Loom.getServer().getScheduler().createTask();
    }

    interface Builder {

        @NonNull Builder async();

        @NonNull Builder execute(@NonNull Runnable runnable);

        @NonNull Builder delay(long delay, TimeUnit timeUnit);

        @NonNull Builder delayTicks(long delay);

        @NonNull Builder interval(long delay, TimeUnit timeUnit);

        @NonNull Builder intervalTicks(long ticks);

        @NonNull Task complete(@NonNull Plugin plugin);
    }
}
