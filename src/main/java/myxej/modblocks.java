package myxej;

import com.google.common.base.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class modblocks {
    
    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore", () ->
        new Block(AbstractBlock.Properties
        .of(Material.STONE)
        .harvestLevel(2)
        .sound(SoundType.STONE)
        .strength(3, 10))
    );

    public static final RegistryObject<Block> SILVER_BLOCK = register("silver_block", () ->
        new Block(AbstractBlock.Properties
        .of(Material.METAL)
        .harvestLevel(2)
        .sound(SoundType.METAL)
        .strength(3, 10))
    );

        
    public static void register(){};

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block)
    {
        return registries.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject <T> ret = registerNoItem(name, block);
        registries.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return ret;
    }

}
