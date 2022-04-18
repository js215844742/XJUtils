package com.jane.utils.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * @author : Jane
 * @date :   2022/4/15 3:43 下午
 * @desc :   键盘控制管理
 */
public class KeyboardUtils {

    private KeyboardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 显示软键盘
     * @param view
     */
    public static void showSoftInput(View view) {
        InputMethodManager imm =
                (InputMethodManager) AppUtils.getApp().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm == null) return;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        imm.showSoftInput(view, InputMethodManager.SHOW_FORCED);
    }

    /**
     * 显示软键盘
     * @param activity
     */
    public static void showSoftInput(final Activity activity) {
        InputMethodManager imm =
                (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (imm == null) return;
        View view = activity.getCurrentFocus();
        if (view == null) {
            view = new View(activity);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        }
        imm.showSoftInput(view, InputMethodManager.SHOW_FORCED);
    }

    /**
     * 隐藏软键盘
     * @param view
     */
    public static void hideSoftInput(View view) {
        if (view!=null) {
            InputMethodManager imm =
                    (InputMethodManager) AppUtils.getApp().getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm == null) return;
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /**
     * 隐藏软键盘
     * @param activity
     */
    public static void hideSoftInput(final Activity activity) {
        InputMethodManager imm =
                (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (imm == null) return;
        View view = activity.getCurrentFocus();
        View decorView = activity.getWindow().getDecorView();
        if (view == null) view = new View(activity);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

//    public static void setOnEnterKeyListener(EditText editText, String string, KeyListener listener) {
//        editText.setImeOptions(EditorInfo.IME_ACTION_SEARCH);
//        editText.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//
//                return false;
//            }
//        });
//    }
//
//    interface KeyListener {
//
//        void onClick();
//
//    }
}
