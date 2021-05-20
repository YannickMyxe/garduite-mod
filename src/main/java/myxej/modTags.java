package myxej;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class modTags {
    public static final class Blocks
    {
        // SILVER
        public static final ITag.INamedTag<Block> ORES_SILVER = forge("ores/silver");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_SILVER = forge("storage_blocks/silver");

        // COPPER
        public static final ITag.INamedTag<Block> ORES_COPPER = forge("ores/copper");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_COPPER = forge("storage_blocks/copper");

        // LEAD
        public static final ITag.INamedTag<Block> ORES_LEAD = forge("ores/lead");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_LEAD = forge("storage_blocks/lead");

        // CUSTOM FUNCTIONS
        public static final ITag.INamedTag<Block> forge(String path)
        {
            return BlockTags.createOptional(new ResourceLocation("forge", path));
        }
        public static final ITag.INamedTag<Block> mod(String path)
        {
            return BlockTags.createOptional(new ResourceLocation(garduite.MODID, path));
        }
    }

    public static final class Items
    {
        // SILVER
        public static final ITag.INamedTag<Item> ORES_SILVER = forge("ores/silver");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_SILVER = forge("storage_blocks/silver");
        public static final ITag.INamedTag<Item> INGOT_SILVER = forge("ingots/silver");
        public static final ITag.INamedTag<Item> ORECHUNK_SILVER = mod("orechunk/silver");

        // IRON
        public static final ITag.INamedTag<Item> ORECHUNK_IRON = mod("orechunk/iron");

        // COPPER
        public static final ITag.INamedTag<Item> ORES_COPPER = forge("ores/copper");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_COPPER = forge("storage_blocks/copper");
        public static final ITag.INamedTag<Item> INGOT_COPPER = forge("ingots/copper");
        public static final ITag.INamedTag<Item> ORECHUNK_COPPER = mod("orechunk/copper");

        // LEAD
        public static final ITag.INamedTag<Item> ORES_LEAD = forge("ores/lead");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_LEAD = forge("storage_blocks/lead");
        public static final ITag.INamedTag<Item> INGOT_LEAD = forge("ingots/lead");
        public static final ITag.INamedTag<Item> ORECHUNK_LEAD = mod("orechunk/lead");


        //  Custom functions
        public static final ITag.INamedTag<Item> forge(String path)
        {
            return ItemTags.createOptional(new ResourceLocation("forge", path));
        }
        public static final ITag.INamedTag<Item> mod(String path)
        {
            return ItemTags.createOptional(new ResourceLocation(garduite.MODID, path));
        }
    }
}
