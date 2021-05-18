package myxej.data;

import myxej.garduite;
import myxej.data.client.modBlockStateProvider;
import myxej.data.client.modBlockTagProvider;
import myxej.data.client.modItemModleProvider;
import myxej.data.client.modItemTagProvider;
import myxej.data.client.modLootTableProvider;
import myxej.data.client.modRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(modid = garduite.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class datagenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        
        gen.addProvider(new modBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new modItemModleProvider(gen, existingFileHelper));

        modBlockTagProvider blockTags = new modBlockTagProvider(gen, existingFileHelper);
        gen.addProvider(blockTags);
        gen.addProvider(new modItemTagProvider(gen, blockTags, existingFileHelper));

        gen.addProvider(new modLootTableProvider(gen));
        gen.addProvider(new modRecipeProvider(gen));

    }
}
