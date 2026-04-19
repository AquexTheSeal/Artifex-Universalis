package org.celestialworkshop.artifexuniversalis;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.celestialworkshop.artifex.api.AFMaterial;
import org.celestialworkshop.artifexuniversalis.registry.AUCreativeTabs;
import org.celestialworkshop.artifexuniversalis.registry.AUItems;
import org.slf4j.Logger;

import java.util.List;

@Mod(ArtifexUniversalis.MODID)
public class ArtifexUniversalis {

    public static final String MODID = "universalis";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final List<AFMaterial> ALL_MATERIALS = new ObjectArrayList();

    public ArtifexUniversalis() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        AUItems.ITEMS.register(modEventBus);
        AUCreativeTabs.CREATIVE_TABS.register(modEventBus);
    }

    public static ResourceLocation prefix(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
