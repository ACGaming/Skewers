package mod.acgaming.skewers;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SkewersRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Skewers.MOD_ID);

    // RAW SKEWERS
    public static final RegistryObject<Item> SKEWER_BEEF_RAW = ITEMS.register("skewer_beef_raw", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).meat().build())));
    public static final RegistryObject<Item> SKEWER_PORKCHOP_RAW = ITEMS.register("skewer_porkchop_raw", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).meat().build())));
    public static final RegistryObject<Item> SKEWER_COD_RAW = ITEMS.register("skewer_cod_raw", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> SKEWER_SALMON_RAW = ITEMS.register("skewer_salmon_raw", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> SKEWER_VEGGIE_RAW = ITEMS.register("skewer_veggie_raw", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).build())));
    public static final RegistryObject<Item> SKEWER_CHICKEN_RAW = ITEMS.register("skewer_chicken_raw", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().build())));
    public static final RegistryObject<Item> SKEWER_RABBIT_RAW = ITEMS.register("skewer_rabbit_raw", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.3f).meat().build())));
    public static final RegistryObject<Item> SKEWER_MUTTON_RAW = ITEMS.register("skewer_mutton_raw", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).meat().build())));

    // COOKED SKEWERS
    public static final RegistryObject<Item> SKEWER_BEEF_COOKED = ITEMS.register("skewer_beef_cooked", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(16).saturationMod(0.8f).meat().build())));
    public static final RegistryObject<Item> SKEWER_PORKCHOP_COOKED = ITEMS.register("skewer_porkchop_cooked", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(16).saturationMod(0.8f).meat().build())));
    public static final RegistryObject<Item> SKEWER_COD_COOKED = ITEMS.register("skewer_cod_cooked", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> SKEWER_SALMON_COOKED = ITEMS.register("skewer_salmon_cooked", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(12).saturationMod(0.8f).build())));
    public static final RegistryObject<Item> SKEWER_VEGGIE_COOKED = ITEMS.register("skewer_veggie_cooked", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> SKEWER_CHICKEN_COOKED = ITEMS.register("skewer_chicken_cooked", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(12).saturationMod(0.6f).meat().build())));
    public static final RegistryObject<Item> SKEWER_RABBIT_COOKED = ITEMS.register("skewer_rabbit_cooked", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.6f).meat().build())));
    public static final RegistryObject<Item> SKEWER_MUTTON_COOKED = ITEMS.register("skewer_mutton_cooked", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(12).saturationMod(0.8f).meat().build())));

    // OTHER
    public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", () -> new Item(new Item.Properties().tab(Skewers.TAB)));
    public static final RegistryObject<Item> SKEWER_CARAMEL_APPLE = ITEMS.register("skewer_caramel_apple", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> SKEWER_COOKIE = ITEMS.register("skewer_cookie", () -> new Item(new Item.Properties().tab(Skewers.TAB)
        .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.2f).build())));
}