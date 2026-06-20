package net.stall.simplecarpentry;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = SimpleCarpentry.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = SimpleCarpentry.MODID, value = Dist.CLIENT)
public class SimpleCarpentryClient {
    public SimpleCarpentryClient(ModContainer container) {

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }
}
