package net.shapeshifter.turretdefense.registry;

import net.shapeshifter.turretdefense.TurretDefense;
import net.shapeshifter.turretdefense.block.entity.TurretBlockEntity;
import net.shapeshifter.turretdefense.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TurretDefense.MOD_ID);

    public static final RegistryObject<BlockEntityType<TurretBlockEntity>> TURRET_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("turret_block_entity",
                    () -> BlockEntityType.Builder.of(TurretBlockEntity::new, ModBlocks.DISRUPTOR_LASER_TURRET.get()).build(null));

    public static void register() {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

