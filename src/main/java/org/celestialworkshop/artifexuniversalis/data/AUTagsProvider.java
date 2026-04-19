package org.celestialworkshop.artifexuniversalis.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class AUTagsProvider {

    public static class ItemsProvider extends ItemTagsProvider {
        public ItemsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider blockTags, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, blockTags.contentsGetter(), ArtifexUniversalis.MODID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
        }
    }

    public static class BlocksProvider extends BlockTagsProvider {
        public BlocksProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, ArtifexUniversalis.MODID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
        }
    }
}