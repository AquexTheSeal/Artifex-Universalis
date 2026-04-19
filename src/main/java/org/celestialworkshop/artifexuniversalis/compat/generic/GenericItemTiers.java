package org.celestialworkshop.artifexuniversalis.compat.generic;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.TierSortingRegistry;
import org.celestialworkshop.artifexuniversalis.AUTags;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;

import java.util.List;

public class GenericItemTiers {

    public static final Tier COPPER_FALLBACK = TierSortingRegistry.registerTier(
            new ForgeTier(1, 200, 4.5F, 1.0F, 14, BlockTags.NEEDS_STONE_TOOL,
                    () -> Ingredient.of(Tags.Items.INGOTS_COPPER)),
            ArtifexUniversalis.prefix("copper"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier TIN_FALLBACK = TierSortingRegistry.registerTier(
            new ForgeTier(1, 175, 4.0F, 0.5F, 14, BlockTags.NEEDS_STONE_TOOL,
                    () -> Ingredient.of(AUTags.INGOTS_TIN)),
            ArtifexUniversalis.prefix("tin"), List.of(Tiers.STONE), List.of(GenericItemTiers.COPPER_FALLBACK));

    public static final Tier SILVER_FALLBACK = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 6.0F, 1.5F, 22, BlockTags.NEEDS_IRON_TOOL,
                    () -> Ingredient.of(AUTags.INGOTS_SILVER)),
            ArtifexUniversalis.prefix("silver"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier BRONZE_FALLBACK = TierSortingRegistry.registerTier(
            new ForgeTier(2, 500, 6.5F, 2.0F, 12, BlockTags.NEEDS_IRON_TOOL,
                    () -> Ingredient.of(AUTags.INGOTS_BRONZE)),
            ArtifexUniversalis.prefix("bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier LEAD_FALLBACK = TierSortingRegistry.registerTier(
            new ForgeTier(2, 300, 4.0F, 1.5F, 8, BlockTags.NEEDS_IRON_TOOL,
                    () -> Ingredient.of(AUTags.INGOTS_LEAD)),
            ArtifexUniversalis.prefix("lead"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier NICKEL_FALLBACK = TierSortingRegistry.registerTier(
            new ForgeTier(2, 400, 6.5F, 2.0F, 14, BlockTags.NEEDS_IRON_TOOL,
                    () -> Ingredient.of(AUTags.INGOTS_NICKEL)),
            ArtifexUniversalis.prefix("nickel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier STEEL_FALLBACK = TierSortingRegistry.registerTier(
            new ForgeTier(2, 800, 7.0F, 2.5F, 10, BlockTags.NEEDS_IRON_TOOL,
                    () -> Ingredient.of(AUTags.INGOTS_STEEL)),
            ArtifexUniversalis.prefix("steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier PLATINUM_FALLBACK = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1500, 8.0F, 3.0F, 18, BlockTags.NEEDS_DIAMOND_TOOL,
                    () -> Ingredient.of(AUTags.INGOTS_PLATINUM)),
            ArtifexUniversalis.prefix("platinum"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));


}
