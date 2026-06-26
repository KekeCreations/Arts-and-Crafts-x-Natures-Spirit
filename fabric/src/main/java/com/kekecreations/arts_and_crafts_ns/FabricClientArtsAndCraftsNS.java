package com.kekecreations.arts_and_crafts_ns;

import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSFabricBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.DyeColor;

@Environment(EnvType.CLIENT)
public class FabricClientArtsAndCraftsNS implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        registerBlockLayers();
    }


    public static void registerBlockLayers() {
        for (DyeColor colour : DyeColor.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getScorchedGrassFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getBeachGrassFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getSedgeGrassFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getFlaxenFernFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getOatGrassFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getMelicGrassFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getLushFernFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getFrigidGrassFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getGreenBearberriesFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getRedBearberriesFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getPurpleBearberriesFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getOrnateSucculentFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getDrowsySucculentFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getAureateSucculentFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getSageSucculentFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getFoamySucculentFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getImperialSucculentFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getRegalSucculentFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getShiitakeMushroomFlowerPots(colour), RenderType.cutout());

            //ROUND 2
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getAnemoneFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getAspenSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getBlackIrisFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getBlueIrisFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getBlueWisteriaSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getBluebellFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getCedarSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getCypressSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getDwarfBlossomsFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getFirSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getGhafSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getHibiscusFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getJoshuaSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getLarchSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getMahoganySaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getMarigoldFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getOliveSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getOrangeMapleSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getPaloVerdeSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getPinkWisteriaSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getProteaFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getPurpleHeatherFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getPurpleWildflowerFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getPurpleWisteriaSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getRedHeatherFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getRedMapleSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getRedwoodSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getRubyBlossomsFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getSaxaulSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getSugiSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getTigerLilyFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getWhiteHeatherFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getWhiteWisteriaSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getWillowSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getYellowMapleSaplingFlowerPots(colour), RenderType.cutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ACNSFabricBlocks.getYellowWildflowerFlowerPots(colour), RenderType.cutout());

        }
    }
}