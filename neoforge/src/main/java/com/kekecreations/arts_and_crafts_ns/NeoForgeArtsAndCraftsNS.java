package com.kekecreations.arts_and_crafts_ns;


import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSNeoForgeBlocks;
import com.kekecreations.arts_and_crafts_ns.platform.Services;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;


import java.util.concurrent.CompletableFuture;

@Mod(Constants.MOD_ID)
public class NeoForgeArtsAndCraftsNS {

    public NeoForgeArtsAndCraftsNS(IEventBus eventBus) {


        ArtsAndCraftsNS.init();
        if (Services.PLATFORM.isModLoaded("natures_spirit")) {
            ACNSNeoForgeBlocks.register();
        }
    }
}