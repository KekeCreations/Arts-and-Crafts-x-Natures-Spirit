package com.kekecreations.arts_and_crafts_ns;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoForgeArtsAndCraftsNS {

    public NeoForgeArtsAndCraftsNS(IEventBus eventBus) {
        ArtsAndCraftsNS.init();

    }
}