package net.etherealmc.dimensionmod;

import net.etherealmc.dimensionmod.block.ModBlocks;
import net.etherealmc.dimensionmod.item.ModItemGroups;
import net.etherealmc.dimensionmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DimensionMod implements ModInitializer {
	public static final String MOD_ID = "dimensionmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModItems.registerModItems();
	}
}