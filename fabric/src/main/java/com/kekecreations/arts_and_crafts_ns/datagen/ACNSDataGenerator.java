package com.kekecreations.arts_and_crafts_ns.datagen;

import com.kekecreations.arts_and_crafts_ns.datagen.client.ACNSModelProvider;
import com.kekecreations.arts_and_crafts_ns.datagen.server.ACNSBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ACNSDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Server Data
        pack.addProvider(ACNSBlockLootTableProvider::new);

        // Client Data
        pack.addProvider(ACNSModelProvider::new);
    }
}
