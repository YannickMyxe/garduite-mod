package myxej.data.client;

import myxej.garduite;
import myxej.modblocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class modBlockStateProvider extends BlockStateProvider{

    public modBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, garduite.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // SILVER
        simpleBlock(modblocks.SILVER_BLOCK.get());
        simpleBlock(modblocks.SILVER_ORE.get());

        // COPPER
        simpleBlock(modblocks.COPPER_BLOCK.get());
        simpleBlock(modblocks.COPPER_ORE.get());

        // LEAD
        simpleBlock(modblocks.LEAD_BLOCK.get());
        simpleBlock(modblocks.LEAD_ORE.get());
    }
    
}
