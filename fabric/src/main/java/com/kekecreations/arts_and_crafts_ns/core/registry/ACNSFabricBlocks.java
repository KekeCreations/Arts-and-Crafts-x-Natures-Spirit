package com.kekecreations.arts_and_crafts_ns.core.registry;

import com.kekecreations.arts_and_crafts_ns.Constants;
import com.kekecreations.arts_and_crafts_ns.common.block.ACNSFlowerPotBlock;
import com.kekecreations.jinxedlib.core.util.JinxedRegistryHelper;
import net.hibiscus.naturespirit.registration.NSMiscBlocks;
import net.hibiscus.naturespirit.registration.NSWoods;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.HashMap;
import java.util.function.Supplier;

public class ACNSFabricBlocks {


    public static final HashMap<DyeColor, Supplier<Block>> SCORCHED_GRASS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> BEACH_GRASS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> SEDGE_GRASS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> FLAXEN_FERN_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> OAT_GRASS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> MELIC_GRASS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> LUSH_FERN_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> FRIGID_GRASS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> GREEN_BEARBERRIES_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> RED_BEARBERRIES_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PURPLE_BEARBERRIES_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> ORNATE_SUCCULENT_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DROWSY_SUCCULENT_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> AUREATE_SUCCULENT_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> SAGE_SUCCULENT_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> FOAMY_SUCCULENT_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> IMPERIAL_SUCCULENT_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> REGAL_SUCCULENT_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> SHIITAKE_MUSHROOM_FLOWER_POTS = new HashMap<>();

    //Round 2
    public static final HashMap<DyeColor, Supplier<Block>> ANEMONE_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> ASPEN_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> BLACK_IRIS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> BLUE_IRIS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> BLUE_WISTERIA_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> BLUEBELL_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> CEDAR_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> CYPRESS_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> DWARF_BLOSSOMS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> FIR_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> GHAF_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> HIBISCUS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> JOSHUA_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> LARCH_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> MAHOGANY_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> MARIGOLD_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> OLIVE_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> ORANGE_MAPLE_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PALO_VERDE_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PINK_WISTERIA_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PROTEA_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PURPLE_HEATHER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PURPLE_WILDFLOWER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> PURPLE_WISTERIA_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> RED_HEATHER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> RED_MAPLE_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> REDWOOD_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> RUBY_BLOSSOMS_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> SAXAUL_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> SUGI_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> TIGER_LILY_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> WHITE_HEATHER_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> WHITE_WISTERIA_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> WILLOW_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> YELLOW_MAPLE_SAPLING_FLOWER_POTS = new HashMap<>();
    public static final HashMap<DyeColor, Supplier<Block>> YELLOW_WILDFLOWER_FLOWER_POTS = new HashMap<>();


    static {
        for (DyeColor colour : DyeColor.values()) {
            SCORCHED_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_scorched_grass",
                    () -> flowerPot(NSMiscBlocks.SCORCHED_GRASS, colour)));

            BEACH_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_beach_grass",
                    () -> flowerPot(NSMiscBlocks.BEACH_GRASS, colour)));

            SEDGE_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_sedge_grass",
                    () -> flowerPot(NSMiscBlocks.SEDGE_GRASS, colour)));

            FLAXEN_FERN_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_flaxen_fern",
                    () -> flowerPot(NSMiscBlocks.FLAXEN_FERN, colour)));

            OAT_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_oat_grass",
                    () -> flowerPot(NSMiscBlocks.OAT_GRASS, colour)));

            MELIC_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_melic_grass",
                    () -> flowerPot(NSMiscBlocks.MELIC_GRASS, colour)));

            LUSH_FERN_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_lush_fern",
                    () -> flowerPot(NSMiscBlocks.LUSH_FERN, colour)));

            FRIGID_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_frigid_grass",
                    () -> flowerPot(NSMiscBlocks.FRIGID_GRASS, colour)));

            GREEN_BEARBERRIES_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_green_bearberries",
                    () -> flowerPot(NSMiscBlocks.GREEN_BEARBERRIES, colour)));

            RED_BEARBERRIES_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_red_bearberries",
                    () -> flowerPot(NSMiscBlocks.RED_BEARBERRIES, colour)));

            PURPLE_BEARBERRIES_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_purple_bearberries",
                    () -> flowerPot(NSMiscBlocks.PURPLE_BEARBERRIES, colour)));

            ORNATE_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_ornate_succulent",
                    () -> flowerPot(NSMiscBlocks.ORNATE_SUCCULENT, colour)));

            DROWSY_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_drowsy_succulent",
                    () -> flowerPot(NSMiscBlocks.DROWSY_SUCCULENT, colour)));

            AUREATE_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_aureate_succulent",
                    () -> flowerPot(NSMiscBlocks.AUREATE_SUCCULENT, colour)));

            SAGE_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_sage_succulent",
                    () -> flowerPot(NSMiscBlocks.SAGE_SUCCULENT, colour)));

            FOAMY_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_foamy_succulent",
                    () -> flowerPot(NSMiscBlocks.FOAMY_SUCCULENT, colour)));

            IMPERIAL_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_imperial_succulent",
                    () -> flowerPot(NSMiscBlocks.IMPERIAL_SUCCULENT, colour)));

            REGAL_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_regal_succulent",
                    () -> flowerPot(NSMiscBlocks.REGAL_SUCCULENT, colour)));

            SHIITAKE_MUSHROOM_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_shiitake_mushroom",
                    () -> flowerPot(NSMiscBlocks.SHIITAKE_MUSHROOM, colour)));


            //ROUND 2
            ANEMONE_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_anemone",
                    () -> flowerPot(NSMiscBlocks.ANEMONE.getFlowerBlock(), colour)));

            ASPEN_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_aspen_sapling",
                    () -> flowerPot(NSWoods.ASPEN.getSapling(), colour)));

            BLACK_IRIS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_black_iris",
                    () -> flowerPot(NSMiscBlocks.BLACK_IRIS.getFlowerBlock(), colour)));

            BLUE_IRIS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_blue_iris",
                    () -> flowerPot(NSMiscBlocks.BLUE_IRIS.getFlowerBlock(), colour)));

            BLUE_WISTERIA_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_blue_wisteria_sapling",
                    () -> flowerPot(NSWoods.WISTERIA.getBlueSapling(), colour)));

            BLUEBELL_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_bluebell",
                    () -> flowerPot(NSMiscBlocks.BLUEBELL.getFlowerBlock(), colour)));

            CEDAR_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_cedar_sapling",
                    () -> flowerPot(NSWoods.CEDAR.getSapling(), colour)));

            CYPRESS_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_cypress_sapling",
                    () -> flowerPot(NSWoods.CYPRESS.getSapling(), colour)));

            DWARF_BLOSSOMS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_dwarf_blossoms",
                    () -> flowerPot(NSMiscBlocks.DWARF_BLOSSOMS.getFlowerBlock(), colour)));

            FIR_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_fir_sapling",
                    () -> flowerPot(NSWoods.FIR.getSapling(), colour)));

            GHAF_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_ghaf_sapling",
                    () -> flowerPot(NSWoods.GHAF.getSapling(), colour)));

            HIBISCUS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_hibiscus",
                    () -> flowerPot(NSMiscBlocks.HIBISCUS.getFlowerBlock(), colour)));

            JOSHUA_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_joshua_sapling",
                    () -> flowerPot(NSWoods.JOSHUA.getSapling(), colour)));

            LARCH_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_larch_sapling",
                    () -> flowerPot(NSWoods.LARCH.getSapling(), colour)));

            MAHOGANY_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_mahogany_sapling",
                    () -> flowerPot(NSWoods.MAHOGANY.getSapling(), colour)));

            MARIGOLD_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_marigold",
                    () -> flowerPot(NSMiscBlocks.MARIGOLD.getFlowerBlock(), colour)));

            OLIVE_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_olive_sapling",
                    () -> flowerPot(NSWoods.OLIVE.getSapling(), colour)));

            ORANGE_MAPLE_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_orange_maple_sapling",
                    () -> flowerPot(NSWoods.MAPLE.getOrangeSapling(), colour)));

            PALO_VERDE_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_palo_verde_sapling",
                    () -> flowerPot(NSWoods.PALO_VERDE.getSapling(), colour)));

            PINK_WISTERIA_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_pink_wisteria_sapling",
                    () -> flowerPot(NSWoods.WISTERIA.getPinkSapling(), colour)));

            PROTEA_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_protea",
                    () -> flowerPot(NSMiscBlocks.PROTEA.getFlowerBlock(), colour)));

            PURPLE_HEATHER_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_purple_heather",
                    () -> flowerPot(NSMiscBlocks.PURPLE_HEATHER.getFlowerBlock(), colour)));

            PURPLE_WILDFLOWER_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_purple_wildflower",
                    () -> flowerPot(NSMiscBlocks.PURPLE_WILDFLOWER.getFlowerBlock(), colour)));

            PURPLE_WISTERIA_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_purple_wisteria_sapling",
                    () -> flowerPot(NSWoods.WISTERIA.getPurpleSapling(), colour)));

            RED_HEATHER_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_red_heather",
                    () -> flowerPot(NSMiscBlocks.RED_HEATHER.getFlowerBlock(), colour)));

            RED_MAPLE_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_red_maple_sapling",
                    () -> flowerPot(NSWoods.MAPLE.getRedSapling(), colour)));

            REDWOOD_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_redwood_sapling",
                    () -> flowerPot(NSWoods.REDWOOD.getSapling(), colour)));

            RUBY_BLOSSOMS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_ruby_blossoms",
                    () -> flowerPot(NSMiscBlocks.RUBY_BLOSSOMS.getFlowerBlock(), colour)));

            SAXAUL_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_saxaul_sapling",
                    () -> flowerPot(NSWoods.SAXAUL.getSapling(), colour)));

            SUGI_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_sugi_sapling",
                    () -> flowerPot(NSWoods.SUGI.getSapling(), colour)));

            TIGER_LILY_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_tiger_lily",
                    () -> flowerPot(NSMiscBlocks.TIGER_LILY.getFlowerBlock(), colour)));

            WHITE_HEATHER_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_white_heather",
                    () -> flowerPot(NSMiscBlocks.WHITE_HEATHER.getFlowerBlock(), colour)));

            WHITE_WISTERIA_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_white_wisteria_sapling",
                    () -> flowerPot(NSWoods.WISTERIA.getWhiteSapling(), colour)));

            WILLOW_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_willow_sapling",
                    () -> flowerPot(NSWoods.WILLOW.getSapling(), colour)));

            YELLOW_MAPLE_SAPLING_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_yellow_maple_sapling",
                    () -> flowerPot(NSWoods.MAPLE.getYellowSapling(), colour)));

            YELLOW_WILDFLOWER_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_yellow_wildflower",
                    () -> flowerPot(NSMiscBlocks.YELLOW_WILDFLOWER.getFlowerBlock(), colour)));

        }
    }

            private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> blockSupplier) {
        return JinxedRegistryHelper.registerBlock(Constants.MOD_ID, name, false, blockSupplier);
    }

    private static ACNSFlowerPotBlock flowerPot(Block block, DyeColor dyeColor) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        return new ACNSFlowerPotBlock(block, dyeColor, properties);
    }

    public static Block getScorchedGrassFlowerPots(DyeColor color) {
        return SCORCHED_GRASS_FLOWER_POTS.get(color).get();
    }

    public static Block getBeachGrassFlowerPots(DyeColor color) {
        return BEACH_GRASS_FLOWER_POTS.get(color).get();
    }

    public static Block getSedgeGrassFlowerPots(DyeColor color) {
        return SEDGE_GRASS_FLOWER_POTS.get(color).get();
    }

    public static Block getFlaxenFernFlowerPots(DyeColor color) {
        return FLAXEN_FERN_FLOWER_POTS.get(color).get();
    }

    public static Block getOatGrassFlowerPots(DyeColor color) {
        return OAT_GRASS_FLOWER_POTS.get(color).get();
    }

    public static Block getMelicGrassFlowerPots(DyeColor color) {
        return MELIC_GRASS_FLOWER_POTS.get(color).get();
    }

    public static Block getLushFernFlowerPots(DyeColor color) {
        return LUSH_FERN_FLOWER_POTS.get(color).get();
    }

    public static Block getFrigidGrassFlowerPots(DyeColor color) {
        return FRIGID_GRASS_FLOWER_POTS.get(color).get();
    }

    public static Block getGreenBearberriesFlowerPots(DyeColor color) {
        return GREEN_BEARBERRIES_FLOWER_POTS.get(color).get();
    }

    public static Block getRedBearberriesFlowerPots(DyeColor color) {
        return RED_BEARBERRIES_FLOWER_POTS.get(color).get();
    }

    public static Block getPurpleBearberriesFlowerPots(DyeColor color) {
        return PURPLE_BEARBERRIES_FLOWER_POTS.get(color).get();
    }

    public static Block getOrnateSucculentFlowerPots(DyeColor color) {
        return ORNATE_SUCCULENT_FLOWER_POTS.get(color).get();
    }

    public static Block getDrowsySucculentFlowerPots(DyeColor color) {
        return DROWSY_SUCCULENT_FLOWER_POTS.get(color).get();
    }

    public static Block getAureateSucculentFlowerPots(DyeColor color) {
        return AUREATE_SUCCULENT_FLOWER_POTS.get(color).get();
    }

    public static Block getSageSucculentFlowerPots(DyeColor color) {
        return SAGE_SUCCULENT_FLOWER_POTS.get(color).get();
    }

    public static Block getFoamySucculentFlowerPots(DyeColor color) {
        return FOAMY_SUCCULENT_FLOWER_POTS.get(color).get();
    }

    public static Block getImperialSucculentFlowerPots(DyeColor color) {
        return IMPERIAL_SUCCULENT_FLOWER_POTS.get(color).get();
    }

    public static Block getRegalSucculentFlowerPots(DyeColor color) {
        return REGAL_SUCCULENT_FLOWER_POTS.get(color).get();
    }

    public static Block getShiitakeMushroomFlowerPots(DyeColor color) {
        return SHIITAKE_MUSHROOM_FLOWER_POTS.get(color).get();
    }


    public static void register() {

    }
}
