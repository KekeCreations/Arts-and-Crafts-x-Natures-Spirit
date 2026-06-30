package com.kekecreations.arts_and_crafts_ns;


import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSNeoForgeBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoForgeArtsAndCraftsNS {

    public NeoForgeArtsAndCraftsNS(IEventBus eventBus) {


        if (ModList.get().isLoaded("natures_spirit")) {
            ACNSNeoForgeBlocks.register(eventBus);
        }
    }
}