package com.example.yesno;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.view.View;
import android.view.inputmethod.InputConnection;

public class 好不键盘 extends InputMethodService implements KeyboardView.OnKeyboardActionListener {

    private static final String 字符 = "@好不";

    @Override
    public View onCreateInputView() {
        KeyboardView 视图 = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard_view, null);
        Keyboard 键盘 = new Keyboard(this, R.xml.keyboard);
        视图.setKeyboard(键盘);
        视图.setOnKeyboardActionListener(this);
        return 视图;
    }

    @Override
    public void onKey(int 码, int[] keyCodes) {
        InputConnection 输入连接 = getCurrentInputConnection();

        if (输入连接 != null) {
            char 字 = 字符.charAt(码);
            输入连接.commitText(String.valueOf(字), 1);
        }
    }

    @Override
    public void onPress(int i) {

    }

    @Override
    public void onRelease(int i) {

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

}
