package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SoTugema extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(5)
            .hunger(5)
            .effect(() -> new EffectInstance(Effects.POISON, 1200, 1), 1)
            .effect(() -> new EffectInstance(Effects.NAUSEA, 1200, 1), 1)
            .effect(() -> new EffectInstance(Effects.HUNGER, 1200, 1), 1)
            .build();

    public SoTugema() {
        super(new Item.Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
