package org.loomdev.api.entity;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.loomdev.api.block.BlockTypes;

import java.util.*;
import java.util.stream.Collectors;

public class EntityTypeTests {

    @Test
    void doEnumValuesMatchRegistry() {
        Map<String, String> current = Arrays.stream(EntityType.values()).collect(Collectors.toMap(Enum::name, EntityType::getId));
        Map<String, String> missing = new HashMap<>();
        List<String> versionMismatch = new ArrayList<>();

        for (Identifier id : Registry.ENTITY_TYPE.getIds()) {
            String name = id.getPath().toUpperCase();
            if (!current.containsKey(name)) {
                missing.put(name, id.toString());
            } else if (!current.get(name).equals(id.toString())) {
                versionMismatch.add("Wrong id:! " + name + " has " + current.get(name) + " but should be " + id.toString());
            }
        }

        List<Map.Entry<String, String>> missingSorted = new ArrayList<>(missing.entrySet());
        missingSorted.sort(Map.Entry.comparingByValue());
        Assertions.assertTrue(missing.isEmpty(), "Missing entity types: \n" + String.join(",\n", missingSorted.stream().map(kv -> kv.getKey() + "(\"" + kv.getValue() + "\")").collect(Collectors.toList())));
        Assertions.assertTrue(versionMismatch.isEmpty(), String.join("\n", versionMismatch));
    }

}
