package net.shapeshifter.turretdefense.client.model;

import net.shapeshifter.turretdefense.block.entity.TurretBlockEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import net.minecraft.resources.ResourceLocation;

public class DisruptorLaserModel extends AnimatedGeoModel<TurretBlockEntity> {

    @Override
    public ResourceLocation getModelResource(TurretBlockEntity object) {
        return new ResourceLocation("turretdefense", "geo/disruptor_laser.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TurretBlockEntity object) {
        return new ResourceLocation("turretdefense", "textures/block/disruptor_laser.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TurretBlockEntity object) {
        return new ResourceLocation("turretdefense", "animations/disruptor_laser.animation.json");
    }
}