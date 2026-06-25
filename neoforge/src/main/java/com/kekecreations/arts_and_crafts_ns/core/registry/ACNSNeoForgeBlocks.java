package com.kekecreations.arts_and_crafts_ns.core.registry;

import com.kekecreations.arts_and_crafts.common.block.ACFlowerPotBlock;
import com.kekecreations.arts_and_crafts_ns.Constants;
import com.kekecreations.jinxedlib.core.util.JinxedRegistryHelper;
import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.HashMap;
import java.util.function.Supplier;

public class ACNSNeoForgeBlocks {


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


    static {
        for (DyeColor colour : DyeColor.values()) {
            SCORCHED_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_scorched_grass",
                    () -> flowerPot(NSBlocks.SCORCHED_GRASS, colour)));

            BEACH_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_beach_grass",
                    () -> flowerPot(NSBlocks.BEACH_GRASS, colour)));

            SEDGE_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_sedge_grass",
                    () -> flowerPot(NSBlocks.SEDGE_GRASS, colour)));

            FLAXEN_FERN_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_flaxen_fern",
                    () -> flowerPot(NSBlocks.FLAXEN_FERN, colour)));

            OAT_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_oat_grass",
                    () -> flowerPot(NSBlocks.OAT_GRASS, colour)));

            MELIC_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_melic_grass",
                    () -> flowerPot(NSBlocks.MELIC_GRASS, colour)));

            LUSH_FERN_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_lush_fern",
                    () -> flowerPot(NSBlocks.LUSH_FERN, colour)));

            FRIGID_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_frigid_grass",
                    () -> flowerPot(NSBlocks.FRIGID_GRASS, colour)));

            GREEN_BEARBERRIES_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_green_bearberries",
                    () -> flowerPot(NSBlocks.GREEN_BEARBERRIES, colour)));

            RED_BEARBERRIES_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_red_bearberries",
                    () -> flowerPot(NSBlocks.RED_BEARBERRIES, colour)));

            PURPLE_BEARBERRIES_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_purple_bearberries",
                    () -> flowerPot(NSBlocks.PURPLE_BEARBERRIES, colour)));

            ORNATE_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_ornate_succulent",
                    () -> flowerPot(NSBlocks.ORNATE_SUCCULENT, colour)));

            DROWSY_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_drowsy_succulent",
                    () -> flowerPot(NSBlocks.DROWSY_SUCCULENT, colour)));

            AUREATE_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_aureate_succulent",
                    () -> flowerPot(NSBlocks.AUREATE_SUCCULENT, colour)));

            SAGE_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_sage_succulent",
                    () -> flowerPot(NSBlocks.SAGE_SUCCULENT, colour)));

            FOAMY_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_foamy_succulent",
                    () -> flowerPot(NSBlocks.FOAMY_SUCCULENT, colour)));

            IMPERIAL_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_imperial_succulent",
                    () -> flowerPot(NSBlocks.IMPERIAL_SUCCULENT, colour)));

            REGAL_SUCCULENT_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_regal_succulent",
                    () -> flowerPot(NSBlocks.REGAL_SUCCULENT, colour)));

            SHIITAKE_MUSHROOM_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_shiitake_mushroom",
                    () -> flowerPot(NSBlocks.SHIITAKE_MUSHROOM, colour)));

        }
    }

            private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> blockSupplier) {
        return JinxedRegistryHelper.registerBlock(Constants.MOD_ID, name, false, blockSupplier);
    }

    private static ACFlowerPotBlock flowerPot(Supplier<? extends Block> block, DyeColor dyeColor) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        return new ACFlowerPotBlock(block.get(), dyeColor, properties);
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
