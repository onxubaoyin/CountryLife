package baoyin.countrylife.item;

import baoyin.countrylife.Utils;
import baoyin.countrylife.block.BlockLoader;
import baoyin.countrylife.creative.ModGroup;
import baoyin.countrylife.item.fi.Soe;
import baoyin.countrylife.item.fi.You;
import baoyin.countrylife.item.food.*;
import baoyin.countrylife.item.omocha.Danjuu;
import baoyin.countrylife.item.omocha.LyengJuu;
import baoyin.countrylife.item.seed.PaBoushoZee;
import baoyin.countrylife.item.seed.PalouuZee;
import baoyin.countrylife.item.seed.RiceSeeds;
import baoyin.countrylife.item.seed.WonBoushoZee;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemLoader
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> danJuu = ITEMS.register("danjuu", Danjuu::new);
    public static final RegistryObject<Item> yeWanFan = ITEMS.register("ye_wan_fan", YeWanFan::new);
    public static final RegistryObject<Item> riceSeeds = ITEMS.register("rice_seeds", RiceSeeds::new);
    public static final RegistryObject<Item> mouCheng = ITEMS.register("moucheng", Moucheng::new);
    public static final RegistryObject<Item> paLouu = ITEMS.register("palouu", PaLouu::new);
    public static final RegistryObject<Item> palouuZee = ITEMS.register("palouu_zee", PalouuZee::new);
    public static final RegistryObject<Item> paboushoZee = ITEMS.register("pabousho_zee", PaBoushoZee::new);
    public static final RegistryObject<Item> wonboushoZee = ITEMS.register("wonbousho_zee", WonBoushoZee::new);
    public static final RegistryObject<Item> soe = ITEMS.register("soe", Soe::new);
    public static final RegistryObject<Item> you = ITEMS.register("you", You::new);
    public static final RegistryObject<Item> wonbousho = ITEMS.register("wonbousho", Wonbousho::new);
    public static final RegistryObject<Item> soWonbousho = ITEMS.register("so_wonbousho", SoWonbousho::new);
    public static final RegistryObject<Item> pabousho = ITEMS.register("pabousho", Pabousho::new);
    public static final RegistryObject<Item> soPabousho = ITEMS.register("so_pabousho", SoPabousho::new);
    public static final RegistryObject<Item> soewai = ITEMS.register("soewai", () -> new BlockItem(BlockLoader.soewai.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> lyengJuu = ITEMS.register("lyengjuu", LyengJuu::new);
    public static final RegistryObject<Item> sanEYo = ITEMS.register("san_e_yo", SanEYo::new);
    public static final RegistryObject<Item> soEYo = ITEMS.register("so_e_yo", SoEYo::new);
    public static final RegistryObject<Item> sanNgoYo = ITEMS.register("san_ngo_yo", SanNgoYo::new);
    public static final RegistryObject<Item> soNgoYo = ITEMS.register("so_ngo_yo", SoNgoYo::new);
    public static final RegistryObject<Item> sanYagoYo = ITEMS.register("san_yago_yo", SanYagoYo::new);
    public static final RegistryObject<Item> soYagoYo = ITEMS.register("so_yago_yo", SoYagoYo::new);
    public static final RegistryObject<Item> sanMoutoein = ITEMS.register("san_moutoein_yo", SanMoutoein::new);
    public static final RegistryObject<Item> soMoutoein = ITEMS.register("so_moutoein_yo", SoMoutoein::new);
    public static final RegistryObject<Item> sanInYo = ITEMS.register("san_in_yo", SanInYo::new);
    public static final RegistryObject<Item> soInYo = ITEMS.register("so_in_yo", SoInYo::new);
    public static final RegistryObject<Item> sanGemaYo = ITEMS.register("san_gema_yo", SanGema::new);
    public static final RegistryObject<Item> soGemaYo = ITEMS.register("so_gema_yo", SoGema::new);
    public static final RegistryObject<Item> sanTugemaYo = ITEMS.register("san_tugema_yo", SanTugema::new);
    public static final RegistryObject<Item> soTugemaYo = ITEMS.register("so_tugema_yo", SoTugema::new);
    public static final RegistryObject<Item> sanTsongemaYo = ITEMS.register("san_tsongema_yo", SanTsongema::new);
    public static final RegistryObject<Item> soTsongemaYo = ITEMS.register("so_tsongema_yo", SoTsongema::new);
    public static final RegistryObject<Item> sanSagemaYo = ITEMS.register("san_sagema_yo", SanSagema::new);
    public static final RegistryObject<Item> soSagemaYo = ITEMS.register("so_sagema_yo", SoSagema::new);
    public static final RegistryObject<Item> sanSaYo = ITEMS.register("san_sa_yo", SanSa::new);
    public static final RegistryObject<Item> soSaYo = ITEMS.register("so_sa_yo", SoSa::new);
    public static final RegistryObject<Item> sanLingYo = ITEMS.register("san_ling_yo", SanLing::new);
    public static final RegistryObject<Item> soLingYo = ITEMS.register("so_ling_yo", SoLing::new);
    public static final RegistryObject<Item> sanYaduuYo = ITEMS.register("san_yaduu_yo", SanYaduuYo::new);
    public static final RegistryObject<Item> soYaduuYo = ITEMS.register("so_yaduu_yo", SoYaduuYo::new);
}
