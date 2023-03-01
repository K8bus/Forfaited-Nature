package com.ancientstudio.forfeitednature.data;

import com.ancientstudio.forfeitednature.block.ModBlocks;
import com.ancientstudio.forfeitednature.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MAGNESIUM_BLOCK);
        addDrop(ModBlocks.RAW_MAGNESIUM_BLOCK);

        oreDrops(ModBlocks.MAGNESIUM_ORE, ModItems.RAW_MAGNESIUM);
        oreDrops(ModBlocks.DEEPSLATE_MAGNESIUM_ORE, ModItems.RAW_MAGNESIUM);
        oreDrops(ModBlocks.DEEPSLATE_MAGNESIUM_ORE, ModItems.RAW_MAGNESIUM_NUGGET);
    }
}
