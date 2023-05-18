package gun.more.lifes30daytrial.blocks;

import gun.more.lifes30daytrial.MoreGun;
import gun.more.lifes30daytrial.items.MoreGunItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class MoreGunBlocks {
    public static final Block SENTRY_BASE = registerBlock("sentry_base", new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), MoreGunItemGroup.MOREGUN);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(MoreGun.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MoreGun.ID, name), new BlockItem(block, new FabricItemSettings()));
        // registers item with the given parameters
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        // adds item to ItemGroup
        return item;
    }

    public static void registerBlocks() {
        MoreGun.LOGGER.info("Registering blocks...");
    }

}

