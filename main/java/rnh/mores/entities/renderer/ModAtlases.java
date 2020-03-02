package rnh.mores.entities.renderer;

import java.util.function.Consumer;


import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import rnh.mores.Main;
import rnh.mores.objects.blocks.StoneChestType;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = Main.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModAtlases {

	   public static final ResourceLocation STONE_CHEST_ATLAS = new ResourceLocation("textures/atlas/chest.png");
	   private static final RenderType STONE_CHEST_TYPE = RenderType.getEntityCutout(STONE_CHEST_ATLAS);
	   public static final Material STONE_CHEST_MATERIAL = getStoneChestMaterial("stone_chest_normal");
	   public static final Material STONE_CHEST_LEFT_MATERIAL = getStoneChestMaterial("stone_chest_left");
	   public static final Material STONE_CHEST_RIGHT_MATERIAL = getStoneChestMaterial("stone_chest_right");
	   
	
	   public static RenderType getStoneChestType() {
		      return STONE_CHEST_TYPE;
		   }
	   
	   public static void collectAllMaterials(Consumer<Material> material) {
		   material.accept(STONE_CHEST_MATERIAL);
		   material.accept(STONE_CHEST_LEFT_MATERIAL);
		   material.accept(STONE_CHEST_RIGHT_MATERIAL);	   
	   }
	   
	   private static Material getStoneChestMaterial(String name) {
		      return new Material(STONE_CHEST_ATLAS, new ResourceLocation("entity/chest/" + name));
		   }
	   
	   public static Material getStoneChestMaterial(TileEntity entity, StoneChestType type) {
		   		return getStoneChestMaterial(type, STONE_CHEST_MATERIAL, STONE_CHEST_LEFT_MATERIAL, STONE_CHEST_RIGHT_MATERIAL);
		   }

		private static Material getStoneChestMaterial(StoneChestType type, Material p_228772_1_, Material p_228772_2_, Material p_228772_3_) {
		      switch(type) {
		      case LEFT:
		         return p_228772_2_;
		      case RIGHT:
		         return p_228772_3_;
		      case SINGLE:
		      default:
		         return p_228772_1_;
		      }
		   }
		
		@SubscribeEvent
		public static void onStitch(TextureStitchEvent.Pre event) {
		    if (!event.getMap().getTextureLocation().equals(Atlases.CHEST_ATLAS)) {
		      return;
		    }

		    event.addSprite(STONE_CHEST_MATERIAL.getTextureLocation());
		    event.addSprite(STONE_CHEST_LEFT_MATERIAL.getTextureLocation());
		    event.addSprite(STONE_CHEST_RIGHT_MATERIAL.getTextureLocation());
		
		}
}
