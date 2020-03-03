package rnh.mores.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.DyeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import rnh.mores.objects.blocks.tileentity.StoneSignTileEntity;

public class AbstractModSignBlock extends ContainerBlock implements IWaterLoggable {
	   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	   protected static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
	   private final StoneSignType stoneType;

	   protected AbstractModSignBlock(Block.Properties propertiesIn, StoneSignType stoneTypeIn) {
	      super(propertiesIn);
	      this.stoneType = stoneTypeIn;
	   }

	   /**
	    * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
	    * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
	    * returns its solidified counterpart.
	    * Note that this method should ideally consider only the specific face passed in.
	    */
	   public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
	      if (stateIn.get(WATERLOGGED)) {
	         worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
	      }

	      return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	   }

	   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	      return SHAPE;
	   }

	   /**
	    * Return true if an entity can be spawned inside the block (used to get the player's bed spawn location)
	    */
	   public boolean canSpawnInBlock() {
	      return true;
	   }

	   public TileEntity createNewTileEntity(IBlockReader worldIn) {
	      return new StoneSignTileEntity();
	   }

	   public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
	      ItemStack itemstack = player.getHeldItem(handIn);
	      boolean flag = itemstack.getItem() instanceof DyeItem && player.abilities.allowEdit;
	      if (worldIn.isRemote) {
	         return flag ? ActionResultType.SUCCESS : ActionResultType.CONSUME;
	      } else {
	         TileEntity tileentity = worldIn.getTileEntity(pos);
	         if (tileentity instanceof StoneSignTileEntity) {
	        	 StoneSignTileEntity signtileentity = (StoneSignTileEntity)tileentity;
	            if (flag) {
	               boolean flag1 = signtileentity.setTextColor(((DyeItem)itemstack.getItem()).getDyeColor());
	               if (flag1 && !player.isCreative()) {
	                  itemstack.shrink(1);
	               }
	            }

	            return signtileentity.executeCommand(player) ? ActionResultType.SUCCESS : ActionResultType.PASS;
	         } else {
	            return ActionResultType.PASS;
	         }
	      }
	   }

	   public IFluidState getFluidState(BlockState state) {
	      return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
	   }

	   @OnlyIn(Dist.CLIENT)
	   public StoneSignType getStoneType() {
	      return this.stoneType;
	   }
}