package baoyin.countrylife.item.food;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SanSa extends Item
{
    private static final Food FOOD = (new Food.Builder())
            .saturation(0)
            .hunger(1)
            .effect(() -> new EffectInstance(Effects.POISON, 1200, 1), 1)
            .effect(() -> new EffectInstance(Effects.NAUSEA, 1200, 1), 1)
            .effect(() -> new EffectInstance(Effects.HUNGER, 1200, 1), 1)
            .effect(() -> new EffectInstance(Effects.WEAKNESS, 1200, 1), 1)
            .effect(() -> new EffectInstance(Effects.WITHER, 1200, 1), 1)
            .effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE, 1200, 1), 1)
            .effect(() -> new EffectInstance(Effects.BLINDNESS, 1200, 1), 1)
            .build();

    public SanSa() {
        super(new Item.Properties().food(FOOD).group(ModGroup.ITEM_GROUP));
    }
}
