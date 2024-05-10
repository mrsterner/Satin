package ladysnake.satin.forge;

import dev.architectury.platform.forge.EventBuses;
import ladysnake.satin.Satin;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Satin.MOD_ID)
public final class SatinForge {
    public SatinForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(Satin.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            Satin.init();
        });
    }
}
