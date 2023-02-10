package com.ancientstudio.forfeitednature;

import com.ancientstudio.forfeitednature.block.ModBlocks;
import com.ancientstudio.forfeitednature.item.ModItemGroup;
import com.ancientstudio.forfeitednature.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForfeitedNature implements ModInitializer {
	public static final String MOD_ID = "forfeitednature";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}