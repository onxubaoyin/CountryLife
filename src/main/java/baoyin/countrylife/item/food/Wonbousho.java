package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Wonbousho extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(4)
            .hunger(5)
            .build();

    public Wonbousho() {
        super(new Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
