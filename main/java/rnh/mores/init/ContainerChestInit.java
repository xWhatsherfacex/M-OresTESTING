package rnh.mores.init;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rnh.mores.Main;
import rnh.mores.inventory.container.StoneChestContainer;


@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ContainerChestInit {
	

	  public static final DeferredRegister<ContainerType<?>> CONTAINERS = new DeferredRegister<>(ForgeRegistries.CONTAINERS, Main.MODID);

	  public static final RegistryObject<ContainerType<StoneChestContainer>> STONE_CHEST = CONTAINERS.register("stone_chest_container", () -> new ContainerType<>(StoneChestContainer::createGeneric9X3));


}

