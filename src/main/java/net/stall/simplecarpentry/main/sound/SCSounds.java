package net.stall.simplecarpentry.main.sound;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.stall.simplecarpentry.SimpleCarpentry;

public class SCSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, SimpleCarpentry.MODID);

    public static final Holder<SoundEvent> UI_SAWMILL_TAKE_RESULT = SOUND_EVENTS.register(
            "ui_sawmill_take_result",
            SoundEvent::createVariableRangeEvent
    );
}
