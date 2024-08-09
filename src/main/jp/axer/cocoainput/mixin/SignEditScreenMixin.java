package jp.axer.cocoainput.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import jp.axer.cocoainput.wrapper.SignEditScreenWrapper;
import net.minecraft.client.gui.screens.inventory.SignEditScreen;

@Mixin(SignEditScreen.class)
public class SignEditScreenMixin {
	 @Unique
	 SignEditScreenWrapper wrapper;
	 
	 @Inject(method="<init>",at=@At("TAIL"))
	 private void init(CallbackInfo ci) {
		 wrapper = new SignEditScreenWrapper((SignEditScreen)(Object)this);
	 }

	 /*
	 @Redirect(method="tick",at = @At(value="FIELD", target="Lnet/minecraft/client/gui/screens/inventory/SignEditScreen;frame:I",opcode=Opcodes.PUTFIELD))
	 private void injectCurosr(SignEditScreen esc,int n) {
		 esc.frame=wrapper.renewCursorCounter();
	 }
	 */
}

