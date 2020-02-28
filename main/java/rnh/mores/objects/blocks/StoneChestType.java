package rnh.mores.objects.blocks;

import net.minecraft.util.IStringSerializable;

public enum StoneChestType implements IStringSerializable {
	   SINGLE("single", 0),
	   LEFT("left", 2),
	   RIGHT("right", 1);

	   public static final StoneChestType[] VALUES = values();
	   private final String name;
	   private final int opposite;

	   private StoneChestType(String name, int oppositeIn) {
	      this.name = name;
	      this.opposite = oppositeIn;
	   }

	   public String getName() {
	      return this.name;
	   }

	   public StoneChestType opposite() {
	      return VALUES[this.opposite];
	   }
	}