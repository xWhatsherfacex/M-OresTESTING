package rnh.mores;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import rnh.mores.entities.renderer.StoneChestTileEntityRenderer;
import rnh.mores.entities.renderer.StoneRockRenderer;
import rnh.mores.gui.DiamondStonecutterScreen;
import rnh.mores.gui.StoneChestScreen;
import rnh.mores.init.BlockInit;
import rnh.mores.init.ContainerChestInit;
import rnh.mores.init.ContainerInit;
import rnh.mores.init.EntityInit;
import rnh.mores.init.ItemInit;
import rnh.mores.init.TileEntityInit;
import rnh.mores.world.MoreOreGen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mores")
@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
public class Main
{
    @SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "mores";
    public static Main instance;
    
    public Main() {
    	
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	//modEventBus.addListener(this::doClientStuff);
        
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);

        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
          // Client setup
        	modEventBus.addListener(this::doClientStuff);
        });

        // Registry objects
        TileEntityInit.TILE_ENTITY_TYPES.register(modEventBus);
        ContainerChestInit.CONTAINERS.register(modEventBus);
      }

    private void setup(final FMLCommonSetupEvent event){

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    	RenderTypeLookup.setRenderLayer(BlockInit.diamond_variant_door_block, RenderType.getCutout());
    	RenderTypeLookup.setRenderLayer(BlockInit.diamond_stonecutter_block, RenderType.getCutout());
    	
    	
		RenderingRegistry.registerEntityRenderingHandler(EntityInit.STONE_ROCK_ENTITY, StoneRockRenderer::new);
		
	    ScreenManager.registerFactory(ContainerChestInit.STONE_CHEST.get(), StoneChestScreen::new);
        ScreenManager.registerFactory(ContainerInit.DIAMOND_STONECUTTER, DiamondStonecutterScreen::new);
        
        ClientRegistry.bindTileEntityRenderer(TileEntityInit.STONE_CHEST.get(), StoneChestTileEntityRenderer::new);
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    	MoreOreGen.generateOre();
    }
    
    
    public static class MainItemGroup extends ItemGroup{
   
    	public static final MainItemGroup instance = new MainItemGroup(ItemGroup.GROUPS.length,"maintab");
    	
    	private MainItemGroup(int index, String label) {
    		super(index, label);
    	}
    		@Override
    		public ItemStack createIcon() {
    			return new ItemStack(ItemInit.dirt_item);
    	}
    }
}