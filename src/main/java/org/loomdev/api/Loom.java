package org.loomdev.api;

import org.loomdev.api.server.Server;

public abstract class Loom {

    private static Server server;

    public static Server getServer() {
        return server;
    }

    public void setServer(Server instance) {
        server = instance;
    }
}
