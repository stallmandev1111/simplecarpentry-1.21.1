package net.stall.simplecarpentry;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.stall.simplecarpentry.main.block.SCBlocks;
import net.stall.simplecarpentry.main.block.compat.FlavoredBlocks;
import net.stall.simplecarpentry.main.block.compat.VerdanceBlocks;
import net.stall.simplecarpentry.main.gui.menu.SCMenuTypes;
import net.stall.simplecarpentry.main.item.SCItems;
import net.stall.simplecarpentry.main.recipes.SCRecipeSerializers;
import net.stall.simplecarpentry.main.recipes.SCRecipes;
import net.stall.simplecarpentry.main.sound.SCSounds;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


@Mod(SimpleCarpentry.MODID)
public class SimpleCarpentry {
    public static final String MODID = "simplecarpentry";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SimpleCarpentry(IEventBus modEventBus, ModContainer modContainer) {
        boolean isVerdanceLoaded = ModList.get().isLoaded("verdance");
        boolean isFlavoredLoaded = ModList.get().isLoaded("flavored");

        modEventBus.addListener(this::commonSetup);

        SCRecipes.RECIPE_TYPES.register(modEventBus);
        SCRecipeSerializers.RECIPE_SERIALIZERS.register(modEventBus);

        SCSounds.SOUND_EVENTS.register(modEventBus);
        SCMenuTypes.register(modEventBus);
        SCBlocks.register(modEventBus);

        if (isVerdanceLoaded) {
            VerdanceBlocks.register(modEventBus);
        };
        if (isFlavoredLoaded) {
            FlavoredBlocks.register(modEventBus);
        };

        SCItems.register(modEventBus);


        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Simple Carpentry");

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        SCItems.setupTabEditors(event);
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
