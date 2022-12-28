package baoyin.countrylife.creative;

import baoyin.countrylife.item.ItemLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CountryLifeGroup extends ItemGroup
{
    public CountryLifeGroup() {
        super("countrylife");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemLoader.yeWanFan.get());
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }

    @Override
    public int getSearchbarWidth()
    {
        return 45;
    }

    @Override
    public String getBackgroundImageName()
    {
        return "countrylife.png";
    }
}
