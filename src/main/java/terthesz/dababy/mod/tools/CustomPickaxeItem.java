package terthesz.dababy.mod.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class CustomPickaxeItem extends AxeItem {
  public CustomPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
      super(material, attackDamage, attackSpeed, settings);
  }
}