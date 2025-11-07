package net.alminoris.aestheticwindows.sound;

import net.alminoris.aestheticwindows.AestheticWindows;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds
{
    public static final SoundEvent OPEN_WINDOW = registerSoundEvent("open_window");
    public static final SoundEvent CLOSE_WINDOW = registerSoundEvent("close_window");

    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = Identifier.of(AestheticWindows.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds()
    {

    }
}