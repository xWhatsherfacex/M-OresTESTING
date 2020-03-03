package rnh.mores.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import rnh.mores.Main;
import rnh.mores.objects.items.BlockSignItem;
import rnh.mores.objects.items.RockItem;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
@ObjectHolder(Main.MODID)
public class ItemInit {
	
	public static Item stone_sign_item;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(new BlockSignItem(new Item.Properties().group(Main.MainBlockGroup.instance), BlockInit.stone_standing_sign_block, BlockInit.stone_wall_sign_block).setRegistryName("stone_sign_item"));
		
	}

}
