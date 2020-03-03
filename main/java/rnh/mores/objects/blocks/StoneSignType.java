package rnh.mores.objects.blocks;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Set;
import java.util.stream.Stream;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class StoneSignType {
   private static final Set<StoneSignType> VALUES = new ObjectArraySet<>();
   public static final StoneSignType STONE = register(new StoneSignType("stone"));
   public static final StoneSignType COBBLESTONE = register(new StoneSignType("cobblestone"));
   private final String name;

   protected StoneSignType(String nameIn) {
      this.name = nameIn;
   }

   private static StoneSignType register(StoneSignType stoneTypeIn) {
      VALUES.add(stoneTypeIn);
      return stoneTypeIn;
   }

   @OnlyIn(Dist.CLIENT)
   public static Stream<StoneSignType> getValues() {
      return VALUES.stream();
   }

   @OnlyIn(Dist.CLIENT)
   public String getName() {
      return this.name;
   }
}