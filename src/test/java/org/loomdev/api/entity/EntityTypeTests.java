package org.loomdev.api.entity;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EntityTypeTests {

    @Test
    void doEnumValuesMatchRegistry() {
        List<String> current = Arrays.stream(EntityType.values()).map(Enum::toString).collect(Collectors.toList());
        List<String> missing =  Registry.ENTITY_TYPE.getIds().stream()
                .map(Identifier::getPath)
                .map(String::toUpperCase)
                .filter(value -> !current.contains(value))
                .collect(Collectors.toList());
        Assertions.assertTrue(missing.isEmpty(), "Missing entity types: \n" + String.join(",\n", missing));
    }

}
