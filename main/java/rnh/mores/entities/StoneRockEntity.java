package rnh.mores.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.entity.projectile.SnowballEntity;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import rnh.mores.init.EntityInit;
import rnh.mores.init.ItemInit;

public class StoneRockEntity extends ProjectileItemEntity{

	 public StoneRockEntity(EntityType<? extends SnowballEntity> entity, World world) {
	      super(entity, world);
	   }

	 public StoneRockEntity(World worldIn, LivingEntity throwerIn) {
	      super(EntityInit.STONE_ROCK_ENTITY, throwerIn, worldIn);
	   }

	 public StoneRockEntity(World worldIn, double x, double y, double z) {
	      super(EntityInit.STONE_ROCK_ENTITY, x, y, z, worldIn);
	   }

	 protected Item getDefaultItem() {
	      return ItemInit.stone_rock_normal_item;
	   }
	 
	@Override
	protected void onImpact(RayTraceResult result) {
		if (result.getType() == RayTraceResult.Type.ENTITY) {
	         Entity entity = ((EntityRayTraceResult)result).getEntity();	        
	         entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 4);
		this.entityDropItem(new ItemStack(ItemInit.stone_rock_normal_item));
	      } else if (result.getType() == RayTraceResult.Type.BLOCK) {
			//Check for glass...break glass
			//this.world.playSound(null, this.getPosition(), SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.HOSTILE, 1, 1);
			this.entityDropItem(new ItemStack(ItemInit.stone_rock_normal_item));	
			
			//Check for other blocks...play sound
		}

	      if (!this.world.isRemote) {
	         this.world.setEntityState(this, (byte)3);
	         this.remove();
	      }		
	}
	
	
}
