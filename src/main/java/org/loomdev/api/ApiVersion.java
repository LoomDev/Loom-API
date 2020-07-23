package org.loomdev.api;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum ApiVersion {

    UNKNOWN("unknown"),
    v1_16_1R1("1.16.1-R1");

    public static final ApiVersion LATEST = values()[ApiVersion.values().length - 1];

    private static final Map<String, ApiVersion> NAME_VERSION_MAP = Arrays.stream(values()).collect(Collectors.toMap(ApiVersion::getName, apiVersion -> apiVersion));
    private final String name;

    ApiVersion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isNewerThan(ApiVersion other) {
        return this.ordinal() > other.ordinal();
    }

    public boolean isAtLeast(ApiVersion other) {
        return this.ordinal() >= other.ordinal();
    }

    public boolean isOlderThan(ApiVersion other) {
        return this.ordinal() < other.ordinal();
    }

    public boolean isAtMost(ApiVersion other) {
        return this.ordinal() <= other.ordinal();
    }

    public static ApiVersion getByName(String name) {
        return NAME_VERSION_MAP.get(name);
    }
}
