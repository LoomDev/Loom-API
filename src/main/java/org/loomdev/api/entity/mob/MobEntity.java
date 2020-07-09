package org.loomdev.api.entity.mob;

import org.loomdev.api.entity.LivingEntity;

public interface MobEntity extends LivingEntity {

    boolean hasAi();

    void setAi(boolean flag);

    boolean canPickupItems();

    void setCanPickItems(boolean flag);

    boolean isPersistent();

    void setPersistent(boolean remove);

}
