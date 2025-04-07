package net.shapeshifter.turretdefense.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.shapeshifter.turretdefense.block.entity.TurretBlockEntity;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class DisruptorLaserRenderer extends GeoBlockRenderer<TurretBlockEntity> {

    public DisruptorLaserRenderer(BlockEntityRendererProvider.Context rendererProvider) {
        super(rendererProvider);
    }

    @Override
    public void render(TurretBlockEntity animatable, float partialTicks, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        super.render(animatable, partialTicks, poseStack, bufferSource, packedLight, packedOverlay);
    }
}





