package rnh.mores.init;

import java.util.function.Supplier;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import rnh.mores.Main;
import rnh.mores.objects.blocks.tileentity.StoneChestTileEntity;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TileEntityInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, Main.MODID);
	
	public static final Supplier<TileEntityType<? extends StoneChestTileEntity>> STONE_CHEST = TILE_ENTITY_TYPES.register("stone_chest", () -> TileEntityType.Builder.create(StoneChestTileEntity::new, BlockInit.stone_chest_block).build(null));
	
}
