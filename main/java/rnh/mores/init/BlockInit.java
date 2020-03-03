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
	public static Block stone_wall_block;
	public static Block stone_door_block;
	public static Block stone_chest_block;
	public static Block stone_trapdoor_block;
	//Learn how to make custom signs!
	public static Block stone_standing_sign_block;
	public static Block stone_wall_sign_block;

	//Cobblestone
	public static Block cobblestone_door_block;
	public static Block cobblestone_chest_block;
	public static Block cobblestone_trapdoor_block;
	public static Block cobblestone_button_block;
	public static Block cobblestone_pressure_plate_block;
	public static final Block cobblestone_sign_block = null;

	//Smooth Stone
	public static Block smooth_stone_stairs_block;
	public static Block smooth_stone_pressure_plate_block;
	public static Block smooth_stone_wall_block;
	public static Block smooth_stone_door_block;
	public static final Block smooth_stone_chest_block = null;
	public static Block smooth_stone_button_block;
	public static Block smooth_stone_trapdoor_block;
	public static final Block smooth_stone_sign_block = null;

	//Stone Bricks
	public static Block stone_bricks_pressure_plate_block;
	public static Block stone_bricks_door_block;
	public static Block stone_bricks_trapdoor_block;	
	public static Block stone_bricks_button_block;
	
	//Cracked Stone Bricks
	public static Block cracked_stone_bricks_stairs_block;
	public static Block cracked_stone_bricks_slab_block;
	public static Block cracked_stone_bricks_wall_block;
	public static Block cracked_stone_bricks_pressure_plate_block;
	public static Block cracked_stone_bricks_door_block;
	public static Block cracked_stone_bricks_trapdoor_block;
	public static Block cracked_stone_bricks_button_block;
	
	//Mossy Stone Bricks
	public static Block mossy_stone_bricks_pressure_plate_block;
	public static Block mossy_stone_bricks_door_block;
	public static Block mossy_stone_bricks_trapdoor_block;
	public static Block mossy_stone_bricks_button_block;
	
	//Mossy Cobblestone
	public static Block mossy_cobblestone_pressure_plate_block;
	public static Block mossy_cobblestone_door_block;
	public static Block mossy_cobblestone_trapdoor_block;
	public static Block mossy_cobblestone_button_block;
	
	//Granite
	public static Block granite_pressure_plate_block;
	public static Block granite_door_block;
	public static Block granite_trapdoor_block;
	public static Block granite_button_block;
	
	
	//Granite Cobblestone
	public static final Block granite_cobblestone_block = null;
	public static Block granite_cobblestone_stairs_block;
	public static Block granite_cobblestone_slab_block;
	public static Block granite_cobblestone_wall_block;
	public static Block granite_cobblestone_pressure_plate_block;
	public static Block granite_cobblestone_door_block;
	public static Block granite_cobblestone_chest_block;
	public static Block granite_cobblestone_trapdoor_block;
	public static Block granite_cobblestone_button_block;
	
	//Granite Polished 
	public static Block granite_polished_wall_block;
	public static Block granite_polished_pressure_plate_block;
	public static Block granite_polished_door_block;
	public static Block granite_polished_trapdoor_block;
	public static Block granite_polished_button_block;
	
	//Granite Bricks
	public static final Block granite_bricks_block = null;
	public static Block granite_bricks_stairs_block;
	public static Block granite_bricks_slab_block;
	public static Block granite_bricks_wall_block;
	public static Block granite_bricks_pressure_plate_block;
	public static Block granite_bricks_door_block;
	public static Block granite_bricks_chest_block;
	public static Block granite_bricks_trapdoor_block;
	public static Block granite_bricks_button_block;
	
	//Granite Cracked Bricks
	public static final Block granite_cracked_bricks_block = null;
	public static Block granite_cracked_bricks_stairs_block;
	public static Block granite_cracked_bricks_slab_block;
	public static Block granite_cracked_bricks_wall_block;
	public static Block granite_cracked_bricks_pressure_plate_block;
	public static Block granite_cracked_bricks_door_block;
	public static Block granite_cracked_bricks_chest_block;
	public static Block granite_cracked_bricks_trapdoor_block;
	public static Block granite_cracked_bricks_button_block;
	
	
	public static final Block granite_mossy_bricks_block = null;
	public static final Block granite_chiseled_bricks_block = null;
	public static final Block granite_chest_block = null;
	public static final Block granite_mossy_cobblestone_block = null;

	public static final Block diorite_pressure_plate_block = null;
	public static final Block diorite_door_block = null;
	public static final Block diorite_chest_block = null;
	public static final Block diorite_trapdoor_block = null;
	
	public static final Block polished_diorite_wall_block = null;
	public static final Block polished_diorite_pressure_plate_block = null;
	public static final Block polished_diorite_door_block = null;
	public static final Block polished_diorite_trapdoor_block = null;
	
	public static final Block diorite_cobblestone_block = null;
	public static final Block diorite_cobblestone_stairs_block = null;
	public static final Block diorite_cobblestone_slab_block = null;
	public static final Block diorite_cobblestone_wall_block = null;
	public static final Block diorite_cobblestone_pressure_plate_block = null;
	public static final Block diorite_cobblestone_door_block = null;
	public static final Block diorite_cobblestone_chest_block = null;
	public static final Block diorite_cobblestone_trapdoor_block = null;
	
	public static final Block andesite_pressure_plate_block = null;
	public static final Block andesite_door_block = null;
	public static final Block andesite_chest_block = null;
	public static final Block andesite_trapdoor_block = null;
	
	public static final Block polished_andesite_wall_block = null;
	public static final Block polished_andesite_pressure_plate_block = null;
	public static final Block polished_andesite_door_block = null;
	public static final Block polished_andesite_trapdoor_block = null;
	
	public static final Block andesite_cobblestone_block = null;
	public static final Block andesite_cobblestone_stairs_block = null;
	public static final Block andesite_cobblestone_slab_block = null;
	public static final Block andesite_cobblestone_wall_block = null;
	public static final Block andesite_cobblestone_pressure_plate_block = null;
	public static final Block andesite_cobblestone_door_block = null;
	public static final Block andesite_cobblestone_chest_block = null;
	public static final Block andesite_cobblestone_trapdoor_block = null;
	
	public static final Block coal_poor_ore_block = null;
	public static final Block coal_rich_ore_block = null;
	public static final Block coal_dense_ore_block = null;

	public static final Block iron_stairs_block = null;
	public static final Block iron_slab_block = null;
	public static final Block iron_wall_block = null;
	public static final Block iron_chest_block = null;
	public static final Block iron_poor_ore_block = null;
	public static final Block iron_rich_ore_block = null;
	public static final Block iron_dense_ore_block = null;
	
	public static final Block gold_stairs_block = null;
	public static final Block gold_slab_block = null;
	public static final Block gold_wall_block = null;	
	public static final Block gold_door_block = null;
	public static final Block gold_chest_block = null;
	public static final Block gold_poor_ore_block = null;
	public static final Block gold_rich_ore_block = null;
	public static final Block gold_dense_ore_block = null;
	
	public static final Block diamond_stairs_block = null;
	public static final Block diamond_slab_block = null;
	public static final Block diamond_wall_block = null;	
	public static final Block diamond_pressure_plate_block = null;	
	public static Block diamond_door_block;
	public static Block diamond_variant_door_block;
	public static final Block diamond_chest_block = null;
	public static final Block diamond_poor_ore_block = null;
	public static final Block diamond_rich_ore_block = null;
	public static final Block diamond_dense_ore_block = null;
	
	public static final Block emerald_stairs_block = null;
	public static final Block emerald_slab_block = null;
	public static final Block emerald_wall_block = null;	
	public static final Block emerald_pressure_plate_block = null;	
	public static final Block emerald_door_block = null;
	public static final Block emerald_chest_block = null;
	public static final Block emerald_poor_ore_block = null;
	public static final Block emerald_rich_ore_block = null;
	public static final Block emerald_dense_ore_block = null;

	public static final Block lapis_poor_ore_block = null;
	public static final Block lapis_rich_ore_block = null;
	public static final Block lapis_dense_ore_block = null;
	
	public static final Block redstone_poor_ore_block = null;
	public static final Block redstone_rich_ore_block = null;
	public static final Block redstone_dense_ore_block = null;
	
	public static Block diamond_stonecutter_block;
	

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		//Stone
		
		event.getRegistry().register(stone_chest_block = new StoneChestBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE), TileEntityInit.STONE_CHEST).setRegistryName("stone_chest_block"));
		event.getRegistry().register(stone_wall_block = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("stone_wall_block"));
		event.getRegistry().register(stone_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("stone_door_block"));	
		event.getRegistry().register(stone_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("stone_trapdoor_block"));	
		event.getRegistry().register(stone_standing_sign_block = new StoneStandingSignBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE), StoneSignType.STONE).setRegistryName("stone_standing_sign_block"));	
		event.getRegistry().register(stone_wall_sign_block = new StoneWallSignBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE), StoneSignType.STONE).setRegistryName("stone_wall_sign_block"));	
		
		//Cobblestone
		event.getRegistry().register(cobblestone_chest_block = new StoneChestBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE), TileEntityInit.STONE_CHEST).setRegistryName("cobblestone_chest_block"));
		event.getRegistry().register(cobblestone_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cobblestone_door_block"));	
		event.getRegistry().register(cobblestone_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cobblestone_pressure_plate_block"));	
		event.getRegistry().register(cobblestone_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cobblestone_button_block"));	
		event.getRegistry().register(cobblestone_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cobblestone_trapdoor_block"));	

		//Smooth Stone
		event.getRegistry().register(smooth_stone_wall_block = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("smooth_stone_wall_block"));
		event.getRegistry().register(smooth_stone_stairs_block =  (BaseStairsBlock) new BaseStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("smooth_stone_stairs_block"));	
		event.getRegistry().register(smooth_stone_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("smooth_stone_pressure_plate_block"));	
		event.getRegistry().register(smooth_stone_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("smooth_stone_door_block"));	
		event.getRegistry().register(smooth_stone_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("smooth_stone_button_block"));	
		event.getRegistry().register(smooth_stone_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("smooth_stone_trapdoor_block"));	

		//StoneBricks
		event.getRegistry().register(stone_bricks_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("stone_bricks_pressure_plate_block"));	
		event.getRegistry().register(stone_bricks_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("stone_bricks_door_block"));	
		event.getRegistry().register(stone_bricks_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("stone_bricks_button_block"));	
		event.getRegistry().register(stone_bricks_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("stone_bricks_trapdoor_block"));	

		//Cracked Stone Bricks
		event.getRegistry().register(cracked_stone_bricks_stairs_block =  (BaseStairsBlock) new BaseStairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cracked_stone_bricks_stairs_block"));	
		event.getRegistry().register(cracked_stone_bricks_slab_block = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cracked_stone_bricks_slab_block"));			
		event.getRegistry().register(cracked_stone_bricks_wall_block = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cracked_stone_bricks_wall_block"));
		event.getRegistry().register(cracked_stone_bricks_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cracked_stone_bricks_pressure_plate_block"));	
		event.getRegistry().register(cracked_stone_bricks_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cracked_stone_bricks_door_block"));	
		event.getRegistry().register(cracked_stone_bricks_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cracked_stone_bricks_button_block"));	
		event.getRegistry().register(cracked_stone_bricks_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cracked_stone_bricks_trapdoor_block"));	
		
		//Mossy Stone Bricks
		event.getRegistry().register(mossy_stone_bricks_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("mossy_stone_bricks_pressure_plate_block"));	
		event.getRegistry().register(mossy_stone_bricks_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("mossy_stone_bricks_door_block"));	
		event.getRegistry().register(mossy_stone_bricks_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("mossy_stone_bricks_button_block"));	
		event.getRegistry().register(mossy_stone_bricks_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("mossy_stone_bricks_trapdoor_block"));	
		
		//Mossy Stone Bricks
		event.getRegistry().register(mossy_cobblestone_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("mossy_cobblestone_pressure_plate_block"));	
		event.getRegistry().register(mossy_cobblestone_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("mossy_cobblestone_door_block"));	
		event.getRegistry().register(mossy_cobblestone_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("mossy_cobblestone_button_block"));	
		event.getRegistry().register(mossy_cobblestone_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("mossy_cobblestone_trapdoor_block"));	
				
		//Granite
		event.getRegistry().register(granite_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_pressure_plate_block"));	
		event.getRegistry().register(granite_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_door_block"));	
		event.getRegistry().register(granite_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_button_block"));	
		event.getRegistry().register(granite_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_trapdoor_block"));	
		
		//Granite Cobblestone
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cobblestone_block"));
		event.getRegistry().register(granite_cobblestone_wall_block = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cobblestone_wall_block"));
		event.getRegistry().register(granite_cobblestone_stairs_block =  (BaseStairsBlock) new BaseStairsBlock(Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cobblestone_stairs_block"));	
		event.getRegistry().register(granite_cobblestone_slab_block = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cobblestone_slab_block"));			
		event.getRegistry().register(granite_cobblestone_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cobblestone_pressure_plate_block"));	
		event.getRegistry().register(granite_cobblestone_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cobblestone_door_block"));	
		event.getRegistry().register(granite_cobblestone_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cobblestone_button_block"));	
		event.getRegistry().register(granite_cobblestone_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cobblestone_trapdoor_block"));	

		//Granite Polished
		event.getRegistry().register(granite_polished_wall_block = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_polished_wall_block"));
		event.getRegistry().register(granite_polished_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_polished_pressure_plate_block"));	
		event.getRegistry().register(granite_polished_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_polished_door_block"));	
		event.getRegistry().register(granite_polished_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_polished_button_block"));	
		event.getRegistry().register(granite_polished_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_polished_trapdoor_block"));	

		//Granite Bricks
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_bricks_block"));
		event.getRegistry().register(granite_bricks_wall_block = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_bricks_wall_block"));
		event.getRegistry().register(granite_bricks_stairs_block =  (BaseStairsBlock) new BaseStairsBlock(Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_bricks_stairs_block"));	
		event.getRegistry().register(granite_bricks_slab_block = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_bricks_slab_block"));			
		event.getRegistry().register(granite_bricks_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_bricks_pressure_plate_block"));	
		event.getRegistry().register(granite_bricks_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_bricks_door_block"));	
		event.getRegistry().register(granite_bricks_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_bricks_button_block"));	
		event.getRegistry().register(granite_bricks_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_bricks_trapdoor_block"));	

		//Granite Cracked Bricks
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cracked_bricks_block"));
		event.getRegistry().register(granite_cracked_bricks_wall_block = new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cracked_bricks_wall_block"));
		event.getRegistry().register(granite_cracked_bricks_stairs_block =  (BaseStairsBlock) new BaseStairsBlock(Blocks.GRANITE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cracked_bricks_stairs_block"));	
		event.getRegistry().register(granite_cracked_bricks_slab_block = new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cracked_bricks_slab_block"));			
		event.getRegistry().register(granite_cracked_bricks_pressure_plate_block = new BasePressurePlateBlock(Sensitivity.EVERYTHING, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cracked_bricks_pressure_plate_block"));	
		event.getRegistry().register(granite_cracked_bricks_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cracked_bricks_door_block"));	
		event.getRegistry().register(granite_cracked_bricks_button_block = new BaseButtonBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cracked_bricks_button_block"));	
		event.getRegistry().register(granite_cracked_bricks_trapdoor_block = new BaseTrapDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_cracked_bricks_trapdoor_block"));	

		
		
		
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_mossy_bricks_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_chiseled_bricks_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("granite_mossy_cobblestone_block"));

		
		
		
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f, 3.5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("iron_poor_ore_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f, 3.5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("iron_rich_ore_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.5f, 3.5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(1)).setRegistryName("iron_dense_ore_block"));
	
		event.getRegistry().register(diamond_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("diamond_door_block"));	
		event.getRegistry().register(diamond_variant_door_block = new BaseDoorBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("diamond_variant_door_block"));	

		event.getRegistry().register(diamond_stonecutter_block = new DiamondStoneCutterBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 6.0f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("diamond_stonecutter_block"));	
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		
		//Stone
		event.getRegistry().register(new BlockItem(stone_chest_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("stone_chest_block"));
		event.getRegistry().register(new BlockItem(stone_wall_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("stone_wall_block"));
		event.getRegistry().register(new BlockItem(stone_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("stone_door_block"));
		event.getRegistry().register(new BlockItem(stone_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("stone_trapdoor_block"));
		//event.getRegistry().register(new BlockSignItem(new Item.Properties().group(Main.MainBlockGroup.instance), stone_sign_block, stone_sign_block ).setRegistryName("stone_sign_block"));
		
		//Cobblestone
		event.getRegistry().register(new BlockItem(cobblestone_chest_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cobblestone_chest_block"));
		event.getRegistry().register(new BlockItem(cobblestone_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cobblestone_door_block"));
		event.getRegistry().register(new BlockItem(cobblestone_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cobblestone_button_block"));
		event.getRegistry().register(new BlockItem(cobblestone_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cobblestone_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(cobblestone_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cobblestone_trapdoor_block"));
		
		//Smooth Stone
		event.getRegistry().register(new BlockItem(smooth_stone_wall_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("smooth_stone_wall_block"));
		event.getRegistry().register(new BlockItem(smooth_stone_stairs_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("smooth_stone_stairs_block"));
		event.getRegistry().register(new BlockItem(smooth_stone_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("smooth_stone_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(smooth_stone_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("smooth_stone_door_block"));
		event.getRegistry().register(new BlockItem(smooth_stone_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("smooth_stone_button_block"));
		event.getRegistry().register(new BlockItem(smooth_stone_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("smooth_stone_trapdoor_block"));

		//Stone Bricks
		event.getRegistry().register(new BlockItem(stone_bricks_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("stone_bricks_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(stone_bricks_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("stone_bricks_door_block"));
		event.getRegistry().register(new BlockItem(stone_bricks_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("stone_bricks_button_block"));
		event.getRegistry().register(new BlockItem(stone_bricks_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("stone_bricks_trapdoor_block"));

		//Cracked Stone Bricks
		event.getRegistry().register(new BlockItem(cracked_stone_bricks_stairs_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cracked_stone_bricks_stairs_block"));
		event.getRegistry().register(new BlockItem(cracked_stone_bricks_slab_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cracked_stone_bricks_slab_block"));
		event.getRegistry().register(new BlockItem(cracked_stone_bricks_wall_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cracked_stone_bricks_wall_block"));
		event.getRegistry().register(new BlockItem(cracked_stone_bricks_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cracked_stone_bricks_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(cracked_stone_bricks_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cracked_stone_bricks_door_block"));
		event.getRegistry().register(new BlockItem(cracked_stone_bricks_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cracked_stone_bricks_button_block"));
		event.getRegistry().register(new BlockItem(cracked_stone_bricks_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("cracked_stone_bricks_trapdoor_block"));		
		
		//Mossy Stone Bricks
		event.getRegistry().register(new BlockItem(mossy_stone_bricks_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("mossy_stone_bricks_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(mossy_stone_bricks_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("mossy_stone_bricks_door_block"));
		event.getRegistry().register(new BlockItem(mossy_stone_bricks_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("mossy_stone_bricks_button_block"));
		event.getRegistry().register(new BlockItem(mossy_stone_bricks_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("mossy_stone_bricks_trapdoor_block"));		
		
		//Mossy Cobblestone
		event.getRegistry().register(new BlockItem(mossy_cobblestone_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("mossy_cobblestone_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(mossy_cobblestone_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("mossy_cobblestone_door_block"));
		event.getRegistry().register(new BlockItem(mossy_cobblestone_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("mossy_cobblestone_button_block"));
		event.getRegistry().register(new BlockItem(mossy_cobblestone_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("mossy_cobblestone_trapdoor_block"));		
		
		//Granite
		event.getRegistry().register(new BlockItem(granite_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(granite_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_door_block"));
		event.getRegistry().register(new BlockItem(granite_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_button_block"));
		event.getRegistry().register(new BlockItem(granite_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_trapdoor_block"));		
		
		//Granite Cobblestone
		event.getRegistry().register(new BlockItem(granite_cobblestone_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cobblestone_block"));
		event.getRegistry().register(new BlockItem(granite_cobblestone_stairs_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cobblestone_stairs_block"));
		event.getRegistry().register(new BlockItem(granite_cobblestone_slab_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cobblestone_slab_block"));
		event.getRegistry().register(new BlockItem(granite_cobblestone_wall_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cobblestone_wall_block"));
		event.getRegistry().register(new BlockItem(granite_cobblestone_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cobblestone_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(granite_cobblestone_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cobblestone_door_block"));
		event.getRegistry().register(new BlockItem(granite_cobblestone_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cobblestone_button_block"));
		event.getRegistry().register(new BlockItem(granite_cobblestone_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cobblestone_trapdoor_block"));		
		
		//Granite Polished
		event.getRegistry().register(new BlockItem(granite_polished_wall_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_polished_wall_block"));
		event.getRegistry().register(new BlockItem(granite_polished_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_polished_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(granite_polished_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_polished_door_block"));
		event.getRegistry().register(new BlockItem(granite_polished_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_polished_button_block"));
		event.getRegistry().register(new BlockItem(granite_polished_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_polished_trapdoor_block"));		
		
		//Granite Bricks
		event.getRegistry().register(new BlockItem(granite_bricks_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_bricks_block"));
		event.getRegistry().register(new BlockItem(granite_bricks_stairs_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_bricks_stairs_block"));
		event.getRegistry().register(new BlockItem(granite_bricks_slab_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_bricks_slab_block"));
		event.getRegistry().register(new BlockItem(granite_bricks_wall_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_bricks_wall_block"));
		event.getRegistry().register(new BlockItem(granite_bricks_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_bricks_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(granite_bricks_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_bricks_door_block"));
		event.getRegistry().register(new BlockItem(granite_bricks_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_bricks_button_block"));
		event.getRegistry().register(new BlockItem(granite_bricks_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_bricks_trapdoor_block"));		
		
		//Granite Cracked Bricks
		event.getRegistry().register(new BlockItem(granite_cracked_bricks_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cracked_bricks_block"));
		event.getRegistry().register(new BlockItem(granite_cracked_bricks_stairs_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cracked_bricks_stairs_block"));
		event.getRegistry().register(new BlockItem(granite_cracked_bricks_slab_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cracked_bricks_slab_block"));
		event.getRegistry().register(new BlockItem(granite_cracked_bricks_wall_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cracked_bricks_wall_block"));
		event.getRegistry().register(new BlockItem(granite_cracked_bricks_pressure_plate_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cracked_bricks_pressure_plate_block"));
		event.getRegistry().register(new BlockItem(granite_cracked_bricks_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cracked_bricks_door_block"));
		event.getRegistry().register(new BlockItem(granite_cracked_bricks_button_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cracked_bricks_button_block"));
		event.getRegistry().register(new BlockItem(granite_cracked_bricks_trapdoor_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_cracked_bricks_trapdoor_block"));		
		
		
		
		event.getRegistry().register(new BlockItem(granite_mossy_bricks_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_mossy_bricks_block"));
		event.getRegistry().register(new BlockItem(granite_chiseled_bricks_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_chiseled_bricks_block"));
		event.getRegistry().register(new BlockItem(granite_mossy_cobblestone_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("granite_mossy_cobblestone_block"));
		
		event.getRegistry().register(new BlockItem(iron_poor_ore_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("iron_poor_ore_block"));
		event.getRegistry().register(new BlockItem(iron_rich_ore_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("iron_rich_ore_block"));
		event.getRegistry().register(new BlockItem(iron_dense_ore_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("iron_dense_ore_block"));
	
		event.getRegistry().register(new BlockItem(diamond_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("diamond_door_block"));
		event.getRegistry().register(new BlockItem(diamond_variant_door_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("diamond_variant_door_block"));
		event.getRegistry().register(new BlockItem(diamond_stonecutter_block, new Item.Properties().group(Main.MainBlockGroup.instance)).setRegistryName("diamond_stonecutter_block"));

		
	}
}
