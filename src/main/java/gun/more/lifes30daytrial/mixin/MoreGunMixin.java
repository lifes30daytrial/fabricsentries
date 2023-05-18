package gun.more.lifes30daytrial.mixin;

import gun.more.lifes30daytrial.MoreGun;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MoreGunMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		MoreGun.LOGGER.info("This line is printed by the " + MoreGun.ID + " mod mixin!");
	}
}
