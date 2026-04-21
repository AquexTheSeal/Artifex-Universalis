package org.celestialworkshop.artifexuniversalis.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.text.WordUtils;
import org.celestialworkshop.artifex.Artifex;
import org.celestialworkshop.artifex.api.AFSpecialty;
import org.celestialworkshop.artifex.registry.AFItems;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;
import org.celestialworkshop.artifexuniversalis.compat.behemoths.BehemothsSpecialties;

public class AULanguageProvider extends LanguageProvider {

    public AULanguageProvider(PackOutput output, String locale) {
        super(output, ArtifexUniversalis.MODID, locale);
    }

    @Override
    protected void addTranslations() {

        // CREATIVE TABS
        this.add("item_group.artifexuniversalis.artifexuniversalis", "Artifex: Universalis");

        this.addSpecialty(BehemothsSpecialties.COLOSSUS_SLAYER.get(), "Colossus Slayer", "Deals %s damage against all behemoth entities.");
        this.addSpecialty(BehemothsSpecialties.BANISHMENT_OF_THE_DEAD.get(), "Banishment of the Dead", "Deals %s damage against all undead entities.");

        // ITEMS
        ForgeRegistries.ITEMS.getEntries().stream().filter(entry -> entry.getKey().location().getNamespace().equals(ArtifexUniversalis.MODID)).forEach(mapValue -> {
            Item item = mapValue.getValue();
            ResourceLocation key = mapValue.getKey().location();
            if (!(item instanceof BlockItem) && !(item instanceof SmithingTemplateItem)) {
                this.add(item, WordUtils.capitalize(key.getPath().replace("_", " ")));
            }
        });
    }

    public void addSpecialty(AFSpecialty specialty, String title, String desc) {
        this.add(specialty.getDisplayNameKey(), title);
        this.add(specialty.getDisplayDescriptionKey(), desc);
    }

}