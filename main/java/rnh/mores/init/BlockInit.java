package rnh.mores.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;
import rnh.mores.Main;
import rnh.mores.objects.blocks.StoneChestBlock;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
@ObjectHolder(Main.MODID)
public class BlockInit {

	public static Block stone_chest_block;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(stone_chest_block = new StoneChestBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE), TileEntityInit.STONE_CHEST).setRegistryName("stone_chest_block"));
		}

	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(stone_chest_block, new Item.Properties().group(Main.MainItemGroup.instance)).setRegistryName("stone_chest_block"));
		
	}
}
