package net.stall.simplecarpentry.main.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stall.simplecarpentry.SimpleCarpentry;
import net.stall.simplecarpentry.main.block.custom.SawmillBlock;
import net.stall.simplecarpentry.main.item.SCItems;

import java.util.function.Supplier;

public class SCBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SimpleCarpentry.MODID);

    public static final DeferredBlock<Block> SAWMILL = registerBlock("sawmill",
            () -> new SawmillBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONECUTTER)
            )
    );

    public static final DeferredBlock<Block> OAK_CORDWOOD = registerBlock("oak_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_OAK_CORDWOOD = registerBlock("stripped_oak_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)
            )
    );

    public static final DeferredBlock<Block> DARK_OAK_CORDWOOD = registerBlock("dark_oak_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_LOG)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_CORDWOOD = registerBlock("stripped_dark_oak_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_DARK_OAK_LOG)
            )
    );

    public static final DeferredBlock<Block> SPRUCE_CORDWOOD = registerBlock("spruce_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LOG)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_CORDWOOD = registerBlock("stripped_spruce_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_SPRUCE_LOG)
            )
    );

    public static final DeferredBlock<Block> JUNGLE_CORDWOOD = registerBlock("jungle_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_LOG)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_CORDWOOD = registerBlock("stripped_jungle_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_JUNGLE_LOG)
            )
    );

    public static final DeferredBlock<Block> ACACIA_CORDWOOD = registerBlock("acacia_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_ACACIA_CORDWOOD = registerBlock("stripped_acacia_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_LOG)
            )
    );

    public static final DeferredBlock<Block> BIRCH_CORDWOOD = registerBlock("birch_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_LOG)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_BIRCH_CORDWOOD = registerBlock("stripped_birch_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_BIRCH_LOG)
            )
    );

    public static final DeferredBlock<Block> CHERRY_CORDWOOD = registerBlock("cherry_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LOG)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_CHERRY_CORDWOOD = registerBlock("stripped_cherry_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CHERRY_LOG)
            )
    );

    public static final DeferredBlock<Block> MANGROVE_CORDWOOD = registerBlock("mangrove_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_LOG)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_CORDWOOD = registerBlock("stripped_mangrove_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_MANGROVE_LOG)
            )
    );

    public static final DeferredBlock<Block> CRIMSON_CORDWOOD = registerBlock("crimson_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_STEM)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_CORDWOOD = registerBlock("stripped_crimson_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CRIMSON_STEM)
            )
    );

    public static final DeferredBlock<Block> WARPED_CORDWOOD = registerBlock("warped_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_STEM)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_WARPED_CORDWOOD = registerBlock("stripped_warped_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_WARPED_STEM)
            )
    );

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        SCItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static Boolean always(BlockState state, BlockGetter blockGetter, BlockPos pos, EntityType<?> entity) {
        return true;
    }
}