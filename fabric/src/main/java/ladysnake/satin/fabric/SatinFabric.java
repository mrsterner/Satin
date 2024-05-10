package ladysnake.satin.fabric;

import ladysnake.satin.Satin;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

public final class SatinFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Satin.init();
        if (FabricLoader.getInstance().isModLoaded("optifabric")) {
            Satin.LOGGER.warn("[Satin] Optifine present in the instance, custom entity post process shaders will not work");
        }
    }
}
