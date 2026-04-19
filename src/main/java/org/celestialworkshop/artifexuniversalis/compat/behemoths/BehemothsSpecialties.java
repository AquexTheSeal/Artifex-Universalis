package org.celestialworkshop.artifexuniversalis.compat.behemoths;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.celestialworkshop.artifex.api.AFSpecialty;
import org.celestialworkshop.artifex.registry.AFSpecialties;
import org.celestialworkshop.artifexuniversalis.ArtifexUniversalis;
import org.celestialworkshop.artifexuniversalis.compat.behemoths.specialty.ColossusSlayerSpecialty;
import org.celestialworkshop.artifexuniversalis.compat.behemoths.specialty.DeadBanishmentSpecialty;

public class BehemothsSpecialties {
    public static DeferredRegister<AFSpecialty> SPECIALTIES = DeferredRegister.create(AFSpecialties.SPECIALTIES_KEY, ArtifexUniversalis.MODID);

    public static final RegistryObject<AFSpecialty> COLOSSUS_SLAYER = SPECIALTIES.register("colossus_slayer", () -> new ColossusSlayerSpecialty(AFSpecialty.Category.BENEFICIAL));
    public static final RegistryObject<AFSpecialty> BANISHMENT_OF_THE_DEAD = SPECIALTIES.register("banishment_of_the_dead", () -> new DeadBanishmentSpecialty(AFSpecialty.Category.BENEFICIAL));
}
