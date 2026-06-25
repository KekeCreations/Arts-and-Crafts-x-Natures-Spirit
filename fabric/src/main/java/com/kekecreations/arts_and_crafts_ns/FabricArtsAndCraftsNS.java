package com.kekecreations.arts_and_crafts_ns;

import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSFabricBlocks;
import com.kekecreations.arts_and_crafts_ns.platform.Services;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class FabricArtsAndCraftsNS implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ArtsAndCraftsNS.init();
        if (Services.PLATFORM.isModLoaded("natures_spirit")) {
            ACNSFabricBlocks.register();
        }
        Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer(Constants.MOD_ID);
        modContainer.ifPresent(container -> ResourceManagerHelper.registerBuiltinResourcePack(
                ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "rename_chalk_to_calcite"),
                container,
                Component.translatable("pack.naturesspirit.rename"),
                ResourcePackActivationType.ALWAYS_ENABLED
        ));
    }
}
