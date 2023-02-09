package com.ancientmodders.forfaitednature.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ForfaitedNature {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		com.ancientmodders.forfaitednature.ForfaitedNature.LOGGER.info("This line is printed by an forfaited nature mod mixin!");
	}
}
