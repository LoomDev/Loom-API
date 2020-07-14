package org.loomdev.api.entity.projectile;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.item.ItemStack;
import org.loomdev.api.sound.Sounds;

public interface PersistentProjectile extends Projectile {

    boolean isInBlock();

    double getDamage();

    void setDamage(double damage);

    float getDragInWater(); // TODO yes?

    void setDragInWater(float drag); // TODO yes?

    @NonNull PickupPermission getPickupPermission();

    void setPickupPermission(@NonNull PickupPermission pickupPermission);

    boolean isShotFromCrossbow();

    void setShotFromCrossbow(boolean flag);

    boolean isNoClip();

    void setNoClip(boolean flag);

    byte getPierceLevel();

    void setPierceLevel(byte level);

    boolean isCritical();

    void setCritical(boolean flag);

    int getPunch();

    void setPunch(int punch);

    ItemStack asItemStack();

    Sounds getSound();

    void setSound(Sounds sound);

    enum PickupPermission {
        DISALLOWED, ALLOWED, CREATIVE_ONLY;

        public static PickupPermission fromOrdinal(int i) {
            if (i < 0 || i > values().length) {
                i = 0;
            }

            return values()[i];
        }
    }
}
