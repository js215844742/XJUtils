package com.jane.utils.android;

import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;

import com.jane.utils.R;

import java.lang.ref.WeakReference;

/**
 * @author : Jane
 * @date :   2022/1/23 5:16 下午
 * @desc :   Toast工具类
 */
public class ToastUtils {

    private static WeakReference<Toast> softReference;
    private static int gravity = Gravity.CENTER;

    /**
     * 设置吐司位置
     *
     * @param gravity 位置
     */
    public static void setGravity(int gravity) {
        ToastUtils.gravity = gravity;
    }

    /**
     * 显示短时吐司
     *
     * @param message 消息
     */
    public static void show(@StringRes int message) {
        //处理存管含有br标签的消息，产品暂定app忽略br标签
        if (message == 0) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            newToast(message);
        } else {
            new Handler(Looper.getMainLooper()).post(() -> newToast(message));
        }
    }

    private static void newToast(@StringRes int message) {
        newInstance(R.layout.base_toast, R.drawable.shape_bg_toast, message, false);
    }

    private static void newInstance(@LayoutRes int viewId, @DrawableRes int toastBg, @StringRes int message, boolean isLongToast) {
        cancelTosat();
        if (message == 0) {
            return;
        }
        if (softReference == null) {
            softReference = new WeakReference<>(Toast.makeText(AppUtils.getApp(), message, isLongToast ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT));
        }
        View view = LayoutInflater.from(AppUtils.getApp()).inflate(viewId, null);
        view.setBackgroundResource(toastBg);
        TextView textView = view.findViewById(R.id.tvToastMessage);
        textView.setText(message);
        softReference.get().setGravity(gravity, 0, 0);
        softReference.get().setView(view);
        softReference.get().show();
    }


    /**
     * 取消吐司显示
     */
    public static void cancelTosat() {
        if (softReference != null) {
            if (softReference.get() != null) {
                softReference.get().cancel();
            }
            softReference = null;
        }
    }

}
