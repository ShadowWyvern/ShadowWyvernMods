package net.felix.mymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.felix.mymod.MyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_ENDERITE =  registeritem("raw_enderite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ENDERITE_INGOT =  registeritem("enderite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registeritem(String name, Item item) {
     return Registry.register(Registry.ITEM, new Identifier(MyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MyMod.LOGGER.debug("Registering Mod Items for " + MyMod.MOD_ID);
    }
}
