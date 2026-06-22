package net.stall.simplecarpentry.main.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stall.simplecarpentry.SimpleCarpentry;
import net.stall.simplecarpentry.main.block.SCBlocks;

public class SCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SimpleCarpentry.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    /*public static final DeferredItem<Item> EXAMPLEITEM = ITEMS.register("exampleitem",
            () -> new Item((new Item.Properties())));*/

    public static void setupTabEditors(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.insertAfter(new ItemStack(Items.STONECUTTER), new ItemStack(SCBlocks.SAWMILL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.insertAfter(new ItemStack(Items.OAK_LOG), new ItemStack(SCBlocks.OAK_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.SPRUCE_LOG), new ItemStack(SCBlocks.SPRUCE_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.BIRCH_LOG), new ItemStack(SCBlocks.BIRCH_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.DARK_OAK_LOG), new ItemStack(SCBlocks.DARK_OAK_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.JUNGLE_LOG), new ItemStack(SCBlocks.JUNGLE_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.ACACIA_LOG), new ItemStack(SCBlocks.ACACIA_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.CHERRY_LOG), new ItemStack(SCBlocks.CHERRY_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.MANGROVE_LOG), new ItemStack(SCBlocks.MANGROVE_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(new ItemStack(Items.STRIPPED_OAK_LOG), new ItemStack(SCBlocks.STRIPPED_OAK_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.STRIPPED_SPRUCE_LOG), new ItemStack(SCBlocks.STRIPPED_SPRUCE_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.STRIPPED_BIRCH_LOG), new ItemStack(SCBlocks.STRIPPED_BIRCH_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.STRIPPED_DARK_OAK_LOG), new ItemStack(SCBlocks.STRIPPED_DARK_OAK_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.STRIPPED_JUNGLE_LOG), new ItemStack(SCBlocks.STRIPPED_JUNGLE_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.STRIPPED_ACACIA_LOG), new ItemStack(SCBlocks.STRIPPED_ACACIA_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.STRIPPED_CHERRY_LOG), new ItemStack(SCBlocks.STRIPPED_CHERRY_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(new ItemStack(Items.STRIPPED_MANGROVE_LOG), new ItemStack(SCBlocks.STRIPPED_MANGROVE_CORDWOOD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}