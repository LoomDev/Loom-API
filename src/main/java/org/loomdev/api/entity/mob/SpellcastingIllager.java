package org.loomdev.api.entity.mob;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;

public interface SpellcastingIllager extends Illager {

    @NonNull Spell getSpell();

    void setSpell(@NonNull Spell spell);

    enum Spell {
        NONE(0),
        SUMMON_VEX(1),
        FANGS(2),
        WOLOLO(3),
        DISAPPEAR(4),
        BLINDNESS(5);

        private static final Map<Integer, Spell> mapById = new HashMap<>();
        private final int id;

        Spell(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        static {
            for (Spell spell : values()) {
                mapById.put(spell.id, spell);
            }
        }

        public static Spell getById(int id) {
            return mapById.get(id);
        }
    }
}
