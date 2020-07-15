package org.loomdev.api.event.server;

import net.kyori.adventure.text.TextComponent;
import org.jetbrains.annotations.NotNull;
import org.loomdev.api.event.Cancellable;
import org.loomdev.api.event.Event;

import java.net.InetAddress;

public class ServerPingedEvent implements Event, Cancellable {

    private final InetAddress address;
    private TextComponent motd;
    private int onlinePlayers, slots, protocolVersion;
    private String version, favicon;
    private boolean cancelled;

    public ServerPingedEvent(@NotNull InetAddress address, @NotNull TextComponent motd, int onlinePlayers, int slots, int protocolVersion, @NotNull String version, @NotNull String favicon) {
        this.address = address;
        this.motd = motd;
        this.onlinePlayers = onlinePlayers;
        this.slots = slots;
        this.protocolVersion = protocolVersion;
        this.version = version;
        this.favicon = favicon;
    }

    public InetAddress getAddress() {
        return this.address;
    }

    public TextComponent getMotd() {
        return this.motd;
    }

    public void setMotd(@NotNull TextComponent motd) {
        this.motd = motd;
    }

    public int getOnlinePlayers() {
        return this.onlinePlayers;
    }

    public void setOnlinePlayers(int onlinePlayers) {
        this.onlinePlayers = onlinePlayers;
    }

    public int getSlots() {
        return this.slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    public void setProtocolVersion(int protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(@NotNull String version) {
        this.version = version;
    }

    public String getFavicon() {
        return this.favicon;
    }

    public void setFavicon(@NotNull String favicon) {
        this.favicon = favicon;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void cancel(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
