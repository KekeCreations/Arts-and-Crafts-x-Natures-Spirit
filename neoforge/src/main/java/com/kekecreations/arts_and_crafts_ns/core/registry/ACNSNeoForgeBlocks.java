package com.kekecreations.arts_and_crafts_ns.core.registry;

import com.kekecreations.arts_and_crafts.common.block.ACFlowerPotBlock;
import com.kekecreations.arts_and_crafts_ns.Constants;
import com.kekecreations.jinxedlib.core.util.JinxedRegistryHelper;
import net.hibiscus.naturespirit.registration.NSBlocks;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.HashMap;
import java.util.function.Supplier;

public class ACNSNeoForgeBlocks {


    public static final HashMap<DyeColor, Supplier<Block>> SCORCHED_GRASS_FLOWER_POTS = new HashMap<>();

    static {
        for (DyeColor colour : DyeColor.values()) {
            SCORCHED_GRASS_FLOWER_POTS.put(colour, registerBlock(colour + "_potted_scorched_grass",
                    () -> flowerPot(NSBlocks.SCORCHED_GRASS, colour)));

        }
    }

            private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> blockSupplier) {
        return JinxedRegistryHelper.registerBlock(Constants.MOD_ID, name, false, blockSupplier);
    }

    private static ACFlowerPotBlock flowerPot(Supplier<? extends Block> block, DyeColor dyeColor) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY);
        return new ACFlowerPotBlock(block.get(), dyeColor, properties);
    }

    public static void register() {

    }
}
