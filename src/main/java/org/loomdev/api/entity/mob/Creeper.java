package org.loomdev.api.entity.mob;

public interface Creeper extends HostileEntity {

    boolean isCharged();

    void setCharged(boolean charged);

    int getFuseTime();

    void setFuseTime(int ticks);

    int getCurrentFuseTime();

    int getExplosionRadius();

    void setExplosionRadius(int radius);

    boolean isIgnited();

    void ignite();

    void explode();
}
