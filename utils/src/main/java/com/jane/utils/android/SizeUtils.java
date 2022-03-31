package com.jane.utils.android;

import android.content.Context;
import android.util.TypedValue;

import androidx.annotation.DimenRes;

/**
 * @author : Jane
 * @date :   2022/3/9 4:26 下午
 * @desc :   {类描述}
 */
public class SizeUtils {

    private SizeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * Value of dp to value of px.
     *
     * @param dpValue The value of dp.
     * @return value of px
     */
    public static int dp2px(final float dpValue) {
        final float scale = AppUtils.getAppContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * @param context
     * @param resId   资源id
     * @return
     */
    public static int dp2px(Context context, @DimenRes int resId) {
        return (int) context.getResources().getDimension(resId);
    }

    /**
     * dpi转px
     *
     * @param context
     * @param dpi
     * @return
     */
    public static int dp2px(Context context, float dpi) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dpi, context.getResources().getDisplayMetrics());
    }

    /**
     * Value of px to value of dp.
     *
     * @param pxValue The value of px.
     * @return value of dp
     */
    public static int px2dp(final float pxValue) {
        final float scale = AppUtils.getAppContext().getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
