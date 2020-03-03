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
	
	public static final Item diamond_raw_item = null;
	public static final Item diamond_raw_small_item = null;
	
	public static final Item emerald_raw_item = null;
	public static final Item emerald_raw_small_item = null;
	
	
	//Finitie
	public static final Item finitie_ore = null;
	public static final Item finitie_nugget = null;
	public static final Item finitie_ingot = null;
	
	public static Item stone_sign_item;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("dirt_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("coarse_dirt_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("gravel_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("sand_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("red_sand_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("soul_sand_item"));
		
		event.getRegistry().register(new RockItem(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("stone_rock_normal_item"));

		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("iron_ore_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("iron_poor_ore_item"));
		
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("gold_ore_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("gold_poor_ore_item"));

		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("diamond_raw_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("diamond_raw_small_item"));
		
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("emerald_raw_item"));
		event.getRegistry().register(new Item(new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("emerald_raw_small_item"));
	
		event.getRegistry().register(new BlockSignItem(new Item.Properties().group(Main.MainBlockGroup.instance), BlockInit.stone_standing_sign_block, BlockInit.stone_wall_sign_block).setRegistryName("stone_sign_item"));
		
	}

}
