package net.stall.simplecarpentry;

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
        modEventBus.addListener(this::commonSetup);


    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Simple Carpentry");

    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
