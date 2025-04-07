package net.shapeshifter.turretdefense.events;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.shapeshifter.turretdefense.TurretDefense;
import net.shapeshifter.turretdefense.block.ModBlocks;

@Mod.EventBusSubscriber(modid = TurretDefense.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModEventClient {

    @SubscribeEvent
    public static void onTooltipDisplayed(ItemTooltipEvent event) {
        if (event.getItemStack().getItem() == ModBlocks.BASIC_TURRET_BASE.get().asItem()) {
            if (Screen.hasShiftDown()) {
                event.getToolTip().add(Component.translatable("tooltip.turretdefense.basic_turret_base.description")
                        .withStyle(ChatFormatting.GRAY));
            } else {
                event.getToolTip().add(Component.translatable("tooltip.turretdefense.basic_turret_base.hold_shift")
                        .withStyle(ChatFormatting.YELLOW));
            }
        }
    }
}
