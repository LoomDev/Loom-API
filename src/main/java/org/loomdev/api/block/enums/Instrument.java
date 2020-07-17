package org.loomdev.api.block.enums;

import org.loomdev.api.block.BlockTypes;
import org.loomdev.api.sound.Sounds;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Instrument {

    HARP("harp", Sounds.BLOCK_NOTE_BLOCK_HARP),
    BASEDRUM("basedrum", Sounds.BLOCK_NOTE_BLOCK_BASEDRUM),
    SNARE("snare", Sounds.BLOCK_NOTE_BLOCK_SNARE),
    HAT("hat", Sounds.BLOCK_NOTE_BLOCK_HAT),
    BASS("bass", Sounds.BLOCK_NOTE_BLOCK_BASS),
    FLUTE("flute", Sounds.BLOCK_NOTE_BLOCK_FLUTE),
    BELL("bell", Sounds.BLOCK_NOTE_BLOCK_BELL),
    GUITAR("guitar", Sounds.BLOCK_NOTE_BLOCK_GUITAR),
    CHIME("chime", Sounds.BLOCK_NOTE_BLOCK_CHIME),
    XYLOPHONE("xylophone", Sounds.BLOCK_NOTE_BLOCK_XYLOPHONE),
    IRON_XYLOPHONE("iron_xylophone", Sounds.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE),
    COW_BELL("cow_bell", Sounds.BLOCK_NOTE_BLOCK_COW_BELL),
    DIDGERIDOO("didgeridoo", Sounds.BLOCK_NOTE_BLOCK_DIDGERIDOO),
    BIT("bit", Sounds.BLOCK_NOTE_BLOCK_BIT),
    BANJO("banjo", Sounds.BLOCK_NOTE_BLOCK_BANJO),
    PLING("pling", Sounds.BLOCK_NOTE_BLOCK_PLING);

    private static final Map<String, Instrument> NAME_INSTRUMENT_MAP = Arrays.stream(values()).collect(Collectors.toMap(Instrument::getName, i -> i));
    private final String name;
    private final Sounds sound;

    Instrument(String name, Sounds sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public Sounds getSound() {
        return sound;
    }

    public static Instrument getByName(String name) {
        return NAME_INSTRUMENT_MAP.get(name.toLowerCase());
    }
}
