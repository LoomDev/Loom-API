package org.loomdev.api.entity.passive;

import lombok.Getter;
import org.loomdev.api.util.DyeColor;

import java.util.HashMap;
import java.util.Map;

public interface Cat extends TameableEntity, Sittable {

    Type getCatType();

    void setCatType(Type type);

    DyeColor getCollarColor();

    void setCollarColor(DyeColor dyeColor);

    void hiss();

    @Getter
    enum Type {
        TABBY(0),
        BLACK(1),
        RED(2),
        SIAMESE(3),
        BRITISH_SHORTHAIR(4),
        CALICO(5),
        PERSIAN(6),
        RAGDOLL(7),
        WHITE(8),
        JELLIE(9),
        ALL_BLACK(10);

        private static Map<Integer, Type> mapById = new HashMap<>();

        private final int id;

        Type(int id) {
            this.id = id;
        }

        public static Type getById(int id) {
            return mapById.get(id);
        }

        static {
            for (Type type : values()) {
                mapById.put(type.getId(), type);
            }
        }
    }
}
