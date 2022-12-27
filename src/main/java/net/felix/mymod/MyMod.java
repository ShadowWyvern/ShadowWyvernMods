package net.felix.mymod;

import net.fabricmc.api.ModInitializer;
import net.felix.mymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMod implements ModInitializer {

	public static final String MOD_ID = "mymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
