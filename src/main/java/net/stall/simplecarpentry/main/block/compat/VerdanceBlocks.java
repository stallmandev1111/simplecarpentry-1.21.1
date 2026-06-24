package net.stall.simplecarpentry.main.block.compat;

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

public class VerdanceBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SimpleCarpentry.MODID);

    public static final DeferredBlock<Block> MULBERRY_CORDWOOD = registerBlock("mulberry_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)
            )
    );
    public static final DeferredBlock<Block> STRIPPED_MULBERRY_CORDWOOD = registerBlock("stripped_mulberry_cordwood",
            () -> new RotatedPillarBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)
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