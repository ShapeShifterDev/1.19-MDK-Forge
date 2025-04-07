package net.shapeshifter.turretdefense.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shapeshifter.turretdefense.TurretDefense;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TurretDefense.MOD_ID);

    //Titanium Ingot
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TURRETDEFENSE_TAB)));
    //Raw Titanium
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TURRETDEFENSE_TAB)));
    //Steel Ingot
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TURRETDEFENSE_TAB)));
    //Ballista Bolt
    public static final RegistryObject<Item> BALLISTA_BOLT = ITEMS.register("ballista_bolt",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TURRETDEFENSE_TAB)
                    .stacksTo(16)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
