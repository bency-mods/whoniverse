package net.bency.whoniverse;

import net.bency.whoniverse.block.ModBlocks;
import net.bency.whoniverse.item.ModItemGroups;
import net.bency.whoniverse.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Whoniverse implements ModInitializer {
	public static String MOD_ID = "whoniverse";
	public static final Logger LOGGER = LoggerFactory.getLogger("whoniverse");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Whoniverse");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}