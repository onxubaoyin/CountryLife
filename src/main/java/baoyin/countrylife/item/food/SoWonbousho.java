package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class SoWonbousho extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(6)
            .hunger(7)
            .build();

    public SoWonbousho() {
        super(new Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
