package org.loomdev.api.event.player;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import net.kyori.adventure.text.TextComponent;
import org.loomdev.api.entity.player.Player;

import java.util.Optional;
import java.util.Set;

public class PlayerMessageSentEvent extends CancellablePlayerEvent {

    @Getter
    public Optional<TextComponent> prefix;

    @Getter
    public Optional<TextComponent> suffix = Optional.empty();

    @Getter
    @Setter
    public TextComponent message;

    @Getter
    @Setter
    public Set<Player> recipients;

    public PlayerMessageSentEvent(@NonNull Player player, @NonNull String message, @NonNull Set<Player> recipients) {
        super(player);
        this.prefix = Optional.of(TextComponent.builder()
                .append("<")
                .append(player.getDisplayName())
                .append("> ")
                .build()
        );
        this.message = TextComponent.of(message);
        this.recipients = recipients;
    }

    public void setPrefix(String prefix) {
        setPrefix(TextComponent.of(prefix));
    }

    public void setPrefix(TextComponent prefix) {
        this.prefix = Optional.of(prefix);
    }

    public void setSuffix(String suffix) {
        setSuffix(TextComponent.of(suffix));
    }

    public void setSuffix(TextComponent suffix) {
        this.suffix = Optional.of(suffix);
    }
}
