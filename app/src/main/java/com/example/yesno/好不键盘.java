package com.example.yesno;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.LinearLayout;

public class 好不键盘 extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

    @Override
    public View onCreateInputView() {
        /*final LinearLayout 布局 = new LinearLayout(this);
        布局.setOrientation(LinearLayout.VERTICAL);
        布局.addView(创建按键("好"));
        布局.addView(创建按键("不"));
        return 布局;*/
        KeyboardView keyboardView = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard_view, null);
        Keyboard keyboard = new Keyboard(this, R.xml.keyboard);
        keyboardView.setKeyboard(keyboard);
        keyboardView.setOnKeyboardActionListener(this);
        return keyboardView;
    }

    @Override
    public void onPress(int i) {

    }

    @Override
    public void onRelease(int i) {

    }

    @Override
    public void onKey(int primatyCode, int[] keyCodes) {
        InputConnection inputConnection = getCurrentInputConnection();

        if (inputConnection != null) {
            char code = (char) primatyCode;
            inputConnection.commitText(String.valueOf(code), 1);
        }
    }

    @Override
    public void onText(CharSequence charSequence) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }

    private Button 创建按键(final String 字) {
        Button 按键 = new Button(this);
        按键.setText(字);
        按键.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getCurrentInputConnection().commitText(字, 1);
            }
        });
        return 按键;
    }

}
