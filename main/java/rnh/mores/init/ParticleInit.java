package rnh.mores.init;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import rnh.mores.Main;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
@ObjectHolder(Main.MODID)
public class ParticleInit {
	
			
		public static BasicParticleType stone_rock = new BasicParticleType(true);

	
			@SubscribeEvent
			public static void registerParticles(final RegistryEvent.Register<ParticleType<?>> event) {
	            event.getRegistry().register(stone_rock.setRegistryName(Main.MODID, "stone_rock"));
	}
	
	
}
