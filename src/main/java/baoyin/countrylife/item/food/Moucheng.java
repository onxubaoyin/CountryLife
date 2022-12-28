package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Moucheng extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(1)
            .hunger(1)
            .build();

    public Moucheng() {
        super(new Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
