package rnh.mores.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import rnh.mores.Main;
import rnh.mores.objects.items.RockItem;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
@ObjectHolder(Main.MODID)
public class ItemInit {
	
	public static final Item dirt_item = null;
	public static final Item gravel_item = null;
	public static final Item sand_item = null;
	public static final Item red_sand_item = null;
	public static final Item soul_sand_item = null;

	
	public static final Item stone_rock_normal_item = null;
	

	public static final Item iron_ore_item = null;
	public static final Item iron_poor_ore_item = null;
	
	public static final Item gold_ore_item = null;
	public static final Item gold_poor_ore_item = null;
	
	public static final Item diamond_ore_item = null;
	public static final Item diamond_poor_ore_item = null;
	
	public static final Item emerald_ore_item = null;
	public static final Item emerald_poor_ore_item = null;
	

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("dirt_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("gravel_item"));
		
		event.getRegistry().register(new RockItem(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("stone_rock_normal_item"));

		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("iron_ore_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("iron_poor_ore_item"));
	
	}

}
