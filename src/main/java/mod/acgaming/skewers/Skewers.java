package mod.acgaming.skewers;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("skewers")
public class Skewers
{
    public static final String MOD_ID = "skewers";
    public static final CreativeModeTab TAB = new CreativeModeTab(MOD_ID)
    {
        @Override
        public ItemStack makeIcon()
        {
            return SkewersRegistry.SKEWER_BEEF_COOKED.get().getDefaultInstance();
        }
    };

    public Skewers()
    {
        final var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        SkewersRegistry.ITEMS.register(eventBus);
    }
}