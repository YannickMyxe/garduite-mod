package myxej;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class moditems {
    public static final RegistryObject<Item> SILVER_INGOT = registries.ITEMS.register("silver_ingot", () -> 
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );

    public static final RegistryObject<Item> SILVER_ORE_CHUNK = registries.ITEMS.register("silver_ore_chunk", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );

    public static final RegistryObject<Item> IRON_ORE_CHUNK = registries.ITEMS.register("iron_ore_chunk", () ->
    new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
);

    public static void register() {}

}
