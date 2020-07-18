package org.loomdev.api.entity.passive;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Arrays;
import java.util.Comparator;

public interface Horse extends HorseBase {

    @NonNull Color getColor();

    void setColor(@NonNull Color color);

    @NonNull Markings getMarkings();

    void setMarkings(@NonNull Markings markings);

    // TODO inventory

    enum Color {
        WHITE(0),
        CREAMY(1),
        CHESTNUT(2),
        BROWN(3),
        BLACK(4),
        GRAY(5),
        DARKBROWN(6);

        private static final Color[] VALUES = Arrays.stream(values())
                .sorted(Comparator.comparingInt(Color::getIndex))
                .toArray(Color[]::new);
        private final int index;

        Color(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public static Color getByIndex(int index) {
            return VALUES[index % VALUES.length];
        }
    }

    enum Markings {
        NONE(0),
        WHITE(1),
        WHITE_FIELD(2),
        WHITE_DOTS(3),
        BLACK_DOTS(4);

        private static final Markings[] VALUES = Arrays.stream(values())
                .sorted(Comparator.comparingInt(Markings::getIndex))
                .toArray(Markings[]::new);
        private final int index;

        Markings(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public static Markings getByIndex(int index) {
            return VALUES[index % VALUES.length];
        }
    }
}
