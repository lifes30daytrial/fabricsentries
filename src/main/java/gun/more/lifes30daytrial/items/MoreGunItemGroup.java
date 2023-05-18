package gun.more.lifes30daytrial.items;

import gun.more.lifes30daytrial.MoreGun;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoreGunItemGroup {
    public static ItemGroup MOREGUN;

    public static void registerItemGroups() {
        MOREGUN = FabricItemGroup.builder(new Identifier(MoreGun.ID, "moregun"))
                .displayName(Text.translatable("itemgroup.moregun"))
                .icon(() -> new ItemStack(MoreGunItems.BULLET_9MM)).build();
    }
}
