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
	
	
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		
		event.getRegistry().register("stone_rock", EntityType.Builder.<StoneRockEntity>create(StoneRockEntity::new, EntityClassification.MISC).size(0.25F, 0.25F));		
	}
	
}
