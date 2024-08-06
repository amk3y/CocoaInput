package jp.axer.cocoainput.plugin;

import net.minecraft.client.gui.screens.Screen;

public interface CocoaInputController {
    jp.axer.cocoainput.plugin.IMEOperator generateIMEOperator(jp.axer.cocoainput.plugin.IMEReceiver ime);
    //GuiTextFieldとかが作成された時に割り当てるIMEOperator生成処理を委託
    void screenOpenNotify(Screen sc);
}
