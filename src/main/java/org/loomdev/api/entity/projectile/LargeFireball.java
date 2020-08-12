package org.loomdev.api.entity.projectile;

public interface LargeFireball extends SizedFireball {
    /**
     * Get the power of the explosion.
     *
     * @return The power of the explosion.
     */
    int getExplosionPower();

    /**
     * Set the power of the explosion.
     *
     * @param power The new power of the explosion.
     */
    void setExplosionPower(int power);
}
