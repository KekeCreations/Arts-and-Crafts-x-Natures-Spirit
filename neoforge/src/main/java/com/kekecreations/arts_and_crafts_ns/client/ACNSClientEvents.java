package com.kekecreations.arts_and_crafts_ns.client;


import com.kekecreations.arts_and_crafts_ns.Constants;
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
    }
}
