package org.celestialworkshop.artifexuniversalis.compat.behemoths.specialty;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import org.celestialworkshop.artifex.api.AFSpecialty;

public class DeadBanishmentSpecialty extends AFSpecialty {

    public DeadBanishmentSpecialty(Category category) {
        super(category);
    }

    public float onDamageMelee(LivingEntity attacker, LivingEntity target, ItemStack itemStack, float originalDamage, boolean isCritical, int specialityLevel) {
        return calculateDamage(target, originalDamage, specialityLevel);
    }

    @Override
    public float onDamageRanged(LivingEntity attacker, LivingEntity target, ItemStack itemStack, Projectile ammo, float originalDamage, boolean wasCrit, int specialityLevel) {
        return calculateDamage(target, originalDamage, specialityLevel);
    }

    private float calculateDamage(LivingEntity target, float originalDamage, int specialityLevel) {
        return target.getMobType() == MobType.UNDEAD ? originalDamage * calculatePower(specialityLevel) : originalDamage;
    }

    private float calculatePower(int specialityLevel) {
        return 1.0F + (float)(specialityLevel) * 0.15F;
    }

    @Override
    public Object[] getDisplayDescriptionArgs(int level) {
        return new Object[]{
                asPercentFormat(calculatePower(level))
        };
    }
}
