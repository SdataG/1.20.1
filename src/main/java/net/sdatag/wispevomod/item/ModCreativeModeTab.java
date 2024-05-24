package net.sdatag.wispevomod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sdatag.wispevomod.WispEvoMod;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WispEvoMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MY_CUSTOM_TAB = CREATIVE_MODE_TABS.register("my_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.sample.get()))
                    .title(Component.translatable("creative.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Moditems.sample.get());
                        pOutput.accept(Moditems.thing.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
