package com.ancientstudio.forfaitednature;

import com.ancientstudio.forfaitednature.block.ModBlocks;
import com.ancientstudio.forfaitednature.item.ModItemGroup;
import com.ancientstudio.forfaitednature.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForfaitedNature implements ModInitializer {
	public static final String MOD_ID = "forfaitednature";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}