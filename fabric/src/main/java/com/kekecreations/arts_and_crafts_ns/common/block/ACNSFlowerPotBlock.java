package com.kekecreations.arts_and_crafts_ns.common.block;

import com.kekecreations.arts_and_crafts.common.block.ACFlowerPotBlock;
import com.kekecreations.arts_and_crafts.core.platform.Services;
import com.kekecreations.arts_and_crafts.core.registry.ACBlocks;
import java.util.HashMap;

import com.kekecreations.arts_and_crafts_ns.core.registry.ACNSFabricBlocks;
import net.hibiscus.naturespirit.registration.NSMiscBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ACNSFlowerPotBlock extends Block {
    public static final HashMap<DyeColor, HashMap<Block, Block>> POTTED_MAPS = new HashMap();
    private Block content;
    private final DyeColor colour;
    public static final float AABB_SIZE = 3.0F;
    protected static final VoxelShape SHAPE;

    public ACNSFlowerPotBlock(Block block, DyeColor dyeColor, BlockBehaviour.Properties properties) {
        super(properties);
        this.content = block;
        this.colour = dyeColor;
        if (block != null) {
            ACFlowerPotBlock.addPotManually(dyeColor, block, this);
        }
    }



    public boolean isEnabled(FeatureFlagSet $$0) {
        return Services.CONFIG.areDyedFlowerPotsEnabled();
    }

    private boolean isEmpty() {
        return this.content == Blocks.AIR;
    }


    protected InteractionResult useWithoutItem(BlockState blockState, Level level, BlockPos blockPos, Player player, BlockHitResult blockHitResult) {
        if (this.content == null) {
            for (DyeColor colour : DyeColor.values()) {
                if (this == ACNSFabricBlocks.getScorchedGrassFlowerPots(colour)) {
                    this.content = NSMiscBlocks.SCORCHED_GRASS;
                    break;
                }
                if (this == ACNSFabricBlocks.getBeachGrassFlowerPots(colour)) {
                    this.content = NSMiscBlocks.BEACH_GRASS;
                    break;
                }
                if (this == ACNSFabricBlocks.getSedgeGrassFlowerPots(colour)) {
                    this.content = NSMiscBlocks.SEDGE_GRASS;
                    break;
                }
                if (this == ACNSFabricBlocks.getFlaxenFernFlowerPots(colour)) {
                    this.content = NSMiscBlocks.FLAXEN_FERN;
                    break;
                }
                if (this == ACNSFabricBlocks.getOatGrassFlowerPots(colour)) {
                    this.content = NSMiscBlocks.OAT_GRASS;
                    break;
                }
                if (this == ACNSFabricBlocks.getMelicGrassFlowerPots(colour)) {
                    this.content = NSMiscBlocks.MELIC_GRASS;
                    break;
                }
                if (this == ACNSFabricBlocks.getLushFernFlowerPots(colour)) {
                    this.content = NSMiscBlocks.LUSH_FERN;
                    break;
                }
                if (this == ACNSFabricBlocks.getFrigidGrassFlowerPots(colour)) {
                    this.content = NSMiscBlocks.FRIGID_GRASS;
                    break;
                }
                if (this == ACNSFabricBlocks.getGreenBearberriesFlowerPots(colour)) {
                    this.content = NSMiscBlocks.GREEN_BEARBERRIES;
                    break;
                }
                if (this == ACNSFabricBlocks.getRedBearberriesFlowerPots(colour)) {
                    this.content = NSMiscBlocks.RED_BEARBERRIES;
                    break;
                }
                if (this == ACNSFabricBlocks.getPurpleBearberriesFlowerPots(colour)) {
                    this.content = NSMiscBlocks.PURPLE_BEARBERRIES;
                    break;
                }
                if (this == ACNSFabricBlocks.getOrnateSucculentFlowerPots(colour)) {
                    this.content = NSMiscBlocks.ORNATE_SUCCULENT;
                    break;
                }
                if (this == ACNSFabricBlocks.getDrowsySucculentFlowerPots(colour)) {
                    this.content = NSMiscBlocks.DROWSY_SUCCULENT;
                    break;
                }
                if (this == ACNSFabricBlocks.getAureateSucculentFlowerPots(colour)) {
                    this.content = NSMiscBlocks.AUREATE_SUCCULENT;
                    break;
                }
                if (this == ACNSFabricBlocks.getSageSucculentFlowerPots(colour)) {
                    this.content = NSMiscBlocks.SAGE_SUCCULENT;
                    break;
                }
                if (this == ACNSFabricBlocks.getFoamySucculentFlowerPots(colour)) {
                    this.content = NSMiscBlocks.FOAMY_SUCCULENT;
                    break;
                }
                if (this == ACNSFabricBlocks.getImperialSucculentFlowerPots(colour)) {
                    this.content = NSMiscBlocks.IMPERIAL_SUCCULENT;
                    break;
                }
                if (this == ACNSFabricBlocks.getRegalSucculentFlowerPots(colour)) {
                    this.content = NSMiscBlocks.REGAL_SUCCULENT;
                    break;
                }
                if (this == ACNSFabricBlocks.getShiitakeMushroomFlowerPots(colour)) {
                    this.content = NSMiscBlocks.SHIITAKE_MUSHROOM;
                    break;
                }
            }
        }
        if (this.isEmpty()) {
            return InteractionResult.CONSUME;
        } else {
            ItemStack itemStack = new ItemStack(this.content);
            if (!player.addItem(itemStack)) {
                player.drop(itemStack, false);
            }

            level.setBlock(blockPos, ACBlocks.getDyedFlowerPot(this.colour.getId()).defaultBlockState(), 3);
            level.gameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return SHAPE;
    }

    public RenderShape getRenderShape(BlockState blockState) {
        return RenderShape.MODEL;
    }

    public ItemStack getCloneItemStack(LevelReader levelReader, BlockPos blockPos, BlockState blockState) {
        return ACBlocks.getDyedFlowerPot(colour.getId()).asItem().getDefaultInstance();
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        return direction == Direction.DOWN && !blockState.canSurvive(levelAccessor, blockPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(blockState, direction, blockState2, levelAccessor, blockPos, blockPos2);
    }

    public Block getContent() {
        return this.content;
    }

    public boolean isPathfindable(BlockState blockState, PathComputationType pathComputationType) {
        return false;
    }

    static {
        for(DyeColor colour : DyeColor.values()) {
            POTTED_MAPS.put(colour, new HashMap());
        }

        SHAPE = Block.box((double)5.0F, (double)0.0F, (double)5.0F, (double)11.0F, (double)6.0F, (double)11.0F);
    }
}
