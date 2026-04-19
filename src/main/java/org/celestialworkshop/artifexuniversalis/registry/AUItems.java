package org.celestialworkshop.artifexuniversalis.registry;

import com.teamabnormals.caverns_and_chasms.core.other.CCTiers;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.celestialworkshop.artifex.api.AFMaterial;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;

public class AUCommonMetalsItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArtifexUniversalis.MODID);

    public static final AFMaterial COPPER_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "copper")
            .tier(CCTiers.CCItemTiers.COPPER).build()
    );

    public static final AFMaterial SILVER_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "silver")
            .tier(CCTiers.CCItemTiers.SILVER).build()
    );

    public static final AFMaterial NECRONIUM_MATERIAL = registerGeneralMaterial(AFMaterial.builder(ITEMS, "necronium")
            .tier(CCTiers.CCItemTiers.NECROMIUM).build()
    );

    public static AFMaterial registerGeneralMaterial(AFMaterial material) {
        ArtifexUniversalis.ALL_MATERIALS.add(material);
        return material;
    }
}
