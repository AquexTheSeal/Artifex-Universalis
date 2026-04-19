package org.celestialworkshop.artifexuniversalis.registry;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.celestialworkshop.artifex.api.AFMaterial;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;
import org.celestialworkshop.behemoths.registries.BMItemTiers;

public class AUItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArtifexUniversalis.MODID);

    // GENERIC
    public static final AFMaterial COPPER_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "copper").tier(AUItemTiers.COPPER_FALLBACK).build());
    public static final AFMaterial SILVER_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "silver").tier(AUItemTiers.SILVER_FALLBACK).build());
    public static final AFMaterial TIN_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "tin").tier(AUItemTiers.TIN_FALLBACK).build());
    public static final AFMaterial BRONZE_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "bronze").tier(AUItemTiers.BRONZE_FALLBACK).build());
    public static final AFMaterial STEEL_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "steel").tier(AUItemTiers.STEEL_FALLBACK).build());
    public static final AFMaterial LEAD_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "lead").tier(AUItemTiers.LEAD_FALLBACK).build());
    public static final AFMaterial NICKEL_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "nickel").tier(AUItemTiers.NICKEL_FALLBACK).build());
    public static final AFMaterial PLATINUM_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "platinum").tier(AUItemTiers.PLATINUM_FALLBACK).build());

    // BEHEMOTHS
    public static final AFMaterial MAGNALYTH_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "magnalyth").tier(BMItemTiers.MAGNALYTH).build());
    public static final AFMaterial MORTYX_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "mortyx").tier(BMItemTiers.MORTYX).build());

    public static AFMaterial registerGeneralMaterial(AFMaterial material) {
        ArtifexUniversalis.ALL_MATERIALS.add(material);
        return material;
    }
}
