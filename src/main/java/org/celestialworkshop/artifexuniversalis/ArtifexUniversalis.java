package org.celestialworkshop.artifexuniversalis;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.celestialworkshop.artifex.api.AFMaterial;
import org.celestialworkshop.artifex.datagen.compat.MaterialBetterCombatPropertiesProvider;
import org.celestialworkshop.artifex.datagen.material.MaterialItemModelProvider;
import org.celestialworkshop.artifex.datagen.material.MaterialRecipeProvider;
import org.celestialworkshop.artifexuniversalis.compat.behemoths.BehemothsItems;
import org.celestialworkshop.artifexuniversalis.compat.behemoths.BehemothsSpecialties;
import org.celestialworkshop.artifexuniversalis.compat.generic.GenericItems;
import org.celestialworkshop.artifexuniversalis.data.AUTagsProvider;
import org.slf4j.Logger;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod(ArtifexUniversalis.MODID)
public class ArtifexUniversalis {

    public static final String MODID = "artifexuniversalis";
    public static final Logger LOGGER = LogUtils.getLogger();

    // Data Generation Purposes.
    public static final List<AFMaterial> ALL_MATERIALS = new ObjectArrayList();

    public ArtifexUniversalis() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        AUCreativeTabs.CREATIVE_TABS.register(modEventBus);

        GenericItems.ITEMS.register(modEventBus);

        if (ModList.get().isLoaded("behemoths")) {
            BehemothsItems.ITEMS.register(modEventBus);
            BehemothsSpecialties.SPECIALTIES.register(modEventBus);
        }

        modEventBus.addListener(this::onGatherData);
    }

    public static ResourceLocation prefix(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    public static AFMaterial registerGeneralMaterial(AFMaterial material) {
        ALL_MATERIALS.add(material);
        return material;
    }

    public void onGatherData(GatherDataEvent event) {
        LOGGER.info("Gathering data for Artifex Universalis");
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper efh = event.getExistingFileHelper();

//        generator.addProvider(event.includeClient(), new AULanguageProvider(packOutput, "en_us"));
        generator.addProvider(event.includeClient(), new MaterialItemModelProvider(packOutput, efh, MODID, ALL_MATERIALS));

        AUTagsProvider.BlocksProvider blockTagsProvider = new AUTagsProvider.BlocksProvider(packOutput, lookupProvider, efh);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new AUTagsProvider.ItemsProvider(packOutput, lookupProvider, blockTagsProvider, efh));
        generator.addProvider(event.includeServer(), new MaterialRecipeProvider(packOutput, MODID, ALL_MATERIALS));
        generator.addProvider(event.includeServer(), new MaterialBetterCombatPropertiesProvider(packOutput, MODID, ALL_MATERIALS));

    }
}
