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
        simpleBlock(modblocks.SILVER_BLOCK.get());
        simpleBlock(modblocks.SILVER_ORE.get());
    }
    
}
