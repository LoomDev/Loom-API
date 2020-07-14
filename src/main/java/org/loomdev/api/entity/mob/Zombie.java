package org.loomdev.api.entity.mob;

public interface Zombie extends HostileEntity {

    boolean canBreakDoors();

    void setCanBreakDoors(boolean flag);

    boolean isBaby();

    void setBaby(boolean flag);

    // TODO v2 override burnsInDayLight

}
