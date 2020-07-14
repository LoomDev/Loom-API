package org.loomdev.api.entity;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.loomdev.api.block.Material;
import org.loomdev.api.entity.damage.DamageSource;
import org.loomdev.api.entity.effect.StatusEffect;
import org.loomdev.api.entity.effect.StatusEffectType;
import org.loomdev.api.item.ItemStack;
import org.loomdev.api.sound.Sounds;
import org.loomdev.api.util.Hand;
import org.loomdev.api.world.Location;
import org.loomdev.api.world.World;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface LivingEntity extends Damageable {

    @NonNull List<StatusEffect> getStatusEffects();

    @NonNull Optional<StatusEffect> getStatusEffect(@NonNull StatusEffectType type);

    void addStatusEffect(@NonNull StatusEffect effect);

    void removeStatusEffect(@NonNull StatusEffectType type);

    void clearStatusEffects();

    boolean hasStatusEffect(@NonNull StatusEffectType type);

    int getAir();

    void setAir(int ticks);

    int getMaxAir();

    void setMaxAir(int ticks);

    void resetMaxAir();

    int getNoDamageTicks();

    void setNoDamageTicks(int ticks);

    void swingHand(@NonNull Hand hand);

    boolean isUsingRiptide();

    boolean isSleeping();

    boolean hasLineOfSight(@NonNull Entity other);

    boolean canPickupItems();

    void setCanPickItems(boolean flag);

    Sounds getHurtSound();

    Sounds getHurtSound(@NonNull DamageSource source);
    
    void setHurtSound(@NonNull Sounds sound);

    void setHurtSound(@NonNull DamageSource source, @NonNull Sounds sound);
    
    void playHurtSound(); 

    void playHurtSound(@NonNull DamageSource source); 

    Sounds getDeathSound();

    void setDeathSound(@NonNull Sounds sound);

    Sounds getFallSound();

    void setFallSound(@NonNull Sounds sound);

    Sounds getDrinkSound();

    void setDrinkSound(@NonNull Sounds sound);

    Sounds getEatSound();

    void setEatSound(@NonNull Sounds sound);

    float getSoundVolume();

    void setSoundVolume(float volume);

    float getSoundPitch();

    void setSoundPitch(float pitch);

    boolean isAlive();

    int getStuckArrowCount();

    void setStuckArrowCount(int count);

    int getStingerCount();

    void setStringerCount(int count);

    boolean isHolding(@NonNull Material material); // TODO use material?

    boolean isHolding(@NonNull Predicate<Material> predicate); // TODO use material?

    @NonNull Optional<ItemStack> getStackInHand(@NonNull Hand hand);

    void setStackInHand(@NonNull Hand hand, @NonNull ItemStack itemStack);

    float getMovementSpeed();

    void setMovementSpeed(float speed);

    boolean isHurtByWater();

    void setHurtByWater(boolean flag);

    void resetHurtByWater();

    boolean canSee(@NonNull Entity entity);

    float getHeadYaw();

    void setHeadYaw(float yaw);

    float getBodyYaw();

    void setBodyYaw(float yaw);

    boolean isUsingItem();

    @NonNull Hand getActiveHand();

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
