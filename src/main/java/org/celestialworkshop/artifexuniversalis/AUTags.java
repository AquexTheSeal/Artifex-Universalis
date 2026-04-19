package org.celestialworkshop.artifexuniversalis;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class AUTags {
    public static final TagKey<Item> INGOTS_TIN = ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/tin"));
    public static final TagKey<Item> INGOTS_BRONZE = ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/bronze"));
    public static final TagKey<Item> INGOTS_STEEL = ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/steel"));
    public static final TagKey<Item> INGOTS_SILVER = ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/silver"));
    public static final TagKey<Item> INGOTS_LEAD = ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/lead"));
    public static final TagKey<Item> INGOTS_NICKEL = ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/nickel"));
    public static final TagKey<Item> INGOTS_PLATINUM = ItemTags.create(ResourceLocation.fromNamespaceAndPath("forge", "ingots/platinum"));

}
