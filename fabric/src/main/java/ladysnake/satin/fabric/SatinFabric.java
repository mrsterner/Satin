package ladysnake.satin.fabric;

import ladysnake.satin.Satin;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public final class SatinFabric implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        Satin.init();
    }
}
