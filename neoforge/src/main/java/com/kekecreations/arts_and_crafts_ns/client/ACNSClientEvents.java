package com.kekecreations.arts_and_crafts_ns.client;


import com.kekecreations.arts_and_crafts_ns.Constants;
import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSNeoForgeBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.DyeColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import javax.annotation.ParametersAreNonnullByDefault;

@SuppressWarnings("deprecation")
@ParametersAreNonnullByDefault
@EventBusSubscriber(modid = Constants.MOD_ID, bus= EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ACNSClientEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        for (DyeColor colour : DyeColor.values()) {
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getScorchedGrassFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getBeachGrassFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getSedgeGrassFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getFlaxenFernFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getOatGrassFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getMelicGrassFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getLushFernFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getFrigidGrassFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getGreenBearberriesFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getRedBearberriesFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getPurpleBearberriesFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getOrnateSucculentFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getDrowsySucculentFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getAureateSucculentFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getSageSucculentFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getFoamySucculentFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getImperialSucculentFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getRegalSucculentFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getShiitakeMushroomFlowerPots(colour), RenderType.cutout());

            //ROUND 2
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getAnemoneFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getAspenSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getBlackIrisFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getBlueIrisFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getBlueWisteriaSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getBluebellFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getCedarSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getCypressSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getDwarfBlossomsFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getFirSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getGhafSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getHibiscusFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getJoshuaSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getLarchSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getMahoganySaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getMarigoldFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getOliveSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getOrangeMapleSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getPaloVerdeSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getPinkWisteriaSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getProteaFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getPurpleHeatherFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getPurpleWildflowerFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getPurpleWisteriaSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getRedHeatherFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getRedMapleSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getRedwoodSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getRubyBlossomsFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getSaxaulSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getSugiSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getTigerLilyFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getWhiteHeatherFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getWhiteWisteriaSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getWillowSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getYellowMapleSaplingFlowerPots(colour), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ACNSNeoForgeBlocks.getYellowWildflowerFlowerPots(colour), RenderType.cutout());
        }
    }
}
