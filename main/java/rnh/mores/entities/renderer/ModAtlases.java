package rnh.mores.entities.renderer;

import java.util.function.Consumer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import rnh.mores.Main;
import rnh.mores.objects.blocks.StoneChestType;
import rnh.mores.objects.blocks.tileentity.StoneChestTileEntity;

public class ModAtlases {

	   public static final ResourceLocation STONE_CHEST_ATLAS = new ResourceLocation("textures/atlas/chest.png");
	   private static final RenderType STONE_CHEST_TYPE = RenderType.getEntityCutout(STONE_CHEST_ATLAS);
	   public static final Material STONE_CHEST_MATERIAL = getStoneChestMaterial("stone_chest_normal");
	   public static final Material STONE_CHEST_LEFT_MATERIAL = getStoneChestMaterial("stone_chest_left");
	   public static final Material STONE_CHEST_RIGHT_MATERIAL = getStoneChestMaterial("stone_chest_right");
	
	   public static RenderType getStoneChestType() {
		      return STONE_CHEST_TYPE;
		   }
	   
	   public static void collectAllMaterials(Consumer<Material> p_228775_0_) {
		   p_228775_0_.accept(STONE_CHEST_MATERIAL);
		      p_228775_0_.accept(STONE_CHEST_LEFT_MATERIAL);
		      p_228775_0_.accept(STONE_CHEST_RIGHT_MATERIAL);	   
	   }
	   
	   private static Material getStoneChestMaterial(String p_228774_0_) {
		      return new Material(STONE_CHEST_ATLAS, new ResourceLocation(Main.MODID + "textures/entity/chest/" + p_228774_0_));
		   }
	   
	   public static Material getStoneChestMaterial(TileEntity p_228771_0_, StoneChestType p_228771_1_) {
		      if ( p_228771_0_ instanceof StoneChestTileEntity) {
		         return getStoneChestMaterial(p_228771_1_, STONE_CHEST_MATERIAL, STONE_CHEST_LEFT_MATERIAL, STONE_CHEST_RIGHT_MATERIAL);
		      }
			return null;
		   }

		private static Material getStoneChestMaterial(StoneChestType p_228772_0_, Material p_228772_1_, Material p_228772_2_, Material p_228772_3_) {
		      switch(p_228772_0_) {
		      case LEFT:
		         return p_228772_2_;
		      case RIGHT:
		         return p_228772_3_;
		      case SINGLE:
		      default:
		         return p_228772_1_;
		      }
		   }
	
}
