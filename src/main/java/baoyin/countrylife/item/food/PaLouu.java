package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class PaLouu extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(3)
            .hunger(3)
            .build();

    public PaLouu() {
        super(new Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
