package org.loomdev.api.block.enums;

import org.loomdev.api.sound.Sounds;

public enum Instrument {

    HARP(Sounds.BLOCK_NOTE_BLOCK_HARP),
    BASEDRUM(Sounds.BLOCK_NOTE_BLOCK_BASEDRUM),
    SNARE(Sounds.BLOCK_NOTE_BLOCK_SNARE),
    HAT(Sounds.BLOCK_NOTE_BLOCK_HAT),
    BASS(Sounds.BLOCK_NOTE_BLOCK_BASS),
    FLUTE(Sounds.BLOCK_NOTE_BLOCK_FLUTE),
    BELL(Sounds.BLOCK_NOTE_BLOCK_BELL),
    GUITAR(Sounds.BLOCK_NOTE_BLOCK_GUITAR),
    CHIME(Sounds.BLOCK_NOTE_BLOCK_CHIME),
    XYLOPHONE(Sounds.BLOCK_NOTE_BLOCK_XYLOPHONE),
    IRON_XYLOPHONE(Sounds.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE),
    COW_BELL(Sounds.BLOCK_NOTE_BLOCK_COW_BELL),
    DIDGERIDOO(Sounds.BLOCK_NOTE_BLOCK_DIDGERIDOO),
    BIT(Sounds.BLOCK_NOTE_BLOCK_BIT),
    BANJO(Sounds.BLOCK_NOTE_BLOCK_BANJO),
    PLING(Sounds.BLOCK_NOTE_BLOCK_PLING);

    private final Sounds sound;

    Instrument(Sounds sound) {
        this.sound = sound;
    }

    public Sounds getSound() {
        return sound;
    }

    public static Instrument getByName(String name) {
        return valueOf(name.toUpperCase());
    }
}
