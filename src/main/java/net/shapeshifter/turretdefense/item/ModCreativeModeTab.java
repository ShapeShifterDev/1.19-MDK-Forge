package net.shapeshifter.turretdefense.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab TURRETDEFENSE_TAB = new CreativeModeTab("turretdefense") {
        @Override
        public @NotNull ItemStack makeIcon() {
            //Set the icon for the creative mode tab
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };
}
