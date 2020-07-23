package org.loomdev.api.scheduler;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.plugin.Plugin;

import java.util.Optional;
import java.util.Set;

import static org.loomdev.api.scheduler.Task.*;

public interface Scheduler {

    @NonNull Builder createTask();

    @NonNull Optional<Task> getTaskById(int id);

    @NonNull Set<Task> getScheduledTasks();

    @NonNull Set<Task> getScheduledTasks(@NonNull Plugin plugin);

    void unregisterSchedulers(@NonNull Plugin plugin);

    void disableTask(int id, boolean interruptIfRunning);
}
