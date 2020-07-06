package org.loomdev.api.monitoring;

public interface Tps {

    double getTps();

    double getTps(TpsInterval interval);

    enum TpsInterval {
        SECONDS_1,
        SECONDS_5,
        SECONDS_15
    }
}
