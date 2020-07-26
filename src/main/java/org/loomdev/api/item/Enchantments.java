package org.loomdev.api.item;

import org.loomdev.api.Loom;

/**
 * The different enchantments of Minecraft.
 *
 * <p>Documentation Source: https://minecraft.gamepedia.com/Enchanting</p>
 */
public class Enchantments {

    /**
     * Increases underwater mining speed.
     */
    public static final Enchantment AQUA_AFFINITY = Loom.getRegistry().getEnchantment("minecraft:aqua_affinity");

    /**
     * Increases damage and applies Slowness IV to arthropod mobs (spiders, cave spiders, silverfish, endermites and bees).
     */
    public static final Enchantment BANE_OF_ARTHROPODS = Loom.getRegistry().getEnchantment("minecraft:bane_of_arthropods");

    /**
     * Reduces explosion damage and knockback.
     */
    public static final Enchantment BLAST_PROTECTION = Loom.getRegistry().getEnchantment("minecraft:blast_protection");

    /**
     * Trident "channels" a bolt of lightning toward a hit entity.
     * Functions only during thunderstorms and if target is unobstructed with opaque blocks.
     */
    public static final Enchantment CHANNELING = Loom.getRegistry().getEnchantment("minecraft:channeling");

    /**
     * Except when in creative mode, items cannot be removed from armor slots except due to death or breaking.
     */
    public static final Enchantment CURSE_OF_BINDING = Loom.getRegistry().getEnchantment("minecraft:binding_curse");

    /**
     * Item destroyed on death.
     */
    public static final Enchantment CURSE_OF_VANISHING = Loom.getRegistry().getEnchantment("minecraft:vanishing_curse");

    /**
     * Increases underwater movement speed.
     */
    public static final Enchantment DEPTH_STRIDER = Loom.getRegistry().getEnchantment("minecraft:depth_strider");

    /**
     * Increases mining speed.
     * When applied to an axe it increases the chance that the axe may stun a shield,
     * with the base chance being 25% and a 5% increase for each level of efficiency.
     */
    public static final Enchantment EFFICIENCY = Loom.getRegistry().getEnchantment("minecraft:efficiency");

    /**
     * Reduces fall damage.
     */
    public static final Enchantment FEATHER_FALLING = Loom.getRegistry().getEnchantment("minecraft:feather_falling");

    /**
     * Sets target on fire.
     */
    public static final Enchantment FIRE_ASPECT = Loom.getRegistry().getEnchantment("minecraft:fire_aspect");

    /**
     * Reduces fire damage and burn time.
     */
    public static final Enchantment FIRE_PROTECTION = Loom.getRegistry().getEnchantment("minecraft:fire_protection");

    /**
     * Arrows set target on fire.
     */
    public static final Enchantment FLAME = Loom.getRegistry().getEnchantment("minecraft:flame");

    /**
     * Increases certain block drops.
     */
    public static final Enchantment FORTUNE = Loom.getRegistry().getEnchantment("minecraft:fortune");

    /**
     * Turns water beneath the player into frosted ice and prevents
     * the damage the player would take from standing on magma blocks.
     */
    public static final Enchantment FROST_WALKER = Loom.getRegistry().getEnchantment("minecraft:frost_walker");

    /**
     * Trident deals additional damage to mobs that spawn naturally in the ocean.
     */
    public static final Enchantment IMPALING = Loom.getRegistry().getEnchantment("minecraft:impaling");

    /**
     * Shooting consumes no regular arrows.
     */
    public static final Enchantment INFINITY = Loom.getRegistry().getEnchantment("minecraft:infinity");

    /**
     * Increases knockback.
     */
    public static final Enchantment KNOCKBACK = Loom.getRegistry().getEnchantment("minecraft:knockback");

    /**
     * Increases mob loot.
     */
    public static final Enchantment LOOTING = Loom.getRegistry().getEnchantment("minecraft:looting");

    /**
     * Trident returns after being thrown. Higher levels reduce return time.
     */
    public static final Enchantment LOYALTY = Loom.getRegistry().getEnchantment("minecraft:loyalty");

    /**
     * Increases rate of good loot (enchanting books, etc.)
     */
    public static final Enchantment LUCK_OF_THE_SEA = Loom.getRegistry().getEnchantment("minecraft:luck_of_the_sea");

    /**
     * Decreases wait time until fish/junk/loot "bites".
     */
    public static final Enchantment LURE = Loom.getRegistry().getEnchantment("minecraft:lure");

    /**
     * Repair the item while gaining XP orbs.
     */
    public static final Enchantment MENDING = Loom.getRegistry().getEnchantment("minecraft:mending");

    /**
     * Shoot 3 arrows at the cost of one; only one arrow can be recovered.
     */
    public static final Enchantment MULTISHOT = Loom.getRegistry().getEnchantment("minecraft:multishot");

    /**
     * Arrows pass through multiple entities.
     */
    public static final Enchantment PIERCING = Loom.getRegistry().getEnchantment("minecraft:piercing");

    /**
     * Increases arrow damage.
     */
    public static final Enchantment POWER = Loom.getRegistry().getEnchantment("minecraft:power");

    /**
     * Reduces projectile damage.
     */
    public static final Enchantment PROJECTILE_PROTECTION = Loom.getRegistry().getEnchantment("minecraft:projectile_protection");

    /**
     * Reduces most types of damage by 4% for each level.
     */
    public static final Enchantment PROTECTION = Loom.getRegistry().getEnchantment("minecraft:protection");

    /**
     * Increases arrow knockback.
     */
    public static final Enchantment PUNCH = Loom.getRegistry().getEnchantment("minecraft:punch");

    /**
     * Decreases crossbow charging time.
     */
    public static final Enchantment QUICK_CHARGE = Loom.getRegistry().getEnchantment("minecraft:quick_charge");

    /**
     * Extends underwater breathing time.
     */
    public static final Enchantment RESPIRATION = Loom.getRegistry().getEnchantment("minecraft:respiration");

    /**
     * Trident launches player with itself when thrown. Functions only in water or rain.
     */
    public static final Enchantment RIPTIDE = Loom.getRegistry().getEnchantment("minecraft:riptide");

    /**
     * Increases damage.
     */
    public static final Enchantment SHARPNESS = Loom.getRegistry().getEnchantment("minecraft:sharpness");

    /**
     * Mined blocks drop themselves.
     */
    public static final Enchantment SILK_TOUCH = Loom.getRegistry().getEnchantment("minecraft:silk_touch");

    /**
     * Increases damage to undead mobs.
     */
    public static final Enchantment SMITE = Loom.getRegistry().getEnchantment("minecraft:smite");

    /**
     * Increases walking speed on soul sand and soul soil.
     */
    public static final Enchantment SOUL_SPEED = Loom.getRegistry().getEnchantment("minecraft:soul_speed");

    /**
     * Increases sweeping attack damage.
     */
    public static final Enchantment SWEEPING_EDGE = Loom.getRegistry().getEnchantment("minecraft:sweeping");

    /**
     * Reflects some of the damage taken when hit, at the cost of reducing durability with each proc.
     */
    public static final Enchantment THORNS = Loom.getRegistry().getEnchantment("minecraft:thorns");

    /**
     * Increases item durability.
     */
    public static final Enchantment UNBREAKING = Loom.getRegistry().getEnchantment("minecraft:unbreaking");

    private Enchantments() { throw new UnsupportedOperationException("You should be instantiating Enchantments"); }
}
