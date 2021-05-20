package myxej.data.client;

import myxej.garduite;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class modItemModleProvider extends ItemModelProvider{

    public modItemModleProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, garduite.MODID, existingFileHelper);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void registerModels() {
        // SILVER
        withExistingParent("silver_block", modLoc("block/silver_block"));
        withExistingParent("silver_ore", modLoc("block/silver_ore"));
        // COPPER
        withExistingParent("copper_block", modLoc("block/copper_block"));
        withExistingParent("copper_ore", modLoc("block/copper_ore"));

        ModelFile itemsGenerated = getExistingFile(mcLoc("item/generated"));
        builder(itemsGenerated, "silver_ingot");
        builder(itemsGenerated, "silver_ore_chunk");
        builder(itemsGenerated, "iron_ore_chunk");
        builder(itemsGenerated, "copper_ingot");
        builder(itemsGenerated, "copper_ore_chunk");
    }
    
    private ItemModelBuilder builder(ModelFile modelfile, String name)
    {
        return getBuilder(name).parent(modelfile).texture("layer0", "item/" + name);
    }

}
