package myxej;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class moditems {
    
    // SILVER
    public static final RegistryObject<Item> SILVER_INGOT = registries.ITEMS.register("silver_ingot", () -> 
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );

    public static final RegistryObject<Item> SILVER_ORE_CHUNK = registries.ITEMS.register("silver_ore_chunk", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );

    // IRON
    public static final RegistryObject<Item> IRON_ORE_CHUNK = registries.ITEMS.register("iron_ore_chunk", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );

    // COPPER 
    public static final RegistryObject<Item> COPPER_INGOT = registries.ITEMS.register("copper_ingot", () -> 
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );

    public static final RegistryObject<Item> COPPER_ORE_CHUNK = registries.ITEMS.register("copper_ore_chunk", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );

    // LEAD
    public static final RegistryObject<Item> LEAD_INGOT = registries.ITEMS.register("lead_ingot", () -> 
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );

    public static final RegistryObject<Item> LEAD_ORE_CHUNK = registries.ITEMS.register("lead_ore_chunk", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS))
    );


    public static void register() {}

}
