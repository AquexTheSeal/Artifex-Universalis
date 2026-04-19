package org.celestialworkshop.artifexuniversalis.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.celestialworkshop.artifex.api.AFWeaponType;
import org.celestialworkshop.artifex.registry.AFItems;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;

public class AUCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArtifexUniversalis.MODID);

    public static final RegistryObject<CreativeModeTab> ARTIFEX = CREATIVE_TABS.register("artifex_universalis", () -> CreativeModeTab.builder()
            .title(Component.translatable("item_group." + ArtifexUniversalis.MODID + ".artifex_universalis"))
            .icon(() -> new ItemStack(AFItems.GOLD_MATERIAL.getWeapon(AFWeaponType.WAR_DOOR)))
            .displayItems((params, output) -> {
                AUItems.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(output::accept);
            })
            .build()
    );
}
