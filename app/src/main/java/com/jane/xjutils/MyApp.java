package com.jane.xjutils;

import android.content.Context;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

import com.jane.utils.android.AppUtils;

/**
 * @author : Jane
 * @date :   2022/3/3 4:57 下午
 * @desc :   {类描述}
 */
public class MyApp extends MultiDexApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 方法数过多处理
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.init(this);
    }
}
