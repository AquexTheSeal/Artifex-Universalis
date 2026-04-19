package org.celestialworkshop.artifexuniversalis.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.celestialworkshop.artifex.datagen.compat.MaterialBetterCombatPropertiesProvider;
import org.celestialworkshop.artifex.datagen.material.MaterialItemModelProvider;
import org.celestialworkshop.artifex.datagen.material.MaterialRecipeProvider;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ArtifexUniversalis.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AUDataGenerators {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper efh = event.getExistingFileHelper();

//        generator.addProvider(event.includeClient(), new AULanguageProvider(packOutput, "en_us"));
        generator.addProvider(event.includeClient(), new MaterialItemModelProvider(packOutput, efh, ArtifexUniversalis.MODID, ArtifexUniversalis.ALL_MATERIALS));

//        AFTagsProvider.BlocksProvider blockTagsProvider = new AUTagsProvider.BlocksProvider(packOutput, lookupProvider, efh);
//        generator.addProvider(event.includeServer(), blockTagsProvider);
//        generator.addProvider(event.includeServer(), new AUTagsProvider.ItemsProvider(packOutput, lookupProvider, blockTagsProvider, efh));
        generator.addProvider(event.includeServer(), new MaterialRecipeProvider(packOutput, ArtifexUniversalis.MODID, ArtifexUniversalis.ALL_MATERIALS));
        generator.addProvider(event.includeServer(), new MaterialBetterCombatPropertiesProvider(packOutput, ArtifexUniversalis.MODID, ArtifexUniversalis.ALL_MATERIALS));

    }
}
