package org.loomdev.api.entity;

import org.jetbrains.annotations.NotNull;
import org.loomdev.api.block.Material;
import org.loomdev.api.entity.damage.DamageSource;
import org.loomdev.api.entity.effect.StatusEffect;
import org.loomdev.api.item.ItemStack;
import org.loomdev.api.sound.Sound;
import org.loomdev.api.util.Hand;
import org.loomdev.api.world.Location;
import org.loomdev.api.world.World;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface LivingEntity extends Damageable {

    @NotNull List<StatusEffect> getStatusEffects();

    @NotNull Optional<StatusEffect> getStatusEffect(@NotNull StatusEffect.Type type);

    void addStatusEffect(@NotNull StatusEffect effect);

    void removeStatusEffect(@NotNull StatusEffect.Type type);

    void clearStatusEffects();

    boolean hasStatusEffect(@NotNull StatusEffect.Type type);

    int getAir();

    void setAir(int ticks);

    int getMaxAir();

    void setMaxAir(int ticks);

    void resetMaxAir();

    int getNoDamageTicks();

    void setNoDamageTicks(int ticks);

    void swingHand(@NotNull Hand hand);

    boolean isUsingRiptide();

    boolean isSleeping();

    boolean hasLineOfSight(@NotNull Entity other);

    boolean canPickupItems();

    void setCanPickItems(boolean flag);

    Sound.Type getHurtSound();

    Sound.Type getHurtSound(@NotNull DamageSource source);

    void setHurtSound(@NotNull Sound.Type sound);

    void setHurtSound(@NotNull DamageSource source, @NotNull Sound.Type sound);

    void playHurtSound();

    void playHurtSound(@NotNull DamageSource source);

    Sound.Type getDeathSound();

    void setDeathSound(@NotNull Sound.Type sound);

    Sound.Type getFallSound();

    void setFallSound(@NotNull Sound.Type sound);

    Sound.Type getDrinkSound();

    void setDrinkSound(@NotNull Sound.Type sound);

    Sound.Type getEatSound();

    void setEatSound(@NotNull Sound.Type sound);

    float getSoundVolume();

    void setSoundVolume(float volume);

    float getSoundPitch();

    void setSoundPitch(float pitch);

    boolean isAlive();

    int getStuckArrowCount();

    void setStuckArrowCount(int count);

    int getStingerCount();

    void setStringerCount(int count);

    boolean isHolding(@NotNull Material material); // TODO use material?

    boolean isHolding(@NotNull Predicate<Material> predicate); // TODO use material?

    @NotNull Optional<ItemStack> getStackInHand(@NotNull Hand hand);

    void setStackInHand(@NotNull Hand hand, @NotNull ItemStack itemStack);

    float getMovementSpeed();

    void setMovementSpeed(float speed);

    boolean isHurtByWater();

    void setHurtByWater(boolean flag);

    void resetHurtByWater();

    boolean canSee(@NotNull Entity entity);

    float getHeadYaw();

    void setHeadYaw(float yaw);

    float getBodyYaw();

    void setBodyYaw(float yaw);

    boolean isUsingItem();

    @NotNull Hand getActiveHand();

    void setCurrentHand(Hand hand);

    boolean isGliding();

    Optional<Location> getSleepingPosition();

    void setSleepingPosition(Location location);

    void clearSleepingPosition();

    ItemStack eatFood(World world, ItemStack itemStack);

    // attributes

    // colidable enable/disable

    // equipment

}
