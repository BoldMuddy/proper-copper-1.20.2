package net.muddy.propercopper;

import net.fabricmc.api.ModInitializer;

import net.muddy.propercopper.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProperCopper implements ModInitializer {

	public static final String MOD_ID = "proper_copper";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItemGroups.registerItemGroups();
	}
}