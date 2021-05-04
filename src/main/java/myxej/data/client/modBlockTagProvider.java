package myxej.data.client;

import myxej.garduite;
import myxej.modTags;
import myxej.modblocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class modBlockTagProvider extends BlockTagsProvider{

    public modBlockTagProvider(DataGenerator dataGenInput, ExistingFileHelper existingFileHelper) {
        super(dataGenInput, garduite.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(modTags.Blocks.ORES_SILVER).add(modblocks.SILVER_ORE.get());
        tag(Tags.Blocks.ORES).addTag(modTags.Blocks.ORES_SILVER);
        tag(modTags.Blocks.STORAGE_BLOCKS_SILVER).add(modblocks.SILVER_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(modTags.Blocks.STORAGE_BLOCKS_SILVER);
    }

}
