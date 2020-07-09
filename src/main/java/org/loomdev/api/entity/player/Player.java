package org.loomdev.api.entity.player;

import org.loomdev.api.entity.LivingEntity;

public interface Player extends LivingEntity {

    boolean isSneaking();

    void setSneaking(boolean flag);

    boolean isSprinting();

    void setSprinting(boolean flag);

    float getWalkSpeed();

    void setWalkSpeed(float speed);

    float getFlySpeed();

    void setFlySpeed(float speed);

}
