package myxej.data.client;

import myxej.garduite;
import myxej.modTags;
import myxej.moditems;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class modItemTagProvider extends ItemTagsProvider{

    public modItemTagProvider(DataGenerator dataGenInput, BlockTagsProvider blockTag, ExistingFileHelper existingFileHelper) {
        super(dataGenInput, blockTag, garduite.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        // SILVER BLOCKS
        copy(modTags.Blocks.ORES_SILVER, modTags.Items.ORES_SILVER);
        copy(Tags.Blocks.ORES, modTags.Items.ORES_SILVER);
        copy(modTags.Blocks.STORAGE_BLOCKS_SILVER, modTags.Items.STORAGE_BLOCKS_SILVER);
        copy(Tags.Blocks.STORAGE_BLOCKS, modTags.Items.STORAGE_BLOCKS_SILVER);

        // COPPER BLOCKS
        copy(modTags.Blocks.ORES_COPPER, modTags.Items.ORES_COPPER);
        copy(Tags.Blocks.ORES, modTags.Items.ORES_COPPER);
        copy(modTags.Blocks.STORAGE_BLOCKS_COPPER, modTags.Items.STORAGE_BLOCKS_COPPER);
        copy(Tags.Blocks.STORAGE_BLOCKS, modTags.Items.STORAGE_BLOCKS_COPPER);

        // INGOTS
        tag(modTags.Items.INGOT_SILVER).add(moditems.SILVER_INGOT.get());
        tag(Tags.Items.INGOTS).addTag(modTags.Items.INGOT_SILVER);
        tag(modTags.Items.INGOT_COPPER).add(moditems.COPPER_INGOT.get());
        tag(Tags.Items.INGOTS).addTag(modTags.Items.INGOT_COPPER);

        // ORE CHUNKS
        tag(modTags.Items.ORECHUNK_SILVER).add(moditems.SILVER_ORE_CHUNK.get());
        tag(modTags.Items.ORECHUNK_IRON).add(moditems.IRON_ORE_CHUNK.get());
        tag(modTags.Items.ORECHUNK_COPPER).add(moditems.COPPER_ORE_CHUNK.get());

    }
    
}
