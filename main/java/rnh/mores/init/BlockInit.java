package rnh.mores.init;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
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
import rnh.mores.objects.blocks.BaseButtonBlock;
import rnh.mores.objects.blocks.BaseDoorBlock;
import rnh.mores.objects.blocks.BasePressurePlateBlock;
import rnh.mores.objects.blocks.BaseStairsBlock;
import rnh.mores.objects.blocks.BaseTrapDoorBlock;
import rnh.mores.objects.blocks.DiamondStoneCutterBlock;
import rnh.mores.objects.blocks.StoneChestBlock;
import rnh.mores.objects.blocks.StoneStandingSignBlock;
import rnh.mores.objects.blocks.StoneWallSignBlock;
import rnh.mores.objects.blocks.StoneSignType;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
@ObjectHolder(Main.MODID)
public class BlockInit {

	//Stone
	public static Block stone_standing_sign_block;
	public static Block stone_wall_sign_block;

	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		//Stone
		
		event.getRegistry().register(stone_standing_sign_block = new StoneStandingSignBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE), StoneSignType.STONE).setRegistryName("stone_standing_sign_block"));	
		event.getRegistry().register(stone_wall_sign_block = new StoneWallSignBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE), StoneSignType.STONE).setRegistryName("stone_wall_sign_block"));	
		}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		
	}
}
