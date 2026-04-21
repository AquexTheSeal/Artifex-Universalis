package org.celestialworkshop.artifexuniversalis.compat.betterend;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.betterx.betterend.item.material.EndToolMaterial;
import org.betterx.betterend.registry.EndTemplates;
import org.celestialworkshop.artifex.api.AFMaterial;
import org.celestialworkshop.artifex.registry.AFItems;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;

public class BetterEndItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArtifexUniversalis.MODID);

    public static final RegistryObject<Item> TERMINITE_BINDER = ITEMS.register("terminite_binder", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AETERNIUM_BINDER = ITEMS.register("aeternium_binder", () -> new Item(new Item.Properties()));

    public static final AFMaterial TERMINITE_MATERIAL = ArtifexUniversalis.registerGeneralMaterial(
            AFMaterial.builder(ITEMS, "terminite")
                    .tier(EndToolMaterial.TERMINITE)
                    .smithingConfig(
                            () -> EndTemplates.TERMINITE_UPGRADE,
                            () -> Ingredient.of(BetterEndItems.TERMINITE_BINDER.get()),
                            AFItems.IRON_MATERIAL
                    )
                    .build()
    );

    public static final AFMaterial AETERNIUM_MATERIAL = ArtifexUniversalis.registerGeneralMaterial(
            AFMaterial.builder(ITEMS, "aeternium")
                    .tier(EndToolMaterial.AETERNIUM)
                    .smithingConfig(
                            () -> EndTemplates.AETERNIUM_UPGRADE,
                            () -> Ingredient.of(BetterEndItems.AETERNIUM_BINDER.get()),
                            AFItems.DIAMOND_MATERIAL
                    )
                    .build()
    );
}
