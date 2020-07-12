package org.loomdev.api.entity.vehicle;

import org.loomdev.api.block.BlockTypes;
import org.loomdev.api.entity.Entity;
import org.loomdev.api.item.ItemTypes;

public interface Boat extends Entity {
    
    Type getBoatType();
    
    void setBoatType(Type type);

    Placement getPlacement();
    
    enum Type {
        OAK(BlockTypes.OAK_PLANKS, ItemTypes.OAK_BOAT, "oak"),
        SPRUCE(BlockTypes.SPRUCE_PLANKS, ItemTypes.SPRUCE_BOAT, "spruce"),
        BIRCH(BlockTypes.BIRCH_PLANKS, ItemTypes.BIRCH_BOAT, "birch"),
        JUNGLE(BlockTypes.JUNGLE_PLANKS, ItemTypes.JUNGLE_BOAT, "jungle"),
        ACACIA(BlockTypes.ACACIA_PLANKS, ItemTypes.ACACIA_BOAT, "acacia"),
        DARK_OAK(BlockTypes.DARK_OAK_PLANKS, ItemTypes.DARK_OAK_BOAT, "dark_oak");

        private final BlockTypes plankType;
        private final ItemTypes itemTypes;
        private final String name;

        Type(BlockTypes plankType, ItemTypes itemTypes, String name) {
            this.plankType = plankType;
            this.itemTypes = itemTypes;
            this.name = name;
        }

        private String getName() {
            return this.name;
        }

        public ItemTypes getItemType() {
            return itemTypes;
        }

        public BlockTypes getPlankType() {
            return plankType;
        }
    }

    enum Placement {
        IN_WATER,
        UNDER_WATER,
        UNDER_FLOWING_WATER,
        ON_LAND,
        IN_AIR
    }
}
