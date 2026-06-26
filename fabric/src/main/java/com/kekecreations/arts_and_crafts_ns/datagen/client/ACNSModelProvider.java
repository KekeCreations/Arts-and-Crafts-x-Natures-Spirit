package com.kekecreations.arts_and_crafts_ns.datagen.client;

import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSFabricBlocks;
import com.kekecreations.arts_and_crafts_ns.datagen.client.util.ACNSModelTemplate;
import com.kekecreations.arts_and_crafts_ns.datagen.client.util.ACNSTextureMapping;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;

public class ACNSModelProvider extends FabricModelProvider {


    public ACNSModelProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        for (DyeColor colour : DyeColor.values()) {

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getScorchedGrassFlowerPots(colour), "scorched_grass", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getBeachGrassFlowerPots(colour), "beach_grass", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getSedgeGrassFlowerPots(colour), "sedge_grass", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getFlaxenFernFlowerPots(colour), "flaxen_fern", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getOatGrassFlowerPots(colour), "oat_grass", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getMelicGrassFlowerPots(colour), "melic_grass", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getLushFernFlowerPots(colour), "lush_fern", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getFrigidGrassFlowerPots(colour), "frigid_grass", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getGreenBearberriesFlowerPots(colour), "green_bearberries", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getRedBearberriesFlowerPots(colour), "red_bearberries", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getPurpleBearberriesFlowerPots(colour), "purple_bearberries", colour, generator);

            this.createSucculentFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getOrnateSucculentFlowerPots(colour), "ornate_succulent", colour, generator);

            this.createSucculentFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getDrowsySucculentFlowerPots(colour), "drowsy_succulent", colour, generator);

            this.createSucculentFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getAureateSucculentFlowerPots(colour), "aureate_succulent", colour, generator);

            this.createSucculentFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getSageSucculentFlowerPots(colour), "sage_succulent", colour, generator);

            this.createSucculentFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getFoamySucculentFlowerPots(colour), "foamy_succulent", colour, generator);

            this.createSucculentFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getImperialSucculentFlowerPots(colour), "imperial_succulent", colour, generator);

            this.createSucculentFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getRegalSucculentFlowerPots(colour), "regal_succulent", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getShiitakeMushroomFlowerPots(colour), "shiitake_mushroom", colour, generator);


            //ROUND 2
            this.createTallFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getAnemoneFlowerPots(colour), "anemone", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getAspenSaplingFlowerPots(colour), "aspen_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getBlackIrisFlowerPots(colour), "black_iris", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getBlueIrisFlowerPots(colour), "blue_iris", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getBlueWisteriaSaplingFlowerPots(colour), "blue_wisteria_sapling", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getBluebellFlowerPots(colour), "bluebell", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getCedarSaplingFlowerPots(colour), "cedar_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getCypressSaplingFlowerPots(colour), "cypress_sapling", colour, generator);

            this.createTallFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getDwarfBlossomsFlowerPots(colour), "dwarf_blossoms", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getFirSaplingFlowerPots(colour), "fir_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getGhafSaplingFlowerPots(colour), "ghaf_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getHibiscusFlowerPots(colour), "hibiscus", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getJoshuaSaplingFlowerPots(colour), "joshua_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getLarchSaplingFlowerPots(colour), "larch_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getMahoganySaplingFlowerPots(colour), "mahogany_sapling", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getMarigoldFlowerPots(colour), "marigold", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getOliveSaplingFlowerPots(colour), "olive_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getOrangeMapleSaplingFlowerPots(colour), "orange_maple_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getPaloVerdeSaplingFlowerPots(colour), "palo_verde_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getPinkWisteriaSaplingFlowerPots(colour), "pink_wisteria_sapling", colour, generator);

            this.createProteaFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getProteaFlowerPots(colour), "protea_flower", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getPurpleHeatherFlowerPots(colour), "purple_heather", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getPurpleWildflowerFlowerPots(colour), "purple_wildflower", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getPurpleWisteriaSaplingFlowerPots(colour), "purple_wisteria_sapling", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getRedHeatherFlowerPots(colour), "red_heather", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getRedMapleSaplingFlowerPots(colour), "red_maple_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getRedwoodSaplingFlowerPots(colour), "redwood_sapling", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getRubyBlossomsFlowerPots(colour), "ruby_blossoms", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getSaxaulSaplingFlowerPots(colour), "saxaul_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getSugiSaplingFlowerPots(colour), "sugi_sapling", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getTigerLilyFlowerPots(colour), "tiger_lily", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getWhiteHeatherFlowerPots(colour), "white_heather", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getWhiteWisteriaSaplingFlowerPots(colour), "white_wisteria_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getWillowSaplingFlowerPots(colour), "willow_sapling", colour, generator);

            this.createFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getYellowMapleSaplingFlowerPots(colour), "yellow_maple_sapling", colour, generator);

            this.createLargeFlowerPot("natures_spirit",
                    ACNSFabricBlocks.getYellowWildflowerFlowerPots(colour), "yellow_wildflower", colour, generator);
        }

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }


    public final void createFlowerPot(String modID, Block flowerPot, String plant, DyeColor colour, BlockModelGenerators blockModelGenerators) {
        TextureMapping textureMapping = ACNSTextureMapping.flowerPotTextureMappings(modID, plant, colour);
        ResourceLocation resourceLocation = ACNSModelTemplate.FLOWER_POT.create(flowerPot, textureMapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(flowerPot, resourceLocation));
    }

    public final void createSucculentFlowerPot(String modID, Block flowerPot, String plant, DyeColor colour, BlockModelGenerators blockModelGenerators) {
        TextureMapping textureMapping = ACNSTextureMapping.flowerPotTextureMappings(modID, plant, colour);
        ResourceLocation resourceLocation = ACNSModelTemplate.SUCCULENT_FLOWER_POT.create(flowerPot, textureMapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(flowerPot, resourceLocation));
    }

    public final void createLargeFlowerPot(String modID, Block flowerPot, String plant, DyeColor colour, BlockModelGenerators blockModelGenerators) {
        TextureMapping textureMapping = ACNSTextureMapping.flowerPotTextureMappings(modID, plant, colour);
        ResourceLocation resourceLocation = ACNSModelTemplate.LARGE_FLOWER_POT.create(flowerPot, textureMapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(flowerPot, resourceLocation));
    }

    public final void createTallFlowerPot(String modID, Block flowerPot, String plant, DyeColor colour, BlockModelGenerators blockModelGenerators) {
        TextureMapping textureMapping = ACNSTextureMapping.flowerPotTextureMappings(modID, plant, colour);
        ResourceLocation resourceLocation = ACNSModelTemplate.TALL_FLOWER_POT.create(flowerPot, textureMapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(flowerPot, resourceLocation));
    }

    public final void createProteaFlowerPot(String modID, Block flowerPot, String plant, DyeColor colour, BlockModelGenerators blockModelGenerators) {
        TextureMapping textureMapping = ACNSTextureMapping.flowerPotTextureMappings(modID, plant, colour);
        ResourceLocation resourceLocation = ACNSModelTemplate.PROTEA_FLOWER_POT.create(flowerPot, textureMapping, blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(flowerPot, resourceLocation));
    }
}
