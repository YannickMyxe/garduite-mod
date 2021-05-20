package myxej.data.client;

import java.util.Map;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import myxej.modblocks;
import myxej.moditems;
import myxej.registries;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class modLootTableProvider extends LootTableProvider{

    public modLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
            Pair.of(ModBlockLootTable::new, LootParameterSets.BLOCK)
        );
     }
    
     protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validate(validationtracker, p_218436_2_, p_218436_3_));
     }


     public static class ModBlockLootTable extends BlockLootTables
     {
        @Override
        protected void addTables() {
            dropSelf(modblocks.SILVER_BLOCK.get());
            this.add(modblocks.SILVER_ORE.get(), (ModBlockLootTable) -> {
                return createOreDrop(ModBlockLootTable, moditems.SILVER_ORE_CHUNK.get());
             });
            
            dropSelf(modblocks.COPPER_BLOCK.get());
            this.add(modblocks.COPPER_ORE.get(), (ModBlockLootTable) -> {
                 return createOreDrop(ModBlockLootTable, moditems.COPPER_ORE_CHUNK.get());
              });
        }
        
        @Override
        protected Iterable<Block> getKnownBlocks() {
            return registries.BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }

    }

}
