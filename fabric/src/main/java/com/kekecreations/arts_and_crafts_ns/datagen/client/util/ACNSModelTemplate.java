package com.kekecreations.arts_and_crafts_ns.datagen.client.util;

import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class ACNSModelTemplate {

    public static final ModelTemplate FLOWER_POT = createFlowerPot(TextureSlot.PARTICLE, ACNSTextureMapping.FLOWER_POT, TextureSlot.PLANT);
    public static final ModelTemplate TINTED_FLOWER_POT = createTintedFlowerPot(TextureSlot.PARTICLE, ACNSTextureMapping.FLOWER_POT, TextureSlot.PLANT);

    public static final ModelTemplate SUCCULENT_FLOWER_POT = createSucculentFlowerPot(TextureSlot.PARTICLE, ACNSTextureMapping.FLOWER_POT, TextureSlot.PLANT);
    public static final ModelTemplate LARGE_FLOWER_POT = createLargeFlowerPot(TextureSlot.PARTICLE, ACNSTextureMapping.FLOWER_POT, TextureSlot.PLANT);


    public static ModelTemplate createFlowerPot(TextureSlot... textureSlots) {
        return new ModelTemplate((Optional.of(ResourceLocation.withDefaultNamespace("block/flower_pot_cross"))), Optional.empty(), textureSlots);
    }

    public static ModelTemplate createSucculentFlowerPot(TextureSlot... textureSlots) {
        return new ModelTemplate((Optional.of(ResourceLocation.fromNamespaceAndPath("arts_and_crafts_ns", "block/succulent_pot"))), Optional.empty(), textureSlots);
    }

    public static ModelTemplate createLargeFlowerPot(TextureSlot... textureSlots) {
        return new ModelTemplate((Optional.of(ResourceLocation.fromNamespaceAndPath("arts_and_crafts_ns", "block/large_cross_pot"))), Optional.empty(), textureSlots);
    }

    public static ModelTemplate createTintedFlowerPot(TextureSlot... textureSlots) {
        return new ModelTemplate((Optional.of(ResourceLocation.withDefaultNamespace("block/tinted_flower_pot_cross"))), Optional.empty(), textureSlots);
    }
}
