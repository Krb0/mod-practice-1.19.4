package net.practice.mod;

import net.fabricmc.api.ModInitializer;

import net.practice.mod.Item.ModItemGroup;
import net.practice.mod.Item.ModItems;
import net.practice.mod.block.ModBlocks;
import net.practice.mod.block.ModBlocksController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PracticeMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "practice-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("practice-mod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}