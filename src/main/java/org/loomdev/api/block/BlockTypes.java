package org.loomdev.api.block;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;

public enum BlockTypes {

    ACACIA_BUTTON("minecraft:acacia_button"),
    ACACIA_DOOR("minecraft:acacia_door"),
    ACACIA_FENCE("minecraft:acacia_fence"),
    ACACIA_FENCE_GATE("minecraft:acacia_fence_gate"),
    ACACIA_LEAVES("minecraft:acacia_leaves"),
    ACACIA_LOG("minecraft:acacia_log"),
    ACACIA_PLANKS("minecraft:acacia_planks"),
    ACACIA_PRESSURE_PLATE("minecraft:acacia_pressure_plate"),
    ACACIA_SAPLING("minecraft:acacia_sapling"),
    ACACIA_SIGN("minecraft:acacia_sign"),
    ACACIA_SLAB("minecraft:acacia_slab"),
    ACACIA_STAIRS("minecraft:acacia_stairs"),
    ACACIA_TRAPDOOR("minecraft:acacia_trapdoor"),
    ACACIA_WALL_SIGN("minecraft:acacia_wall_sign"),
    ACACIA_WOOD("minecraft:acacia_wood"),
    ACTIVATOR_RAIL("minecraft:activator_rail"),
    AIR("minecraft:air"),
    ALLIUM("minecraft:allium"),
    ANCIENT_DEBRIS("minecraft:ancient_debris"),
    ANDESITE("minecraft:andesite"),
    ANDESITE_SLAB("minecraft:andesite_slab"),
    ANDESITE_STAIRS("minecraft:andesite_stairs"),
    ANDESITE_WALL("minecraft:andesite_wall"),
    ANVIL("minecraft:anvil"),
    ATTACHED_MELON_STEM("minecraft:attached_melon_stem"),
    ATTACHED_PUMPKIN_STEM("minecraft:attached_pumpkin_stem"),
    AZURE_BLUET("minecraft:azure_bluet"),
    BAMBOO("minecraft:bamboo"),
    BAMBOO_SAPLING("minecraft:bamboo_sapling"),
    BARREL("minecraft:barrel"),
    BARRIER("minecraft:barrier"),
    BASALT("minecraft:basalt"),
    BEACON("minecraft:beacon"),
    BEDROCK("minecraft:bedrock"),
    BEE_NEST("minecraft:bee_nest"),
    BEEHIVE("minecraft:beehive"),
    BEETROOTS("minecraft:beetroots"),
    BELL("minecraft:bell"),
    BIRCH_BUTTON("minecraft:birch_button"),
    BIRCH_DOOR("minecraft:birch_door"),
    BIRCH_FENCE("minecraft:birch_fence"),
    BIRCH_FENCE_GATE("minecraft:birch_fence_gate"),
    BIRCH_LEAVES("minecraft:birch_leaves"),
    BIRCH_LOG("minecraft:birch_log"),
    BIRCH_PLANKS("minecraft:birch_planks"),
    BIRCH_PRESSURE_PLATE("minecraft:birch_pressure_plate"),
    BIRCH_SAPLING("minecraft:birch_sapling"),
    BIRCH_SIGN("minecraft:birch_sign"),
    BIRCH_SLAB("minecraft:birch_slab"),
    BIRCH_STAIRS("minecraft:birch_stairs"),
    BIRCH_TRAPDOOR("minecraft:birch_trapdoor"),
    BIRCH_WALL_SIGN("minecraft:birch_wall_sign"),
    BIRCH_WOOD("minecraft:birch_wood"),
    BLACK_BANNER("minecraft:black_banner"),
    BLACK_BED("minecraft:black_bed"),
    BLACK_CARPET("minecraft:black_carpet"),
    BLACK_CONCRETE("minecraft:black_concrete"),
    BLACK_CONCRETE_POWDER("minecraft:black_concrete_powder"),
    BLACK_GLAZED_TERRACOTTA("minecraft:black_glazed_terracotta"),
    BLACK_SHULKER_BOX("minecraft:black_shulker_box"),
    BLACK_STAINED_GLASS("minecraft:black_stained_glass"),
    BLACK_STAINED_GLASS_PANE("minecraft:black_stained_glass_pane"),
    BLACK_TERRACOTTA("minecraft:black_terracotta"),
    BLACK_WALL_BANNER("minecraft:black_wall_banner"),
    BLACK_WOOL("minecraft:black_wool"),
    BLACKSTONE("minecraft:blackstone"),
    BLACKSTONE_SLAB("minecraft:blackstone_slab"),
    BLACKSTONE_STAIRS("minecraft:blackstone_stairs"),
    BLACKSTONE_WALL("minecraft:blackstone_wall"),
    BLAST_FURNACE("minecraft:blast_furnace"),
    BLUE_BANNER("minecraft:blue_banner"),
    BLUE_BED("minecraft:blue_bed"),
    BLUE_CARPET("minecraft:blue_carpet"),
    BLUE_CONCRETE("minecraft:blue_concrete"),
    BLUE_CONCRETE_POWDER("minecraft:blue_concrete_powder"),
    BLUE_GLAZED_TERRACOTTA("minecraft:blue_glazed_terracotta"),
    BLUE_ICE("minecraft:blue_ice"),
    BLUE_ORCHID("minecraft:blue_orchid"),
    BLUE_SHULKER_BOX("minecraft:blue_shulker_box"),
    BLUE_STAINED_GLASS("minecraft:blue_stained_glass"),
    BLUE_STAINED_GLASS_PANE("minecraft:blue_stained_glass_pane"),
    BLUE_TERRACOTTA("minecraft:blue_terracotta"),
    BLUE_WALL_BANNER("minecraft:blue_wall_banner"),
    BLUE_WOOL("minecraft:blue_wool"),
    BONE_BLOCK("minecraft:bone_block"),
    BOOKSHELF("minecraft:bookshelf"),
    BRAIN_CORAL("minecraft:brain_coral"),
    BRAIN_CORAL_BLOCK("minecraft:brain_coral_block"),
    BRAIN_CORAL_FAN("minecraft:brain_coral_fan"),
    BRAIN_CORAL_WALL_FAN("minecraft:brain_coral_wall_fan"),
    BREWING_STAND("minecraft:brewing_stand"),
    BRICK_SLAB("minecraft:brick_slab"),
    BRICK_STAIRS("minecraft:brick_stairs"),
    BRICK_WALL("minecraft:brick_wall"),
    BRICKS("minecraft:bricks"),
    BROWN_BANNER("minecraft:brown_banner"),
    BROWN_BED("minecraft:brown_bed"),
    BROWN_CARPET("minecraft:brown_carpet"),
    BROWN_CONCRETE("minecraft:brown_concrete"),
    BROWN_CONCRETE_POWDER("minecraft:brown_concrete_powder"),
    BROWN_GLAZED_TERRACOTTA("minecraft:brown_glazed_terracotta"),
    BROWN_MUSHROOM("minecraft:brown_mushroom"),
    BROWN_MUSHROOM_BLOCK("minecraft:brown_mushroom_block"),
    BROWN_SHULKER_BOX("minecraft:brown_shulker_box"),
    BROWN_STAINED_GLASS("minecraft:brown_stained_glass"),
    BROWN_STAINED_GLASS_PANE("minecraft:brown_stained_glass_pane"),
    BROWN_TERRACOTTA("minecraft:brown_terracotta"),
    BROWN_WALL_BANNER("minecraft:brown_wall_banner"),
    BROWN_WOOL("minecraft:brown_wool"),
    BUBBLE_COLUMN("minecraft:bubble_column"),
    BUBBLE_CORAL("minecraft:bubble_coral"),
    BUBBLE_CORAL_BLOCK("minecraft:bubble_coral_block"),
    BUBBLE_CORAL_FAN("minecraft:bubble_coral_fan"),
    BUBBLE_CORAL_WALL_FAN("minecraft:bubble_coral_wall_fan"),
    CACTUS("minecraft:cactus"),
    CAKE("minecraft:cake"),
    CAMPFIRE("minecraft:campfire"),
    CARROTS("minecraft:carrots"),
    CARTOGRAPHY_TABLE("minecraft:cartography_table"),
    CARVED_PUMPKIN("minecraft:carved_pumpkin"),
    CAULDRON("minecraft:cauldron"),
    CAVE_AIR("minecraft:cave_air"),
    CHAIN("minecraft:chain"),
    CHAIN_COMMAND_BLOCK("minecraft:chain_command_block"),
    CHEST("minecraft:chest"),
    CHIPPED_ANVIL("minecraft:chipped_anvil"),
    CHISELED_NETHER_BRICKS("minecraft:chiseled_nether_bricks"),
    CHISELED_POLISHED_BLACKSTONE("minecraft:chiseled_polished_blackstone"),
    CHISELED_QUARTZ_BLOCK("minecraft:chiseled_quartz_block"),
    CHISELED_RED_SANDSTONE("minecraft:chiseled_red_sandstone"),
    CHISELED_SANDSTONE("minecraft:chiseled_sandstone"),
    CHISELED_STONE_BRICKS("minecraft:chiseled_stone_bricks"),
    CHORUS_FLOWER("minecraft:chorus_flower"),
    CHORUS_PLANT("minecraft:chorus_plant"),
    CLAY("minecraft:clay"),
    COAL_BLOCK("minecraft:coal_block"),
    COAL_ORE("minecraft:coal_ore"),
    COARSE_DIRT("minecraft:coarse_dirt"),
    COBBLESTONE("minecraft:cobblestone"),
    COBBLESTONE_SLAB("minecraft:cobblestone_slab"),
    COBBLESTONE_STAIRS("minecraft:cobblestone_stairs"),
    COBBLESTONE_WALL("minecraft:cobblestone_wall"),
    COBWEB("minecraft:cobweb"),
    COCOA("minecraft:cocoa"),
    COMMAND_BLOCK("minecraft:command_block"),
    COMPARATOR("minecraft:comparator"),
    COMPOSTER("minecraft:composter"),
    CONDUIT("minecraft:conduit"),
    CORNFLOWER("minecraft:cornflower"),
    CRACKED_NETHER_BRICKS("minecraft:cracked_nether_bricks"),
    CRACKED_POLISHED_BLACKSTONE_BRICKS("minecraft:cracked_polished_blackstone_bricks"),
    CRACKED_STONE_BRICKS("minecraft:cracked_stone_bricks"),
    CRAFTING_TABLE("minecraft:crafting_table"),
    CREEPER_HEAD("minecraft:creeper_head"),
    CREEPER_WALL_HEAD("minecraft:creeper_wall_head"),
    CRIMSON_BUTTON("minecraft:crimson_button"),
    CRIMSON_DOOR("minecraft:crimson_door"),
    CRIMSON_FENCE("minecraft:crimson_fence"),
    CRIMSON_FENCE_GATE("minecraft:crimson_fence_gate"),
    CRIMSON_FUNGUS("minecraft:crimson_fungus"),
    CRIMSON_HYPHAE("minecraft:crimson_hyphae"),
    CRIMSON_NYLIUM("minecraft:crimson_nylium"),
    CRIMSON_PLANKS("minecraft:crimson_planks"),
    CRIMSON_PRESSURE_PLATE("minecraft:crimson_pressure_plate"),
    CRIMSON_ROOTS("minecraft:crimson_roots"),
    CRIMSON_SIGN("minecraft:crimson_sign"),
    CRIMSON_SLAB("minecraft:crimson_slab"),
    CRIMSON_STAIRS("minecraft:crimson_stairs"),
    CRIMSON_STEM("minecraft:crimson_stem"),
    CRIMSON_TRAPDOOR("minecraft:crimson_trapdoor"),
    CRIMSON_WALL_SIGN("minecraft:crimson_wall_sign"),
    CRYING_OBSIDIAN("minecraft:crying_obsidian"),
    CUT_RED_SANDSTONE("minecraft:cut_red_sandstone"),
    CUT_RED_SANDSTONE_SLAB("minecraft:cut_red_sandstone_slab"),
    CUT_SANDSTONE("minecraft:cut_sandstone"),
    CUT_SANDSTONE_SLAB("minecraft:cut_sandstone_slab"),
    CYAN_BANNER("minecraft:cyan_banner"),
    CYAN_BED("minecraft:cyan_bed"),
    CYAN_CARPET("minecraft:cyan_carpet"),
    CYAN_CONCRETE("minecraft:cyan_concrete"),
    CYAN_CONCRETE_POWDER("minecraft:cyan_concrete_powder"),
    CYAN_GLAZED_TERRACOTTA("minecraft:cyan_glazed_terracotta"),
    CYAN_SHULKER_BOX("minecraft:cyan_shulker_box"),
    CYAN_STAINED_GLASS("minecraft:cyan_stained_glass"),
    CYAN_STAINED_GLASS_PANE("minecraft:cyan_stained_glass_pane"),
    CYAN_TERRACOTTA("minecraft:cyan_terracotta"),
    CYAN_WALL_BANNER("minecraft:cyan_wall_banner"),
    CYAN_WOOL("minecraft:cyan_wool"),
    DAMAGED_ANVIL("minecraft:damaged_anvil"),
    DANDELION("minecraft:dandelion"),
    DARK_OAK_BUTTON("minecraft:dark_oak_button"),
    DARK_OAK_DOOR("minecraft:dark_oak_door"),
    DARK_OAK_FENCE("minecraft:dark_oak_fence"),
    DARK_OAK_FENCE_GATE("minecraft:dark_oak_fence_gate"),
    DARK_OAK_LEAVES("minecraft:dark_oak_leaves"),
    DARK_OAK_LOG("minecraft:dark_oak_log"),
    DARK_OAK_PLANKS("minecraft:dark_oak_planks"),
    DARK_OAK_PRESSURE_PLATE("minecraft:dark_oak_pressure_plate"),
    DARK_OAK_SAPLING("minecraft:dark_oak_sapling"),
    DARK_OAK_SIGN("minecraft:dark_oak_sign"),
    DARK_OAK_SLAB("minecraft:dark_oak_slab"),
    DARK_OAK_STAIRS("minecraft:dark_oak_stairs"),
    DARK_OAK_TRAPDOOR("minecraft:dark_oak_trapdoor"),
    DARK_OAK_WALL_SIGN("minecraft:dark_oak_wall_sign"),
    DARK_OAK_WOOD("minecraft:dark_oak_wood"),
    DARK_PRISMARINE("minecraft:dark_prismarine"),
    DARK_PRISMARINE_SLAB("minecraft:dark_prismarine_slab"),
    DARK_PRISMARINE_STAIRS("minecraft:dark_prismarine_stairs"),
    DAYLIGHT_DETECTOR("minecraft:daylight_detector"),
    DEAD_BRAIN_CORAL("minecraft:dead_brain_coral"),
    DEAD_BRAIN_CORAL_BLOCK("minecraft:dead_brain_coral_block"),
    DEAD_BRAIN_CORAL_FAN("minecraft:dead_brain_coral_fan"),
    DEAD_BRAIN_CORAL_WALL_FAN("minecraft:dead_brain_coral_wall_fan"),
    DEAD_BUBBLE_CORAL("minecraft:dead_bubble_coral"),
    DEAD_BUBBLE_CORAL_BLOCK("minecraft:dead_bubble_coral_block"),
    DEAD_BUBBLE_CORAL_FAN("minecraft:dead_bubble_coral_fan"),
    DEAD_BUBBLE_CORAL_WALL_FAN("minecraft:dead_bubble_coral_wall_fan"),
    DEAD_BUSH("minecraft:dead_bush"),
    DEAD_FIRE_CORAL("minecraft:dead_fire_coral"),
    DEAD_FIRE_CORAL_BLOCK("minecraft:dead_fire_coral_block"),
    DEAD_FIRE_CORAL_FAN("minecraft:dead_fire_coral_fan"),
    DEAD_FIRE_CORAL_WALL_FAN("minecraft:dead_fire_coral_wall_fan"),
    DEAD_HORN_CORAL("minecraft:dead_horn_coral"),
    DEAD_HORN_CORAL_BLOCK("minecraft:dead_horn_coral_block"),
    DEAD_HORN_CORAL_FAN("minecraft:dead_horn_coral_fan"),
    DEAD_HORN_CORAL_WALL_FAN("minecraft:dead_horn_coral_wall_fan"),
    DEAD_TUBE_CORAL("minecraft:dead_tube_coral"),
    DEAD_TUBE_CORAL_BLOCK("minecraft:dead_tube_coral_block"),
    DEAD_TUBE_CORAL_FAN("minecraft:dead_tube_coral_fan"),
    DEAD_TUBE_CORAL_WALL_FAN("minecraft:dead_tube_coral_wall_fan"),
    DETECTOR_RAIL("minecraft:detector_rail"),
    DIAMOND_BLOCK("minecraft:diamond_block"),
    DIAMOND_ORE("minecraft:diamond_ore"),
    DIORITE("minecraft:diorite"),
    DIORITE_SLAB("minecraft:diorite_slab"),
    DIORITE_STAIRS("minecraft:diorite_stairs"),
    DIORITE_WALL("minecraft:diorite_wall"),
    DIRT("minecraft:dirt"),
    DISPENSER("minecraft:dispenser"),
    DRAGON_EGG("minecraft:dragon_egg"),
    DRAGON_HEAD("minecraft:dragon_head"),
    DRAGON_WALL_HEAD("minecraft:dragon_wall_head"),
    DRIED_KELP_BLOCK("minecraft:dried_kelp_block"),
    DROPPER("minecraft:dropper"),
    EMERALD_BLOCK("minecraft:emerald_block"),
    EMERALD_ORE("minecraft:emerald_ore"),
    ENCHANTING_TABLE("minecraft:enchanting_table"),
    END_GATEWAY("minecraft:end_gateway"),
    END_PORTAL("minecraft:end_portal"),
    END_PORTAL_FRAME("minecraft:end_portal_frame"),
    END_ROD("minecraft:end_rod"),
    END_STONE("minecraft:end_stone"),
    END_STONE_BRICK_SLAB("minecraft:end_stone_brick_slab"),
    END_STONE_BRICK_STAIRS("minecraft:end_stone_brick_stairs"),
    END_STONE_BRICK_WALL("minecraft:end_stone_brick_wall"),
    END_STONE_BRICKS("minecraft:end_stone_bricks"),
    ENDER_CHEST("minecraft:ender_chest"),
    FARMLAND("minecraft:farmland"),
    FERN("minecraft:fern"),
    FIRE("minecraft:fire"),
    FIRE_CORAL("minecraft:fire_coral"),
    FIRE_CORAL_BLOCK("minecraft:fire_coral_block"),
    FIRE_CORAL_FAN("minecraft:fire_coral_fan"),
    FIRE_CORAL_WALL_FAN("minecraft:fire_coral_wall_fan"),
    FLETCHING_TABLE("minecraft:fletching_table"),
    FLOWER_POT("minecraft:flower_pot"),
    FROSTED_ICE("minecraft:frosted_ice"),
    FURNACE("minecraft:furnace"),
    GILDED_BLACKSTONE("minecraft:gilded_blackstone"),
    GLASS("minecraft:glass"),
    GLASS_PANE("minecraft:glass_pane"),
    GLOWSTONE("minecraft:glowstone"),
    GOLD_BLOCK("minecraft:gold_block"),
    GOLD_ORE("minecraft:gold_ore"),
    GRANITE("minecraft:granite"),
    GRANITE_SLAB("minecraft:granite_slab"),
    GRANITE_STAIRS("minecraft:granite_stairs"),
    GRANITE_WALL("minecraft:granite_wall"),
    GRASS("minecraft:grass"),
    GRASS_BLOCK("minecraft:grass_block"),
    GRASS_PATH("minecraft:grass_path"),
    GRAVEL("minecraft:gravel"),
    GRAY_BANNER("minecraft:gray_banner"),
    GRAY_BED("minecraft:gray_bed"),
    GRAY_CARPET("minecraft:gray_carpet"),
    GRAY_CONCRETE("minecraft:gray_concrete"),
    GRAY_CONCRETE_POWDER("minecraft:gray_concrete_powder"),
    GRAY_GLAZED_TERRACOTTA("minecraft:gray_glazed_terracotta"),
    GRAY_SHULKER_BOX("minecraft:gray_shulker_box"),
    GRAY_STAINED_GLASS("minecraft:gray_stained_glass"),
    GRAY_STAINED_GLASS_PANE("minecraft:gray_stained_glass_pane"),
    GRAY_TERRACOTTA("minecraft:gray_terracotta"),
    GRAY_WALL_BANNER("minecraft:gray_wall_banner"),
    GRAY_WOOL("minecraft:gray_wool"),
    GREEN_BANNER("minecraft:green_banner"),
    GREEN_BED("minecraft:green_bed"),
    GREEN_CARPET("minecraft:green_carpet"),
    GREEN_CONCRETE("minecraft:green_concrete"),
    GREEN_CONCRETE_POWDER("minecraft:green_concrete_powder"),
    GREEN_GLAZED_TERRACOTTA("minecraft:green_glazed_terracotta"),
    GREEN_SHULKER_BOX("minecraft:green_shulker_box"),
    GREEN_STAINED_GLASS("minecraft:green_stained_glass"),
    GREEN_STAINED_GLASS_PANE("minecraft:green_stained_glass_pane"),
    GREEN_TERRACOTTA("minecraft:green_terracotta"),
    GREEN_WALL_BANNER("minecraft:green_wall_banner"),
    GREEN_WOOL("minecraft:green_wool"),
    GRINDSTONE("minecraft:grindstone"),
    HAY_BLOCK("minecraft:hay_block"),
    HEAVY_WEIGHTED_PRESSURE_PLATE("minecraft:heavy_weighted_pressure_plate"),
    HONEY_BLOCK("minecraft:honey_block"),
    HONEYCOMB_BLOCK("minecraft:honeycomb_block"),
    HOPPER("minecraft:hopper"),
    HORN_CORAL("minecraft:horn_coral"),
    HORN_CORAL_BLOCK("minecraft:horn_coral_block"),
    HORN_CORAL_FAN("minecraft:horn_coral_fan"),
    HORN_CORAL_WALL_FAN("minecraft:horn_coral_wall_fan"),
    ICE("minecraft:ice"),
    INFESTED_CHISELED_STONE_BRICKS("minecraft:infested_chiseled_stone_bricks"),
    INFESTED_COBBLESTONE("minecraft:infested_cobblestone"),
    INFESTED_CRACKED_STONE_BRICKS("minecraft:infested_cracked_stone_bricks"),
    INFESTED_MOSSY_STONE_BRICKS("minecraft:infested_mossy_stone_bricks"),
    INFESTED_STONE("minecraft:infested_stone"),
    INFESTED_STONE_BRICKS("minecraft:infested_stone_bricks"),
    IRON_BARS("minecraft:iron_bars"),
    IRON_BLOCK("minecraft:iron_block"),
    IRON_DOOR("minecraft:iron_door"),
    IRON_ORE("minecraft:iron_ore"),
    IRON_TRAPDOOR("minecraft:iron_trapdoor"),
    JACK_O_LANTERN("minecraft:jack_o_lantern"),
    JIGSAW("minecraft:jigsaw"),
    JUKEBOX("minecraft:jukebox"),
    JUNGLE_BUTTON("minecraft:jungle_button"),
    JUNGLE_DOOR("minecraft:jungle_door"),
    JUNGLE_FENCE("minecraft:jungle_fence"),
    JUNGLE_FENCE_GATE("minecraft:jungle_fence_gate"),
    JUNGLE_LEAVES("minecraft:jungle_leaves"),
    JUNGLE_LOG("minecraft:jungle_log"),
    JUNGLE_PLANKS("minecraft:jungle_planks"),
    JUNGLE_PRESSURE_PLATE("minecraft:jungle_pressure_plate"),
    JUNGLE_SAPLING("minecraft:jungle_sapling"),
    JUNGLE_SIGN("minecraft:jungle_sign"),
    JUNGLE_SLAB("minecraft:jungle_slab"),
    JUNGLE_STAIRS("minecraft:jungle_stairs"),
    JUNGLE_TRAPDOOR("minecraft:jungle_trapdoor"),
    JUNGLE_WALL_SIGN("minecraft:jungle_wall_sign"),
    JUNGLE_WOOD("minecraft:jungle_wood"),
    KELP("minecraft:kelp"),
    KELP_PLANT("minecraft:kelp_plant"),
    LADDER("minecraft:ladder"),
    LANTERN("minecraft:lantern"),
    LAPIS_BLOCK("minecraft:lapis_block"),
    LAPIS_ORE("minecraft:lapis_ore"),
    LARGE_FERN("minecraft:large_fern"),
    LAVA("minecraft:lava"),
    LECTERN("minecraft:lectern"),
    LEVER("minecraft:lever"),
    LIGHT_BLUE_BANNER("minecraft:light_blue_banner"),
    LIGHT_BLUE_BED("minecraft:light_blue_bed"),
    LIGHT_BLUE_CARPET("minecraft:light_blue_carpet"),
    LIGHT_BLUE_CONCRETE("minecraft:light_blue_concrete"),
    LIGHT_BLUE_CONCRETE_POWDER("minecraft:light_blue_concrete_powder"),
    LIGHT_BLUE_GLAZED_TERRACOTTA("minecraft:light_blue_glazed_terracotta"),
    LIGHT_BLUE_SHULKER_BOX("minecraft:light_blue_shulker_box"),
    LIGHT_BLUE_STAINED_GLASS("minecraft:light_blue_stained_glass"),
    LIGHT_BLUE_STAINED_GLASS_PANE("minecraft:light_blue_stained_glass_pane"),
    LIGHT_BLUE_TERRACOTTA("minecraft:light_blue_terracotta"),
    LIGHT_BLUE_WALL_BANNER("minecraft:light_blue_wall_banner"),
    LIGHT_BLUE_WOOL("minecraft:light_blue_wool"),
    LIGHT_GRAY_BANNER("minecraft:light_gray_banner"),
    LIGHT_GRAY_BED("minecraft:light_gray_bed"),
    LIGHT_GRAY_CARPET("minecraft:light_gray_carpet"),
    LIGHT_GRAY_CONCRETE("minecraft:light_gray_concrete"),
    LIGHT_GRAY_CONCRETE_POWDER("minecraft:light_gray_concrete_powder"),
    LIGHT_GRAY_GLAZED_TERRACOTTA("minecraft:light_gray_glazed_terracotta"),
    LIGHT_GRAY_SHULKER_BOX("minecraft:light_gray_shulker_box"),
    LIGHT_GRAY_STAINED_GLASS("minecraft:light_gray_stained_glass"),
    LIGHT_GRAY_STAINED_GLASS_PANE("minecraft:light_gray_stained_glass_pane"),
    LIGHT_GRAY_TERRACOTTA("minecraft:light_gray_terracotta"),
    LIGHT_GRAY_WALL_BANNER("minecraft:light_gray_wall_banner"),
    LIGHT_GRAY_WOOL("minecraft:light_gray_wool"),
    LIGHT_WEIGHTED_PRESSURE_PLATE("minecraft:light_weighted_pressure_plate"),
    LILAC("minecraft:lilac"),
    LILY_OF_THE_VALLEY("minecraft:lily_of_the_valley"),
    LILY_PAD("minecraft:lily_pad"),
    LIME_BANNER("minecraft:lime_banner"),
    LIME_BED("minecraft:lime_bed"),
    LIME_CARPET("minecraft:lime_carpet"),
    LIME_CONCRETE("minecraft:lime_concrete"),
    LIME_CONCRETE_POWDER("minecraft:lime_concrete_powder"),
    LIME_GLAZED_TERRACOTTA("minecraft:lime_glazed_terracotta"),
    LIME_SHULKER_BOX("minecraft:lime_shulker_box"),
    LIME_STAINED_GLASS("minecraft:lime_stained_glass"),
    LIME_STAINED_GLASS_PANE("minecraft:lime_stained_glass_pane"),
    LIME_TERRACOTTA("minecraft:lime_terracotta"),
    LIME_WALL_BANNER("minecraft:lime_wall_banner"),
    LIME_WOOL("minecraft:lime_wool"),
    LODESTONE("minecraft:lodestone"),
    LOOM("minecraft:loom"),
    MAGENTA_BANNER("minecraft:magenta_banner"),
    MAGENTA_BED("minecraft:magenta_bed"),
    MAGENTA_CARPET("minecraft:magenta_carpet"),
    MAGENTA_CONCRETE("minecraft:magenta_concrete"),
    MAGENTA_CONCRETE_POWDER("minecraft:magenta_concrete_powder"),
    MAGENTA_GLAZED_TERRACOTTA("minecraft:magenta_glazed_terracotta"),
    MAGENTA_SHULKER_BOX("minecraft:magenta_shulker_box"),
    MAGENTA_STAINED_GLASS("minecraft:magenta_stained_glass"),
    MAGENTA_STAINED_GLASS_PANE("minecraft:magenta_stained_glass_pane"),
    MAGENTA_TERRACOTTA("minecraft:magenta_terracotta"),
    MAGENTA_WALL_BANNER("minecraft:magenta_wall_banner"),
    MAGENTA_WOOL("minecraft:magenta_wool"),
    MAGMA_BLOCK("minecraft:magma_block"),
    MELON("minecraft:melon"),
    MELON_STEM("minecraft:melon_stem"),
    MOSSY_COBBLESTONE("minecraft:mossy_cobblestone"),
    MOSSY_COBBLESTONE_SLAB("minecraft:mossy_cobblestone_slab"),
    MOSSY_COBBLESTONE_STAIRS("minecraft:mossy_cobblestone_stairs"),
    MOSSY_COBBLESTONE_WALL("minecraft:mossy_cobblestone_wall"),
    MOSSY_STONE_BRICK_SLAB("minecraft:mossy_stone_brick_slab"),
    MOSSY_STONE_BRICK_STAIRS("minecraft:mossy_stone_brick_stairs"),
    MOSSY_STONE_BRICK_WALL("minecraft:mossy_stone_brick_wall"),
    MOSSY_STONE_BRICKS("minecraft:mossy_stone_bricks"),
    MOVING_PISTON("minecraft:moving_piston"),
    MUSHROOM_STEM("minecraft:mushroom_stem"),
    MYCELIUM("minecraft:mycelium"),
    NETHER_BRICK_FENCE("minecraft:nether_brick_fence"),
    NETHER_BRICK_SLAB("minecraft:nether_brick_slab"),
    NETHER_BRICK_STAIRS("minecraft:nether_brick_stairs"),
    NETHER_BRICK_WALL("minecraft:nether_brick_wall"),
    NETHER_BRICKS("minecraft:nether_bricks"),
    NETHER_GOLD_ORE("minecraft:nether_gold_ore"),
    NETHER_PORTAL("minecraft:nether_portal"),
    NETHER_QUARTZ_ORE("minecraft:nether_quartz_ore"),
    NETHER_SPROUTS("minecraft:nether_sprouts"),
    NETHER_WART("minecraft:nether_wart"),
    NETHER_WART_BLOCK("minecraft:nether_wart_block"),
    NETHERITE_BLOCK("minecraft:netherite_block"),
    NETHERRACK("minecraft:netherrack"),
    NOTE_BLOCK("minecraft:note_block"),
    OAK_BUTTON("minecraft:oak_button"),
    OAK_DOOR("minecraft:oak_door"),
    OAK_FENCE("minecraft:oak_fence"),
    OAK_FENCE_GATE("minecraft:oak_fence_gate"),
    OAK_LEAVES("minecraft:oak_leaves"),
    OAK_LOG("minecraft:oak_log"),
    OAK_PLANKS("minecraft:oak_planks"),
    OAK_PRESSURE_PLATE("minecraft:oak_pressure_plate"),
    OAK_SAPLING("minecraft:oak_sapling"),
    OAK_SIGN("minecraft:oak_sign"),
    OAK_SLAB("minecraft:oak_slab"),
    OAK_STAIRS("minecraft:oak_stairs"),
    OAK_TRAPDOOR("minecraft:oak_trapdoor"),
    OAK_WALL_SIGN("minecraft:oak_wall_sign"),
    OAK_WOOD("minecraft:oak_wood"),
    OBSERVER("minecraft:observer"),
    OBSIDIAN("minecraft:obsidian"),
    ORANGE_BANNER("minecraft:orange_banner"),
    ORANGE_BED("minecraft:orange_bed"),
    ORANGE_CARPET("minecraft:orange_carpet"),
    ORANGE_CONCRETE("minecraft:orange_concrete"),
    ORANGE_CONCRETE_POWDER("minecraft:orange_concrete_powder"),
    ORANGE_GLAZED_TERRACOTTA("minecraft:orange_glazed_terracotta"),
    ORANGE_SHULKER_BOX("minecraft:orange_shulker_box"),
    ORANGE_STAINED_GLASS("minecraft:orange_stained_glass"),
    ORANGE_STAINED_GLASS_PANE("minecraft:orange_stained_glass_pane"),
    ORANGE_TERRACOTTA("minecraft:orange_terracotta"),
    ORANGE_TULIP("minecraft:orange_tulip"),
    ORANGE_WALL_BANNER("minecraft:orange_wall_banner"),
    ORANGE_WOOL("minecraft:orange_wool"),
    OXEYE_DAISY("minecraft:oxeye_daisy"),
    PACKED_ICE("minecraft:packed_ice"),
    PEONY("minecraft:peony"),
    PETRIFIED_OAK_SLAB("minecraft:petrified_oak_slab"),
    PINK_BANNER("minecraft:pink_banner"),
    PINK_BED("minecraft:pink_bed"),
    PINK_CARPET("minecraft:pink_carpet"),
    PINK_CONCRETE("minecraft:pink_concrete"),
    PINK_CONCRETE_POWDER("minecraft:pink_concrete_powder"),
    PINK_GLAZED_TERRACOTTA("minecraft:pink_glazed_terracotta"),
    PINK_SHULKER_BOX("minecraft:pink_shulker_box"),
    PINK_STAINED_GLASS("minecraft:pink_stained_glass"),
    PINK_STAINED_GLASS_PANE("minecraft:pink_stained_glass_pane"),
    PINK_TERRACOTTA("minecraft:pink_terracotta"),
    PINK_TULIP("minecraft:pink_tulip"),
    PINK_WALL_BANNER("minecraft:pink_wall_banner"),
    PINK_WOOL("minecraft:pink_wool"),
    PISTON("minecraft:piston"),
    PISTON_HEAD("minecraft:piston_head"),
    PLAYER_HEAD("minecraft:player_head"),
    PLAYER_WALL_HEAD("minecraft:player_wall_head"),
    PODZOL("minecraft:podzol"),
    POLISHED_ANDESITE("minecraft:polished_andesite"),
    POLISHED_ANDESITE_SLAB("minecraft:polished_andesite_slab"),
    POLISHED_ANDESITE_STAIRS("minecraft:polished_andesite_stairs"),
    POLISHED_BASALT("minecraft:polished_basalt"),
    POLISHED_BLACKSTONE("minecraft:polished_blackstone"),
    POLISHED_BLACKSTONE_BRICK_SLAB("minecraft:polished_blackstone_brick_slab"),
    POLISHED_BLACKSTONE_BRICK_STAIRS("minecraft:polished_blackstone_brick_stairs"),
    POLISHED_BLACKSTONE_BRICK_WALL("minecraft:polished_blackstone_brick_wall"),
    POLISHED_BLACKSTONE_BRICKS("minecraft:polished_blackstone_bricks"),
    POLISHED_BLACKSTONE_BUTTON("minecraft:polished_blackstone_button"),
    POLISHED_BLACKSTONE_PRESSURE_PLATE("minecraft:polished_blackstone_pressure_plate"),
    POLISHED_BLACKSTONE_SLAB("minecraft:polished_blackstone_slab"),
    POLISHED_BLACKSTONE_STAIRS("minecraft:polished_blackstone_stairs"),
    POLISHED_BLACKSTONE_WALL("minecraft:polished_blackstone_wall"),
    POLISHED_DIORITE("minecraft:polished_diorite"),
    POLISHED_DIORITE_SLAB("minecraft:polished_diorite_slab"),
    POLISHED_DIORITE_STAIRS("minecraft:polished_diorite_stairs"),
    POLISHED_GRANITE("minecraft:polished_granite"),
    POLISHED_GRANITE_SLAB("minecraft:polished_granite_slab"),
    POLISHED_GRANITE_STAIRS("minecraft:polished_granite_stairs"),
    POPPY("minecraft:poppy"),
    POTATOES("minecraft:potatoes"),
    POTTED_ACACIA_SAPLING("minecraft:potted_acacia_sapling"),
    POTTED_ALLIUM("minecraft:potted_allium"),
    POTTED_AZURE_BLUET("minecraft:potted_azure_bluet"),
    POTTED_BAMBOO("minecraft:potted_bamboo"),
    POTTED_BIRCH_SAPLING("minecraft:potted_birch_sapling"),
    POTTED_BLUE_ORCHID("minecraft:potted_blue_orchid"),
    POTTED_BROWN_MUSHROOM("minecraft:potted_brown_mushroom"),
    POTTED_CACTUS("minecraft:potted_cactus"),
    POTTED_CORNFLOWER("minecraft:potted_cornflower"),
    POTTED_CRIMSON_FUNGUS("minecraft:potted_crimson_fungus"),
    POTTED_CRIMSON_ROOTS("minecraft:potted_crimson_roots"),
    POTTED_DANDELION("minecraft:potted_dandelion"),
    POTTED_DARK_OAK_SAPLING("minecraft:potted_dark_oak_sapling"),
    POTTED_DEAD_BUSH("minecraft:potted_dead_bush"),
    POTTED_FERN("minecraft:potted_fern"),
    POTTED_JUNGLE_SAPLING("minecraft:potted_jungle_sapling"),
    POTTED_LILY_OF_THE_VALLEY("minecraft:potted_lily_of_the_valley"),
    POTTED_OAK_SAPLING("minecraft:potted_oak_sapling"),
    POTTED_ORANGE_TULIP("minecraft:potted_orange_tulip"),
    POTTED_OXEYE_DAISY("minecraft:potted_oxeye_daisy"),
    POTTED_PINK_TULIP("minecraft:potted_pink_tulip"),
    POTTED_POPPY("minecraft:potted_poppy"),
    POTTED_RED_MUSHROOM("minecraft:potted_red_mushroom"),
    POTTED_RED_TULIP("minecraft:potted_red_tulip"),
    POTTED_SPRUCE_SAPLING("minecraft:potted_spruce_sapling"),
    POTTED_WARPED_FUNGUS("minecraft:potted_warped_fungus"),
    POTTED_WARPED_ROOTS("minecraft:potted_warped_roots"),
    POTTED_WHITE_TULIP("minecraft:potted_white_tulip"),
    POTTED_WITHER_ROSE("minecraft:potted_wither_rose"),
    POWERED_RAIL("minecraft:powered_rail"),
    PRISMARINE("minecraft:prismarine"),
    PRISMARINE_BRICK_SLAB("minecraft:prismarine_brick_slab"),
    PRISMARINE_BRICK_STAIRS("minecraft:prismarine_brick_stairs"),
    PRISMARINE_BRICKS("minecraft:prismarine_bricks"),
    PRISMARINE_SLAB("minecraft:prismarine_slab"),
    PRISMARINE_STAIRS("minecraft:prismarine_stairs"),
    PRISMARINE_WALL("minecraft:prismarine_wall"),
    PUMPKIN("minecraft:pumpkin"),
    PUMPKIN_STEM("minecraft:pumpkin_stem"),
    PURPLE_BANNER("minecraft:purple_banner"),
    PURPLE_BED("minecraft:purple_bed"),
    PURPLE_CARPET("minecraft:purple_carpet"),
    PURPLE_CONCRETE("minecraft:purple_concrete"),
    PURPLE_CONCRETE_POWDER("minecraft:purple_concrete_powder"),
    PURPLE_GLAZED_TERRACOTTA("minecraft:purple_glazed_terracotta"),
    PURPLE_SHULKER_BOX("minecraft:purple_shulker_box"),
    PURPLE_STAINED_GLASS("minecraft:purple_stained_glass"),
    PURPLE_STAINED_GLASS_PANE("minecraft:purple_stained_glass_pane"),
    PURPLE_TERRACOTTA("minecraft:purple_terracotta"),
    PURPLE_WALL_BANNER("minecraft:purple_wall_banner"),
    PURPLE_WOOL("minecraft:purple_wool"),
    PURPUR_BLOCK("minecraft:purpur_block"),
    PURPUR_PILLAR("minecraft:purpur_pillar"),
    PURPUR_SLAB("minecraft:purpur_slab"),
    PURPUR_STAIRS("minecraft:purpur_stairs"),
    QUARTZ_BLOCK("minecraft:quartz_block"),
    QUARTZ_BRICKS("minecraft:quartz_bricks"),
    QUARTZ_PILLAR("minecraft:quartz_pillar"),
    QUARTZ_SLAB("minecraft:quartz_slab"),
    QUARTZ_STAIRS("minecraft:quartz_stairs"),
    RAIL("minecraft:rail"),
    RED_BANNER("minecraft:red_banner"),
    RED_BED("minecraft:red_bed"),
    RED_CARPET("minecraft:red_carpet"),
    RED_CONCRETE("minecraft:red_concrete"),
    RED_CONCRETE_POWDER("minecraft:red_concrete_powder"),
    RED_GLAZED_TERRACOTTA("minecraft:red_glazed_terracotta"),
    RED_MUSHROOM("minecraft:red_mushroom"),
    RED_MUSHROOM_BLOCK("minecraft:red_mushroom_block"),
    RED_NETHER_BRICK_SLAB("minecraft:red_nether_brick_slab"),
    RED_NETHER_BRICK_STAIRS("minecraft:red_nether_brick_stairs"),
    RED_NETHER_BRICK_WALL("minecraft:red_nether_brick_wall"),
    RED_NETHER_BRICKS("minecraft:red_nether_bricks"),
    RED_SAND("minecraft:red_sand"),
    RED_SANDSTONE("minecraft:red_sandstone"),
    RED_SANDSTONE_SLAB("minecraft:red_sandstone_slab"),
    RED_SANDSTONE_STAIRS("minecraft:red_sandstone_stairs"),
    RED_SANDSTONE_WALL("minecraft:red_sandstone_wall"),
    RED_SHULKER_BOX("minecraft:red_shulker_box"),
    RED_STAINED_GLASS("minecraft:red_stained_glass"),
    RED_STAINED_GLASS_PANE("minecraft:red_stained_glass_pane"),
    RED_TERRACOTTA("minecraft:red_terracotta"),
    RED_TULIP("minecraft:red_tulip"),
    RED_WALL_BANNER("minecraft:red_wall_banner"),
    RED_WOOL("minecraft:red_wool"),
    REDSTONE_BLOCK("minecraft:redstone_block"),
    REDSTONE_LAMP("minecraft:redstone_lamp"),
    REDSTONE_ORE("minecraft:redstone_ore"),
    REDSTONE_TORCH("minecraft:redstone_torch"),
    REDSTONE_WALL_TORCH("minecraft:redstone_wall_torch"),
    REDSTONE_WIRE("minecraft:redstone_wire"),
    REPEATER("minecraft:repeater"),
    REPEATING_COMMAND_BLOCK("minecraft:repeating_command_block"),
    RESPAWN_ANCHOR("minecraft:respawn_anchor"),
    ROSE_BUSH("minecraft:rose_bush"),
    SAND("minecraft:sand"),
    SANDSTONE("minecraft:sandstone"),
    SANDSTONE_SLAB("minecraft:sandstone_slab"),
    SANDSTONE_STAIRS("minecraft:sandstone_stairs"),
    SANDSTONE_WALL("minecraft:sandstone_wall"),
    SCAFFOLDING("minecraft:scaffolding"),
    SEA_LANTERN("minecraft:sea_lantern"),
    SEA_PICKLE("minecraft:sea_pickle"),
    SEAGRASS("minecraft:seagrass"),
    SHROOMLIGHT("minecraft:shroomlight"),
    SHULKER_BOX("minecraft:shulker_box"),
    SKELETON_SKULL("minecraft:skeleton_skull"),
    SKELETON_WALL_SKULL("minecraft:skeleton_wall_skull"),
    SLIME_BLOCK("minecraft:slime_block"),
    SMITHING_TABLE("minecraft:smithing_table"),
    SMOKER("minecraft:smoker"),
    SMOOTH_QUARTZ("minecraft:smooth_quartz"),
    SMOOTH_QUARTZ_SLAB("minecraft:smooth_quartz_slab"),
    SMOOTH_QUARTZ_STAIRS("minecraft:smooth_quartz_stairs"),
    SMOOTH_RED_SANDSTONE("minecraft:smooth_red_sandstone"),
    SMOOTH_RED_SANDSTONE_SLAB("minecraft:smooth_red_sandstone_slab"),
    SMOOTH_RED_SANDSTONE_STAIRS("minecraft:smooth_red_sandstone_stairs"),
    SMOOTH_SANDSTONE("minecraft:smooth_sandstone"),
    SMOOTH_SANDSTONE_SLAB("minecraft:smooth_sandstone_slab"),
    SMOOTH_SANDSTONE_STAIRS("minecraft:smooth_sandstone_stairs"),
    SMOOTH_STONE("minecraft:smooth_stone"),
    SMOOTH_STONE_SLAB("minecraft:smooth_stone_slab"),
    SNOW("minecraft:snow"),
    SNOW_BLOCK("minecraft:snow_block"),
    SOUL_CAMPFIRE("minecraft:soul_campfire"),
    SOUL_FIRE("minecraft:soul_fire"),
    SOUL_LANTERN("minecraft:soul_lantern"),
    SOUL_SAND("minecraft:soul_sand"),
    SOUL_SOIL("minecraft:soul_soil"),
    SOUL_TORCH("minecraft:soul_torch"),
    SOUL_WALL_TORCH("minecraft:soul_wall_torch"),
    SPAWNER("minecraft:spawner"),
    SPONGE("minecraft:sponge"),
    SPRUCE_BUTTON("minecraft:spruce_button"),
    SPRUCE_DOOR("minecraft:spruce_door"),
    SPRUCE_FENCE("minecraft:spruce_fence"),
    SPRUCE_FENCE_GATE("minecraft:spruce_fence_gate"),
    SPRUCE_LEAVES("minecraft:spruce_leaves"),
    SPRUCE_LOG("minecraft:spruce_log"),
    SPRUCE_PLANKS("minecraft:spruce_planks"),
    SPRUCE_PRESSURE_PLATE("minecraft:spruce_pressure_plate"),
    SPRUCE_SAPLING("minecraft:spruce_sapling"),
    SPRUCE_SIGN("minecraft:spruce_sign"),
    SPRUCE_SLAB("minecraft:spruce_slab"),
    SPRUCE_STAIRS("minecraft:spruce_stairs"),
    SPRUCE_TRAPDOOR("minecraft:spruce_trapdoor"),
    SPRUCE_WALL_SIGN("minecraft:spruce_wall_sign"),
    SPRUCE_WOOD("minecraft:spruce_wood"),
    STICKY_PISTON("minecraft:sticky_piston"),
    STONE("minecraft:stone"),
    STONE_BRICK_SLAB("minecraft:stone_brick_slab"),
    STONE_BRICK_STAIRS("minecraft:stone_brick_stairs"),
    STONE_BRICK_WALL("minecraft:stone_brick_wall"),
    STONE_BRICKS("minecraft:stone_bricks"),
    STONE_BUTTON("minecraft:stone_button"),
    STONE_PRESSURE_PLATE("minecraft:stone_pressure_plate"),
    STONE_SLAB("minecraft:stone_slab"),
    STONE_STAIRS("minecraft:stone_stairs"),
    STONECUTTER("minecraft:stonecutter"),
    STRIPPED_ACACIA_LOG("minecraft:stripped_acacia_log"),
    STRIPPED_ACACIA_WOOD("minecraft:stripped_acacia_wood"),
    STRIPPED_BIRCH_LOG("minecraft:stripped_birch_log"),
    STRIPPED_BIRCH_WOOD("minecraft:stripped_birch_wood"),
    STRIPPED_CRIMSON_HYPHAE("minecraft:stripped_crimson_hyphae"),
    STRIPPED_CRIMSON_STEM("minecraft:stripped_crimson_stem"),
    STRIPPED_DARK_OAK_LOG("minecraft:stripped_dark_oak_log"),
    STRIPPED_DARK_OAK_WOOD("minecraft:stripped_dark_oak_wood"),
    STRIPPED_JUNGLE_LOG("minecraft:stripped_jungle_log"),
    STRIPPED_JUNGLE_WOOD("minecraft:stripped_jungle_wood"),
    STRIPPED_OAK_LOG("minecraft:stripped_oak_log"),
    STRIPPED_OAK_WOOD("minecraft:stripped_oak_wood"),
    STRIPPED_SPRUCE_LOG("minecraft:stripped_spruce_log"),
    STRIPPED_SPRUCE_WOOD("minecraft:stripped_spruce_wood"),
    STRIPPED_WARPED_HYPHAE("minecraft:stripped_warped_hyphae"),
    STRIPPED_WARPED_STEM("minecraft:stripped_warped_stem"),
    STRUCTURE_BLOCK("minecraft:structure_block"),
    STRUCTURE_VOID("minecraft:structure_void"),
    SUGAR_CANE("minecraft:sugar_cane"),
    SUNFLOWER("minecraft:sunflower"),
    SWEET_BERRY_BUSH("minecraft:sweet_berry_bush"),
    TALL_GRASS("minecraft:tall_grass"),
    TALL_SEAGRASS("minecraft:tall_seagrass"),
    TARGET("minecraft:target"),
    TERRACOTTA("minecraft:terracotta"),
    TNT("minecraft:tnt"),
    TORCH("minecraft:torch"),
    TRAPPED_CHEST("minecraft:trapped_chest"),
    TRIPWIRE("minecraft:tripwire"),
    TRIPWIRE_HOOK("minecraft:tripwire_hook"),
    TUBE_CORAL("minecraft:tube_coral"),
    TUBE_CORAL_BLOCK("minecraft:tube_coral_block"),
    TUBE_CORAL_FAN("minecraft:tube_coral_fan"),
    TUBE_CORAL_WALL_FAN("minecraft:tube_coral_wall_fan"),
    TURTLE_EGG("minecraft:turtle_egg"),
    TWISTING_VINES("minecraft:twisting_vines"),
    TWISTING_VINES_PLANT("minecraft:twisting_vines_plant"),
    VINE("minecraft:vine"),
    VOID_AIR("minecraft:void_air"),
    WALL_TORCH("minecraft:wall_torch"),
    WARPED_BUTTON("minecraft:warped_button"),
    WARPED_DOOR("minecraft:warped_door"),
    WARPED_FENCE("minecraft:warped_fence"),
    WARPED_FENCE_GATE("minecraft:warped_fence_gate"),
    WARPED_FUNGUS("minecraft:warped_fungus"),
    WARPED_HYPHAE("minecraft:warped_hyphae"),
    WARPED_NYLIUM("minecraft:warped_nylium"),
    WARPED_PLANKS("minecraft:warped_planks"),
    WARPED_PRESSURE_PLATE("minecraft:warped_pressure_plate"),
    WARPED_ROOTS("minecraft:warped_roots"),
    WARPED_SIGN("minecraft:warped_sign"),
    WARPED_SLAB("minecraft:warped_slab"),
    WARPED_STAIRS("minecraft:warped_stairs"),
    WARPED_STEM("minecraft:warped_stem"),
    WARPED_TRAPDOOR("minecraft:warped_trapdoor"),
    WARPED_WALL_SIGN("minecraft:warped_wall_sign"),
    WARPED_WART_BLOCK("minecraft:warped_wart_block"),
    WATER("minecraft:water"),
    WEEPING_VINES("minecraft:weeping_vines"),
    WEEPING_VINES_PLANT("minecraft:weeping_vines_plant"),
    WET_SPONGE("minecraft:wet_sponge"),
    WHEAT("minecraft:wheat"),
    WHITE_BANNER("minecraft:white_banner"),
    WHITE_BED("minecraft:white_bed"),
    WHITE_CARPET("minecraft:white_carpet"),
    WHITE_CONCRETE("minecraft:white_concrete"),
    WHITE_CONCRETE_POWDER("minecraft:white_concrete_powder"),
    WHITE_GLAZED_TERRACOTTA("minecraft:white_glazed_terracotta"),
    WHITE_SHULKER_BOX("minecraft:white_shulker_box"),
    WHITE_STAINED_GLASS("minecraft:white_stained_glass"),
    WHITE_STAINED_GLASS_PANE("minecraft:white_stained_glass_pane"),
    WHITE_TERRACOTTA("minecraft:white_terracotta"),
    WHITE_TULIP("minecraft:white_tulip"),
    WHITE_WALL_BANNER("minecraft:white_wall_banner"),
    WHITE_WOOL("minecraft:white_wool"),
    WITHER_ROSE("minecraft:wither_rose"),
    WITHER_SKELETON_SKULL("minecraft:wither_skeleton_skull"),
    WITHER_SKELETON_WALL_SKULL("minecraft:wither_skeleton_wall_skull"),
    YELLOW_BANNER("minecraft:yellow_banner"),
    YELLOW_BED("minecraft:yellow_bed"),
    YELLOW_CARPET("minecraft:yellow_carpet"),
    YELLOW_CONCRETE("minecraft:yellow_concrete"),
    YELLOW_CONCRETE_POWDER("minecraft:yellow_concrete_powder"),
    YELLOW_GLAZED_TERRACOTTA("minecraft:yellow_glazed_terracotta"),
    YELLOW_SHULKER_BOX("minecraft:yellow_shulker_box"),
    YELLOW_STAINED_GLASS("minecraft:yellow_stained_glass"),
    YELLOW_STAINED_GLASS_PANE("minecraft:yellow_stained_glass_pane"),
    YELLOW_TERRACOTTA("minecraft:yellow_terracotta"),
    YELLOW_WALL_BANNER("minecraft:yellow_wall_banner"),
    YELLOW_WOOL("minecraft:yellow_wool"),
    ZOMBIE_HEAD("minecraft:zombie_head"),
    ZOMBIE_WALL_HEAD("minecraft:zombie_wall_head");

    private static Map<String, BlockTypes> mapById = new HashMap<>();
    private final String id;

    BlockTypes(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public static @Nullable BlockTypes getById(String id) {
        return mapById.get(id);
    }

    static {
        for (BlockTypes type : values()) {
            mapById.put(type.id, type);
        }
    }
}
