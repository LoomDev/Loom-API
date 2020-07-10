package org.loomdev.api;

import lombok.Getter;
import lombok.Setter;
import org.loomdev.api.server.Server;

public abstract class Loom {

    @Getter
    @Setter
    private static Server server;
}
