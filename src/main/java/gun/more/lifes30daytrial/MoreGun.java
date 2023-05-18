package gun.more.lifes30daytrial;

import gun.more.lifes30daytrial.blocks.MoreGunBlocks;
import gun.more.lifes30daytrial.items.MoreGunItemGroup;
import gun.more.lifes30daytrial.items.MoreGunItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreGun implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String ID = "moregun";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("Hello Fabric world!");
		MoreGunItemGroup.registerItemGroups();
		MoreGunItems.registerItems();
		MoreGunBlocks.registerBlocks();

	}
}
