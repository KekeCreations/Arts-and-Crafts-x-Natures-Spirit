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
        }
    }
}
