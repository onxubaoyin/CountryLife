package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pabousho extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(3)
            .hunger(4)
            .build();

    public Pabousho() {
        super(new Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
