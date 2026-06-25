package com.kekecreations.arts_and_crafts_ns;

import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSFabricBlocks;
import com.kekecreations.arts_and_crafts_ns.platform.Services;
import net.fabricmc.api.ModInitializer;

public class FabricArtsAndCraftsNS implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ArtsAndCraftsNS.init();
        if (Services.PLATFORM.isModLoaded("natures_spirit")) {
            ACNSFabricBlocks.register();
        }
    }
}
