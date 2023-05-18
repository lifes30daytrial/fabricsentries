package gun.more.lifes30daytrial.items;

import gun.more.lifes30daytrial.MoreGun;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MoreGunItems {
    public static final Item BULLET_9MM = registerItem("bullet_9mm", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MoreGun.ID, name), item);
    }

    private static void addAllToItemGroup() {
        addToItemGroup(BULLET_9MM, MoreGunItemGroup.MOREGUN);
    }

    private static void addToItemGroup(Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerItems() {
        MoreGun.LOGGER.info("Registering mod items for mod " + MoreGun.ID + "...");
        addAllToItemGroup();
    }
}
