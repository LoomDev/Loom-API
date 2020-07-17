package org.loomdev.api.entity.mob;

import org.loomdev.api.entity.ConvertingEntity;

public interface Zombie extends HostileEntity, ConvertingEntity {

    boolean canBreakDoors();

    void setCanBreakDoors(boolean flag);

    boolean isBaby();

    void setBaby(boolean flag);

    // TODO v2 override burnsInDayLight

}
