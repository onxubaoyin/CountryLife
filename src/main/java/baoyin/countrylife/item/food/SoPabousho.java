package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class SoPabousho extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(7)
            .hunger(8)
            .build();

    public SoPabousho() {
        super(new Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
