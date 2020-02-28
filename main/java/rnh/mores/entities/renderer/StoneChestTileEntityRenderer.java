package rnh.mores.entities.renderer;

import java.util.Calendar;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ChestBlock;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.model.Material;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.tileentity.DualBrightnessCallback;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.IChestLid;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMerger;
import net.minecraft.tileentity.TileEntityMerger.ICallbackWrapper;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import rnh.mores.init.BlockInit;
import rnh.mores.objects.blocks.AbstractModChestBlock;
import rnh.mores.objects.blocks.StoneChestBlock;
import rnh.mores.objects.blocks.StoneChestType;
import rnh.mores.objects.blocks.tileentity.StoneChestTileEntity;

public class StoneChestTileEntityRenderer <T extends TileEntity & IChestLid> extends TileEntityRenderer<T> {
	
	
	
	   private final ModelRenderer field_228862_a_;
	   private final ModelRenderer field_228863_c_;
	   private final ModelRenderer field_228864_d_;
	   private final ModelRenderer field_228865_e_;
	   private final ModelRenderer field_228866_f_;
	   private final ModelRenderer field_228867_g_;
	   private final ModelRenderer field_228868_h_;
	   private final ModelRenderer field_228869_i_;
	   private final ModelRenderer field_228870_j_;
	   
	   public StoneChestTileEntityRenderer(TileEntityRendererDispatcher p_i226008_1_) {
	      super(p_i226008_1_);
	      Calendar calendar = Calendar.getInstance();
	      if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
	      }

	      this.field_228863_c_ = new ModelRenderer(64, 64, 0, 19);
	      this.field_228863_c_.addBox(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F, 0.0F);
	      this.field_228862_a_ = new ModelRenderer(64, 64, 0, 0);
	      this.field_228862_a_.addBox(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F, 0.0F);
	      this.field_228862_a_.rotationPointY = 9.0F;
	      this.field_228862_a_.rotationPointZ = 1.0F;
	      this.field_228864_d_ = new ModelRenderer(64, 64, 0, 0);
	      this.field_228864_d_.addBox(7.0F, -1.0F, 15.0F, 2.0F, 4.0F, 1.0F, 0.0F);
	      this.field_228864_d_.rotationPointY = 8.0F;
	      this.field_228866_f_ = new ModelRenderer(64, 64, 0, 19);
	      this.field_228866_f_.addBox(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
	      this.field_228865_e_ = new ModelRenderer(64, 64, 0, 0);
	      this.field_228865_e_.addBox(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
	      this.field_228865_e_.rotationPointY = 9.0F;
	      this.field_228865_e_.rotationPointZ = 1.0F;
	      this.field_228867_g_ = new ModelRenderer(64, 64, 0, 0);
	      this.field_228867_g_.addBox(15.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
	      this.field_228867_g_.rotationPointY = 8.0F;
	      this.field_228869_i_ = new ModelRenderer(64, 64, 0, 19);
	      this.field_228869_i_.addBox(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
	      this.field_228868_h_ = new ModelRenderer(64, 64, 0, 0);
	      this.field_228868_h_.addBox(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
	      this.field_228868_h_.rotationPointY = 9.0F;
	      this.field_228868_h_.rotationPointZ = 1.0F;
	      this.field_228870_j_ = new ModelRenderer(64, 64, 0, 0);
	      this.field_228870_j_.addBox(0.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
	      this.field_228870_j_.rotationPointY = 8.0F;
	   }

	   @SuppressWarnings("rawtypes")
	   public void render(T tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
	      World world = tileEntityIn.getWorld();
	      boolean flag = world != null;
	      BlockState blockstate = flag ? tileEntityIn.getBlockState() : BlockInit.stone_chest_block.getDefaultState().with(StoneChestBlock.FACING, Direction.SOUTH);
	      StoneChestType chesttype = blockstate.has(StoneChestBlock.TYPE) ? blockstate.get(StoneChestBlock.TYPE) : StoneChestType.SINGLE;
	      Block block = blockstate.getBlock();
	      if (block instanceof AbstractModChestBlock) {
	         AbstractModChestBlock<?> AbstractModChestBlock = (AbstractModChestBlock)block;
	         boolean flag1 = chesttype != StoneChestType.SINGLE;
	         matrixStackIn.push();
	         float f = blockstate.get(ChestBlock.FACING).getHorizontalAngle();
	         matrixStackIn.translate(0.5D, 0.5D, 0.5D);
	         matrixStackIn.rotate(Vector3f.YP.rotationDegrees(-f));
	         matrixStackIn.translate(-0.5D, -0.5D, -0.5D);
	         ICallbackWrapper<? extends StoneChestTileEntity> icallbackwrapper;
	         if (flag) {
	            icallbackwrapper = AbstractModChestBlock.func_225536_a_(blockstate, world, tileEntityIn.getPos(), true);
	         } else {
	            icallbackwrapper = TileEntityMerger.ICallback::func_225537_b_;
	         }

	         float f1 = icallbackwrapper.apply(StoneChestBlock.func_226917_a_((IChestLid)tileEntityIn)).get(partialTicks);
	         f1 = 1.0F - f1;
	         f1 = 1.0F - f1 * f1 * f1;
	         int i = icallbackwrapper.apply(new DualBrightnessCallback<>()).applyAsInt(combinedLightIn);
	         Material material = this.getMaterial(tileEntityIn, chesttype);
	         IVertexBuilder ivertexbuilder = material.getBuffer(bufferIn, RenderType::getEntityCutout);
	         if (flag1) {
	            if (chesttype == StoneChestType.LEFT) {
	               this.func_228871_a_(matrixStackIn, ivertexbuilder, this.field_228868_h_, this.field_228870_j_, this.field_228869_i_, f1, i, combinedOverlayIn);
	            } else {
	               this.func_228871_a_(matrixStackIn, ivertexbuilder, this.field_228865_e_, this.field_228867_g_, this.field_228866_f_, f1, i, combinedOverlayIn);
	            }
	         } else {
	            this.func_228871_a_(matrixStackIn, ivertexbuilder, this.field_228862_a_, this.field_228864_d_, this.field_228863_c_, f1, i, combinedOverlayIn);
	         }

	         matrixStackIn.pop();
	      }
	   }

	   private void func_228871_a_(MatrixStack p_228871_1_, IVertexBuilder p_228871_2_, ModelRenderer p_228871_3_, ModelRenderer p_228871_4_, ModelRenderer p_228871_5_, float p_228871_6_, int p_228871_7_, int p_228871_8_) {
	      p_228871_3_.rotateAngleX = -(p_228871_6_ * ((float)Math.PI / 2F));
	      p_228871_4_.rotateAngleX = p_228871_3_.rotateAngleX;
	      p_228871_3_.render(p_228871_1_, p_228871_2_, p_228871_7_, p_228871_8_);
	      p_228871_4_.render(p_228871_1_, p_228871_2_, p_228871_7_, p_228871_8_);
	      p_228871_5_.render(p_228871_1_, p_228871_2_, p_228871_7_, p_228871_8_);
	   }

	   protected Material getMaterial(T tileEntity, StoneChestType chestType) {
	      return ModAtlases.getStoneChestMaterial(tileEntity, chestType);
	   }
	}