package net.shapeshifter.turretdefense.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class DisruptorLaserTurret extends TurretBlock {

    public DisruptorLaserTurret(Properties properties) {
        super(properties, 10.0, 4.0, 20, 0.95, SoundEvents.BEACON_ACTIVATE);
    }

    @Override
    protected void fireProjectile(ServerLevel level, Vec3 from, LivingEntity target) {
        Vec3 to = target.position().add(0, target.getBbHeight() / 2, 0);

        // Play shoot sound
        level.playSound(null, new BlockPos(from), this.shootSound, net.minecraft.sounds.SoundSource.BLOCKS, 1.0f, 1.0f);

        // Spawn particles moving toward the target
        for (int i = 0; i < 10; i++) {
            double progress = i / 10.0;
            double px = from.x + (to.x - from.x) * progress;
            double py = from.y + (to.y - from.y) * progress;
            double pz = from.z + (to.z - from.z) * progress;
            level.sendParticles(net.minecraft.core.particles.ParticleTypes.END_ROD, px, py, pz, 1, 0, 0, 0, 0);
        }

        // Apply damage
        target.hurt(net.minecraft.world.damagesource.DamageSource.MAGIC, (float) this.damage);
    }
}