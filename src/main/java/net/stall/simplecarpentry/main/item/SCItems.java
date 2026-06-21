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
    }
}