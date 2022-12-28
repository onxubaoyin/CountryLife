package baoyin.countrylife.item.fi;

import baoyin.countrylife.creative.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Soe extends Item
{
    public Soe() {
        super(new Properties().group(ModGroup.ITEM_GROUP));
    }

    @Override
    public int getBurnTime(ItemStack itemStack)
    {
        return 10000;
    }
}
