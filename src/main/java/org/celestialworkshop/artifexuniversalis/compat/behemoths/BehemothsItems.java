package org.celestialworkshop.artifexuniversalis.compat.behemoths;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.celestialworkshop.artifex.api.AFMaterial;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;
import org.celestialworkshop.behemoths.registries.BMItemTiers;

public class BehemothsItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArtifexUniversalis.MODID);

    public static final AFMaterial MAGNALYTH_MATERIAL = ArtifexUniversalis.registerGeneralMaterial(
            AFMaterial.builder(ITEMS, "magnalyth")
            .tier(BMItemTiers.MAGNALYTH)
            .specialties(config -> {
                config.add(BehemothsSpecialties.COLOSSUS_SLAYER, 1);
            })
            .build()
    );
}
