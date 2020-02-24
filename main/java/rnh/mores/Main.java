package rnh.mores;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import rnh.mores.init.ItemInit;
import rnh.mores.world.MoreOreGen;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

@Mod("mores")
@Mod.EventBusSubscriber(modid = Main.MODID, bus = Bus.MOD)
public class Main
{
   // private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "mores";
    public static Main instance;
    
    public Main() {
        
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    
    }

    private void setup(final FMLCommonSetupEvent event){
    	
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	
    	//RenderTypeLookup.setRenderLayer(BlockInit.stone_door_block, RenderType.getCutout());
    	
    	
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
