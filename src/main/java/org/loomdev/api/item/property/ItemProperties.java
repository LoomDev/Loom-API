package org.loomdev.api.item.property;

import org.loomdev.api.Loom;
import org.loomdev.api.item.property.data.DamageData;
import org.loomdev.api.item.property.data.EnchantmentData;
import org.loomdev.api.item.property.data.LoreData;
import org.loomdev.api.item.property.data.NameData;

/**
 * The different item properties that can be applied to an {@link org.loomdev.api.item.ItemStack}
 */
public class ItemProperties {

    /**
     * Change the name of an {@link org.loomdev.api.item.ItemStack}.
     * <p>Can be applied to all {@link org.loomdev.api.item.ItemTypes}.</p>
     */
    public static final ItemProperty<NameData> Name = Loom.getRegistry().getItemProperty(NameData.class);

    /**
     * Change the lore of an {@link org.loomdev.api.item.ItemStack}.
     * <p>Can be applied to all {@link org.loomdev.api.item.ItemTypes}.</p>
     */
    public static final ItemProperty<LoreData> Lore = Loom.getRegistry().getItemProperty(LoreData.class);

    /**
     * Modify the damage properties of an {@link org.loomdev.api.item.ItemStack}.
     * <p>Can be applied to all {@link org.loomdev.api.item.ItemTypes}.</p>
     */
    public static final ItemProperty<DamageData> Damage = Loom.getRegistry().getItemProperty(DamageData.class);

    /**
     * Add, remove, etc. enchantments of an {@link org.loomdev.api.item.ItemStack}.
     * <p>Can be applied to any {@link org.loomdev.api.item.ItemTypes}.</p>
     */
    public static final ItemProperty<EnchantmentData> Enchantments = Loom.getRegistry().getItemProperty(EnchantmentData.class);

    // banner
    // block data
    // block state
    // book
    // Compass
    // Crossbow
    // FireworkStar
    // Firework
    // KnowledgeBook
    // LeatherArmor
    // Map
    // Potion
    // Repairable
    // Skull
    // SpawnEgg
    // SuspiciousStew
    // TropicalFishBucket

    // book | BookData = done |

    // map data ??
    // compass
    // Item flags (hide stuff, unbreakable?)
    // Persistence data
    // attribute modifier
    // model data?
    // repair data

    private ItemProperties() { throw new UnsupportedOperationException("You should be instantiating Enchantments"); }
}
