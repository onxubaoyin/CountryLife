package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class YeWanFan extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(7)
            .hunger(6)
            .build();

    public YeWanFan() {
        super(new Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
