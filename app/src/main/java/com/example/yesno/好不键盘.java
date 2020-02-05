package com.example.yesno;

import android.inputmethodservice.InputMethodService;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class 好不键盘 extends InputMethodService {

    @Override
    public View onCreateInputView() {
        final LinearLayout 布局 = new LinearLayout(this);
        布局.setOrientation(LinearLayout.VERTICAL);
        布局.addView(创建按键("好"));
        布局.addView(创建按键("不"));
        return 布局;
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
