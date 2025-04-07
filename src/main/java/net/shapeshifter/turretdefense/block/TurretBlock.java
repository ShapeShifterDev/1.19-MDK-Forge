package net.shapeshifter.turretdefense.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public abstract class TurretBlock extends Block {
    protected final double range;
    protected final double damage;
    protected final double fireRate;
    protected final double accuracy;
    protected final SoundEvent shootSound;

    public TurretBlock(Properties properties, double range, double damage, int fireRate, double accuracy, SoundEvent shootSound) {
        super(properties);
        this.range = range;
        this.damage = damage;
        this.fireRate = fireRate;
        this.accuracy = accuracy;
        this.shootSound = shootSound;
    }

    public void shoot(ServerLevel level, BlockPos pos) {
        List<Mob> mobs = level.getEntitiesOfClass(Mob.class, new AABB(pos).inflate(range), entity -> entity instanceof Monster);
        if (!mobs.isEmpty()) {
            Mob target = mobs.get(0);
            Vec3 shootPos = new Vec3(pos.getX() + 0.5, pos.getY() + 1.5, pos.getZ() + 0.5);
            fireProjectile(level, shootPos, target);
        }
    }

    protected abstract void fireProjectile(ServerLevel level, Vec3 from, LivingEntity target);
}

