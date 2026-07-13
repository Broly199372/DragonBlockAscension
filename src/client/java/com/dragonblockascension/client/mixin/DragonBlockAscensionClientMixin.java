package com.dragonblockascension.client.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Object.class)
public class DragonBlockAscensionClientMixin {
	@Inject(at = @At("HEAD"), method = "toString")
	private void init(CallbackInfo info) {
		// Placeholder client mixin.
	}
}