package baoyin.countrylife.block;

import baoyin.countrylife.Utils;
import baoyin.countrylife.block.fi.Soewai;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockLoader
{
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
        public static final RegistryObject<Block> soewai = BLOCKS.register("soewai", Soewai::new);
}
