package org.celestialworkshop.artifexuniversalis.data;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.celestialworkshop.artifex.datagen.material.MaterialItemModelProvider;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;
import org.celestialworkshop.artifexuniversalis.compat.betterend.BetterEndItems;

public class AUItemModelProvider extends MaterialItemModelProvider {

    public AUItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, existingFileHelper, ArtifexUniversalis.MODID, ArtifexUniversalis.DATA_GENERATION_MATERIALS);
    }

    @Override
    protected void registerModels() {
        super.registerModels();

        this.basicItem(BetterEndItems.TERMINITE_BINDER.get());
        this.basicItem(BetterEndItems.AETERNIUM_BINDER.get());
    }
}
