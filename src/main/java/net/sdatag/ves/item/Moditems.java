package net.sdatag.ves.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sdatag.ves.Main;

 //The Moditems class is responsible for registering and creating item objects for the mod.
public class Moditems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> sample = ITEMS.register("sample",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> thing = ITEMS.register("thing",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
