package rnh.mores.init;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import rnh.mores.Main;
import rnh.mores.entities.StoneRockEntity;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
@ObjectHolder(Main.MODID)
public class EntityInit {
	
	public static EntityType<StoneRockEntity> STONE_ROCK_ENTITY;
	
	@SubscribeEvent
	@SuppressWarnings("unchecked")
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		
		event.getRegistry().register(STONE_ROCK_ENTITY = (EntityType<StoneRockEntity>) new EntityTypes(StoneRockEntity::new, EntityClassification.MISC, false, false, false, false, EntitySize.fixed(0.25F, 0.25F)).setRegistryName("stone_rock_entity"));
		
		
	}
	
}
