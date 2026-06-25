package com.kekecreations.arts_and_crafts_ns.datagen.server;

import com.kekecreations.arts_and_crafts.core.registry.ACBlocks;
import com.kekecreations.arts_and_crafts_ns.common.block.ACNSFlowerPotBlock;
import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSFabricBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.concurrent.CompletableFuture;

public class ACNSBlockLootTableProvider extends FabricBlockLootTableProvider {

    public ACNSBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (DyeColor colour : DyeColor.values()) {
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getScorchedGrassFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getBeachGrassFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getSedgeGrassFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getFlaxenFernFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getOatGrassFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getMelicGrassFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getLushFernFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getFrigidGrassFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getGreenBearberriesFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getRedBearberriesFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getPurpleBearberriesFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getOrnateSucculentFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getDrowsySucculentFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getAureateSucculentFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getSageSucculentFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getFoamySucculentFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getImperialSucculentFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getRegalSucculentFlowerPots(colour));
            dropDyedPotContents(ACBlocks.getDyedFlowerPot(colour.getId()), ACNSFabricBlocks.getShiitakeMushroomFlowerPots(colour));
        }
    }


    public void dropDyedPotContents(Block flowerPot, Block flowerPotWithPlant) {
        this.add(flowerPotWithPlant, (blockx) -> {
            return this.createDyedPotFlowerItemTable(flowerPot, ((ACNSFlowerPotBlock)blockx).getContent());
        });
    }

    public final LootTable.Builder createDyedPotFlowerItemTable(Block flowerPot, ItemLike itemLike) {
        return LootTable.lootTable().withPool((LootPool.Builder)this.applyExplosionCondition(flowerPot, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(flowerPot)))).withPool((LootPool.Builder)this.applyExplosionCondition(itemLike, LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(itemLike))));
    }
}