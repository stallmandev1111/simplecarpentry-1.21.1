package net.stall.simplecarpentry;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.stall.simplecarpentry.main.gui.menu.SCMenuTypes;
import net.stall.simplecarpentry.main.gui.screen.SawmillScreen;

@Mod(value = SimpleCarpentry.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = SimpleCarpentry.MODID, value = Dist.CLIENT)
public class SimpleCarpentryClient {
    public SimpleCarpentryClient(ModContainer container) {

    }
    @SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(SCMenuTypes.SAWMILL_MENU.get(), SawmillScreen::new);
    }
    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
    }
}
