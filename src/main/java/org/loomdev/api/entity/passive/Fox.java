package org.loomdev.api.entity.passive;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public interface Fox extends AnimalEntity {

    @NonNull Type getFoxType();

    void setFoxType(@NonNull Type type);

    boolean isCrouching();

    void setCrouching(boolean flag);

    void setSleeping(boolean flag);

    boolean isChasing();

    void setChasing(boolean flag);

    boolean isRollingHead();

    void setRollingHead(boolean flag);

    List<UUID> getTrusted();

    enum Type {
        RED(0),
        SNOW(1);

        // TODO add biomes

        private static final Map<Integer, Type> ID_TYPE_MAP = Arrays.stream(values()).collect(Collectors.toMap(Type::getId, t -> t));
        private final int id;

        Type(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public static Type getById(int id) {
            return ID_TYPE_MAP.get(id);
        }
    }
}
